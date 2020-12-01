/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.MeasureOCL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure OCL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureOCLImpl#getOclQuery <em>Ocl Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureOCLImpl extends MeasureValueImpl implements MeasureOCL {
	private static OCL ocl;
	
	static {
		ocl = OCL.newInstance();

	}
	
	/**
	 * The default value of the '{@link #getOclQuery() <em>Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_QUERY_EDEFAULT = null;

	
	@Generated({"NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
	
		try {
			OCLHelper helper = ocl.createOCLHelper(targetClass.eClass());
			ExpressionInOCL expression = helper.createQuery(oclQuery);
			setValue(new BigDecimal(ocl.evaluate(targetClass, expression).toString()));
		} catch (ParserException e) {
			System.err.println("Could not run query "+oclQuery+" \n on "+targetClass.getClass());
			e.printStackTrace();
		}	
	
	}

	/**
	 * The cached value of the '{@link #getOclQuery() <em>Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclQuery()
	 * @generated
	 * @ordered
	 */
	protected String oclQuery = OCL_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureOCLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_OCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclQuery() {
		return oclQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclQuery(String newOclQuery) {
		String oldOclQuery = oclQuery;
		oclQuery = newOclQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASURE_OCL__OCL_QUERY, oldOclQuery, oclQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.MEASURE_OCL__OCL_QUERY:
				return getOclQuery();
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
			case AlgaePackage.MEASURE_OCL__OCL_QUERY:
				setOclQuery((String)newValue);
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
			case AlgaePackage.MEASURE_OCL__OCL_QUERY:
				setOclQuery(OCL_QUERY_EDEFAULT);
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
			case AlgaePackage.MEASURE_OCL__OCL_QUERY:
				return OCL_QUERY_EDEFAULT == null ? oclQuery != null : !OCL_QUERY_EDEFAULT.equals(oclQuery);
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
		result.append(" (oclQuery: ");
		result.append(oclQuery);
		result.append(')');
		return result.toString();
	}

} //MeasureOCLImpl
