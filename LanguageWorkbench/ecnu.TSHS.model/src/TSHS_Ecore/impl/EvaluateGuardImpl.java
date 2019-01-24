/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.EvaluateGuard;
import TSHS_Ecore.TSHS_EcorePackage;
import TSHS_Ecore.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.EvaluateGuardImpl#getVcondition <em>Vcondition</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.EvaluateGuardImpl#getOnvariable <em>Onvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluateGuardImpl extends GuardImpl implements EvaluateGuard {
	/**
	 * The default value of the '{@link #getVcondition() <em>Vcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String VCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVcondition() <em>Vcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcondition()
	 * @generated
	 * @ordered
	 */
	protected String vcondition = VCONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnvariable() <em>Onvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnvariable()
	 * @generated
	 * @ordered
	 */
	protected Variable onvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.EVALUATE_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVcondition() {
		return vcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcondition(String newVcondition) {
		String oldVcondition = vcondition;
		vcondition = newVcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.EVALUATE_GUARD__VCONDITION, oldVcondition, vcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getOnvariable() {
		if (onvariable != null && onvariable.eIsProxy()) {
			InternalEObject oldOnvariable = (InternalEObject)onvariable;
			onvariable = (Variable)eResolveProxy(oldOnvariable);
			if (onvariable != oldOnvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE, oldOnvariable, onvariable));
			}
		}
		return onvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetOnvariable() {
		return onvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnvariable(Variable newOnvariable) {
		Variable oldOnvariable = onvariable;
		onvariable = newOnvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE, oldOnvariable, onvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TSHS_EcorePackage.EVALUATE_GUARD__VCONDITION:
				return getVcondition();
			case TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE:
				if (resolve) return getOnvariable();
				return basicGetOnvariable();
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
			case TSHS_EcorePackage.EVALUATE_GUARD__VCONDITION:
				setVcondition((String)newValue);
				return;
			case TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE:
				setOnvariable((Variable)newValue);
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
			case TSHS_EcorePackage.EVALUATE_GUARD__VCONDITION:
				setVcondition(VCONDITION_EDEFAULT);
				return;
			case TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE:
				setOnvariable((Variable)null);
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
			case TSHS_EcorePackage.EVALUATE_GUARD__VCONDITION:
				return VCONDITION_EDEFAULT == null ? vcondition != null : !VCONDITION_EDEFAULT.equals(vcondition);
			case TSHS_EcorePackage.EVALUATE_GUARD__ONVARIABLE:
				return onvariable != null;
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
		result.append(" (vcondition: ");
		result.append(vcondition);
		result.append(')');
		return result.toString();
	}

} //EvaluateGuardImpl
