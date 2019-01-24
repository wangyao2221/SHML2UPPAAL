/**
 */
package TSHS_Ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.State#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getOutgoingct <em>Outgoingct</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getIncomingct <em>Incomingct</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getOutgoingpt <em>Outgoingpt</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getIncomingpt <em>Incomingpt</em>}</li>
 *   <li>{@link TSHS_Ecore.State#getUrgent <em>Urgent</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaveode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaveode</em>' reference.
	 * @see #setSlaveode(ODE)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Slaveode()
	 * @model required="true"
	 * @generated
	 */
	ODE getSlaveode();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.State#getSlaveode <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slaveode</em>' reference.
	 * @see #getSlaveode()
	 * @generated
	 */
	void setSlaveode(ODE value);

	/**
	 * Returns the value of the '<em><b>Outgoingct</b></em>' reference list.
	 * The list contents are of type {@link TSHS_Ecore.ComTransition}.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingct</em>' reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Outgoingct()
	 * @see TSHS_Ecore.ComTransition#getCsrc
	 * @model opposite="csrc"
	 * @generated
	 */
	EList<ComTransition> getOutgoingct();

	/**
	 * Returns the value of the '<em><b>Incomingct</b></em>' reference list.
	 * The list contents are of type {@link TSHS_Ecore.ComTransition}.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomingct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingct</em>' reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Incomingct()
	 * @see TSHS_Ecore.ComTransition#getCtgt
	 * @model opposite="ctgt"
	 * @generated
	 */
	EList<ComTransition> getIncomingct();

	/**
	 * Returns the value of the '<em><b>Outgoingpt</b></em>' reference list.
	 * The list contents are of type {@link TSHS_Ecore.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingpt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingpt</em>' reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Outgoingpt()
	 * @see TSHS_Ecore.ProbTransition#getPsrc
	 * @model opposite="psrc"
	 * @generated
	 */
	EList<ProbTransition> getOutgoingpt();

	/**
	 * Returns the value of the '<em><b>Incomingpt</b></em>' reference list.
	 * The list contents are of type {@link TSHS_Ecore.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomingpt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingpt</em>' reference list.
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Incomingpt()
	 * @see TSHS_Ecore.ProbTransition#getPtgt
	 * @model opposite="ptgt"
	 * @generated
	 */
	EList<ProbTransition> getIncomingpt();

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(int)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getState_Urgent()
	 * @model
	 * @generated
	 */
	int getUrgent();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.State#getUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #getUrgent()
	 * @generated
	 */
	void setUrgent(int value);

} // State
