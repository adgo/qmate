/**
 */
package org.tud.inf.st.mbt.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestExecutableImpl#getRiskReduction <em>Risk Reduction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestExecutableImpl extends AbstractModelElementImpl implements TestExecutable {
	/**
	 * The default value of the '{@link #getRiskReduction() <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskReduction()
	 * @generated
	 * @ordered
	 */
	protected static final double RISK_REDUCTION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getRiskReduction() <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskReduction()
	 * @generated
	 * @ordered
	 */
	protected double riskReduction = RISK_REDUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestExecutableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_EXECUTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRiskReduction() {
		return riskReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskReduction(double newRiskReduction) {
		double oldRiskReduction = riskReduction;
		riskReduction = newRiskReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_EXECUTABLE__RISK_REDUCTION, oldRiskReduction, riskReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION:
				return getRiskReduction();
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
			case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION:
				setRiskReduction((Double)newValue);
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
			case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION:
				setRiskReduction(RISK_REDUCTION_EDEFAULT);
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
			case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION:
				return riskReduction != RISK_REDUCTION_EDEFAULT;
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
		result.append(" (riskReduction: ");
		result.append(riskReduction);
		result.append(')');
		return result.toString();
	}

} //TestExecutableImpl
