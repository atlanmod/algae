/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureUnboundSumOperation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Unbound Sum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasureUnboundSumOperationImpl extends MeasureUnboundOperationImpl implements MeasureUnboundSumOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureUnboundSumOperationImpl() {
		super();
	}
	
	@Generated(value = { "NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		BigDecimal sum = new BigDecimal(0);
		for (Measure m : getMeasures()) {
			if (m != this) {
				m.computeValue(targetClass, targetOperation);
				sum = sum.add(m.value());
			} else {
				sum = sum.add(getValue());
			}
		}
		setValue(sum);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_UNBOUND_SUM_OPERATION;
	}

} //MeasureUnboundSumOperationImpl
