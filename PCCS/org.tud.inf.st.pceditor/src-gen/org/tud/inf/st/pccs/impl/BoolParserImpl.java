/**
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.pccs.BoolParser;
import org.tud.inf.st.pccs.PccsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.BoolParserImpl#getTrueLit <em>True Lit</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.BoolParserImpl#getFalseLit <em>False Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoolParserImpl extends LiteralParserImpl implements BoolParser {
	/**
	 * The default value of the '{@link #getTrueLit() <em>True Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueLit()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUE_LIT_EDEFAULT = "true";
	/**
	 * The cached value of the '{@link #getTrueLit() <em>True Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueLit()
	 * @generated
	 * @ordered
	 */
	protected String trueLit = TRUE_LIT_EDEFAULT;
	/**
	 * The default value of the '{@link #getFalseLit() <em>False Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseLit()
	 * @generated
	 * @ordered
	 */
	protected static final String FALSE_LIT_EDEFAULT = "false";
	/**
	 * The cached value of the '{@link #getFalseLit() <em>False Lit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseLit()
	 * @generated
	 * @ordered
	 */
	protected String falseLit = FALSE_LIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.BOOL_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrueLit() {
		return trueLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueLit(String newTrueLit) {
		String oldTrueLit = trueLit;
		trueLit = newTrueLit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.BOOL_PARSER__TRUE_LIT, oldTrueLit, trueLit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFalseLit() {
		return falseLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseLit(String newFalseLit) {
		String oldFalseLit = falseLit;
		falseLit = newFalseLit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.BOOL_PARSER__FALSE_LIT, oldFalseLit, falseLit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PccsPackage.BOOL_PARSER__TRUE_LIT:
				return getTrueLit();
			case PccsPackage.BOOL_PARSER__FALSE_LIT:
				return getFalseLit();
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
			case PccsPackage.BOOL_PARSER__TRUE_LIT:
				setTrueLit((String)newValue);
				return;
			case PccsPackage.BOOL_PARSER__FALSE_LIT:
				setFalseLit((String)newValue);
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
			case PccsPackage.BOOL_PARSER__TRUE_LIT:
				setTrueLit(TRUE_LIT_EDEFAULT);
				return;
			case PccsPackage.BOOL_PARSER__FALSE_LIT:
				setFalseLit(FALSE_LIT_EDEFAULT);
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
			case PccsPackage.BOOL_PARSER__TRUE_LIT:
				return TRUE_LIT_EDEFAULT == null ? trueLit != null : !TRUE_LIT_EDEFAULT.equals(trueLit);
			case PccsPackage.BOOL_PARSER__FALSE_LIT:
				return FALSE_LIT_EDEFAULT == null ? falseLit != null : !FALSE_LIT_EDEFAULT.equals(falseLit);
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
		result.append(" (trueLit: ");
		result.append(trueLit);
		result.append(", falseLit: ");
		result.append(falseLit);
		result.append(')');
		return result.toString();
	}

} //BoolParserImpl
