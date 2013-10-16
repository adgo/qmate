/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.TimeAction;

import org.tud.inf.st.mbt.rules.ITimeConsumer;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Time Action</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.impl.TimeActionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.impl.TimeActionImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeActionImpl extends EObjectImpl implements TimeAction {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected ITimeConsumer consumer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.TIME_ACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.TIME_ACTION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ITimeConsumer getConsumer() {
		if (consumer != null && consumer.eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject)consumer;
			consumer = (ITimeConsumer)eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.TIME_ACTION__CONSUMER, oldConsumer, consumer));
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ITimeConsumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(ITimeConsumer newConsumer) {
		ITimeConsumer oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.TIME_ACTION__CONSUMER, oldConsumer, consumer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.TIME_ACTION__TIME:
				return getTime();
			case ActionsPackage.TIME_ACTION__CONSUMER:
				if (resolve) return getConsumer();
				return basicGetConsumer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionsPackage.TIME_ACTION__TIME:
				setTime((Integer)newValue);
				return;
			case ActionsPackage.TIME_ACTION__CONSUMER:
				setConsumer((ITimeConsumer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActionsPackage.TIME_ACTION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ActionsPackage.TIME_ACTION__CONSUMER:
				setConsumer((ITimeConsumer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActionsPackage.TIME_ACTION__TIME:
				return time != TIME_EDEFAULT;
			case ActionsPackage.TIME_ACTION__CONSUMER:
				return consumer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "time(" + (getConsumer() == null ? "*" : getConsumer()) + ","
				+ getTime() + ")";
	}

} // TimeActionImpl
