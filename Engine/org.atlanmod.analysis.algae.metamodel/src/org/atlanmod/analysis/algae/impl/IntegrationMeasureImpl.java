/**
 */
package org.atlanmod.analysis.algae.impl;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.CompositeMeasure;
import org.atlanmod.analysis.algae.IntegrationMeasure;
import org.atlanmod.analysis.algae.Measure;
import org.atlanmod.analysis.algae.MeasureValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.impl.IntegrationMeasureImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.IntegrationMeasureImpl#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.impl.IntegrationMeasureImpl#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationMeasureImpl extends MeasureValueImpl implements IntegrationMeasure {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected CompositeMeasure function;

	/**
	 * The cached value of the '{@link #getLeftBound() <em>Left Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected Measure leftBound;

	/**
	 * The cached value of the '{@link #getRightBound() <em>Right Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected Measure rightBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationMeasureImpl() {
		super();
	}
	
	@Generated({"NOT"})
	@Override
	public void computeValue(EObject targetClass, EOperation targetOperation) {
		leftBound.computeValue(targetClass, targetOperation);
		rightBound.computeValue(targetClass, targetOperation);
		
		UnivariateFunction fun = new UnivariateFunction() {
			
			@Override
			public double value(double arg0) {
				MeasureValue value = AlgaeFactory.eINSTANCE.createMeasureValue();
				value.setValue(new BigDecimal(arg0));
				function.setX(value);
				function.computeValue(targetClass, targetOperation);
				return function.getValue().doubleValue();
			}
		};
		UnivariateIntegrator in = new SimpsonIntegrator();
		// 100 is the number of points to compute before calculating the area. This is arbitrary and should definitely be adapted to the desired accuracy.
		in.integrate(100, fun, leftBound.value().doubleValue(), rightBound.value().doubleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgaePackage.Literals.INTEGRATION_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasure getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (CompositeMeasure)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgaePackage.INTEGRATION_MEASURE__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasure basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(CompositeMeasure newFunction) {
		CompositeMeasure oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.INTEGRATION_MEASURE__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getLeftBound() {
		if (leftBound != null && leftBound.eIsProxy()) {
			InternalEObject oldLeftBound = (InternalEObject)leftBound;
			leftBound = (Measure)eResolveProxy(oldLeftBound);
			if (leftBound != oldLeftBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND, oldLeftBound, leftBound));
			}
		}
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetLeftBound() {
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftBound(Measure newLeftBound) {
		Measure oldLeftBound = leftBound;
		leftBound = newLeftBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND, oldLeftBound, leftBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getRightBound() {
		if (rightBound != null && rightBound.eIsProxy()) {
			InternalEObject oldRightBound = (InternalEObject)rightBound;
			rightBound = (Measure)eResolveProxy(oldRightBound);
			if (rightBound != oldRightBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND, oldRightBound, rightBound));
			}
		}
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetRightBound() {
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightBound(Measure newRightBound) {
		Measure oldRightBound = rightBound;
		rightBound = newRightBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND, oldRightBound, rightBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgaePackage.INTEGRATION_MEASURE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND:
				if (resolve) return getLeftBound();
				return basicGetLeftBound();
			case AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				if (resolve) return getRightBound();
				return basicGetRightBound();
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
			case AlgaePackage.INTEGRATION_MEASURE__FUNCTION:
				setFunction((CompositeMeasure)newValue);
				return;
			case AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND:
				setLeftBound((Measure)newValue);
				return;
			case AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				setRightBound((Measure)newValue);
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
			case AlgaePackage.INTEGRATION_MEASURE__FUNCTION:
				setFunction((CompositeMeasure)null);
				return;
			case AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND:
				setLeftBound((Measure)null);
				return;
			case AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				setRightBound((Measure)null);
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
			case AlgaePackage.INTEGRATION_MEASURE__FUNCTION:
				return function != null;
			case AlgaePackage.INTEGRATION_MEASURE__LEFT_BOUND:
				return leftBound != null;
			case AlgaePackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				return rightBound != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegrationMeasureImpl
