/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.ExponentialMeasure;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExponentialMeasureImpl extends CompositeMeasureImpl implements ExponentialMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialMeasureImpl() {
		super();
	}
	
	@Generated({"NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		x.computeValue(targetClass, targetOperation);
		
		value = BigDecimal.valueOf(Math.exp(getX().value().doubleValue()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.EXPONENTIAL_MEASURE;
	}

} //ExponentialMeasureImpl
