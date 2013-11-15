/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Real Time Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.impl.GetRealTimeActionImpl#getTimeHint <em>Time Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetRealTimeActionImpl extends EObjectImpl implements GetRealTimeAction {
	/**
	 * The default value of the '{@link #getTimeHint() <em>Time Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeHint()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_HINT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTimeHint() <em>Time Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeHint()
	 * @generated
	 * @ordered
	 */
	protected long timeHint = TIME_HINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetRealTimeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.GET_REAL_TIME_ACTION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeHint() {
		return timeHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeHint(long newTimeHint) {
		long oldTimeHint = timeHint;
		timeHint = newTimeHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.GET_REAL_TIME_ACTION__TIME_HINT, oldTimeHint, timeHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.GET_REAL_TIME_ACTION__TIME_HINT:
				return getTimeHint();
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
			case ActionsPackage.GET_REAL_TIME_ACTION__TIME_HINT:
				setTimeHint((Long)newValue);
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
			case ActionsPackage.GET_REAL_TIME_ACTION__TIME_HINT:
				setTimeHint(TIME_HINT_EDEFAULT);
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
			case ActionsPackage.GET_REAL_TIME_ACTION__TIME_HINT:
				return timeHint != TIME_HINT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		return "&getRealTime";
	}

} //GetRealTimeActionImpl
