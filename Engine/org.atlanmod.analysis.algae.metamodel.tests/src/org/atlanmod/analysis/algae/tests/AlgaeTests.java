/**
 */
package org.atlanmod.analysis.algae.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>algae</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgaeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AlgaeTests("algae Tests");
		suite.addTestSuite(MeasureValueTest.class);
		suite.addTestSuite(MeasureOCLTest.class);
		suite.addTestSuite(MeasureAttributeTest.class);
		suite.addTestSuite(MeasureCastTest.class);
		suite.addTestSuite(RealTimeDurationTest.class);
		suite.addTestSuite(MeasureUnboundSumOperationTest.class);
		suite.addTestSuite(MeasureUnboundSubstractOperationTest.class);
		suite.addTestSuite(MeasureUnboundProductOperationTest.class);
		suite.addTestSuite(MeasureUnboundDivisionOperationTest.class);
		suite.addTestSuite(NormalDistributionTest.class);
		suite.addTestSuite(CompositeMeasureTest.class);
		suite.addTestSuite(LogisticMeasureTest.class);
		suite.addTestSuite(ExponentialMeasureTest.class);
		suite.addTestSuite(IntegrationMeasureTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgaeTests(String name) {
		super(name);
	}

} //AlgaeTests
