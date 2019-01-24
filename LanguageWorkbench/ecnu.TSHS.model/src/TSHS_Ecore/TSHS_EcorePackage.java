/**
 */
package TSHS_Ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TSHS_Ecore.TSHS_EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface TSHS_EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TSHS_Ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/TSHS_Ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TSHS_Ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TSHS_EcorePackage eINSTANCE = TSHS_Ecore.impl.TSHS_EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.SystemImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Tshss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TSHSS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Globalvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALVARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Globalclocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALCLOCKS = 3;

	/**
	 * The feature id for the '<em><b>Globalevents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALEVENTS = 4;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.TSHSImpl <em>TSHS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.TSHSImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTSHS()
	 * @generated
	 */
	int TSHS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__INITIALSTATE = 1;

	/**
	 * The feature id for the '<em><b>Ownedodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDODES = 2;

	/**
	 * The feature id for the '<em><b>Localvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALVARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Localevents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALEVENTS = 4;

	/**
	 * The feature id for the '<em><b>Localclock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALCLOCK = 5;

	/**
	 * The feature id for the '<em><b>Ownedtransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDTRANSITIONS = 6;

	/**
	 * The feature id for the '<em><b>Ownedstates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDSTATES = 7;

	/**
	 * The number of structural features of the '<em>TSHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TSHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.VariableImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.ClockImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ticks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__TICKS = 1;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.EventImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.TransitionImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Ownedguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNEDGUARD = 2;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGEREVENT = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.GuardImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.TemporalGuardImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTemporalGuard()
	 * @generated
	 */
	int TEMPORAL_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Tcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__TCONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onclock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__ONCLOCK = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.EventGuardImpl <em>Event Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.EventGuardImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEventGuard()
	 * @generated
	 */
	int EVENT_GUARD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Econdition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__ECONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD__ONEVENT = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.EvaluateGuardImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEvaluateGuard()
	 * @generated
	 */
	int EVALUATE_GUARD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Vcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__VCONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__ONVARIABLE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.ComTransitionImpl <em>Com Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.ComTransitionImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getComTransition()
	 * @generated
	 */
	int COM_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__ACTION = TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Ownedguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__OWNEDGUARD = TRANSITION__OWNEDGUARD;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__TRIGGEREVENT = TRANSITION__TRIGGEREVENT;

	/**
	 * The feature id for the '<em><b>Csrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CSRC = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CTGT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.ProbTransitionImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getProbTransition()
	 * @generated
	 */
	int PROB_TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__ACTION = TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Ownedguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__OWNEDGUARD = TRANSITION__OWNEDGUARD;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__TRIGGEREVENT = TRANSITION__TRIGGEREVENT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Psrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PSRC = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ptgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PTGT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.StateImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SLAVEODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoingct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGCT = 2;

	/**
	 * The feature id for the '<em><b>Incomingct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMINGCT = 3;

	/**
	 * The feature id for the '<em><b>Outgoingpt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGPT = 4;

	/**
	 * The feature id for the '<em><b>Incomingpt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMINGPT = 5;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__URGENT = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.ODEImpl <em>ODE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.ODEImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getODE()
	 * @generated
	 */
	int ODE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.FunctionImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indevariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INDEVARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Devariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Fright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FRIGHT = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.IndeVariableImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getIndeVariable()
	 * @generated
	 */
	int INDE_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.DeVariableImpl <em>De Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.DeVariableImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getDeVariable()
	 * @generated
	 */
	int DE_VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.FrightImpl <em>Fright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.FrightImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getFright()
	 * @generated
	 */
	int FRIGHT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.ConditionImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TSHS_Ecore.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TSHS_Ecore.impl.IntervalImpl
	 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Subinterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__SUBINTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see TSHS_Ecore.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.System#getTshss <em>Tshss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tshss</em>'.
	 * @see TSHS_Ecore.System#getTshss()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Tshss();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.System#getGlobalvariables <em>Globalvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalvariables</em>'.
	 * @see TSHS_Ecore.System#getGlobalvariables()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalvariables();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.System#getGlobalclocks <em>Globalclocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalclocks</em>'.
	 * @see TSHS_Ecore.System#getGlobalclocks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalclocks();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.System#getGlobalevents <em>Globalevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalevents</em>'.
	 * @see TSHS_Ecore.System#getGlobalevents()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalevents();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.TSHS <em>TSHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSHS</em>'.
	 * @see TSHS_Ecore.TSHS
	 * @generated
	 */
	EClass getTSHS();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.TSHS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.TSHS#getName()
	 * @see #getTSHS()
	 * @generated
	 */
	EAttribute getTSHS_Name();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.TSHS#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see TSHS_Ecore.TSHS#getInitialstate()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Initialstate();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.TSHS#getOwnedodes <em>Ownedodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedodes</em>'.
	 * @see TSHS_Ecore.TSHS#getOwnedodes()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedodes();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.TSHS#getLocalvariables <em>Localvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localvariables</em>'.
	 * @see TSHS_Ecore.TSHS#getLocalvariables()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localvariables();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.TSHS#getLocalevents <em>Localevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localevents</em>'.
	 * @see TSHS_Ecore.TSHS#getLocalevents()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localevents();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.TSHS#getLocalclock <em>Localclock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localclock</em>'.
	 * @see TSHS_Ecore.TSHS#getLocalclock()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localclock();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.TSHS#getOwnedtransitions <em>Ownedtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedtransitions</em>'.
	 * @see TSHS_Ecore.TSHS#getOwnedtransitions()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedtransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.TSHS#getOwnedstates <em>Ownedstates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedstates</em>'.
	 * @see TSHS_Ecore.TSHS#getOwnedstates()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedstates();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see TSHS_Ecore.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TSHS_Ecore.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see TSHS_Ecore.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Clock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Clock#getName()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Name();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Clock#getTicks <em>Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticks</em>'.
	 * @see TSHS_Ecore.Clock#getTicks()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Ticks();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see TSHS_Ecore.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see TSHS_Ecore.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see TSHS_Ecore.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link TSHS_Ecore.Transition#getOwnedguard <em>Ownedguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedguard</em>'.
	 * @see TSHS_Ecore.Transition#getOwnedguard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Ownedguard();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.Transition#getTriggerevent <em>Triggerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggerevent</em>'.
	 * @see TSHS_Ecore.Transition#getTriggerevent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Triggerevent();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see TSHS_Ecore.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Guard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Guard#getName()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Guard</em>'.
	 * @see TSHS_Ecore.TemporalGuard
	 * @generated
	 */
	EClass getTemporalGuard();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.TemporalGuard#getTcondition <em>Tcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcondition</em>'.
	 * @see TSHS_Ecore.TemporalGuard#getTcondition()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EAttribute getTemporalGuard_Tcondition();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.TemporalGuard#getOnclock <em>Onclock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onclock</em>'.
	 * @see TSHS_Ecore.TemporalGuard#getOnclock()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EReference getTemporalGuard_Onclock();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.EventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Guard</em>'.
	 * @see TSHS_Ecore.EventGuard
	 * @generated
	 */
	EClass getEventGuard();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.EventGuard#getEcondition <em>Econdition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Econdition</em>'.
	 * @see TSHS_Ecore.EventGuard#getEcondition()
	 * @see #getEventGuard()
	 * @generated
	 */
	EAttribute getEventGuard_Econdition();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.EventGuard#getOnevent <em>Onevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onevent</em>'.
	 * @see TSHS_Ecore.EventGuard#getOnevent()
	 * @see #getEventGuard()
	 * @generated
	 */
	EReference getEventGuard_Onevent();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Guard</em>'.
	 * @see TSHS_Ecore.EvaluateGuard
	 * @generated
	 */
	EClass getEvaluateGuard();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.EvaluateGuard#getVcondition <em>Vcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcondition</em>'.
	 * @see TSHS_Ecore.EvaluateGuard#getVcondition()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EAttribute getEvaluateGuard_Vcondition();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.EvaluateGuard#getOnvariable <em>Onvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onvariable</em>'.
	 * @see TSHS_Ecore.EvaluateGuard#getOnvariable()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EReference getEvaluateGuard_Onvariable();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.ComTransition <em>Com Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Transition</em>'.
	 * @see TSHS_Ecore.ComTransition
	 * @generated
	 */
	EClass getComTransition();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Csrc</em>'.
	 * @see TSHS_Ecore.ComTransition#getCsrc()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Csrc();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctgt</em>'.
	 * @see TSHS_Ecore.ComTransition#getCtgt()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Ctgt();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.ProbTransition <em>Prob Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Transition</em>'.
	 * @see TSHS_Ecore.ProbTransition
	 * @generated
	 */
	EClass getProbTransition();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.ProbTransition#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see TSHS_Ecore.ProbTransition#getProbability()
	 * @see #getProbTransition()
	 * @generated
	 */
	EAttribute getProbTransition_Probability();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Psrc</em>'.
	 * @see TSHS_Ecore.ProbTransition#getPsrc()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Psrc();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ptgt</em>'.
	 * @see TSHS_Ecore.ProbTransition#getPtgt()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Ptgt();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see TSHS_Ecore.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link TSHS_Ecore.State#getSlaveode <em>Slaveode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slaveode</em>'.
	 * @see TSHS_Ecore.State#getSlaveode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Slaveode();

	/**
	 * Returns the meta object for the reference list '{@link TSHS_Ecore.State#getOutgoingct <em>Outgoingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingct</em>'.
	 * @see TSHS_Ecore.State#getOutgoingct()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoingct();

	/**
	 * Returns the meta object for the reference list '{@link TSHS_Ecore.State#getIncomingct <em>Incomingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomingct</em>'.
	 * @see TSHS_Ecore.State#getIncomingct()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomingct();

	/**
	 * Returns the meta object for the reference list '{@link TSHS_Ecore.State#getOutgoingpt <em>Outgoingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingpt</em>'.
	 * @see TSHS_Ecore.State#getOutgoingpt()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoingpt();

	/**
	 * Returns the meta object for the reference list '{@link TSHS_Ecore.State#getIncomingpt <em>Incomingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomingpt</em>'.
	 * @see TSHS_Ecore.State#getIncomingpt()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomingpt();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.State#getUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see TSHS_Ecore.State#getUrgent()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Urgent();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.ODE <em>ODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ODE</em>'.
	 * @see TSHS_Ecore.ODE
	 * @generated
	 */
	EClass getODE();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.ODE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.ODE#getName()
	 * @see #getODE()
	 * @generated
	 */
	EAttribute getODE_Name();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.ODE#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see TSHS_Ecore.ODE#getFunction()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Function();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.ODE#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see TSHS_Ecore.ODE#getInterval()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.ODE#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see TSHS_Ecore.ODE#getCondition()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Condition();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see TSHS_Ecore.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.Function#getIndevariable <em>Indevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indevariable</em>'.
	 * @see TSHS_Ecore.Function#getIndevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Indevariable();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.Function#getDevariable <em>Devariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devariable</em>'.
	 * @see TSHS_Ecore.Function#getDevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Devariable();

	/**
	 * Returns the meta object for the containment reference '{@link TSHS_Ecore.Function#getFright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fright</em>'.
	 * @see TSHS_Ecore.Function#getFright()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Fright();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.IndeVariable <em>Inde Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inde Variable</em>'.
	 * @see TSHS_Ecore.IndeVariable
	 * @generated
	 */
	EClass getIndeVariable();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.IndeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.IndeVariable#getName()
	 * @see #getIndeVariable()
	 * @generated
	 */
	EAttribute getIndeVariable_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.DeVariable <em>De Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Variable</em>'.
	 * @see TSHS_Ecore.DeVariable
	 * @generated
	 */
	EClass getDeVariable();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.DeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.DeVariable#getName()
	 * @see #getDeVariable()
	 * @generated
	 */
	EAttribute getDeVariable_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Fright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fright</em>'.
	 * @see TSHS_Ecore.Fright
	 * @generated
	 */
	EClass getFright();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Fright#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Fright#getName()
	 * @see #getFright()
	 * @generated
	 */
	EAttribute getFright_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see TSHS_Ecore.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link TSHS_Ecore.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see TSHS_Ecore.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Interval#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TSHS_Ecore.Interval#getName()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Name();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Interval#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see TSHS_Ecore.Interval#getLeft()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Left();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Interval#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see TSHS_Ecore.Interval#getRight()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Right();

	/**
	 * Returns the meta object for the attribute '{@link TSHS_Ecore.Interval#getSubinterval <em>Subinterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subinterval</em>'.
	 * @see TSHS_Ecore.Interval#getSubinterval()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Subinterval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TSHS_EcoreFactory getTSHS_EcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.SystemImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Tshss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TSHSS = eINSTANCE.getSystem_Tshss();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Globalvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALVARIABLES = eINSTANCE.getSystem_Globalvariables();

		/**
		 * The meta object literal for the '<em><b>Globalclocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALCLOCKS = eINSTANCE.getSystem_Globalclocks();

		/**
		 * The meta object literal for the '<em><b>Globalevents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALEVENTS = eINSTANCE.getSystem_Globalevents();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.TSHSImpl <em>TSHS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.TSHSImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTSHS()
		 * @generated
		 */
		EClass TSHS = eINSTANCE.getTSHS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSHS__NAME = eINSTANCE.getTSHS_Name();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__INITIALSTATE = eINSTANCE.getTSHS_Initialstate();

		/**
		 * The meta object literal for the '<em><b>Ownedodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDODES = eINSTANCE.getTSHS_Ownedodes();

		/**
		 * The meta object literal for the '<em><b>Localvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALVARIABLES = eINSTANCE.getTSHS_Localvariables();

		/**
		 * The meta object literal for the '<em><b>Localevents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALEVENTS = eINSTANCE.getTSHS_Localevents();

		/**
		 * The meta object literal for the '<em><b>Localclock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALCLOCK = eINSTANCE.getTSHS_Localclock();

		/**
		 * The meta object literal for the '<em><b>Ownedtransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDTRANSITIONS = eINSTANCE.getTSHS_Ownedtransitions();

		/**
		 * The meta object literal for the '<em><b>Ownedstates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDSTATES = eINSTANCE.getTSHS_Ownedstates();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.VariableImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.ClockImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__NAME = eINSTANCE.getClock_Name();

		/**
		 * The meta object literal for the '<em><b>Ticks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__TICKS = eINSTANCE.getClock_Ticks();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.EventImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.TransitionImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Ownedguard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OWNEDGUARD = eINSTANCE.getTransition_Ownedguard();

		/**
		 * The meta object literal for the '<em><b>Triggerevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGEREVENT = eINSTANCE.getTransition_Triggerevent();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.GuardImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.TemporalGuardImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getTemporalGuard()
		 * @generated
		 */
		EClass TEMPORAL_GUARD = eINSTANCE.getTemporalGuard();

		/**
		 * The meta object literal for the '<em><b>Tcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GUARD__TCONDITION = eINSTANCE.getTemporalGuard_Tcondition();

		/**
		 * The meta object literal for the '<em><b>Onclock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GUARD__ONCLOCK = eINSTANCE.getTemporalGuard_Onclock();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.EventGuardImpl <em>Event Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.EventGuardImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEventGuard()
		 * @generated
		 */
		EClass EVENT_GUARD = eINSTANCE.getEventGuard();

		/**
		 * The meta object literal for the '<em><b>Econdition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_GUARD__ECONDITION = eINSTANCE.getEventGuard_Econdition();

		/**
		 * The meta object literal for the '<em><b>Onevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GUARD__ONEVENT = eINSTANCE.getEventGuard_Onevent();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.EvaluateGuardImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getEvaluateGuard()
		 * @generated
		 */
		EClass EVALUATE_GUARD = eINSTANCE.getEvaluateGuard();

		/**
		 * The meta object literal for the '<em><b>Vcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE_GUARD__VCONDITION = eINSTANCE.getEvaluateGuard_Vcondition();

		/**
		 * The meta object literal for the '<em><b>Onvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_GUARD__ONVARIABLE = eINSTANCE.getEvaluateGuard_Onvariable();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.ComTransitionImpl <em>Com Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.ComTransitionImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getComTransition()
		 * @generated
		 */
		EClass COM_TRANSITION = eINSTANCE.getComTransition();

		/**
		 * The meta object literal for the '<em><b>Csrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CSRC = eINSTANCE.getComTransition_Csrc();

		/**
		 * The meta object literal for the '<em><b>Ctgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CTGT = eINSTANCE.getComTransition_Ctgt();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.ProbTransitionImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getProbTransition()
		 * @generated
		 */
		EClass PROB_TRANSITION = eINSTANCE.getProbTransition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_TRANSITION__PROBABILITY = eINSTANCE.getProbTransition_Probability();

		/**
		 * The meta object literal for the '<em><b>Psrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PSRC = eINSTANCE.getProbTransition_Psrc();

		/**
		 * The meta object literal for the '<em><b>Ptgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PTGT = eINSTANCE.getProbTransition_Ptgt();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.StateImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Slaveode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SLAVEODE = eINSTANCE.getState_Slaveode();

		/**
		 * The meta object literal for the '<em><b>Outgoingct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGCT = eINSTANCE.getState_Outgoingct();

		/**
		 * The meta object literal for the '<em><b>Incomingct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMINGCT = eINSTANCE.getState_Incomingct();

		/**
		 * The meta object literal for the '<em><b>Outgoingpt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGPT = eINSTANCE.getState_Outgoingpt();

		/**
		 * The meta object literal for the '<em><b>Incomingpt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMINGPT = eINSTANCE.getState_Incomingpt();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__URGENT = eINSTANCE.getState_Urgent();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.ODEImpl <em>ODE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.ODEImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getODE()
		 * @generated
		 */
		EClass ODE = eINSTANCE.getODE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODE__NAME = eINSTANCE.getODE_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__FUNCTION = eINSTANCE.getODE_Function();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__INTERVAL = eINSTANCE.getODE_Interval();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__CONDITION = eINSTANCE.getODE_Condition();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.FunctionImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Indevariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INDEVARIABLE = eINSTANCE.getFunction_Indevariable();

		/**
		 * The meta object literal for the '<em><b>Devariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DEVARIABLE = eINSTANCE.getFunction_Devariable();

		/**
		 * The meta object literal for the '<em><b>Fright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FRIGHT = eINSTANCE.getFunction_Fright();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.IndeVariableImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getIndeVariable()
		 * @generated
		 */
		EClass INDE_VARIABLE = eINSTANCE.getIndeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDE_VARIABLE__NAME = eINSTANCE.getIndeVariable_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.DeVariableImpl <em>De Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.DeVariableImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getDeVariable()
		 * @generated
		 */
		EClass DE_VARIABLE = eINSTANCE.getDeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_VARIABLE__NAME = eINSTANCE.getDeVariable_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.FrightImpl <em>Fright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.FrightImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getFright()
		 * @generated
		 */
		EClass FRIGHT = eINSTANCE.getFright();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIGHT__NAME = eINSTANCE.getFright_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.ConditionImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link TSHS_Ecore.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TSHS_Ecore.impl.IntervalImpl
		 * @see TSHS_Ecore.impl.TSHS_EcorePackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__NAME = eINSTANCE.getInterval_Name();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__LEFT = eINSTANCE.getInterval_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__RIGHT = eINSTANCE.getInterval_Right();

		/**
		 * The meta object literal for the '<em><b>Subinterval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__SUBINTERVAL = eINSTANCE.getInterval_Subinterval();

	}

} //TSHS_EcorePackage
