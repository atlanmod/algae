/**
 */
package org.atlanmod.analysis.algae.tests;

import junit.textui.TestRunner;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.Integral;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integral</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegralTest extends MeasurementUncertaintyInformationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegralTest.class);
	}

	/**
	 * Constructs a new Integral test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integral test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Integral getFixture() {
		return (Integral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgaeFactory.eINSTANCE.createIntegral());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegralTest
