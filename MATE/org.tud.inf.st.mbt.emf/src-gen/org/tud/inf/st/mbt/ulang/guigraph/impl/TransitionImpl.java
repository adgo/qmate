/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl#isTerminates <em>Terminates</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl#getTimeMin <em>Time Min</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl#getTimeMax <em>Time Max</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.TransitionImpl#getTimingType <em>Timing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransitionImpl extends AbstractModelElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final double RISK_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected double risk = RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #isTerminates() <em>Terminates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTerminates() <em>Terminates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminates()
	 * @generated
	 * @ordered
	 */
	protected boolean terminates = TERMINATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeMin() <em>Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_MIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeMin() <em>Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMin()
	 * @generated
	 * @ordered
	 */
	protected long timeMin = TIME_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeMax() <em>Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_MAX_EDEFAULT = -1L;

	/**
	 * The cached value of the '{@link #getTimeMax() <em>Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMax()
	 * @generated
	 * @ordered
	 */
	protected long timeMax = TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimingType() <em>Timing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingType()
	 * @generated
	 * @ordered
	 */
	protected static final TimingType TIMING_TYPE_EDEFAULT = TimingType.DELAY_UNTIL_START;

	/**
	 * The cached value of the '{@link #getTimingType() <em>Timing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingType()
	 * @generated
	 * @ordered
	 */
	protected TimingType timingType = TIMING_TYPE_EDEFAULT;

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
		return GuigraphPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(double newRisk) {
		double oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.TRANSITION__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTerminates() {
		return terminates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminates(boolean newTerminates) {
		boolean oldTerminates = terminates;
		terminates = newTerminates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.TRANSITION__TERMINATES, oldTerminates, terminates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeMin() {
		return timeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeMin(long newTimeMin) {
		long oldTimeMin = timeMin;
		timeMin = newTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.TRANSITION__TIME_MIN, oldTimeMin, timeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeMax() {
		return timeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeMax(long newTimeMax) {
		long oldTimeMax = timeMax;
		timeMax = newTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.TRANSITION__TIME_MAX, oldTimeMax, timeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingType getTimingType() {
		return timingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingType(TimingType newTimingType) {
		TimingType oldTimingType = timingType;
		timingType = newTimingType == null ? TIMING_TYPE_EDEFAULT : newTimingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.TRANSITION__TIMING_TYPE, oldTimingType, timingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigraphPackage.TRANSITION__RISK:
				return getRisk();
			case GuigraphPackage.TRANSITION__TERMINATES:
				return isTerminates();
			case GuigraphPackage.TRANSITION__TIME_MIN:
				return getTimeMin();
			case GuigraphPackage.TRANSITION__TIME_MAX:
				return getTimeMax();
			case GuigraphPackage.TRANSITION__TIMING_TYPE:
				return getTimingType();
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
			case GuigraphPackage.TRANSITION__RISK:
				setRisk((Double)newValue);
				return;
			case GuigraphPackage.TRANSITION__TERMINATES:
				setTerminates((Boolean)newValue);
				return;
			case GuigraphPackage.TRANSITION__TIME_MIN:
				setTimeMin((Long)newValue);
				return;
			case GuigraphPackage.TRANSITION__TIME_MAX:
				setTimeMax((Long)newValue);
				return;
			case GuigraphPackage.TRANSITION__TIMING_TYPE:
				setTimingType((TimingType)newValue);
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
			case GuigraphPackage.TRANSITION__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case GuigraphPackage.TRANSITION__TERMINATES:
				setTerminates(TERMINATES_EDEFAULT);
				return;
			case GuigraphPackage.TRANSITION__TIME_MIN:
				setTimeMin(TIME_MIN_EDEFAULT);
				return;
			case GuigraphPackage.TRANSITION__TIME_MAX:
				setTimeMax(TIME_MAX_EDEFAULT);
				return;
			case GuigraphPackage.TRANSITION__TIMING_TYPE:
				setTimingType(TIMING_TYPE_EDEFAULT);
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
			case GuigraphPackage.TRANSITION__RISK:
				return risk != RISK_EDEFAULT;
			case GuigraphPackage.TRANSITION__TERMINATES:
				return terminates != TERMINATES_EDEFAULT;
			case GuigraphPackage.TRANSITION__TIME_MIN:
				return timeMin != TIME_MIN_EDEFAULT;
			case GuigraphPackage.TRANSITION__TIME_MAX:
				return timeMax != TIME_MAX_EDEFAULT;
			case GuigraphPackage.TRANSITION__TIMING_TYPE:
				return timingType != TIMING_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return super.toString();
	}

} //TransitionImpl
