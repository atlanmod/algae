/**
 */
package org.atlanmod.analysis.algae.tests;

import junit.textui.TestRunner;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.MeasureUnboundDivisionOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Unbound Division Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureUnboundDivisionOperationTest extends MeasureUnboundOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasureUnboundDivisionOperationTest.class);
	}

	/**
	 * Constructs a new Measure Unbound Division Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureUnboundDivisionOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measure Unbound Division Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasureUnboundDivisionOperation getFixture() {
		return (MeasureUnboundDivisionOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlgaeFactory.eINSTANCE.createMeasureUnboundDivisionOperation());
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

} //MeasureUnboundDivisionOperationTest
