/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;
import java.util.Collection;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureUnboundOperation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Unbound Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureUnboundOperationImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureUnboundOperationImpl#getMeasures <em>Measures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasureUnboundOperationImpl extends MeasureValueImpl implements MeasureUnboundOperation {
	/**
	 * The cached setting delegate for the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VAL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)AlgaePackage.Literals.MEASURE_UNBOUND_OPERATION__VAL).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureUnboundOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_UNBOUND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVal() {
		return (BigDecimal)VAL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(BigDecimal newVal) {
		VAL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newVal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectResolvingEList<Measure>(Measure.class, this, AlgaePackage.MEASURE_UNBOUND_OPERATION__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__VAL:
				return getVal();
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__MEASURES:
				return getMeasures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__VAL:
				setVal((BigDecimal)newValue);
				return;
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__VAL:
				VAL__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__MEASURES:
				getMeasures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__VAL:
				return VAL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case AlgaePackage.MEASURE_UNBOUND_OPERATION__MEASURES:
				return measures != null && !measures.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Generated({"NOT"})
	@Override
	public boolean isPost() {
		return isPost() || getMeasures().stream().anyMatch(m -> m.isPost());		
	}
	
	

} //MeasureUnboundOperationImpl
