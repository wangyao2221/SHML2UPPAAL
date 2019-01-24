/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Event;
import TSHS_Ecore.EventGuard;
import TSHS_Ecore.TSHS_EcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.EventGuardImpl#getEcondition <em>Econdition</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.EventGuardImpl#getOnevent <em>Onevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventGuardImpl extends GuardImpl implements EventGuard {
	/**
	 * The default value of the '{@link #getEcondition() <em>Econdition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String ECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcondition() <em>Econdition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcondition()
	 * @generated
	 * @ordered
	 */
	protected String econdition = ECONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnevent() <em>Onevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnevent()
	 * @generated
	 * @ordered
	 */
	protected Event onevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.EVENT_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcondition() {
		return econdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcondition(String newEcondition) {
		String oldEcondition = econdition;
		econdition = newEcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.EVENT_GUARD__ECONDITION, oldEcondition, econdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getOnevent() {
		if (onevent != null && onevent.eIsProxy()) {
			InternalEObject oldOnevent = (InternalEObject)onevent;
			onevent = (Event)eResolveProxy(oldOnevent);
			if (onevent != oldOnevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSHS_EcorePackage.EVENT_GUARD__ONEVENT, oldOnevent, onevent));
			}
		}
		return onevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetOnevent() {
		return onevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnevent(Event newOnevent) {
		Event oldOnevent = onevent;
		onevent = newOnevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.EVENT_GUARD__ONEVENT, oldOnevent, onevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TSHS_EcorePackage.EVENT_GUARD__ECONDITION:
				return getEcondition();
			case TSHS_EcorePackage.EVENT_GUARD__ONEVENT:
				if (resolve) return getOnevent();
				return basicGetOnevent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TSHS_EcorePackage.EVENT_GUARD__ECONDITION:
				setEcondition((String)newValue);
				return;
			case TSHS_EcorePackage.EVENT_GUARD__ONEVENT:
				setOnevent((Event)newValue);
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
			case TSHS_EcorePackage.EVENT_GUARD__ECONDITION:
				setEcondition(ECONDITION_EDEFAULT);
				return;
			case TSHS_EcorePackage.EVENT_GUARD__ONEVENT:
				setOnevent((Event)null);
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
			case TSHS_EcorePackage.EVENT_GUARD__ECONDITION:
				return ECONDITION_EDEFAULT == null ? econdition != null : !ECONDITION_EDEFAULT.equals(econdition);
			case TSHS_EcorePackage.EVENT_GUARD__ONEVENT:
				return onevent != null;
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
		result.append(" (econdition: ");
		result.append(econdition);
		result.append(')');
		return result.toString();
	}

} //EventGuardImpl
