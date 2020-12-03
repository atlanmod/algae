/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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
		setValue(BigDecimal.valueOf(Math.exp(getX().value().doubleValue())).round(new MathContext(5, RoundingMode.HALF_EVEN)));
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
