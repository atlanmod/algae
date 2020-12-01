/**
 */
package org.atlanmod.analysis.algae.impl;

import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureBinaryOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureBinaryOperationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.MeasureBinaryOperationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasureBinaryOperationImpl extends TypedMeasureImpl implements MeasureBinaryOperation {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Measure left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Measure right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureBinaryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.MEASURE_BINARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Measure)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgaePackage.MEASURE_BINARY_OPERATION__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Measure newLeft) {
		Measure oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASURE_BINARY_OPERATION__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Measure)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Measure newRight) {
		Measure oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.MEASURE_BINARY_OPERATION__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
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
			case AlgaePackage.MEASURE_BINARY_OPERATION__LEFT:
				setLeft((Measure)newValue);
				return;
			case AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT:
				setRight((Measure)newValue);
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
			case AlgaePackage.MEASURE_BINARY_OPERATION__LEFT:
				setLeft((Measure)null);
				return;
			case AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT:
				setRight((Measure)null);
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
			case AlgaePackage.MEASURE_BINARY_OPERATION__LEFT:
				return left != null;
			case AlgaePackage.MEASURE_BINARY_OPERATION__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureBinaryOperationImpl
