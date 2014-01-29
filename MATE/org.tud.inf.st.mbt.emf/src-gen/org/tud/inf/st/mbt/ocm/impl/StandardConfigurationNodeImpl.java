/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.inf.st.mbt.features.Configuration;

import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.StandardConfigurationNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Configuration Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.StandardConfigurationNodeImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardConfigurationNodeImpl extends ConfigurationNodeImpl implements StandardConfigurationNode {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardConfigurationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcmPackage.Literals.STANDARD_CONFIGURATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
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
			case OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION:
				setConfiguration((Configuration)newValue);
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
			case OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION:
				setConfiguration((Configuration)null);
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
			case OcmPackage.STANDARD_CONFIGURATION_NODE__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		String str = "{";
		if (configuration != null) {
			List<EObject> stmts = new ArrayList<EObject>();
			stmts.addAll(configuration.getFeatures());
			stmts.addAll(configuration.getBindings());
			Iterator<EObject> i = stmts.iterator();
			while (i.hasNext()) {
				str += i.next();
				if (i.hasNext())
					str += ", ";
			}
		}
		str += "}";
		return str;
	}

} //StandardConfigurationNodeImpl
