/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Event;
import TSHS_Ecore.Guard;
import TSHS_Ecore.TSHS_EcorePackage;
import TSHS_Ecore.Transition;

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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TransitionImpl#getOwnedguard <em>Ownedguard</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.TransitionImpl#getTriggerevent <em>Triggerevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedguard() <em>Ownedguard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedguard()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> ownedguard;

	/**
	 * The cached value of the '{@link #getTriggerevent() <em>Triggerevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerevent()
	 * @generated
	 * @ordered
	 */
	protected Event triggerevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TRANSITION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getOwnedguard() {
		if (ownedguard == null) {
			ownedguard = new EObjectContainmentEList<Guard>(Guard.class, this, TSHS_EcorePackage.TRANSITION__OWNEDGUARD);
		}
		return ownedguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTriggerevent() {
		if (triggerevent != null && triggerevent.eIsProxy()) {
			InternalEObject oldTriggerevent = (InternalEObject)triggerevent;
			triggerevent = (Event)eResolveProxy(oldTriggerevent);
			if (triggerevent != oldTriggerevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSHS_EcorePackage.TRANSITION__TRIGGEREVENT, oldTriggerevent, triggerevent));
			}
		}
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTriggerevent() {
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerevent(Event newTriggerevent) {
		Event oldTriggerevent = triggerevent;
		triggerevent = newTriggerevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.TRANSITION__TRIGGEREVENT, oldTriggerevent, triggerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.TRANSITION__OWNEDGUARD:
				return ((InternalEList<?>)getOwnedguard()).basicRemove(otherEnd, msgs);
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
			case TSHS_EcorePackage.TRANSITION__NAME:
				return getName();
			case TSHS_EcorePackage.TRANSITION__ACTION:
				return getAction();
			case TSHS_EcorePackage.TRANSITION__OWNEDGUARD:
				return getOwnedguard();
			case TSHS_EcorePackage.TRANSITION__TRIGGEREVENT:
				if (resolve) return getTriggerevent();
				return basicGetTriggerevent();
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
			case TSHS_EcorePackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.TRANSITION__ACTION:
				setAction((String)newValue);
				return;
			case TSHS_EcorePackage.TRANSITION__OWNEDGUARD:
				getOwnedguard().clear();
				getOwnedguard().addAll((Collection<? extends Guard>)newValue);
				return;
			case TSHS_EcorePackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent((Event)newValue);
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
			case TSHS_EcorePackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.TRANSITION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TSHS_EcorePackage.TRANSITION__OWNEDGUARD:
				getOwnedguard().clear();
				return;
			case TSHS_EcorePackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent((Event)null);
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
			case TSHS_EcorePackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.TRANSITION__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case TSHS_EcorePackage.TRANSITION__OWNEDGUARD:
				return ownedguard != null && !ownedguard.isEmpty();
			case TSHS_EcorePackage.TRANSITION__TRIGGEREVENT:
				return triggerevent != null;
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
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
