/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.pccs.AsQName;
import org.tud.inf.st.pccs.PccsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As QName</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.AsQNameImpl#getDelim <em>Delim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsQNameImpl extends EObjectImpl implements AsQName {
	/**
	 * The default value of the '{@link #getDelim() <em>Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelim()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelim() <em>Delim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelim()
	 * @generated
	 * @ordered
	 */
	protected String delim = DELIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsQNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.AS_QNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelim() {
		return delim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelim(String newDelim) {
		String oldDelim = delim;
		delim = newDelim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.AS_QNAME__DELIM, oldDelim, delim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PccsPackage.AS_QNAME__DELIM:
				return getDelim();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PccsPackage.AS_QNAME__DELIM:
				setDelim((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PccsPackage.AS_QNAME__DELIM:
				setDelim(DELIM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PccsPackage.AS_QNAME__DELIM:
				return DELIM_EDEFAULT == null ? delim != null : !DELIM_EDEFAULT.equals(delim);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (delim: ");
		result.append(delim);
		result.append(')');
		return result.toString();
	}

} //AsQNameImpl
