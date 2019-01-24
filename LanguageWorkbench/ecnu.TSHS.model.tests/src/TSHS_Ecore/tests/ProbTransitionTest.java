/**
 */
package TSHS_Ecore.tests;

import TSHS_Ecore.ProbTransition;
import TSHS_Ecore.TSHS_EcoreFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prob Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbTransitionTest.class);
	}

	/**
	 * Constructs a new Prob Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prob Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProbTransition getFixture() {
		return (ProbTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TSHS_EcoreFactory.eINSTANCE.createProbTransition());
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

} //ProbTransitionTest
