/**
 */
package TSHS_Ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.EventGuard#getEcondition <em>Econdition</em>}</li>
 *   <li>{@link TSHS_Ecore.EventGuard#getOnevent <em>Onevent</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getEventGuard()
 * @model
 * @generated
 */
public interface EventGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Econdition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Econdition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Econdition</em>' attribute.
	 * @see #setEcondition(String)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getEventGuard_Econdition()
	 * @model
	 * @generated
	 */
	String getEcondition();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.EventGuard#getEcondition <em>Econdition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Econdition</em>' attribute.
	 * @see #getEcondition()
	 * @generated
	 */
	void setEcondition(String value);

	/**
	 * Returns the value of the '<em><b>Onevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onevent</em>' reference.
	 * @see #setOnevent(Event)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getEventGuard_Onevent()
	 * @model required="true"
	 * @generated
	 */
	Event getOnevent();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.EventGuard#getOnevent <em>Onevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onevent</em>' reference.
	 * @see #getOnevent()
	 * @generated
	 */
	void setOnevent(Event value);

} // EventGuard
