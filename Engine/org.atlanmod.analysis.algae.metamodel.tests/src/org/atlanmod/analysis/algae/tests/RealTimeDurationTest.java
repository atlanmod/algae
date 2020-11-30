/**
 */
package org.atlanmod.analysis.algae.tests;

import junit.textui.TestRunner;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.RealTimeDuration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Real Time Duration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealTimeDurationTest extends MeasureValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RealTimeDurationTest.class);
	}

	/**
	 * Constructs a new Real Time Duration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTimeDurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Real Time Duration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RealTimeDuration getFixture() {
		return (RealTimeDuration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgaeFactory.eINSTANCE.createRealTimeDuration());
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

} //RealTimeDurationTest
