/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.rules.Predicate;

import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Action Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl#getApplicationCondition <em>Application Condition</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl#getApplicationConditionText <em>Application Condition Text</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.ConditionActionTransitionImpl#getActionsText <em>Actions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionActionTransitionImpl extends TransitionImpl implements ConditionActionTransition {
	/**
	 * The cached value of the '{@link #getApplicationCondition() <em>Application Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationCondition()
	 * @generated
	 * @ordered
	 */
	protected Predicate applicationCondition;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected PreGenerationSequence actions;

	/**
	 * The default value of the '{@link #getApplicationConditionText() <em>Application Condition Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationConditionText()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_CONDITION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationConditionText() <em>Application Condition Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationConditionText()
	 * @generated
	 * @ordered
	 */
	protected String applicationConditionText = APPLICATION_CONDITION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionsText() <em>Actions Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsText()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionsText() <em>Actions Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsText()
	 * @generated
	 * @ordered
	 */
	protected String actionsText = ACTIONS_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionActionTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigraphPackage.Literals.CONDITION_ACTION_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getApplicationCondition() {
		return applicationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationCondition(Predicate newApplicationCondition, NotificationChain msgs) {
		Predicate oldApplicationCondition = applicationCondition;
		applicationCondition = newApplicationCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION, oldApplicationCondition, newApplicationCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationCondition(Predicate newApplicationCondition) {
		if (newApplicationCondition != applicationCondition) {
			NotificationChain msgs = null;
			if (applicationCondition != null)
				msgs = ((InternalEObject)applicationCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION, null, msgs);
			if (newApplicationCondition != null)
				msgs = ((InternalEObject)newApplicationCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION, null, msgs);
			msgs = basicSetApplicationCondition(newApplicationCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION, newApplicationCondition, newApplicationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreGenerationSequence getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(PreGenerationSequence newActions, NotificationChain msgs) {
		PreGenerationSequence oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(PreGenerationSequence newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationConditionText() {
		return applicationConditionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationConditionText(String newApplicationConditionText) {
		String oldApplicationConditionText = applicationConditionText;
		applicationConditionText = newApplicationConditionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT, oldApplicationConditionText, applicationConditionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionsText() {
		return actionsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionsText(String newActionsText) {
		String oldActionsText = actionsText;
		actionsText = newActionsText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT, oldActionsText, actionsText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
				return basicSetApplicationCondition(null, msgs);
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				return basicSetActions(null, msgs);
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
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
				return getApplicationCondition();
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				return getActions();
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT:
				return getApplicationConditionText();
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT:
				return getActionsText();
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
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
				setApplicationCondition((Predicate)newValue);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				setActions((PreGenerationSequence)newValue);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT:
				setApplicationConditionText((String)newValue);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT:
				setActionsText((String)newValue);
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
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
				setApplicationCondition((Predicate)null);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				setActions((PreGenerationSequence)null);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT:
				setApplicationConditionText(APPLICATION_CONDITION_TEXT_EDEFAULT);
				return;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT:
				setActionsText(ACTIONS_TEXT_EDEFAULT);
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
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION:
				return applicationCondition != null;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS:
				return actions != null;
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT:
				return APPLICATION_CONDITION_TEXT_EDEFAULT == null ? applicationConditionText != null : !APPLICATION_CONDITION_TEXT_EDEFAULT.equals(applicationConditionText);
			case GuigraphPackage.CONDITION_ACTION_TRANSITION__ACTIONS_TEXT:
				return ACTIONS_TEXT_EDEFAULT == null ? actionsText != null : !ACTIONS_TEXT_EDEFAULT.equals(actionsText);
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

} //ConditionActionTransitionImpl
