/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.pccs.LiteralParser;
import org.tud.inf.st.pccs.PccsPackage;
import org.tud.inf.st.pccs.RegularExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.LiteralParserImpl#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LiteralParserImpl extends AbstractParserImpl implements LiteralParser {
	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected RegularExpression regex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.LITERAL_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularExpression getRegex() {
		if (regex != null && regex.eIsProxy()) {
			InternalEObject oldRegex = (InternalEObject)regex;
			regex = (RegularExpression)eResolveProxy(oldRegex);
			if (regex != oldRegex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PccsPackage.LITERAL_PARSER__REGEX, oldRegex, regex));
			}
		}
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularExpression basicGetRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(RegularExpression newRegex) {
		RegularExpression oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.LITERAL_PARSER__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PccsPackage.LITERAL_PARSER__REGEX:
				if (resolve) return getRegex();
				return basicGetRegex();
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
			case PccsPackage.LITERAL_PARSER__REGEX:
				setRegex((RegularExpression)newValue);
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
			case PccsPackage.LITERAL_PARSER__REGEX:
				setRegex((RegularExpression)null);
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
			case PccsPackage.LITERAL_PARSER__REGEX:
				return regex != null;
		}
		return super.eIsSet(featureID);
	}

} //LiteralParserImpl
