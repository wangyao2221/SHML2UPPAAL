/**
 */
package TSHS_Ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.ComTransition#getCsrc <em>Csrc</em>}</li>
 *   <li>{@link TSHS_Ecore.ComTransition#getCtgt <em>Ctgt</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getComTransition()
 * @model
 * @generated
 */
public interface ComTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Csrc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.State#getOutgoingct <em>Outgoingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csrc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csrc</em>' reference.
	 * @see #setCsrc(State)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getComTransition_Csrc()
	 * @see TSHS_Ecore.State#getOutgoingct
	 * @model opposite="outgoingct" required="true"
	 * @generated
	 */
	State getCsrc();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.ComTransition#getCsrc <em>Csrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csrc</em>' reference.
	 * @see #getCsrc()
	 * @generated
	 */
	void setCsrc(State value);

	/**
	 * Returns the value of the '<em><b>Ctgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.State#getIncomingct <em>Incomingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctgt</em>' reference.
	 * @see #setCtgt(State)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getComTransition_Ctgt()
	 * @see TSHS_Ecore.State#getIncomingct
	 * @model opposite="incomingct" required="true"
	 * @generated
	 */
	State getCtgt();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.ComTransition#getCtgt <em>Ctgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctgt</em>' reference.
	 * @see #getCtgt()
	 * @generated
	 */
	void setCtgt(State value);

} // ComTransition
