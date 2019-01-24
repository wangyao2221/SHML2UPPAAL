/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.Interval;
import TSHS_Ecore.TSHS_EcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.IntervalImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.IntervalImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.IntervalImpl#getRight <em>Right</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.IntervalImpl#getSubinterval <em>Subinterval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalImpl extends MinimalEObjectImpl.Container implements Interval {
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
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final float LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected float left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final float RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected float right = RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubinterval() <em>Subinterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubinterval()
	 * @generated
	 * @ordered
	 */
	protected static final float SUBINTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubinterval() <em>Subinterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubinterval()
	 * @generated
	 * @ordered
	 */
	protected float subinterval = SUBINTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.INTERVAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.INTERVAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(float newLeft) {
		float oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.INTERVAL__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(float newRight) {
		float oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.INTERVAL__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSubinterval() {
		return subinterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubinterval(float newSubinterval) {
		float oldSubinterval = subinterval;
		subinterval = newSubinterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.INTERVAL__SUBINTERVAL, oldSubinterval, subinterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TSHS_EcorePackage.INTERVAL__NAME:
				return getName();
			case TSHS_EcorePackage.INTERVAL__LEFT:
				return getLeft();
			case TSHS_EcorePackage.INTERVAL__RIGHT:
				return getRight();
			case TSHS_EcorePackage.INTERVAL__SUBINTERVAL:
				return getSubinterval();
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
			case TSHS_EcorePackage.INTERVAL__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.INTERVAL__LEFT:
				setLeft((Float)newValue);
				return;
			case TSHS_EcorePackage.INTERVAL__RIGHT:
				setRight((Float)newValue);
				return;
			case TSHS_EcorePackage.INTERVAL__SUBINTERVAL:
				setSubinterval((Float)newValue);
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
			case TSHS_EcorePackage.INTERVAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.INTERVAL__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case TSHS_EcorePackage.INTERVAL__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case TSHS_EcorePackage.INTERVAL__SUBINTERVAL:
				setSubinterval(SUBINTERVAL_EDEFAULT);
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
			case TSHS_EcorePackage.INTERVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.INTERVAL__LEFT:
				return left != LEFT_EDEFAULT;
			case TSHS_EcorePackage.INTERVAL__RIGHT:
				return right != RIGHT_EDEFAULT;
			case TSHS_EcorePackage.INTERVAL__SUBINTERVAL:
				return subinterval != SUBINTERVAL_EDEFAULT;
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
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(", subinterval: ");
		result.append(subinterval);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
