/**
 */
package org.atlanmod.analysis.algae;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure OCL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.MeasureOCL#getOclQuery <em>Ocl Query</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureOCL()
 * @model
 * @generated
 */
public interface MeasureOCL extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Query</em>' attribute.
	 * @see #setOclQuery(String)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getMeasureOCL_OclQuery()
	 * @model
	 * @generated
	 */
	String getOclQuery();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.MeasureOCL#getOclQuery <em>Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Query</em>' attribute.
	 * @see #getOclQuery()
	 * @generated
	 */
	void setOclQuery(String value);

} // MeasureOCL
