/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Clock;
import TSHS_Ecore.ComTransition;
import TSHS_Ecore.Condition;
import TSHS_Ecore.DeVariable;
import TSHS_Ecore.EvaluateGuard;
import TSHS_Ecore.Event;
import TSHS_Ecore.EventGuard;
import TSHS_Ecore.Fright;
import TSHS_Ecore.Function;
import TSHS_Ecore.IndeVariable;
import TSHS_Ecore.Interval;
import TSHS_Ecore.ODE;
import TSHS_Ecore.ProbTransition;
import TSHS_Ecore.State;
import TSHS_Ecore.TSHS;
import TSHS_Ecore.TSHS_EcoreFactory;
import TSHS_Ecore.TSHS_EcorePackage;
import TSHS_Ecore.TemporalGuard;
import TSHS_Ecore.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TSHS_EcoreFactoryImpl extends EFactoryImpl implements TSHS_EcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TSHS_EcoreFactory init() {
		try {
			TSHS_EcoreFactory theTSHS_EcoreFactory = (TSHS_EcoreFactory)EPackage.Registry.INSTANCE.getEFactory(TSHS_EcorePackage.eNS_URI);
			if (theTSHS_EcoreFactory != null) {
				return theTSHS_EcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TSHS_EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS_EcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TSHS_EcorePackage.SYSTEM: return createSystem();
			case TSHS_EcorePackage.TSHS: return createTSHS();
			case TSHS_EcorePackage.VARIABLE: return createVariable();
			case TSHS_EcorePackage.CLOCK: return createClock();
			case TSHS_EcorePackage.EVENT: return createEvent();
			case TSHS_EcorePackage.TEMPORAL_GUARD: return createTemporalGuard();
			case TSHS_EcorePackage.EVENT_GUARD: return createEventGuard();
			case TSHS_EcorePackage.EVALUATE_GUARD: return createEvaluateGuard();
			case TSHS_EcorePackage.COM_TRANSITION: return createComTransition();
			case TSHS_EcorePackage.PROB_TRANSITION: return createProbTransition();
			case TSHS_EcorePackage.STATE: return createState();
			case TSHS_EcorePackage.ODE: return createODE();
			case TSHS_EcorePackage.FUNCTION: return createFunction();
			case TSHS_EcorePackage.INDE_VARIABLE: return createIndeVariable();
			case TSHS_EcorePackage.DE_VARIABLE: return createDeVariable();
			case TSHS_EcorePackage.FRIGHT: return createFright();
			case TSHS_EcorePackage.CONDITION: return createCondition();
			case TSHS_EcorePackage.INTERVAL: return createInterval();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS_Ecore.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS createTSHS() {
		TSHSImpl tshs = new TSHSImpl();
		return tshs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard() {
		TemporalGuardImpl temporalGuard = new TemporalGuardImpl();
		return temporalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuard createEventGuard() {
		EventGuardImpl eventGuard = new EventGuardImpl();
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard createEvaluateGuard() {
		EvaluateGuardImpl evaluateGuard = new EvaluateGuardImpl();
		return evaluateGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransition createComTransition() {
		ComTransitionImpl comTransition = new ComTransitionImpl();
		return comTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransition createProbTransition() {
		ProbTransitionImpl probTransition = new ProbTransitionImpl();
		return probTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE createODE() {
		ODEImpl ode = new ODEImpl();
		return ode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable createIndeVariable() {
		IndeVariableImpl indeVariable = new IndeVariableImpl();
		return indeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable createDeVariable() {
		DeVariableImpl deVariable = new DeVariableImpl();
		return deVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright createFright() {
		FrightImpl fright = new FrightImpl();
		return fright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS_EcorePackage getTSHS_EcorePackage() {
		return (TSHS_EcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TSHS_EcorePackage getPackage() {
		return TSHS_EcorePackage.eINSTANCE;
	}

} //TSHS_EcoreFactoryImpl
