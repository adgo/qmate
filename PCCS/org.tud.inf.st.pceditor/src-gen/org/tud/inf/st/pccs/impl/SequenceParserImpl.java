/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.pccs.AbstractParser;
import org.tud.inf.st.pccs.PccsPackage;
import org.tud.inf.st.pccs.SequenceParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.SequenceParserImpl#getParsers <em>Parsers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceParserImpl extends AbstractParserImpl implements SequenceParser {
	/**
	 * The cached value of the '{@link #getParsers() <em>Parsers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsers()
	 * @generated
	 * @ordered
	 */
	protected EList parsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.SEQUENCE_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParsers() {
		if (parsers == null) {
			parsers = new EObjectContainmentEList(AbstractParser.class, this, PccsPackage.SEQUENCE_PARSER__PARSERS);
		}
		return parsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PccsPackage.SEQUENCE_PARSER__PARSERS:
				return ((InternalEList)getParsers()).basicRemove(otherEnd, msgs);
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
			case PccsPackage.SEQUENCE_PARSER__PARSERS:
				return getParsers();
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
			case PccsPackage.SEQUENCE_PARSER__PARSERS:
				getParsers().clear();
				getParsers().addAll((Collection)newValue);
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
			case PccsPackage.SEQUENCE_PARSER__PARSERS:
				getParsers().clear();
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
			case PccsPackage.SEQUENCE_PARSER__PARSERS:
				return parsers != null && !parsers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceParserImpl
