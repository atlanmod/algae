/**
 */
package org.atlanmod.analysis.algae.util;

import org.atlanmod.analysis.algae.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.atlanmod.analysis.algae.AlgaePackage
 * @generated
 */
public class AlgaeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgaePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaeSwitch() {
		if (modelPackage == null) {
			modelPackage = AlgaePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AlgaePackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.TYPED_MEASURE: {
				TypedMeasure typedMeasure = (TypedMeasure)theEObject;
				T result = caseTypedMeasure(typedMeasure);
				if (result == null) result = caseMeasure(typedMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_VALUE: {
				MeasureValue measureValue = (MeasureValue)theEObject;
				T result = caseMeasureValue(measureValue);
				if (result == null) result = caseTypedMeasure(measureValue);
				if (result == null) result = caseMeasure(measureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_OCL: {
				MeasureOCL measureOCL = (MeasureOCL)theEObject;
				T result = caseMeasureOCL(measureOCL);
				if (result == null) result = caseMeasureValue(measureOCL);
				if (result == null) result = caseTypedMeasure(measureOCL);
				if (result == null) result = caseMeasure(measureOCL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_ATTRIBUTE: {
				MeasureAttribute measureAttribute = (MeasureAttribute)theEObject;
				T result = caseMeasureAttribute(measureAttribute);
				if (result == null) result = caseMeasureValue(measureAttribute);
				if (result == null) result = caseTypedMeasure(measureAttribute);
				if (result == null) result = caseMeasure(measureAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_CAST: {
				MeasureCast measureCast = (MeasureCast)theEObject;
				T result = caseMeasureCast(measureCast);
				if (result == null) result = caseTypedMeasure(measureCast);
				if (result == null) result = caseMeasure(measureCast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_BINARY_OPERATION: {
				MeasureBinaryOperation measureBinaryOperation = (MeasureBinaryOperation)theEObject;
				T result = caseMeasureBinaryOperation(measureBinaryOperation);
				if (result == null) result = caseTypedMeasure(measureBinaryOperation);
				if (result == null) result = caseMeasure(measureBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_BINARY_PRODUCT_OPERATION: {
				MeasureBinaryProductOperation measureBinaryProductOperation = (MeasureBinaryProductOperation)theEObject;
				T result = caseMeasureBinaryProductOperation(measureBinaryProductOperation);
				if (result == null) result = caseMeasureBinaryOperation(measureBinaryProductOperation);
				if (result == null) result = caseTypedMeasure(measureBinaryProductOperation);
				if (result == null) result = caseMeasure(measureBinaryProductOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_BINARY_SUM_OPERATION: {
				MeasureBinarySumOperation measureBinarySumOperation = (MeasureBinarySumOperation)theEObject;
				T result = caseMeasureBinarySumOperation(measureBinarySumOperation);
				if (result == null) result = caseMeasureBinaryOperation(measureBinarySumOperation);
				if (result == null) result = caseTypedMeasure(measureBinarySumOperation);
				if (result == null) result = caseMeasure(measureBinarySumOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.REAL_TIME_DURATION: {
				RealTimeDuration realTimeDuration = (RealTimeDuration)theEObject;
				T result = caseRealTimeDuration(realTimeDuration);
				if (result == null) result = caseMeasureValue(realTimeDuration);
				if (result == null) result = caseTypedMeasure(realTimeDuration);
				if (result == null) result = caseMeasure(realTimeDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_UNBOUND_OPERATION: {
				MeasureUnboundOperation measureUnboundOperation = (MeasureUnboundOperation)theEObject;
				T result = caseMeasureUnboundOperation(measureUnboundOperation);
				if (result == null) result = caseTypedMeasure(measureUnboundOperation);
				if (result == null) result = caseMeasure(measureUnboundOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_UNBOUND_SUM_OPERATION: {
				MeasureUnboundSumOperation measureUnboundSumOperation = (MeasureUnboundSumOperation)theEObject;
				T result = caseMeasureUnboundSumOperation(measureUnboundSumOperation);
				if (result == null) result = caseMeasureUnboundOperation(measureUnboundSumOperation);
				if (result == null) result = caseTypedMeasure(measureUnboundSumOperation);
				if (result == null) result = caseMeasure(measureUnboundSumOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_UNBOUND_SUBSTRACT_OPERATION: {
				MeasureUnboundSubstractOperation measureUnboundSubstractOperation = (MeasureUnboundSubstractOperation)theEObject;
				T result = caseMeasureUnboundSubstractOperation(measureUnboundSubstractOperation);
				if (result == null) result = caseMeasureUnboundOperation(measureUnboundSubstractOperation);
				if (result == null) result = caseTypedMeasure(measureUnboundSubstractOperation);
				if (result == null) result = caseMeasure(measureUnboundSubstractOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_UNBOUND_PRODUCT_OPERATION: {
				MeasureUnboundProductOperation measureUnboundProductOperation = (MeasureUnboundProductOperation)theEObject;
				T result = caseMeasureUnboundProductOperation(measureUnboundProductOperation);
				if (result == null) result = caseMeasureUnboundOperation(measureUnboundProductOperation);
				if (result == null) result = caseTypedMeasure(measureUnboundProductOperation);
				if (result == null) result = caseMeasure(measureUnboundProductOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASURE_UNBOUND_DIVISION_OPERATION: {
				MeasureUnboundDivisionOperation measureUnboundDivisionOperation = (MeasureUnboundDivisionOperation)theEObject;
				T result = caseMeasureUnboundDivisionOperation(measureUnboundDivisionOperation);
				if (result == null) result = caseMeasureUnboundOperation(measureUnboundDivisionOperation);
				if (result == null) result = caseTypedMeasure(measureUnboundDivisionOperation);
				if (result == null) result = caseMeasure(measureUnboundDivisionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASUREMENT_UNCERTAINTY: {
				MeasurementUncertainty measurementUncertainty = (MeasurementUncertainty)theEObject;
				T result = caseMeasurementUncertainty(measurementUncertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.NORMAL_DISTRIBUTION: {
				NormalDistribution normalDistribution = (NormalDistribution)theEObject;
				T result = caseNormalDistribution(normalDistribution);
				if (result == null) result = caseMeasurementUncertaintyInformation(normalDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseMeasurementUncertaintyInformation(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.MEASUREMENT_UNCERTAINTY_INFORMATION: {
				MeasurementUncertaintyInformation measurementUncertaintyInformation = (MeasurementUncertaintyInformation)theEObject;
				T result = caseMeasurementUncertaintyInformation(measurementUncertaintyInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.SAMPLING: {
				Sampling sampling = (Sampling)theEObject;
				T result = caseSampling(sampling);
				if (result == null) result = caseMeasurementUncertaintyInformation(sampling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.INTEGRAL: {
				Integral integral = (Integral)theEObject;
				T result = caseIntegral(integral);
				if (result == null) result = caseMeasurementUncertaintyInformation(integral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.SAMPLE: {
				Sample sample = (Sample)theEObject;
				T result = caseSample(sample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.COMPOSITE_MEASURE: {
				CompositeMeasure compositeMeasure = (CompositeMeasure)theEObject;
				T result = caseCompositeMeasure(compositeMeasure);
				if (result == null) result = caseMeasureValue(compositeMeasure);
				if (result == null) result = caseTypedMeasure(compositeMeasure);
				if (result == null) result = caseMeasure(compositeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.LOGISTIC_MEASURE: {
				LogisticMeasure logisticMeasure = (LogisticMeasure)theEObject;
				T result = caseLogisticMeasure(logisticMeasure);
				if (result == null) result = caseCompositeMeasure(logisticMeasure);
				if (result == null) result = caseMeasureValue(logisticMeasure);
				if (result == null) result = caseTypedMeasure(logisticMeasure);
				if (result == null) result = caseMeasure(logisticMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.EXPONENTIAL_MEASURE: {
				ExponentialMeasure exponentialMeasure = (ExponentialMeasure)theEObject;
				T result = caseExponentialMeasure(exponentialMeasure);
				if (result == null) result = caseCompositeMeasure(exponentialMeasure);
				if (result == null) result = caseMeasureValue(exponentialMeasure);
				if (result == null) result = caseTypedMeasure(exponentialMeasure);
				if (result == null) result = caseMeasure(exponentialMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.TAIL_MEASURE: {
				TailMeasure tailMeasure = (TailMeasure)theEObject;
				T result = caseTailMeasure(tailMeasure);
				if (result == null) result = caseCompositeMeasure(tailMeasure);
				if (result == null) result = caseMeasureValue(tailMeasure);
				if (result == null) result = caseTypedMeasure(tailMeasure);
				if (result == null) result = caseMeasure(tailMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgaePackage.INTEGRATION_MEASURE: {
				IntegrationMeasure integrationMeasure = (IntegrationMeasure)theEObject;
				T result = caseIntegrationMeasure(integrationMeasure);
				if (result == null) result = caseCompositeMeasure(integrationMeasure);
				if (result == null) result = caseMeasureValue(integrationMeasure);
				if (result == null) result = caseTypedMeasure(integrationMeasure);
				if (result == null) result = caseMeasure(integrationMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedMeasure(TypedMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureValue(MeasureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure OCL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure OCL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureOCL(MeasureOCL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureAttribute(MeasureAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureCast(MeasureCast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureBinaryOperation(MeasureBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Binary Product Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Binary Product Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureBinaryProductOperation(MeasureBinaryProductOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Binary Sum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Binary Sum Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureBinarySumOperation(MeasureBinarySumOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTimeDuration(RealTimeDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Unbound Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Unbound Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureUnboundOperation(MeasureUnboundOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Unbound Sum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Unbound Sum Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureUnboundSumOperation(MeasureUnboundSumOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Unbound Substract Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Unbound Substract Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureUnboundSubstractOperation(MeasureUnboundSubstractOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Unbound Product Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Unbound Product Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureUnboundProductOperation(MeasureUnboundProductOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Unbound Division Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Unbound Division Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureUnboundDivisionOperation(MeasureUnboundDivisionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Uncertainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUncertainty(MeasurementUncertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDistribution(NormalDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Uncertainty Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Uncertainty Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUncertaintyInformation(MeasurementUncertaintyInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampling(Sampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegral(Integral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMeasure(CompositeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticMeasure(LogisticMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentialMeasure(ExponentialMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tail Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tail Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTailMeasure(TailMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationMeasure(IntegrationMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AlgaeSwitch
