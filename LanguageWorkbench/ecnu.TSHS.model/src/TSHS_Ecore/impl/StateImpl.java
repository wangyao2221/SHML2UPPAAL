/**
 */
package TSHS_Ecore.impl;

import TSHS_Ecore.ComTransition;
import TSHS_Ecore.ODE;
import TSHS_Ecore.ProbTransition;
import TSHS_Ecore.State;
import TSHS_Ecore.TSHS_EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getOutgoingct <em>Outgoingct</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getIncomingct <em>Incomingct</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getOutgoingpt <em>Outgoingpt</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getIncomingpt <em>Incomingpt</em>}</li>
 *   <li>{@link TSHS_Ecore.impl.StateImpl#getUrgent <em>Urgent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getSlaveode() <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveode()
	 * @generated
	 * @ordered
	 */
	protected ODE slaveode;

	/**
	 * The cached value of the '{@link #getOutgoingct() <em>Outgoingct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingct()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> outgoingct;

	/**
	 * The cached value of the '{@link #getIncomingct() <em>Incomingct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingct()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> incomingct;

	/**
	 * The cached value of the '{@link #getOutgoingpt() <em>Outgoingpt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingpt()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> outgoingpt;

	/**
	 * The cached value of the '{@link #getIncomingpt() <em>Incomingpt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingpt()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> incomingpt;

	/**
	 * The default value of the '{@link #getUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final int URGENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgent()
	 * @generated
	 * @ordered
	 */
	protected int urgent = URGENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TSHS_EcorePackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE getSlaveode() {
		if (slaveode != null && slaveode.eIsProxy()) {
			InternalEObject oldSlaveode = (InternalEObject)slaveode;
			slaveode = (ODE)eResolveProxy(oldSlaveode);
			if (slaveode != oldSlaveode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TSHS_EcorePackage.STATE__SLAVEODE, oldSlaveode, slaveode));
			}
		}
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE basicGetSlaveode() {
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveode(ODE newSlaveode) {
		ODE oldSlaveode = slaveode;
		slaveode = newSlaveode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.STATE__SLAVEODE, oldSlaveode, slaveode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getOutgoingct() {
		if (outgoingct == null) {
			outgoingct = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, TSHS_EcorePackage.STATE__OUTGOINGCT, TSHS_EcorePackage.COM_TRANSITION__CSRC);
		}
		return outgoingct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getIncomingct() {
		if (incomingct == null) {
			incomingct = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, TSHS_EcorePackage.STATE__INCOMINGCT, TSHS_EcorePackage.COM_TRANSITION__CTGT);
		}
		return incomingct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getOutgoingpt() {
		if (outgoingpt == null) {
			outgoingpt = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, TSHS_EcorePackage.STATE__OUTGOINGPT, TSHS_EcorePackage.PROB_TRANSITION__PSRC);
		}
		return outgoingpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getIncomingpt() {
		if (incomingpt == null) {
			incomingpt = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, TSHS_EcorePackage.STATE__INCOMINGPT, TSHS_EcorePackage.PROB_TRANSITION__PTGT);
		}
		return incomingpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(int newUrgent) {
		int oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TSHS_EcorePackage.STATE__URGENT, oldUrgent, urgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingct()).basicAdd(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingct()).basicAdd(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingpt()).basicAdd(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingpt()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				return ((InternalEList<?>)getOutgoingct()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				return ((InternalEList<?>)getIncomingct()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				return ((InternalEList<?>)getOutgoingpt()).basicRemove(otherEnd, msgs);
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				return ((InternalEList<?>)getIncomingpt()).basicRemove(otherEnd, msgs);
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
			case TSHS_EcorePackage.STATE__NAME:
				return getName();
			case TSHS_EcorePackage.STATE__SLAVEODE:
				if (resolve) return getSlaveode();
				return basicGetSlaveode();
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				return getOutgoingct();
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				return getIncomingct();
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				return getOutgoingpt();
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				return getIncomingpt();
			case TSHS_EcorePackage.STATE__URGENT:
				return getUrgent();
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
			case TSHS_EcorePackage.STATE__NAME:
				setName((String)newValue);
				return;
			case TSHS_EcorePackage.STATE__SLAVEODE:
				setSlaveode((ODE)newValue);
				return;
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				getOutgoingct().clear();
				getOutgoingct().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				getIncomingct().clear();
				getIncomingct().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				getOutgoingpt().clear();
				getOutgoingpt().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				getIncomingpt().clear();
				getIncomingpt().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case TSHS_EcorePackage.STATE__URGENT:
				setUrgent((Integer)newValue);
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
			case TSHS_EcorePackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TSHS_EcorePackage.STATE__SLAVEODE:
				setSlaveode((ODE)null);
				return;
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				getOutgoingct().clear();
				return;
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				getIncomingct().clear();
				return;
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				getOutgoingpt().clear();
				return;
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				getIncomingpt().clear();
				return;
			case TSHS_EcorePackage.STATE__URGENT:
				setUrgent(URGENT_EDEFAULT);
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
			case TSHS_EcorePackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TSHS_EcorePackage.STATE__SLAVEODE:
				return slaveode != null;
			case TSHS_EcorePackage.STATE__OUTGOINGCT:
				return outgoingct != null && !outgoingct.isEmpty();
			case TSHS_EcorePackage.STATE__INCOMINGCT:
				return incomingct != null && !incomingct.isEmpty();
			case TSHS_EcorePackage.STATE__OUTGOINGPT:
				return outgoingpt != null && !outgoingpt.isEmpty();
			case TSHS_EcorePackage.STATE__INCOMINGPT:
				return incomingpt != null && !incomingpt.isEmpty();
			case TSHS_EcorePackage.STATE__URGENT:
				return urgent != URGENT_EDEFAULT;
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
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //StateImpl
