/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.MeasureAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureAttributeImpl#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureAttributeImpl extends MeasureValueImpl implements MeasureAttribute {
	
	@Generated({"NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		Object object = targetClass.eGet(targetClass.eClass().getEAttributes().stream().filter(eAtt -> eAtt.getName().equals(att)).findFirst().get());		
		setValue(BigDecimal.valueOf(Long.valueOf(object.toString())));
	}

	/**
	 * The default value of the '{@link #getAtt() <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtt() <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt()
	 * @generated
	 * @ordered
	 */
	protected String att = ATT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtt() {
		return att;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtt(String newAtt) {
		String oldAtt = att;
		att = newAtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASURE_ATTRIBUTE__ATT, oldAtt, att));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.MEASURE_ATTRIBUTE__ATT:
				return getAtt();
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
			case AlgaePackage.MEASURE_ATTRIBUTE__ATT:
				setAtt((String)newValue);
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
			case AlgaePackage.MEASURE_ATTRIBUTE__ATT:
				setAtt(ATT_EDEFAULT);
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
			case AlgaePackage.MEASURE_ATTRIBUTE__ATT:
				return ATT_EDEFAULT == null ? att != null : !ATT_EDEFAULT.equals(att);
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
		result.append(" (att: ");
		result.append(att);
		result.append(')');
		return result.toString();
	}

} //MeasureAttributeImpl
