/**
 */
package org.atlanmod.analysis.algae;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.LogisticMeasure#getL <em>L</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.LogisticMeasure#getK <em>K</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.LogisticMeasure#getX0 <em>X0</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.LogisticMeasure#getX <em>X</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getLogisticMeasure()
 * @model
 * @generated
 */
public interface LogisticMeasure extends CompositeMeasure {
	/**
	 * Returns the value of the '<em><b>L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' reference.
	 * @see #setL(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getLogisticMeasure_L()
	 * @model required="true"
	 * @generated
	 */
	Measure getL();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.LogisticMeasure#getL <em>L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(Measure value);

	/**
	 * Returns the value of the '<em><b>K</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' reference.
	 * @see #setK(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getLogisticMeasure_K()
	 * @model required="true"
	 * @generated
	 */
	Measure getK();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.LogisticMeasure#getK <em>K</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' reference.
	 * @see #getK()
	 * @generated
	 */
	void setK(Measure value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' reference.
	 * @see #setX0(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getLogisticMeasure_X0()
	 * @model required="true"
	 * @generated
	 */
	Measure getX0();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.LogisticMeasure#getX0 <em>X0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' reference.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(Measure value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getLogisticMeasure_X()
	 * @model required="true"
	 * @generated
	 */
	Measure getX();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.LogisticMeasure#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Measure value);

} // LogisticMeasure
