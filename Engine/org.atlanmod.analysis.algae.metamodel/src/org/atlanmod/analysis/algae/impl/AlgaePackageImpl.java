/**
 */
package org.atlanmod.analysis.algae.impl;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.CompositeMeasure;
import org.atlanmod.analysis.algae.ExponentialMeasure;
import org.atlanmod.analysis.algae.Integral;
import org.atlanmod.analysis.algae.IntegrationMeasure;
import org.atlanmod.analysis.algae.Interval;
import org.atlanmod.analysis.algae.LogisticMeasure;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureAttribute;
import org.atlanmod.analysis.algae.MeasureCast;
import org.atlanmod.analysis.algae.MeasureOCL;
import org.atlanmod.analysis.algae.MeasureUnboundDivisionOperation;
import org.atlanmod.analysis.algae.MeasureUnboundOperation;
import org.atlanmod.analysis.algae.MeasureUnboundProductOperation;
import org.atlanmod.analysis.algae.MeasureUnboundSubstractOperation;
import org.atlanmod.analysis.algae.MeasureUnboundSumOperation;
import org.atlanmod.analysis.algae.MeasureValue;
import org.atlanmod.analysis.algae.MeasurementUncertainty;
import org.atlanmod.analysis.algae.MeasurementUncertaintyInformation;
import org.atlanmod.analysis.algae.NormalDistribution;
import org.atlanmod.analysis.algae.Platform;
import org.atlanmod.analysis.algae.RealTimeDuration;
import org.atlanmod.analysis.algae.Sample;
import org.atlanmod.analysis.algae.Sampling;
import org.atlanmod.analysis.algae.Type;
import org.atlanmod.analysis.algae.TypedMeasure;
import org.atlanmod.analysis.algae.Variable;
import org.atlanmod.analysis.algae.Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgaePackageImpl extends EPackageImpl implements AlgaePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureOCLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureCastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTimeDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureUnboundOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureUnboundSumOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureUnboundSubstractOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureUnboundProductOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureUnboundDivisionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUncertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUncertaintyInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.atlanmod.analysis.algae.AlgaePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgaePackageImpl() {
		super(eNS_URI, AlgaeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgaePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgaePackage init() {
		if (isInited) return (AlgaePackage)EPackage.Registry.INSTANCE.getEPackage(AlgaePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgaePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgaePackageImpl theAlgaePackage = registeredAlgaePackage instanceof AlgaePackageImpl ? (AlgaePackageImpl)registeredAlgaePackage : new AlgaePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAlgaePackage.createPackageContents();

		// Initialize created meta-data
		theAlgaePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgaePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgaePackage.eNS_URI, theAlgaePackage);
		return theAlgaePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_Name() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Variables() {
		return (EReference)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Measures() {
		return (EReference)platformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Vibility() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Name() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Subname() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_TargetClass() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_TargetOperation() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Post() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Uncertainty() {
		return (EReference)measureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasure__Type() {
		return measureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasure__Value() {
		return measureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasure__Name() {
		return measureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedMeasure() {
		return typedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedMeasure_Type() {
		return (EAttribute)typedMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypedMeasure__Type() {
		return typedMeasureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypedMeasure__Name() {
		return typedMeasureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureValue() {
		return measureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValue_Value() {
		return (EAttribute)measureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasureValue__Value() {
		return measureValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureOCL() {
		return measureOCLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureOCL_OclQuery() {
		return (EAttribute)measureOCLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureAttribute() {
		return measureAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureAttribute_Att() {
		return (EAttribute)measureAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureCast() {
		return measureCastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCast_Measure() {
		return (EReference)measureCastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTimeDuration() {
		return realTimeDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealTimeDuration__Type() {
		return realTimeDurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureUnboundOperation() {
		return measureUnboundOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureUnboundOperation_Val() {
		return (EAttribute)measureUnboundOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureUnboundOperation_Measures() {
		return (EReference)measureUnboundOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureUnboundSumOperation() {
		return measureUnboundSumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureUnboundSubstractOperation() {
		return measureUnboundSubstractOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureUnboundProductOperation() {
		return measureUnboundProductOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureUnboundDivisionOperation() {
		return measureUnboundDivisionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUncertainty() {
		return measurementUncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementUncertainty_Information() {
		return (EReference)measurementUncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementUncertainty_StandardUncertainty() {
		return (EAttribute)measurementUncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDistribution() {
		return normalDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_MeanValue() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_StandardDeviation() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LowerEndpoint() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_UpperEndpoint() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUncertaintyInformation() {
		return measurementUncertaintyInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampling() {
		return samplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampling_Samples() {
		return (EReference)samplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampling_MeasurementProcedure() {
		return (EAttribute)samplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegral() {
		return integralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegral_Interval() {
		return (EReference)integralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegral_Function() {
		return (EAttribute)integralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSample_Quantity() {
		return (EReference)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMeasure() {
		return compositeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMeasure_X() {
		return (EReference)compositeMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogisticMeasure() {
		return logisticMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogisticMeasure_L() {
		return (EReference)logisticMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogisticMeasure_K() {
		return (EReference)logisticMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogisticMeasure_X0() {
		return (EReference)logisticMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialMeasure() {
		return exponentialMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationMeasure() {
		return integrationMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationMeasure_Function() {
		return (EReference)integrationMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationMeasure_LeftBound() {
		return (EReference)integrationMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationMeasure_RightBound() {
		return (EReference)integrationMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaeFactory getAlgaeFactory() {
		return (AlgaeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__NAME);
		createEReference(platformEClass, PLATFORM__VARIABLES);
		createEReference(platformEClass, PLATFORM__MEASURES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VIBILITY);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__NAME);
		createEAttribute(measureEClass, MEASURE__SUBNAME);
		createEAttribute(measureEClass, MEASURE__TARGET_CLASS);
		createEAttribute(measureEClass, MEASURE__TARGET_OPERATION);
		createEAttribute(measureEClass, MEASURE__POST);
		createEReference(measureEClass, MEASURE__UNCERTAINTY);
		createEOperation(measureEClass, MEASURE___TYPE);
		createEOperation(measureEClass, MEASURE___VALUE);
		createEOperation(measureEClass, MEASURE___NAME);

		typedMeasureEClass = createEClass(TYPED_MEASURE);
		createEAttribute(typedMeasureEClass, TYPED_MEASURE__TYPE);
		createEOperation(typedMeasureEClass, TYPED_MEASURE___TYPE);
		createEOperation(typedMeasureEClass, TYPED_MEASURE___NAME);

		measureValueEClass = createEClass(MEASURE_VALUE);
		createEAttribute(measureValueEClass, MEASURE_VALUE__VALUE);
		createEOperation(measureValueEClass, MEASURE_VALUE___VALUE);

		measureOCLEClass = createEClass(MEASURE_OCL);
		createEAttribute(measureOCLEClass, MEASURE_OCL__OCL_QUERY);

		measureAttributeEClass = createEClass(MEASURE_ATTRIBUTE);
		createEAttribute(measureAttributeEClass, MEASURE_ATTRIBUTE__ATT);

		measureCastEClass = createEClass(MEASURE_CAST);
		createEReference(measureCastEClass, MEASURE_CAST__MEASURE);

		realTimeDurationEClass = createEClass(REAL_TIME_DURATION);
		createEOperation(realTimeDurationEClass, REAL_TIME_DURATION___TYPE);

		measureUnboundOperationEClass = createEClass(MEASURE_UNBOUND_OPERATION);
		createEAttribute(measureUnboundOperationEClass, MEASURE_UNBOUND_OPERATION__VAL);
		createEReference(measureUnboundOperationEClass, MEASURE_UNBOUND_OPERATION__MEASURES);

		measureUnboundSumOperationEClass = createEClass(MEASURE_UNBOUND_SUM_OPERATION);

		measureUnboundSubstractOperationEClass = createEClass(MEASURE_UNBOUND_SUBSTRACT_OPERATION);

		measureUnboundProductOperationEClass = createEClass(MEASURE_UNBOUND_PRODUCT_OPERATION);

		measureUnboundDivisionOperationEClass = createEClass(MEASURE_UNBOUND_DIVISION_OPERATION);

		measurementUncertaintyEClass = createEClass(MEASUREMENT_UNCERTAINTY);
		createEReference(measurementUncertaintyEClass, MEASUREMENT_UNCERTAINTY__INFORMATION);
		createEAttribute(measurementUncertaintyEClass, MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY);

		normalDistributionEClass = createEClass(NORMAL_DISTRIBUTION);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__MEAN_VALUE);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__STANDARD_DEVIATION);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__LOWER_ENDPOINT);
		createEReference(intervalEClass, INTERVAL__UPPER_ENDPOINT);

		measurementUncertaintyInformationEClass = createEClass(MEASUREMENT_UNCERTAINTY_INFORMATION);

		samplingEClass = createEClass(SAMPLING);
		createEReference(samplingEClass, SAMPLING__SAMPLES);
		createEAttribute(samplingEClass, SAMPLING__MEASUREMENT_PROCEDURE);

		integralEClass = createEClass(INTEGRAL);
		createEReference(integralEClass, INTEGRAL__INTERVAL);
		createEAttribute(integralEClass, INTEGRAL__FUNCTION);

		sampleEClass = createEClass(SAMPLE);
		createEReference(sampleEClass, SAMPLE__QUANTITY);

		compositeMeasureEClass = createEClass(COMPOSITE_MEASURE);
		createEReference(compositeMeasureEClass, COMPOSITE_MEASURE__X);

		logisticMeasureEClass = createEClass(LOGISTIC_MEASURE);
		createEReference(logisticMeasureEClass, LOGISTIC_MEASURE__L);
		createEReference(logisticMeasureEClass, LOGISTIC_MEASURE__K);
		createEReference(logisticMeasureEClass, LOGISTIC_MEASURE__X0);

		exponentialMeasureEClass = createEClass(EXPONENTIAL_MEASURE);

		integrationMeasureEClass = createEClass(INTEGRATION_MEASURE);
		createEReference(integrationMeasureEClass, INTEGRATION_MEASURE__FUNCTION);
		createEReference(integrationMeasureEClass, INTEGRATION_MEASURE__LEFT_BOUND);
		createEReference(integrationMeasureEClass, INTEGRATION_MEASURE__RIGHT_BOUND);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typedMeasureEClass.getESuperTypes().add(this.getMeasure());
		measureValueEClass.getESuperTypes().add(this.getTypedMeasure());
		measureOCLEClass.getESuperTypes().add(this.getMeasureValue());
		measureAttributeEClass.getESuperTypes().add(this.getMeasureValue());
		measureCastEClass.getESuperTypes().add(this.getTypedMeasure());
		realTimeDurationEClass.getESuperTypes().add(this.getMeasureValue());
		measureUnboundOperationEClass.getESuperTypes().add(this.getMeasureValue());
		measureUnboundSumOperationEClass.getESuperTypes().add(this.getMeasureUnboundOperation());
		measureUnboundSubstractOperationEClass.getESuperTypes().add(this.getMeasureUnboundOperation());
		measureUnboundProductOperationEClass.getESuperTypes().add(this.getMeasureUnboundOperation());
		measureUnboundDivisionOperationEClass.getESuperTypes().add(this.getMeasureUnboundOperation());
		normalDistributionEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		intervalEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		samplingEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		integralEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		compositeMeasureEClass.getESuperTypes().add(this.getMeasureValue());
		logisticMeasureEClass.getESuperTypes().add(this.getCompositeMeasure());
		exponentialMeasureEClass.getESuperTypes().add(this.getCompositeMeasure());
		integrationMeasureEClass.getESuperTypes().add(this.getMeasureValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_Name(), ecorePackage.getEString(), "name", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Variables(), this.getVariable(), null, "variables", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Measures(), this.getMeasure(), null, "measures", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Vibility(), this.getVisibility(), "vibility", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Subname(), ecorePackage.getEString(), "subname", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_TargetClass(), ecorePackage.getEString(), "targetClass", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_TargetOperation(), ecorePackage.getEString(), "targetOperation", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Post(), ecorePackage.getEBooleanObject(), "post", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Uncertainty(), this.getMeasurementUncertainty(), null, "uncertainty", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeasure__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeasure__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeasure__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typedMeasureEClass, TypedMeasure.class, "TypedMeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedMeasure_Type(), this.getType(), "type", null, 1, 1, TypedMeasure.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTypedMeasure__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTypedMeasure__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureValueEClass, MeasureValue.class, "MeasureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureValue_Value(), ecorePackage.getEBigDecimal(), "value", "0", 1, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeasureValue__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureOCLEClass, MeasureOCL.class, "MeasureOCL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureOCL_OclQuery(), ecorePackage.getEString(), "oclQuery", null, 0, 1, MeasureOCL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureAttributeEClass, MeasureAttribute.class, "MeasureAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureAttribute_Att(), ecorePackage.getEString(), "att", null, 0, 1, MeasureAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureCastEClass, MeasureCast.class, "MeasureCast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureCast_Measure(), this.getMeasure(), null, "measure", null, 1, 1, MeasureCast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realTimeDurationEClass, RealTimeDuration.class, "RealTimeDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRealTimeDuration__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureUnboundOperationEClass, MeasureUnboundOperation.class, "MeasureUnboundOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureUnboundOperation_Val(), ecorePackage.getEBigDecimal(), "val", null, 0, 1, MeasureUnboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureUnboundOperation_Measures(), this.getMeasure(), null, "measures", null, 1, -1, MeasureUnboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measureUnboundSumOperationEClass, MeasureUnboundSumOperation.class, "MeasureUnboundSumOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureUnboundSubstractOperationEClass, MeasureUnboundSubstractOperation.class, "MeasureUnboundSubstractOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureUnboundProductOperationEClass, MeasureUnboundProductOperation.class, "MeasureUnboundProductOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureUnboundDivisionOperationEClass, MeasureUnboundDivisionOperation.class, "MeasureUnboundDivisionOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementUncertaintyEClass, MeasurementUncertainty.class, "MeasurementUncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementUncertainty_Information(), this.getMeasurementUncertaintyInformation(), null, "information", null, 0, 1, MeasurementUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementUncertainty_StandardUncertainty(), ecorePackage.getEBigDecimal(), "standardUncertainty", null, 0, 1, MeasurementUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalDistributionEClass, NormalDistribution.class, "NormalDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalDistribution_MeanValue(), ecorePackage.getEBigDecimal(), "meanValue", null, 0, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalDistribution_StandardDeviation(), ecorePackage.getEBigDecimal(), "standardDeviation", null, 0, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_LowerEndpoint(), this.getMeasure(), null, "lowerEndpoint", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_UpperEndpoint(), this.getMeasure(), null, "upperEndpoint", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementUncertaintyInformationEClass, MeasurementUncertaintyInformation.class, "MeasurementUncertaintyInformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(samplingEClass, Sampling.class, "Sampling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampling_Samples(), this.getSample(), null, "samples", null, 0, -1, Sampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampling_MeasurementProcedure(), ecorePackage.getEString(), "measurementProcedure", null, 0, 1, Sampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integralEClass, Integral.class, "Integral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegral_Interval(), this.getInterval(), null, "interval", null, 1, 1, Integral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegral_Function(), ecorePackage.getEString(), "function", null, 0, 1, Integral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSample_Quantity(), this.getMeasure(), null, "quantity", null, 0, -1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeMeasureEClass, CompositeMeasure.class, "CompositeMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMeasure_X(), this.getMeasure(), null, "x", null, 1, 1, CompositeMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticMeasureEClass, LogisticMeasure.class, "LogisticMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticMeasure_L(), this.getMeasure(), null, "L", null, 1, 1, LogisticMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticMeasure_K(), this.getMeasure(), null, "k", null, 1, 1, LogisticMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticMeasure_X0(), this.getMeasure(), null, "x0", null, 1, 1, LogisticMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialMeasureEClass, ExponentialMeasure.class, "ExponentialMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrationMeasureEClass, IntegrationMeasure.class, "IntegrationMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationMeasure_Function(), this.getCompositeMeasure(), null, "function", null, 1, 1, IntegrationMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationMeasure_LeftBound(), this.getMeasure(), null, "leftBound", null, 1, 1, IntegrationMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationMeasure_RightBound(), this.getMeasure(), null, "rightBound", null, 1, 1, IntegrationMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.LOCAL);
		addEEnumLiteral(visibilityEEnum, Visibility.GLOBAL);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.DURATION);
		addEEnumLiteral(typeEEnum, Type.SCALAR);
		addEEnumLiteral(typeEEnum, Type.FREQUENCY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getMeasure__Type(),
		   source,
		   new String[] {
			   "body", "null"
		   });
		addAnnotation
		  (getMeasure__Value(),
		   source,
		   new String[] {
			   "body", "0"
		   });
		addAnnotation
		  (getMeasure__Name(),
		   source,
		   new String[] {
			   "body", "\'\'"
		   });
		addAnnotation
		  (getMeasure_Name(),
		   source,
		   new String[] {
			   "derivation", "name()"
		   });
		addAnnotation
		  (getMeasure_Post(),
		   source,
		   new String[] {
			   "derivation", "false"
		   });
		addAnnotation
		  (getTypedMeasure__Type(),
		   source,
		   new String[] {
			   "body", "self.type"
		   });
		addAnnotation
		  (getTypedMeasure__Name(),
		   source,
		   new String[] {
			   "body", "targetClass+\'.\'+ if subname <> null then subname else type().toString() endif"
		   });
		addAnnotation
		  (getMeasureValue__Value(),
		   source,
		   new String[] {
			   "body", "self.value"
		   });
		addAnnotation
		  (getRealTimeDuration__Type(),
		   source,
		   new String[] {
			   "body", "Type::Duration"
		   });
		addAnnotation
		  (getMeasureUnboundOperation_Val(),
		   source,
		   new String[] {
			   "derivation", "0.0"
		   });
		addAnnotation
		  (getNormalDistribution_MeanValue(),
		   source,
		   new String[] {
			   "derivation", "Measure.allInstances()->select(v |\n\t\t\t\t\tv.uncertainty = (MeasurementUncertainty.allInstances()->select(u |\n\t\t\t\t\t\tu.information = self)->asOrderedSet()->first()))->asOrderedSet()->first().value()"
		   });
		addAnnotation
		  (getNormalDistribution_StandardDeviation(),
		   source,
		   new String[] {
			   "derivation", "MeasurementUncertainty.allInstances()->select(u |\n\t\t\t\t\t\tu.information = self)->asOrderedSet()->first().standardUncertainty"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getMeasureUnboundOperation_Measures(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //AlgaePackageImpl
