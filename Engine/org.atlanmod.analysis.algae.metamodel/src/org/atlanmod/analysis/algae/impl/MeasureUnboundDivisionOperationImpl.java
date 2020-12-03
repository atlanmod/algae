/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.MeasureUnboundDivisionOperation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Unbound Division Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasureUnboundDivisionOperationImpl extends MeasureUnboundOperationImpl implements MeasureUnboundDivisionOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureUnboundDivisionOperationImpl() {
		super();
	}

	@Generated(value = { "NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		
		getMeasures().stream().filter(m -> m != this).forEach(m -> m.computeValue(targetClass, targetOperation));
		BigDecimal val = getMeasures().get(0).value();
		for (int i = 1; i < getMeasures().size(); i++) {
			val = val.divide(getMeasures().get(i).value(), 5, RoundingMode.HALF_EVEN);
		}
		
		setValue(val);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_UNBOUND_DIVISION_OPERATION;
	}

} //MeasureUnboundDivisionOperationImpl
