/**
 */
package org.atlanmod.analysis.algae;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.Variable#getVibility <em>Vibility</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.atlanmod.analysis.algae.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vibility</em>' attribute.
	 * @see org.atlanmod.analysis.algae.Visibility
	 * @see #setVibility(Visibility)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getVariable_Vibility()
	 * @model required="true"
	 * @generated
	 */
	Visibility getVibility();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.Variable#getVibility <em>Vibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vibility</em>' attribute.
	 * @see org.atlanmod.analysis.algae.Visibility
	 * @see #getVibility()
	 * @generated
	 */
	void setVibility(Visibility value);

} // Variable
