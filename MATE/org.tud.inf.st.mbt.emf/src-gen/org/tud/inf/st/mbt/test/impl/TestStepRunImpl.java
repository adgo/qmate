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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.rules.Atom;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.Verdict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestStepRunImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestStepRunImpl#getState <em>State</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestStepRunImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestStepRunImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestStepRunImpl extends TestExecutableImpl implements TestStepRun {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected TestStep step;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<Atom> state;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected PostGenerationAction action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestStepRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_STEP_RUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject)step;
			step = (TestStep)eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TEST_STEP_RUN__STEP, oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(TestStep newStep) {
		TestStep oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_STEP_RUN__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atom> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<Atom>(Atom.class, this, TestPackage.TEST_STEP_RUN__STATE);
		}
		return state;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TEST_STEP_RUN__VERDICT, oldVerdict, newVerdict);
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
				msgs = ((InternalEObject)verdict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_STEP_RUN__VERDICT, null, msgs);
			if (newVerdict != null)
				msgs = ((InternalEObject)newVerdict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_STEP_RUN__VERDICT, null, msgs);
			msgs = basicSetVerdict(newVerdict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_STEP_RUN__VERDICT, newVerdict, newVerdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostGenerationAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(PostGenerationAction newAction, NotificationChain msgs) {
		PostGenerationAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TEST_STEP_RUN__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(PostGenerationAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_STEP_RUN__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_STEP_RUN__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_STEP_RUN__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_STEP_RUN__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case TestPackage.TEST_STEP_RUN__VERDICT:
				return basicSetVerdict(null, msgs);
			case TestPackage.TEST_STEP_RUN__ACTION:
				return basicSetAction(null, msgs);
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
			case TestPackage.TEST_STEP_RUN__STEP:
				if (resolve) return getStep();
				return basicGetStep();
			case TestPackage.TEST_STEP_RUN__STATE:
				return getState();
			case TestPackage.TEST_STEP_RUN__VERDICT:
				return getVerdict();
			case TestPackage.TEST_STEP_RUN__ACTION:
				return getAction();
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
			case TestPackage.TEST_STEP_RUN__STEP:
				setStep((TestStep)newValue);
				return;
			case TestPackage.TEST_STEP_RUN__STATE:
				getState().clear();
				getState().addAll((Collection<? extends Atom>)newValue);
				return;
			case TestPackage.TEST_STEP_RUN__VERDICT:
				setVerdict((Verdict)newValue);
				return;
			case TestPackage.TEST_STEP_RUN__ACTION:
				setAction((PostGenerationAction)newValue);
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
			case TestPackage.TEST_STEP_RUN__STEP:
				setStep((TestStep)null);
				return;
			case TestPackage.TEST_STEP_RUN__STATE:
				getState().clear();
				return;
			case TestPackage.TEST_STEP_RUN__VERDICT:
				setVerdict((Verdict)null);
				return;
			case TestPackage.TEST_STEP_RUN__ACTION:
				setAction((PostGenerationAction)null);
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
			case TestPackage.TEST_STEP_RUN__STEP:
				return step != null;
			case TestPackage.TEST_STEP_RUN__STATE:
				return state != null && !state.isEmpty();
			case TestPackage.TEST_STEP_RUN__VERDICT:
				return verdict != null;
			case TestPackage.TEST_STEP_RUN__ACTION:
				return action != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return ""+action;
	}

} //TestStepRunImpl
