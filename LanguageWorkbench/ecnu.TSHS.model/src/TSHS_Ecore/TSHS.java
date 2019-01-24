/**
 */
package TSHS_Ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSHS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.TSHS#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getOwnedodes <em>Ownedodes</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getLocalvariables <em>Localvariables</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getLocalevents <em>Localevents</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getLocalclock <em>Localclock</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getOwnedtransitions <em>Ownedtransitions</em>}</li>
 *   <li>{@link TSHS_Ecore.TSHS#getOwnedstates <em>Ownedstates</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS()
 * @model
 * @generated
 */
public interface TSHS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.TSHS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(State)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Initialstate()
	 * @model required="true"
	 * @generated
	 */
	State getInitialstate();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.TSHS#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(State value);

	/**
	 * Returns the value of the '<em><b>Ownedodes</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.ODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedodes</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Ownedodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODE> getOwnedodes();

	/**
	 * Returns the value of the '<em><b>Localvariables</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localvariables</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Localvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocalvariables();

	/**
	 * Returns the value of the '<em><b>Localevents</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localevents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localevents</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Localevents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getLocalevents();

	/**
	 * Returns the value of the '<em><b>Localclock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localclock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localclock</em>' containment reference.
	 * @see #setLocalclock(Clock)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Localclock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Clock getLocalclock();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.TSHS#getLocalclock <em>Localclock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localclock</em>' containment reference.
	 * @see #getLocalclock()
	 * @generated
	 */
	void setLocalclock(Clock value);

	/**
	 * Returns the value of the '<em><b>Ownedtransitions</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedtransitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedtransitions</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Ownedtransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedtransitions();

	/**
	 * Returns the value of the '<em><b>Ownedstates</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedstates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedstates</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTSHS_Ownedstates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedstates();

} // TSHS
