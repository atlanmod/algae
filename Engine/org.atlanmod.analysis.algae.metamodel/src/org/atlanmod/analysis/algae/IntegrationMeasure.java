/**
 */
package org.atlanmod.analysis.algae;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.IntegrationMeasure#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.IntegrationMeasure#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getIntegrationMeasure()
 * @model
 * @generated
 */
public interface IntegrationMeasure extends CompositeMeasure {
	/**
	 * Returns the value of the '<em><b>Left Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bound</em>' reference.
	 * @see #setLeftBound(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getIntegrationMeasure_LeftBound()
	 * @model required="true"
	 * @generated
	 */
	Measure getLeftBound();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.IntegrationMeasure#getLeftBound <em>Left Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bound</em>' reference.
	 * @see #getLeftBound()
	 * @generated
	 */
	void setLeftBound(Measure value);

	/**
	 * Returns the value of the '<em><b>Right Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bound</em>' reference.
	 * @see #setRightBound(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getIntegrationMeasure_RightBound()
	 * @model required="true"
	 * @generated
	 */
	Measure getRightBound();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.IntegrationMeasure#getRightBound <em>Right Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bound</em>' reference.
	 * @see #getRightBound()
	 * @generated
	 */
	void setRightBound(Measure value);

} // IntegrationMeasure
