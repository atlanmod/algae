/**
 */
package org.atlanmod.analysis.algae.impl;

import org.atlanmod.analysis.algae.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgaeFactoryImpl extends EFactoryImpl implements AlgaeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgaeFactory init() {
		try {
			AlgaeFactory theAlgaeFactory = (AlgaeFactory)EPackage.Registry.INSTANCE.getEFactory(AlgaePackage.eNS_URI);
			if (theAlgaeFactory != null) {
				return theAlgaeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgaeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AlgaePackage.PLATFORM: return createPlatform();
			case AlgaePackage.VARIABLE: return createVariable();
			case AlgaePackage.MEASURE_VALUE: return createMeasureValue();
			case AlgaePackage.MEASURE_OCL: return createMeasureOCL();
			case AlgaePackage.MEASURE_ATTRIBUTE: return createMeasureAttribute();
			case AlgaePackage.MEASURE_CAST: return createMeasureCast();
			case AlgaePackage.REAL_TIME_DURATION: return createRealTimeDuration();
			case AlgaePackage.MEASURE_UNBOUND_SUM_OPERATION: return createMeasureUnboundSumOperation();
			case AlgaePackage.MEASURE_UNBOUND_SUBSTRACT_OPERATION: return createMeasureUnboundSubstractOperation();
			case AlgaePackage.MEASURE_UNBOUND_PRODUCT_OPERATION: return createMeasureUnboundProductOperation();
			case AlgaePackage.MEASURE_UNBOUND_DIVISION_OPERATION: return createMeasureUnboundDivisionOperation();
			case AlgaePackage.MEASUREMENT_UNCERTAINTY: return createMeasurementUncertainty();
			case AlgaePackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
			case AlgaePackage.INTERVAL: return createInterval();
			case AlgaePackage.SAMPLING: return createSampling();
			case AlgaePackage.INTEGRAL: return createIntegral();
			case AlgaePackage.SAMPLE: return createSample();
			case AlgaePackage.LOGISTIC_MEASURE: return createLogisticMeasure();
			case AlgaePackage.EXPONENTIAL_MEASURE: return createExponentialMeasure();
			case AlgaePackage.INTEGRATION_MEASURE: return createIntegrationMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AlgaePackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case AlgaePackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AlgaePackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case AlgaePackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureValue createMeasureValue() {
		MeasureValueImpl measureValue = new MeasureValueImpl();
		return measureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOCL createMeasureOCL() {
		MeasureOCLImpl measureOCL = new MeasureOCLImpl();
		return measureOCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureAttribute createMeasureAttribute() {
		MeasureAttributeImpl measureAttribute = new MeasureAttributeImpl();
		return measureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureCast createMeasureCast() {
		MeasureCastImpl measureCast = new MeasureCastImpl();
		return measureCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTimeDuration createRealTimeDuration() {
		RealTimeDurationImpl realTimeDuration = new RealTimeDurationImpl();
		return realTimeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundSumOperation createMeasureUnboundSumOperation() {
		MeasureUnboundSumOperationImpl measureUnboundSumOperation = new MeasureUnboundSumOperationImpl();
		return measureUnboundSumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundSubstractOperation createMeasureUnboundSubstractOperation() {
		MeasureUnboundSubstractOperationImpl measureUnboundSubstractOperation = new MeasureUnboundSubstractOperationImpl();
		return measureUnboundSubstractOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundProductOperation createMeasureUnboundProductOperation() {
		MeasureUnboundProductOperationImpl measureUnboundProductOperation = new MeasureUnboundProductOperationImpl();
		return measureUnboundProductOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundDivisionOperation createMeasureUnboundDivisionOperation() {
		MeasureUnboundDivisionOperationImpl measureUnboundDivisionOperation = new MeasureUnboundDivisionOperationImpl();
		return measureUnboundDivisionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUncertainty createMeasurementUncertainty() {
		MeasurementUncertaintyImpl measurementUncertainty = new MeasurementUncertaintyImpl();
		return measurementUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDistribution createNormalDistribution() {
		NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
		return normalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sampling createSampling() {
		SamplingImpl sampling = new SamplingImpl();
		return sampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integral createIntegral() {
		IntegralImpl integral = new IntegralImpl();
		return integral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticMeasure createLogisticMeasure() {
		LogisticMeasureImpl logisticMeasure = new LogisticMeasureImpl();
		return logisticMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialMeasure createExponentialMeasure() {
		ExponentialMeasureImpl exponentialMeasure = new ExponentialMeasureImpl();
		return exponentialMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationMeasure createIntegrationMeasure() {
		IntegrationMeasureImpl integrationMeasure = new IntegrationMeasureImpl();
		return integrationMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaePackage getAlgaePackage() {
		return (AlgaePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgaePackage getPackage() {
		return AlgaePackage.eINSTANCE;
	}

} //AlgaeFactoryImpl
