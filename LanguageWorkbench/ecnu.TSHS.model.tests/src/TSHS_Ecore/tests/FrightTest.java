/**
 */
package TSHS_Ecore.tests;

import TSHS_Ecore.Fright;
import TSHS_Ecore.TSHS_EcoreFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fright</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrightTest extends TestCase {

	/**
	 * The fixture for this Fright test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fright fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FrightTest.class);
	}

	/**
	 * Constructs a new Fright test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrightTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fright test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Fright fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fright test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fright getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TSHS_EcoreFactory.eINSTANCE.createFright());
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

} //FrightTest
