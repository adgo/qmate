/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.OcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.ConfigurationNodeImpl#getPostConfEventID <em>Post Conf Event ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConfigurationNodeImpl extends AbstractModelElementImpl implements ConfigurationNode {
	/**
	 * The default value of the '{@link #getPostConfEventID() <em>Post Conf Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConfEventID()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONF_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostConfEventID() <em>Post Conf Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConfEventID()
	 * @generated
	 * @ordered
	 */
	protected String postConfEventID = POST_CONF_EVENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcmPackage.Literals.CONFIGURATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostConfEventID() {
		return postConfEventID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostConfEventID(String newPostConfEventID) {
		String oldPostConfEventID = postConfEventID;
		postConfEventID = newPostConfEventID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcmPackage.CONFIGURATION_NODE__POST_CONF_EVENT_ID, oldPostConfEventID, postConfEventID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcmPackage.CONFIGURATION_NODE__POST_CONF_EVENT_ID:
				return getPostConfEventID();
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
			case OcmPackage.CONFIGURATION_NODE__POST_CONF_EVENT_ID:
				setPostConfEventID((String)newValue);
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
			case OcmPackage.CONFIGURATION_NODE__POST_CONF_EVENT_ID:
				setPostConfEventID(POST_CONF_EVENT_ID_EDEFAULT);
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
			case OcmPackage.CONFIGURATION_NODE__POST_CONF_EVENT_ID:
				return POST_CONF_EVENT_ID_EDEFAULT == null ? postConfEventID != null : !POST_CONF_EVENT_ID_EDEFAULT.equals(postConfEventID);
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

} //ConfigurationNodeImpl
