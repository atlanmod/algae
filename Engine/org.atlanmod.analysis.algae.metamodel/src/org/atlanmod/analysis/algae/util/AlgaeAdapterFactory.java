/**
 */
package org.atlanmod.analysis.algae.util;

import org.atlanmod.analysis.algae.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.atlanmod.analysis.algae.AlgaePackage
 * @generated
 */
public class AlgaeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgaePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgaePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgaeSwitch<Adapter> modelSwitch =
		new AlgaeSwitch<Adapter>() {
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureValue(MeasureValue object) {
				return createMeasureValueAdapter();
			}
			@Override
			public Adapter caseMeasureOCL(MeasureOCL object) {
				return createMeasureOCLAdapter();
			}
			@Override
			public Adapter caseMeasureAttribute(MeasureAttribute object) {
				return createMeasureAttributeAdapter();
			}
			@Override
			public Adapter caseMeasureCast(MeasureCast object) {
				return createMeasureCastAdapter();
			}
			@Override
			public Adapter caseRealTimeDuration(RealTimeDuration object) {
				return createRealTimeDurationAdapter();
			}
			@Override
			public Adapter caseMeasureUnboundOperation(MeasureUnboundOperation object) {
				return createMeasureUnboundOperationAdapter();
			}
			@Override
			public Adapter caseMeasureUnboundSumOperation(MeasureUnboundSumOperation object) {
				return createMeasureUnboundSumOperationAdapter();
			}
			@Override
			public Adapter caseMeasureUnboundSubstractOperation(MeasureUnboundSubstractOperation object) {
				return createMeasureUnboundSubstractOperationAdapter();
			}
			@Override
			public Adapter caseMeasureUnboundProductOperation(MeasureUnboundProductOperation object) {
				return createMeasureUnboundProductOperationAdapter();
			}
			@Override
			public Adapter caseMeasureUnboundDivisionOperation(MeasureUnboundDivisionOperation object) {
				return createMeasureUnboundDivisionOperationAdapter();
			}
			@Override
			public Adapter caseMeasurementUncertainty(MeasurementUncertainty object) {
				return createMeasurementUncertaintyAdapter();
			}
			@Override
			public Adapter caseNormalDistribution(NormalDistribution object) {
				return createNormalDistributionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseMeasurementUncertaintyInformation(MeasurementUncertaintyInformation object) {
				return createMeasurementUncertaintyInformationAdapter();
			}
			@Override
			public Adapter caseSampling(Sampling object) {
				return createSamplingAdapter();
			}
			@Override
			public Adapter caseIntegral(Integral object) {
				return createIntegralAdapter();
			}
			@Override
			public Adapter caseSample(Sample object) {
				return createSampleAdapter();
			}
			@Override
			public Adapter caseCompositeMeasure(CompositeMeasure object) {
				return createCompositeMeasureAdapter();
			}
			@Override
			public Adapter caseLogisticMeasure(LogisticMeasure object) {
				return createLogisticMeasureAdapter();
			}
			@Override
			public Adapter caseExponentialMeasure(ExponentialMeasure object) {
				return createExponentialMeasureAdapter();
			}
			@Override
			public Adapter caseIntegrationMeasure(IntegrationMeasure object) {
				return createIntegrationMeasureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureValue
	 * @generated
	 */
	public Adapter createMeasureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureOCL <em>Measure OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureOCL
	 * @generated
	 */
	public Adapter createMeasureOCLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureAttribute <em>Measure Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureAttribute
	 * @generated
	 */
	public Adapter createMeasureAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureCast <em>Measure Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureCast
	 * @generated
	 */
	public Adapter createMeasureCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.RealTimeDuration <em>Real Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.RealTimeDuration
	 * @generated
	 */
	public Adapter createRealTimeDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureUnboundOperation <em>Measure Unbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureUnboundOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureUnboundSumOperation <em>Measure Unbound Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureUnboundSumOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundSumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureUnboundSubstractOperation <em>Measure Unbound Substract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureUnboundSubstractOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundSubstractOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureUnboundProductOperation <em>Measure Unbound Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureUnboundProductOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundProductOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasureUnboundDivisionOperation <em>Measure Unbound Division Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasureUnboundDivisionOperation
	 * @generated
	 */
	public Adapter createMeasureUnboundDivisionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasurementUncertainty <em>Measurement Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasurementUncertainty
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.NormalDistribution
	 * @generated
	 */
	public Adapter createNormalDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.MeasurementUncertaintyInformation <em>Measurement Uncertainty Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.MeasurementUncertaintyInformation
	 * @generated
	 */
	public Adapter createMeasurementUncertaintyInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Sampling
	 * @generated
	 */
	public Adapter createSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Integral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Integral
	 * @generated
	 */
	public Adapter createIntegralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.CompositeMeasure <em>Composite Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.CompositeMeasure
	 * @generated
	 */
	public Adapter createCompositeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.LogisticMeasure <em>Logistic Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.LogisticMeasure
	 * @generated
	 */
	public Adapter createLogisticMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.ExponentialMeasure <em>Exponential Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.ExponentialMeasure
	 * @generated
	 */
	public Adapter createExponentialMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.atlanmod.analysis.algae.IntegrationMeasure <em>Integration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.atlanmod.analysis.algae.IntegrationMeasure
	 * @generated
	 */
	public Adapter createIntegrationMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlgaeAdapterFactory
