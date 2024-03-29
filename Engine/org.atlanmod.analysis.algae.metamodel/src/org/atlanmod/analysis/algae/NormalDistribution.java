/**
 */
package org.atlanmod.analysis.algae;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.analysis.algae.NormalDistribution#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.atlanmod.analysis.algae.NormalDistribution#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.analysis.algae.AlgaePackage#getNormalDistribution()
 * @model
 * @generated
 */
public interface NormalDistribution extends MeasurementUncertaintyInformation {
	/**
	 * Returns the value of the '<em><b>Mean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Value</em>' attribute.
	 * @see #setMeanValue(BigDecimal)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getNormalDistribution_MeanValue()
	 * @model derived="true"
	 * @generated
	 */
	BigDecimal getMeanValue();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.NormalDistribution#getMeanValue <em>Mean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Value</em>' attribute.
	 * @see #getMeanValue()
	 * @generated
	 */
	void setMeanValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Deviation</em>' attribute.
	 * @see #setStandardDeviation(BigDecimal)
	 * @see org.atlanmod.analysis.algae.AlgaePackage#getNormalDistribution_StandardDeviation()
	 * @model derived="true"
	 * @generated
	 */
	BigDecimal getStandardDeviation();

	/**
	 * Sets the value of the '{@link org.atlanmod.analysis.algae.NormalDistribution#getStandardDeviation <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Deviation</em>' attribute.
	 * @see #getStandardDeviation()
	 * @generated
	 */
	void setStandardDeviation(BigDecimal value);

} // NormalDistribution
