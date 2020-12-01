/**
 */
package org.atlanmod.analysis.algae;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define the measure computed through operations between measures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.MeasureBinaryOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.MeasureBinaryOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureBinaryOperation()
 * @model abstract="true"
 * @generated
 */
public interface MeasureBinaryOperation extends TypedMeasure {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureBinaryOperation_Left()
	 * @model
	 * @generated
	 */
	Measure getLeft();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.MeasureBinaryOperation#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Measure value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Measure)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureBinaryOperation_Right()
	 * @model
	 * @generated
	 */
	Measure getRight();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.MeasureBinaryOperation#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Measure value);

} // MeasureBinaryOperation
