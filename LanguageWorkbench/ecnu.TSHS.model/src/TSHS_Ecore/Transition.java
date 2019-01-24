/**
 */
package TSHS_Ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.Transition#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link TSHS_Ecore.Transition#getOwnedguard <em>Ownedguard</em>}</li>
 *   <li>{@link TSHS_Ecore.Transition#getTriggerevent <em>Triggerevent</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTransition_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.Transition#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Ownedguard</b></em>' containment reference list.
	 * The list contents are of type {@link TSHS_Ecore.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedguard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedguard</em>' containment reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTransition_Ownedguard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getOwnedguard();

	/**
	 * Returns the value of the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerevent</em>' reference.
	 * @see #setTriggerevent(Event)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getTransition_Triggerevent()
	 * @model required="true"
	 * @generated
	 */
	Event getTriggerevent();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.Transition#getTriggerevent <em>Triggerevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggerevent</em>' reference.
	 * @see #getTriggerevent()
	 * @generated
	 */
	void setTriggerevent(Event value);

} // Transition
