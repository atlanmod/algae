/**
 */
package org.atlanmod.analysis.algae;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.CompositeMeasure#getX <em>X</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getCompositeMeasure()
 * @model
 * @generated
 */
public interface CompositeMeasure extends MeasureValue {

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
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getCompositeMeasure_X()
	 * @model required="true"
	 * @generated
	 */
	Measure getX();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.CompositeMeasure#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Measure value);
} // CompositeMeasure
