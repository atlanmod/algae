/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureUnboundProductOperation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Unbound Product Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasureUnboundProductOperationImpl extends MeasureUnboundOperationImpl implements MeasureUnboundProductOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureUnboundProductOperationImpl() {
		super();
	}
	
	@Generated(value = { "NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		BigDecimal sum = new BigDecimal(1);
		for (Measure m : getMeasures()) {
			if (m != this) {
				m.computeValue(targetClass, targetOperation);
				sum = sum.multiply(m.value());
			} else {
				sum = sum.multiply(this.value);
			}
		}
		value = sum;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_UNBOUND_PRODUCT_OPERATION;
	}

} //MeasureUnboundProductOperationImpl
