/**
 */
package org.atlanmod.analysis.algae;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measures computed by a non-finite set of measures
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.MeasureUnboundOperation#getVal <em>Val</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.MeasureUnboundOperation#getMeasures <em>Measures</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureUnboundOperation()
 * @model abstract="true"
 * @generated
 */
public interface MeasureUnboundOperation extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(BigDecimal)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureUnboundOperation_Val()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='0.0'"
	 * @generated
	 */
	BigDecimal getVal();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.MeasureUnboundOperation#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link org.atlanmod.analysis.algae.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureUnboundOperation_Measures()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Measure> getMeasures();

} // MeasureUnboundOperation
