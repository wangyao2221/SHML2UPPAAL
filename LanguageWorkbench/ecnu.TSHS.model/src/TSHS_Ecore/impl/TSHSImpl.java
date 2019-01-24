/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Clock;
import TSHS_Ecore.Event;
import TSHS_Ecore.ODE;
import TSHS_Ecore.State;
import TSHS_Ecore.TSHS;
import TSHS_Ecore.TSHS_EcorePackage;
import TSHS_Ecore.Transition;
import TSHS_Ecore.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSHS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getOwnedodes <em>Ownedodes</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getLocalvariables <em>Localvariables</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getLocalevents <em>Localevents</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getLocalclock <em>Localclock</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getOwnedtransitions <em>Ownedtransitions</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TSHSImpl#getOwnedstates <em>Ownedstates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSHSImpl extends MinimalEObjectImpl.Container implements TSHS {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected State initialstate;

	/**
	 * The cached value of the '{@link #getOwnedodes() <em>Ownedodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODE> ownedodes;

	/**
	 * The cached value of the '{@link #getLocalvariables() <em>Localvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localvariables;

	/**
	 * The cached value of the '{@link #getLocalevents() <em>Localevents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalevents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> localevents;

	/**
	 * The cached value of the '{@link #getLocalclock() <em>Localclock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalclock()
	 * @generated
	 * @ordered
	 */
	protected Clock localclock;

	/**
	 * The cached value of the '{@link #getOwnedtransitions() <em>Ownedtransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedtransitions;

	/**
	 * The cached value of the '{@link #getOwnedstates() <em>Ownedstates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedstates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedstates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSHSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.TSHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TSHS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialstate() {
		if (initialstate != null && initialstate.eIsProxy()) {
			InternalEObject oldInitialstate = (InternalEObject)initialstate;
			initialstate = (State)eResolveProxy(oldInitialstate);
			if (initialstate != oldInitialstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSHS_EcorePackage.TSHS__INITIALSTATE, oldInitialstate, initialstate));
			}
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(State newInitialstate) {
		State oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TSHS__INITIALSTATE, oldInitialstate, initialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODE> getOwnedodes() {
		if (ownedodes == null) {
			ownedodes = new EObjectContainmentEList<ODE>(ODE.class, this, TSHS_EcorePackage.TSHS__OWNEDODES);
		}
		return ownedodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocalvariables() {
		if (localvariables == null) {
			localvariables = new EObjectContainmentEList<Variable>(Variable.class, this, TSHS_EcorePackage.TSHS__LOCALVARIABLES);
		}
		return localvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getLocalevents() {
		if (localevents == null) {
			localevents = new EObjectContainmentEList<Event>(Event.class, this, TSHS_EcorePackage.TSHS__LOCALEVENTS);
		}
		return localevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getLocalclock() {
		return localclock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalclock(Clock newLocalclock, NotificationChain msgs) {
		Clock oldLocalclock = localclock;
		localclock = newLocalclock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TSHS__LOCALCLOCK, oldLocalclock, newLocalclock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalclock(Clock newLocalclock) {
		if (newLocalclock != localclock) {
			NotificationChain msgs = null;
			if (localclock != null)
				msgs = ((InternalEObject)localclock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.TSHS__LOCALCLOCK, null, msgs);
			if (newLocalclock != null)
				msgs = ((InternalEObject)newLocalclock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.TSHS__LOCALCLOCK, null, msgs);
			msgs = basicSetLocalclock(newLocalclock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TSHS__LOCALCLOCK, newLocalclock, newLocalclock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedtransitions() {
		if (ownedtransitions == null) {
			ownedtransitions = new EObjectContainmentEList<Transition>(Transition.class, this, TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS);
		}
		return ownedtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedstates() {
		if (ownedstates == null) {
			ownedstates = new EObjectContainmentEList<State>(State.class, this, TSHS_EcorePackage.TSHS__OWNEDSTATES);
		}
		return ownedstates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.TSHS__OWNEDODES:
				return ((InternalEList<?>)getOwnedodes()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
				return ((InternalEList<?>)getLocalvariables()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
				return ((InternalEList<?>)getLocalevents()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
				return basicSetLocalclock(null, msgs);
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
				return ((InternalEList<?>)getOwnedtransitions()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
				return ((InternalEList<?>)getOwnedstates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TSHS_EcorePackage.TSHS__NAME:
				return getName();
			case TSHS_EcorePackage.TSHS__INITIALSTATE:
				if (resolve) return getInitialstate();
				return basicGetInitialstate();
			case TSHS_EcorePackage.TSHS__OWNEDODES:
				return getOwnedodes();
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
				return getLocalvariables();
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
				return getLocalevents();
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
				return getLocalclock();
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
				return getOwnedtransitions();
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
				return getOwnedstates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TSHS_EcorePackage.TSHS__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.TSHS__INITIALSTATE:
				setInitialstate((State)newValue);
				return;
			case TSHS_EcorePackage.TSHS__OWNEDODES:
				getOwnedodes().clear();
				getOwnedodes().addAll((Collection<? extends ODE>)newValue);
				return;
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
				getLocalvariables().clear();
				getLocalvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
				getLocalevents().clear();
				getLocalevents().addAll((Collection<? extends Event>)newValue);
				return;
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
				setLocalclock((Clock)newValue);
				return;
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
				getOwnedtransitions().clear();
				getOwnedtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
				getOwnedstates().clear();
				getOwnedstates().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TSHS_EcorePackage.TSHS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.TSHS__INITIALSTATE:
				setInitialstate((State)null);
				return;
			case TSHS_EcorePackage.TSHS__OWNEDODES:
				getOwnedodes().clear();
				return;
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
				getLocalvariables().clear();
				return;
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
				getLocalevents().clear();
				return;
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
				setLocalclock((Clock)null);
				return;
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
				getOwnedtransitions().clear();
				return;
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
				getOwnedstates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TSHS_EcorePackage.TSHS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.TSHS__INITIALSTATE:
				return initialstate != null;
			case TSHS_EcorePackage.TSHS__OWNEDODES:
				return ownedodes != null && !ownedodes.isEmpty();
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
				return localvariables != null && !localvariables.isEmpty();
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
				return localevents != null && !localevents.isEmpty();
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
				return localclock != null;
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
				return ownedtransitions != null && !ownedtransitions.isEmpty();
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
				return ownedstates != null && !ownedstates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TSHSImpl
