/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.MeasurementUncertainty;
import org.atlanmod.analysis.algae.MeasurementUncertaintyInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasurementUncertaintyImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasurementUncertaintyImpl#getStandardUncertainty <em>Standard Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementUncertaintyImpl extends MinimalEObjectImpl.Container implements MeasurementUncertainty {
	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUncertaintyInformation information;

	/**
	 * The default value of the '{@link #getStandardUncertainty() <em>Standard Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STANDARD_UNCERTAINTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardUncertainty() <em>Standard Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardUncertainty()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal standardUncertainty = STANDARD_UNCERTAINTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementUncertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASUREMENT_UNCERTAINTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUncertaintyInformation getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformation(MeasurementUncertaintyInformation newInformation, NotificationChain msgs) {
		MeasurementUncertaintyInformation oldInformation = information;
		information = newInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION, oldInformation, newInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(MeasurementUncertaintyInformation newInformation) {
		if (newInformation != information) {
			NotificationChain msgs = null;
			if (information != null)
				msgs = ((InternalEObject)information).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION, null, msgs);
			if (newInformation != null)
				msgs = ((InternalEObject)newInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION, null, msgs);
			msgs = basicSetInformation(newInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION, newInformation, newInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStandardUncertainty() {
		return standardUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardUncertainty(BigDecimal newStandardUncertainty) {
		BigDecimal oldStandardUncertainty = standardUncertainty;
		standardUncertainty = newStandardUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY, oldStandardUncertainty, standardUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION:
				return basicSetInformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION:
				return getInformation();
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY:
				return getStandardUncertainty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION:
				setInformation((MeasurementUncertaintyInformation)newValue);
				return;
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY:
				setStandardUncertainty((BigDecimal)newValue);
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
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION:
				setInformation((MeasurementUncertaintyInformation)null);
				return;
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY:
				setStandardUncertainty(STANDARD_UNCERTAINTY_EDEFAULT);
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
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__INFORMATION:
				return information != null;
			case AlgaePackage.MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY:
				return STANDARD_UNCERTAINTY_EDEFAULT == null ? standardUncertainty != null : !STANDARD_UNCERTAINTY_EDEFAULT.equals(standardUncertainty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (standardUncertainty: ");
		result.append(standardUncertainty);
		result.append(')');
		return result.toString();
	}

} //MeasurementUncertaintyImpl
