/**
 */
package TSHS_Ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prob Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.ProbTransition#getProbability <em>Probability</em>}</li>
 *   <li>{@link TSHS_Ecore.ProbTransition#getPsrc <em>Psrc</em>}</li>
 *   <li>{@link TSHS_Ecore.ProbTransition#getPtgt <em>Ptgt</em>}</li>
 * </ul>
 *
 * @see TSHS_Ecore.TSHS_EcorePackage#getProbTransition()
 * @model
 * @generated
 */
public interface ProbTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(float)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getProbTransition_Probability()
	 * @model
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.ProbTransition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(float value);

	/**
	 * Returns the value of the '<em><b>Psrc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.State#getOutgoingpt <em>Outgoingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psrc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psrc</em>' reference.
	 * @see #setPsrc(State)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getProbTransition_Psrc()
	 * @see TSHS_Ecore.State#getOutgoingpt
	 * @model opposite="outgoingpt" required="true"
	 * @generated
	 */
	State getPsrc();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.ProbTransition#getPsrc <em>Psrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psrc</em>' reference.
	 * @see #getPsrc()
	 * @generated
	 */
	void setPsrc(State value);

	/**
	 * Returns the value of the '<em><b>Ptgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TSHS_Ecore.State#getIncomingpt <em>Incomingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptgt</em>' reference.
	 * @see #setPtgt(State)
	 * @see TSHS_Ecore.TSHS_EcorePackage#getProbTransition_Ptgt()
	 * @see TSHS_Ecore.State#getIncomingpt
	 * @model opposite="incomingpt" required="true"
	 * @generated
	 */
	State getPtgt();

	/**
	 * Sets the value of the '{@link TSHS_Ecore.ProbTransition#getPtgt <em>Ptgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ptgt</em>' reference.
	 * @see #getPtgt()
	 * @generated
	 */
	void setPtgt(State value);

} // ProbTransition
