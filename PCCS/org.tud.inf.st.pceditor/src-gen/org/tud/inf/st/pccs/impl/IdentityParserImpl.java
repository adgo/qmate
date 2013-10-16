/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.inf.st.pccs.AbstractParser;
import org.tud.inf.st.pccs.IdentityParser;
import org.tud.inf.st.pccs.PccsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.IdentityParserImpl#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityParserImpl extends AbstractParserImpl implements IdentityParser {
	/**
	 * The cached value of the '{@link #getParser() <em>Parser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParser()
	 * @generated
	 * @ordered
	 */
	protected AbstractParser parser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.IDENTITY_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractParser getParser() {
		return parser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParser(AbstractParser newParser, NotificationChain msgs) {
		AbstractParser oldParser = parser;
		parser = newParser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PccsPackage.IDENTITY_PARSER__PARSER, oldParser, newParser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParser(AbstractParser newParser) {
		if (newParser != parser) {
			NotificationChain msgs = null;
			if (parser != null)
				msgs = ((InternalEObject)parser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PccsPackage.IDENTITY_PARSER__PARSER, null, msgs);
			if (newParser != null)
				msgs = ((InternalEObject)newParser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PccsPackage.IDENTITY_PARSER__PARSER, null, msgs);
			msgs = basicSetParser(newParser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.IDENTITY_PARSER__PARSER, newParser, newParser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PccsPackage.IDENTITY_PARSER__PARSER:
				return basicSetParser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PccsPackage.IDENTITY_PARSER__PARSER:
				return getParser();
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
			case PccsPackage.IDENTITY_PARSER__PARSER:
				setParser((AbstractParser)newValue);
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
			case PccsPackage.IDENTITY_PARSER__PARSER:
				setParser((AbstractParser)null);
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
			case PccsPackage.IDENTITY_PARSER__PARSER:
				return parser != null;
		}
		return super.eIsSet(featureID);
	}

} //IdentityParserImpl
