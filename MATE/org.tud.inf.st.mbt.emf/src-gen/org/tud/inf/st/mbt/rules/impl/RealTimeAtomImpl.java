/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.RealTimeAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Time Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.RealTimeAtomImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealTimeAtomImpl extends EObjectImpl implements RealTimeAtom {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected IRealTimeConsumer consumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTimeAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.REAL_TIME_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REAL_TIME_ATOM__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRealTimeConsumer getConsumer() {
		if (consumer != null && consumer.eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject)consumer;
			consumer = (IRealTimeConsumer)eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.REAL_TIME_ATOM__CONSUMER, oldConsumer, consumer));
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRealTimeConsumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(IRealTimeConsumer newConsumer) {
		IRealTimeConsumer oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REAL_TIME_ATOM__CONSUMER, oldConsumer, consumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulesPackage.REAL_TIME_ATOM__TIME:
				return getTime();
			case RulesPackage.REAL_TIME_ATOM__CONSUMER:
				if (resolve) return getConsumer();
				return basicGetConsumer();
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
			case RulesPackage.REAL_TIME_ATOM__TIME:
				setTime((Long)newValue);
				return;
			case RulesPackage.REAL_TIME_ATOM__CONSUMER:
				setConsumer((IRealTimeConsumer)newValue);
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
			case RulesPackage.REAL_TIME_ATOM__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case RulesPackage.REAL_TIME_ATOM__CONSUMER:
				setConsumer((IRealTimeConsumer)null);
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
			case RulesPackage.REAL_TIME_ATOM__TIME:
				return time != TIME_EDEFAULT;
			case RulesPackage.REAL_TIME_ATOM__CONSUMER:
				return consumer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "real_time("+consumer+") = "+time;
	}
} //RealTimeAtomImpl
