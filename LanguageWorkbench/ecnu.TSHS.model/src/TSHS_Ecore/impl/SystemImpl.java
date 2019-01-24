/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Clock;
import TSHS_Ecore.Event;
import TSHS_Ecore.TSHS;
import TSHS_Ecore.TSHS_EcorePackage;
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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.SystemImpl#getTshss <em>Tshss</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.SystemImpl#getGlobalvariables <em>Globalvariables</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.SystemImpl#getGlobalclocks <em>Globalclocks</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.SystemImpl#getGlobalevents <em>Globalevents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements TSHS_Ecore.System {
	/**
	 * The cached value of the '{@link #getTshss() <em>Tshss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTshss()
	 * @generated
	 * @ordered
	 */
	protected EList<TSHS> tshss;

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
	 * The cached value of the '{@link #getGlobalvariables() <em>Globalvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> globalvariables;

	/**
	 * The cached value of the '{@link #getGlobalclocks() <em>Globalclocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalclocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> globalclocks;

	/**
	 * The cached value of the '{@link #getGlobalevents() <em>Globalevents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalevents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> globalevents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSHS> getTshss() {
		if (tshss == null) {
			tshss = new EObjectContainmentEList<TSHS>(TSHS.class, this, TSHS_EcorePackage.SYSTEM__TSHSS);
		}
		return tshss;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getGlobalvariables() {
		if (globalvariables == null) {
			globalvariables = new EObjectContainmentEList<Variable>(Variable.class, this, TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES);
		}
		return globalvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getGlobalclocks() {
		if (globalclocks == null) {
			globalclocks = new EObjectContainmentEList<Clock>(Clock.class, this, TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS);
		}
		return globalclocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGlobalevents() {
		if (globalevents == null) {
			globalevents = new EObjectContainmentEList<Event>(Event.class, this, TSHS_EcorePackage.SYSTEM__GLOBALEVENTS);
		}
		return globalevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.SYSTEM__TSHSS:
				return ((InternalEList<?>)getTshss()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES:
				return ((InternalEList<?>)getGlobalvariables()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS:
				return ((InternalEList<?>)getGlobalclocks()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.SYSTEM__GLOBALEVENTS:
				return ((InternalEList<?>)getGlobalevents()).basicRemove(otherEnd, msgs);
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
			case TSHS_EcorePackage.SYSTEM__TSHSS:
				return getTshss();
			case TSHS_EcorePackage.SYSTEM__NAME:
				return getName();
			case TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES:
				return getGlobalvariables();
			case TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS:
				return getGlobalclocks();
			case TSHS_EcorePackage.SYSTEM__GLOBALEVENTS:
				return getGlobalevents();
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
			case TSHS_EcorePackage.SYSTEM__TSHSS:
				getTshss().clear();
				getTshss().addAll((Collection<? extends TSHS>)newValue);
				return;
			case TSHS_EcorePackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES:
				getGlobalvariables().clear();
				getGlobalvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS:
				getGlobalclocks().clear();
				getGlobalclocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALEVENTS:
				getGlobalevents().clear();
				getGlobalevents().addAll((Collection<? extends Event>)newValue);
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
			case TSHS_EcorePackage.SYSTEM__TSHSS:
				getTshss().clear();
				return;
			case TSHS_EcorePackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES:
				getGlobalvariables().clear();
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS:
				getGlobalclocks().clear();
				return;
			case TSHS_EcorePackage.SYSTEM__GLOBALEVENTS:
				getGlobalevents().clear();
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
			case TSHS_EcorePackage.SYSTEM__TSHSS:
				return tshss != null && !tshss.isEmpty();
			case TSHS_EcorePackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.SYSTEM__GLOBALVARIABLES:
				return globalvariables != null && !globalvariables.isEmpty();
			case TSHS_EcorePackage.SYSTEM__GLOBALCLOCKS:
				return globalclocks != null && !globalclocks.isEmpty();
			case TSHS_EcorePackage.SYSTEM__GLOBALEVENTS:
				return globalevents != null && !globalevents.isEmpty();
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

} //SystemImpl
