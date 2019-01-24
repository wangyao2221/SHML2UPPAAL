/**
 */
package TSHS_Ecore.util;

import TSHS_Ecore.Clock;
import TSHS_Ecore.ComTransition;
import TSHS_Ecore.Condition;
import TSHS_Ecore.DeVariable;
import TSHS_Ecore.EvaluateGuard;
import TSHS_Ecore.Event;
import TSHS_Ecore.EventGuard;
import TSHS_Ecore.Fright;
import TSHS_Ecore.Function;
import TSHS_Ecore.Guard;
import TSHS_Ecore.IndeVariable;
import TSHS_Ecore.Interval;
import TSHS_Ecore.ODE;
import TSHS_Ecore.ProbTransition;
import TSHS_Ecore.State;
import TSHS_Ecore.TSHS;
import TSHS_Ecore.TSHS_EcorePackage;
import TSHS_Ecore.TemporalGuard;
import TSHS_Ecore.Transition;
import TSHS_Ecore.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TSHS_Ecore.TSHS_EcorePackage
 * @generated
 */
public class TSHS_EcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TSHS_EcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS_EcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TSHS_EcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSHS_EcoreSwitch<Adapter> modelSwitch =
		new TSHS_EcoreSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(TSHS_Ecore.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseTSHS(TSHS object) {
				return createTSHSAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseTemporalGuard(TemporalGuard object) {
				return createTemporalGuardAdapter();
			}
			@Override
			public Adapter caseEventGuard(EventGuard object) {
				return createEventGuardAdapter();
			}
			@Override
			public Adapter caseEvaluateGuard(EvaluateGuard object) {
				return createEvaluateGuardAdapter();
			}
			@Override
			public Adapter caseComTransition(ComTransition object) {
				return createComTransitionAdapter();
			}
			@Override
			public Adapter caseProbTransition(ProbTransition object) {
				return createProbTransitionAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseODE(ODE object) {
				return createODEAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseIndeVariable(IndeVariable object) {
				return createIndeVariableAdapter();
			}
			@Override
			public Adapter caseDeVariable(DeVariable object) {
				return createDeVariableAdapter();
			}
			@Override
			public Adapter caseFright(Fright object) {
				return createFrightAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.TSHS <em>TSHS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.TSHS
	 * @generated
	 */
	public Adapter createTSHSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.TemporalGuard
	 * @generated
	 */
	public Adapter createTemporalGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.EventGuard <em>Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.EventGuard
	 * @generated
	 */
	public Adapter createEventGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.EvaluateGuard
	 * @generated
	 */
	public Adapter createEvaluateGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.ComTransition <em>Com Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.ComTransition
	 * @generated
	 */
	public Adapter createComTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.ProbTransition <em>Prob Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.ProbTransition
	 * @generated
	 */
	public Adapter createProbTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.ODE <em>ODE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.ODE
	 * @generated
	 */
	public Adapter createODEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.IndeVariable <em>Inde Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.IndeVariable
	 * @generated
	 */
	public Adapter createIndeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.DeVariable <em>De Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.DeVariable
	 * @generated
	 */
	public Adapter createDeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Fright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Fright
	 * @generated
	 */
	public Adapter createFrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TSHS_Ecore.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TSHS_Ecore.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TSHS_EcoreAdapterFactory
