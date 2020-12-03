package org.atlanmod.analysis.algae.engine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureUnboundOperation;
import org.atlanmod.analysis.algae.Platform;
import org.atlanmod.analysis.algae.RealTimeDuration;
import org.atlanmod.analysis.algae.TypedMeasure;
import org.atlanmod.analysis.algae.smm.SmmModeler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.modisco.omg.smm.SmmFactory;
import org.eclipse.modisco.omg.smm.SmmModel;
import org.eclipse.modisco.omg.smm.SmmPackage;
import org.eclipse.modisco.omg.smm.impl.SmmModelImpl;

public class EngineAddon implements IEngineAddon {

	public static File MODEL;
	private Platform platform;
	private Map<String, Collection<Measure>> mapClassEstimation;
	private Map<String, Long> stepDurations;
	private ArrayList<SmmModeler<?,?>> smmModelers; //TODO: future update should enable multiple modelers at the same time
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine)  {				
		
		IExecutionContext<?, ?, ?> ctx = executionEngine.getExecutionContext();		
		try {
			if (MODEL == null) { // We check that the model has been defined by the user.
				throw new FileNotFoundException("No model chosen ! Please choose an energy estimation model !");
			}
	
			System.out.println("Loading model ...");
			
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(URI.createURI(MODEL.toURI().toString()), true); 
			
			// We verify that the EEL model is properly loaded.
			if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof Platform) {
				platform = (Platform) resource.getContents().get(0);					
			} else {
				throw new IOException("Could not load the EEL model in the resource set");
			}
			
			// We need the meta-model of the language under execution. 
			// We simply check that it is in the executed model's repository.
			// This could be improved by letting the user specify in the GUI its model and meta-model
			Files	.walk(MODEL.getParentFile().toPath())
					.filter(p -> p.toFile().getName().endsWith(".ecore"))
					.forEach(p -> {
						try {
							System.out.println("Loading metamodel "+p.toFile().getName());								
							resourceSet.createResource(URI.createFileURI(p.toUri().toURL().toString()));
							
						} catch (MalformedURLException  e) {
							e.printStackTrace();
						}
					});		
			
			mapClassEstimation = new TreeMap<>();
			stepDurations = new HashMap<>();
			
			// Mapping of the targets defined in EEL to the meta classes defined by the xDSL
			resource.getAllContents().forEachRemaining(eObject -> {
				
				if (eObject instanceof Measure && ((Measure) eObject).getTargetClass() != null && ((Measure) eObject).getTargetOperation() != null) {
					String key = ((Measure) eObject).getTargetClass()+"#"+((Measure) eObject).getTargetOperation();
					Collection<Measure> mArrayList = mapClassEstimation.get(key);
					if (mArrayList != null) {
						mArrayList.add((Measure) eObject);
					} else {
						mArrayList = new ArrayList<Measure>();
						mArrayList.add((Measure) eObject);
						mapClassEstimation.put(key, mArrayList);
					}
				}
			});
										
			EcoreUtil.resolveAll(resource);
			System.out.println(platform.getName()+" estimation model loaded");
			initializeModelers(ctx, resourceSet);								
		} catch (IOException e) {
			System.out.println("An error occured while loading the EEL model.");
			e.printStackTrace();
			IEngineAddon.super.engineStopped(executionEngine);
		}
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	/**
	 * Initialize the SMM models according to the options provided to the {@link IExecutionContext}.
	 * @param ctx the {@link IExecutionContext}.
	 * @param resourceSet a {@link ResourceSet}.
	 * @throws IOException if the smm model cannot be loaded nor created 
	 */
	private void initializeModelers(IExecutionContext<?,?,?> ctx, ResourceSet resourceSet) throws IOException {
		smmModelers = new ArrayList<>();
		Boolean isSmmModelToXMM = ctx.getRunConfiguration().getAttribute("org.atlanmod.analysis.algae.extension.smm_metamodel", false);
		Boolean isSmmModelToXModel = ctx.getRunConfiguration().getAttribute("org.atlanmod.analysis.algae.extension.smm_model", false);
		String smmModelFileAsString = ctx.getRunConfiguration().getAttribute("org.atlanmod.analysis.algae.extension.smm_file", "SmmModel");
		
		if(! isSmmModelToXMM && !isSmmModelToXModel) {
			return;
		}
		
		File xModelFile = new File(MODEL.getAbsolutePath());		
		File xModelRepositoryFile = new File(xModelFile.getParent());
		
		if (!xModelRepositoryFile.exists())
			xModelRepositoryFile.mkdirs();
		
		File smmModelFile = new File(xModelRepositoryFile, smmModelFileAsString);			
		
		SmmModel smmModel;
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());        
        SmmPackage.eINSTANCE.eClass(); // Loading SMM 
        
		if (smmModelFile.exists()) { // Loading the SMM Model
			Resource smmResource = resourceSet.getResource(URI.createURI(smmModelFile.toURI().toString()), true);
			smmModel = (SmmModelImpl) smmResource.getContents().get(0);			
		} else { // Creating the SMM Model
			smmModelFile.createNewFile();
			smmModel = SmmFactory.eINSTANCE.createSmmModel();
			Resource smmResource = resourceSet.createResource(URI.createURI(smmModelFile.toURI().toString()));
			smmResource.getContents().add(smmModel);
		}
		
		if (isSmmModelToXMM) {
			smmModelers.add(new SmmModeler<Double, EClass>(smmModel) {
				@Override
				public EClass callerToTarget(EObject caller) { 
					return caller.eClass();
				}				
			});
		} 
		
		if (isSmmModelToXModel) {
			smmModelers.add(new SmmModeler<Double, EObject>(smmModel) {
				@Override
				public EObject callerToTarget(EObject caller) { 
					return caller;
				}				
			});
		}
		
		smmModelers.forEach(smmModeler -> smmModeler.initializeSmmModelWithEelPlatform(platform));
	}
	
	@Override
	public void engineStarted(IExecutionEngine<?> executionEngine) {				
		IEngineAddon.super.engineStarted(executionEngine);
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {			
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();		
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();		
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		
		stepDurations.put(classOperation, Long.valueOf(System.currentTimeMillis()));
				
		mapClassEstimation.getOrDefault(classOperation, Collections.<Measure>emptyList()).forEach(measure -> {
			if (measure != null && !(hasPost(measure))) {			
				measure.computeValue(caller, operation);
				
				try {
					BigDecimal output = measure.value();
					System.out.println(classOperation + "." 
							+ (measure.getSubname() == null ? ((TypedMeasure) measure).getType() : measure.getSubname())
							+ " : "+output);					
					manageEstimation(measure, caller);
					
				} catch (Exception e) {				
					System.out.println(measure.getName()+" - "+measure.getSubname()+" cannot compute analysis");
				}		
			}
		});
		
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}
	
	

	@Override
	public void stepExecuted(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();						
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		
		Long duration = System.currentTimeMillis() - stepDurations.get(classOperation);
		stepDurations.put(classOperation, Long.valueOf(duration));
		
		mapClassEstimation.getOrDefault(classOperation, Collections.<Measure>emptyList()).forEach(measure -> {	
			if (measure != null && (hasPost(measure))) {			
				//updateMeasure(measure, caller, operation);
				measure.computeValue(caller, operation);

				if (measure instanceof RealTimeDuration) {
					((RealTimeDuration) measure).setValue(BigDecimal.valueOf(duration));
				}				
				
				try {
					BigDecimal output = measure.value();
					System.out.println(classOperation + "." 
							+ (measure.getSubname() == null ? ((TypedMeasure) measure).getType() : measure.getSubname())
							+ " : "+output);					
					manageEstimation(measure, caller);
					
				} catch (Exception e) {				
					System.out.println(measure.getName()+" - "+measure.getSubname()+" cannot compute analysis");
				}		
				
			}		
			
		});;		

		
		IEngineAddon.super.stepExecuted(engine, stepToExecute);
	}

	public static boolean hasPost(Measure m) {					
		if (m.getPost()) {
			return true;
		} else if (m instanceof MeasureUnboundOperation) {
			return ((MeasureUnboundOperation) m).getMeasures().stream().filter(mes -> !mes.equals(m)).anyMatch(EngineAddon::hasPost); 
		} 
				
		return false;		
	}
	
	/**
	 * Models the estimation provided by EEL with SMM, using the defined Modelers.
	 * @param m a EEL {@link Measure}.
	 * @param caller the {@link EObject} under execution.
	 */
	@SuppressWarnings("unchecked")
	private void manageEstimation(Measure m, EObject caller) {
		for (SmmModeler smm : smmModelers) {
			smm.persistMeasurement(m, m.value().doubleValue(), smm.callerToTarget(caller));
		}				
	}

	@Override
	public void engineStopped(IExecutionEngine<?> engine) {
		if (smmModelers.size() > 0) {
			Resource resource = smmModelers.get(0).saveModel();
			System.out.println(resource.getURI()+ " saved.");
		}
		IEngineAddon.super.engineStopped(engine);
	}
	

	public static void displayPlatformMeasurement(Platform p) {
		
		p.getMeasures().forEach(m -> {
			topDownTreeAnalysis(m, (Measure measure) -> {				
				if (measure.getTargetClass() != null)
					System.out.println(" -> "+measure.getTargetClass());
				if (measure.getTargetOperation() != null)
					System.out.println(" -> "+measure.getTargetOperation());
								
				return null;
			}); 
		});			
	}
	
	public static void topDownTreeAnalysis(Measure m, Function<Measure, Void> function) {
		function.apply(m);
		System.out.print("\t");
		m.eContents().stream()
		.filter(o -> o instanceof Measure)
		.map(o -> (Measure) o)
		.forEach(containedMeasure -> topDownTreeAnalysis(containedMeasure, function));
	}
}
