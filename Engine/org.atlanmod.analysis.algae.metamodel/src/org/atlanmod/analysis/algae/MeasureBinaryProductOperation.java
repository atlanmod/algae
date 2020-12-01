/**
 */
package org.atlanmod.analysis.algae;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Binary Product Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiplies the value of two measures. No type checking
 * <!-- end-model-doc -->
 *
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureBinaryProductOperation()
 * @model
 * @generated
 */
public interface MeasureBinaryProductOperation extends MeasureBinaryOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.left.value() * self.right.value()'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureBinaryProductOperation
