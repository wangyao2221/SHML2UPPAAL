/**
 */
package TSHS_Ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.EvaluateGuard#getVcondition <em>Vcondition</em>}</li>
 *   <li>{@link TSHS_Ecore.EvaluateGuard#getOnvariable <em>Onvariable</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getEvaluateGuard()
 * @model
 * @generated
 */
public interface EvaluateGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Vcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcondition</em>' attribute.
	 * @see #setVcondition(String)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getEvaluateGuard_Vcondition()
	 * @model
	 * @generated
	 */
	String getVcondition();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.EvaluateGuard#getVcondition <em>Vcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcondition</em>' attribute.
	 * @see #getVcondition()
	 * @generated
	 */
	void setVcondition(String value);

	/**
	 * Returns the value of the '<em><b>Onvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onvariable</em>' reference.
	 * @see #setOnvariable(Variable)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getEvaluateGuard_Onvariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getOnvariable();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.EvaluateGuard#getOnvariable <em>Onvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onvariable</em>' reference.
	 * @see #getOnvariable()
	 * @generated
	 */
	void setOnvariable(Variable value);

} // EvaluateGuard
