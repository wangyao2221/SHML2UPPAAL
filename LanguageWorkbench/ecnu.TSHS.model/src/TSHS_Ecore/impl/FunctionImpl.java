/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.DeVariable;
import TSHS_Ecore.Fright;
import TSHS_Ecore.Function;
import TSHS_Ecore.IndeVariable;
import TSHS_Ecore.TSHS_EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.FunctionImpl#getIndevariable <em>Indevariable</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.FunctionImpl#getDevariable <em>Devariable</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.FunctionImpl#getFright <em>Fright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
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
	 * The cached value of the '{@link #getIndevariable() <em>Indevariable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndevariable()
	 * @generated
	 * @ordered
	 */
	protected IndeVariable indevariable;

	/**
	 * The cached value of the '{@link #getDevariable() <em>Devariable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevariable()
	 * @generated
	 * @ordered
	 */
	protected DeVariable devariable;

	/**
	 * The cached value of the '{@link #getFright() <em>Fright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFright()
	 * @generated
	 * @ordered
	 */
	protected Fright fright;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable getIndevariable() {
		return indevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndevariable(IndeVariable newIndevariable, NotificationChain msgs) {
		IndeVariable oldIndevariable = indevariable;
		indevariable = newIndevariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__INDEVARIABLE, oldIndevariable, newIndevariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndevariable(IndeVariable newIndevariable) {
		if (newIndevariable != indevariable) {
			NotificationChain msgs = null;
			if (indevariable != null)
				msgs = ((InternalEObject)indevariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__INDEVARIABLE, null, msgs);
			if (newIndevariable != null)
				msgs = ((InternalEObject)newIndevariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__INDEVARIABLE, null, msgs);
			msgs = basicSetIndevariable(newIndevariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__INDEVARIABLE, newIndevariable, newIndevariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable getDevariable() {
		return devariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevariable(DeVariable newDevariable, NotificationChain msgs) {
		DeVariable oldDevariable = devariable;
		devariable = newDevariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__DEVARIABLE, oldDevariable, newDevariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevariable(DeVariable newDevariable) {
		if (newDevariable != devariable) {
			NotificationChain msgs = null;
			if (devariable != null)
				msgs = ((InternalEObject)devariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__DEVARIABLE, null, msgs);
			if (newDevariable != null)
				msgs = ((InternalEObject)newDevariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__DEVARIABLE, null, msgs);
			msgs = basicSetDevariable(newDevariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__DEVARIABLE, newDevariable, newDevariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright getFright() {
		return fright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFright(Fright newFright, NotificationChain msgs) {
		Fright oldFright = fright;
		fright = newFright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__FRIGHT, oldFright, newFright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFright(Fright newFright) {
		if (newFright != fright) {
			NotificationChain msgs = null;
			if (fright != null)
				msgs = ((InternalEObject)fright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__FRIGHT, null, msgs);
			if (newFright != null)
				msgs = ((InternalEObject)newFright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TSHS_EcorePackage.FUNCTION__FRIGHT, null, msgs);
			msgs = basicSetFright(newFright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.FUNCTION__FRIGHT, newFright, newFright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.FUNCTION__INDEVARIABLE:
				return basicSetIndevariable(null, msgs);
			case TSHS_EcorePackage.FUNCTION__DEVARIABLE:
				return basicSetDevariable(null, msgs);
			case TSHS_EcorePackage.FUNCTION__FRIGHT:
				return basicSetFright(null, msgs);
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
			case TSHS_EcorePackage.FUNCTION__NAME:
				return getName();
			case TSHS_EcorePackage.FUNCTION__INDEVARIABLE:
				return getIndevariable();
			case TSHS_EcorePackage.FUNCTION__DEVARIABLE:
				return getDevariable();
			case TSHS_EcorePackage.FUNCTION__FRIGHT:
				return getFright();
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
			case TSHS_EcorePackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.FUNCTION__INDEVARIABLE:
				setIndevariable((IndeVariable)newValue);
				return;
			case TSHS_EcorePackage.FUNCTION__DEVARIABLE:
				setDevariable((DeVariable)newValue);
				return;
			case TSHS_EcorePackage.FUNCTION__FRIGHT:
				setFright((Fright)newValue);
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
			case TSHS_EcorePackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.FUNCTION__INDEVARIABLE:
				setIndevariable((IndeVariable)null);
				return;
			case TSHS_EcorePackage.FUNCTION__DEVARIABLE:
				setDevariable((DeVariable)null);
				return;
			case TSHS_EcorePackage.FUNCTION__FRIGHT:
				setFright((Fright)null);
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
			case TSHS_EcorePackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.FUNCTION__INDEVARIABLE:
				return indevariable != null;
			case TSHS_EcorePackage.FUNCTION__DEVARIABLE:
				return devariable != null;
			case TSHS_EcorePackage.FUNCTION__FRIGHT:
				return fright != null;
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

} //FunctionImpl
