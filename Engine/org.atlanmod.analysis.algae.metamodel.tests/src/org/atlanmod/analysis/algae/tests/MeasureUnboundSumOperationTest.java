/**
 */
package org.atlanmod.analysis.algae.tests;

import junit.textui.TestRunner;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.MeasureUnboundSumOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Unbound Sum Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureUnboundSumOperationTest extends MeasureUnboundOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureUnboundSumOperationTest.class);
	}

	/**
	 * Constructs a new Measure Unbound Sum Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundSumOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure Unbound Sum Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureUnboundSumOperation getFixture() {
		return (MeasureUnboundSumOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgaeFactory.eINSTANCE.createMeasureUnboundSumOperation());
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

} //MeasureUnboundSumOperationTest
