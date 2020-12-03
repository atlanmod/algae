/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.NormalDistribution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.NormalDistributionImpl#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.NormalDistributionImpl#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalDistributionImpl extends MeasurementUncertaintyInformationImpl implements NormalDistribution {
	/**
	 * The default value of the '{@link #getMeanValue() <em>Mean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MEAN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeanValue() <em>Mean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal meanValue = MEAN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STANDARD_DEVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal standardDeviation = STANDARD_DEVIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.NORMAL_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMeanValue() {
		return meanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanValue(BigDecimal newMeanValue) {
		BigDecimal oldMeanValue = meanValue;
		meanValue = newMeanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.NORMAL_DISTRIBUTION__MEAN_VALUE, oldMeanValue, meanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardDeviation(BigDecimal newStandardDeviation) {
		BigDecimal oldStandardDeviation = standardDeviation;
		standardDeviation = newStandardDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION, oldStandardDeviation, standardDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				return getMeanValue();
			case AlgaePackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				return getStandardDeviation();
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
			case AlgaePackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				setMeanValue((BigDecimal)newValue);
				return;
			case AlgaePackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				setStandardDeviation((BigDecimal)newValue);
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
			case AlgaePackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				setMeanValue(MEAN_VALUE_EDEFAULT);
				return;
			case AlgaePackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				setStandardDeviation(STANDARD_DEVIATION_EDEFAULT);
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
			case AlgaePackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				return MEAN_VALUE_EDEFAULT == null ? meanValue != null : !MEAN_VALUE_EDEFAULT.equals(meanValue);
			case AlgaePackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				return STANDARD_DEVIATION_EDEFAULT == null ? standardDeviation != null : !STANDARD_DEVIATION_EDEFAULT.equals(standardDeviation);
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
		result.append(" (meanValue: ");
		result.append(meanValue);
		result.append(", standardDeviation: ");
		result.append(standardDeviation);
		result.append(')');
		return result.toString();
	}

} //NormalDistributionImpl
