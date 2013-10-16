/**
 */
package org.tud.inf.st.mbt.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.test.TestCaseRun;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.Verdict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestRunImpl#getStepRuns <em>Step Runs</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestRunImpl#getVerdict <em>Verdict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestRunImpl extends AbstractModelElementImpl implements TestRun {
	/**
	 * The cached value of the '{@link #getStepRuns() <em>Step Runs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepRuns()
	 * @generated
	 * @ordered
	 */
	protected EList<TestStepRun> stepRuns;
	/**
	 * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected Verdict verdict;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_RUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestStepRun> getStepRuns() {
		if (stepRuns == null) {
			stepRuns = new EObjectContainmentEList<TestStepRun>(TestStepRun.class, this, TestPackage.TEST_RUN__STEP_RUNS);
		}
		return stepRuns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verdict getVerdict() {
		return verdict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerdict(Verdict newVerdict, NotificationChain msgs) {
		Verdict oldVerdict = verdict;
		verdict = newVerdict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TEST_RUN__VERDICT, oldVerdict, newVerdict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerdict(Verdict newVerdict) {
		if (newVerdict != verdict) {
			NotificationChain msgs = null;
			if (verdict != null)
				msgs = ((InternalEObject)verdict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_RUN__VERDICT, null, msgs);
			if (newVerdict != null)
				msgs = ((InternalEObject)newVerdict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_RUN__VERDICT, null, msgs);
			msgs = basicSetVerdict(newVerdict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_RUN__VERDICT, newVerdict, newVerdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_RUN__STEP_RUNS:
				return ((InternalEList<?>)getStepRuns()).basicRemove(otherEnd, msgs);
			case TestPackage.TEST_RUN__VERDICT:
				return basicSetVerdict(null, msgs);
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
			case TestPackage.TEST_RUN__STEP_RUNS:
				return getStepRuns();
			case TestPackage.TEST_RUN__VERDICT:
				return getVerdict();
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
			case TestPackage.TEST_RUN__STEP_RUNS:
				getStepRuns().clear();
				getStepRuns().addAll((Collection<? extends TestStepRun>)newValue);
				return;
			case TestPackage.TEST_RUN__VERDICT:
				setVerdict((Verdict)newValue);
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
			case TestPackage.TEST_RUN__STEP_RUNS:
				getStepRuns().clear();
				return;
			case TestPackage.TEST_RUN__VERDICT:
				setVerdict((Verdict)null);
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
			case TestPackage.TEST_RUN__STEP_RUNS:
				return stepRuns != null && !stepRuns.isEmpty();
			case TestPackage.TEST_RUN__VERDICT:
				return verdict != null;
		}
		return super.eIsSet(featureID);
	}

} //TestRunImpl
