/**
 */
package TSHS_Ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.System#getTshss <em>Tshss</em>}</li>
 *   <li>{@link TSHS_Ecore.System#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.System#getGlobalvariables <em>Globalvariables</em>}</li>
 *   <li>{@link TSHS_Ecore.System#getGlobalclocks <em>Globalclocks</em>}</li>
 *   <li>{@link TSHS_Ecore.System#getGlobalevents <em>Globalevents</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Tshss</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.TSHS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tshss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tshss</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem_Tshss()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSHS> getTshss();

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
	 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Globalvariables</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalvariables</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem_Globalvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getGlobalvariables();

	/**
	 * Returns the value of the '<em><b>Globalclocks</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalclocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalclocks</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem_Globalclocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clock> getGlobalclocks();

	/**
	 * Returns the value of the '<em><b>Globalevents</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalevents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalevents</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getSystem_Globalevents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getGlobalevents();

} // System
