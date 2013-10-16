/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.actions.ReconfigurationAction;

import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Action Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.ReconfigurationActionNodeImpl#getActionsText <em>Actions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationActionNodeImpl extends ConfigurationNodeImpl implements ReconfigurationActionNode {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationAction> actions;

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
	protected ReconfigurationActionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcmPackage.Literals.RECONFIGURATION_ACTION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ReconfigurationAction>(ReconfigurationAction.class, this, OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS);
		}
		return actions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT, oldActionsText, actionsText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS:
				return getActions();
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT:
				return getActionsText();
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
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ReconfigurationAction>)newValue);
				return;
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT:
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
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS:
				getActions().clear();
				return;
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT:
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
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OcmPackage.RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT:
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

} //ReconfigurationActionNodeImpl
