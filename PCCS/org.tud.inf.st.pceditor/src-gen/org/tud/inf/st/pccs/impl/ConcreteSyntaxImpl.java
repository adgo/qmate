/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.MetaModel;
import org.tud.inf.st.pccs.ParserDefinition;
import org.tud.inf.st.pccs.PccsPackage;
import org.tud.inf.st.pccs.RegularExpression;
import org.tud.inf.st.pccs.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getStartwith <em>Startwith</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getParsers <em>Parsers</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getMultiLineCommentIndicationStart <em>Multi Line Comment Indication Start</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getMultiLineCommentIndicationEnd <em>Multi Line Comment Indication End</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getSingleLineCommentIndicationStart <em>Single Line Comment Indication Start</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.ConcreteSyntaxImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteSyntaxImpl extends EObjectImpl implements ConcreteSyntax {
	/**
	 * The cached value of the '{@link #getStartwith() <em>Startwith</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartwith()
	 * @generated
	 * @ordered
	 */
	protected ParserDefinition startwith;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList operators;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList keywords;

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
	 * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList metamodels;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected EList regex;

	/**
	 * The default value of the '{@link #getMultiLineCommentIndicationStart() <em>Multi Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLineCommentIndicationStart()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTI_LINE_COMMENT_INDICATION_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiLineCommentIndicationStart() <em>Multi Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLineCommentIndicationStart()
	 * @generated
	 * @ordered
	 */
	protected String multiLineCommentIndicationStart = MULTI_LINE_COMMENT_INDICATION_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiLineCommentIndicationEnd() <em>Multi Line Comment Indication End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLineCommentIndicationEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTI_LINE_COMMENT_INDICATION_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiLineCommentIndicationEnd() <em>Multi Line Comment Indication End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLineCommentIndicationEnd()
	 * @generated
	 * @ordered
	 */
	protected String multiLineCommentIndicationEnd = MULTI_LINE_COMMENT_INDICATION_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingleLineCommentIndicationStart() <em>Single Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleLineCommentIndicationStart()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_LINE_COMMENT_INDICATION_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleLineCommentIndicationStart() <em>Single Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleLineCommentIndicationStart()
	 * @generated
	 * @ordered
	 */
	protected String singleLineCommentIndicationStart = SINGLE_LINE_COMMENT_INDICATION_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.CONCRETE_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserDefinition getStartwith() {
		if (startwith != null && startwith.eIsProxy()) {
			InternalEObject oldStartwith = (InternalEObject)startwith;
			startwith = (ParserDefinition)eResolveProxy(oldStartwith);
			if (startwith != oldStartwith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PccsPackage.CONCRETE_SYNTAX__STARTWITH, oldStartwith, startwith));
			}
		}
		return startwith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserDefinition basicGetStartwith() {
		return startwith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartwith(ParserDefinition newStartwith) {
		ParserDefinition oldStartwith = startwith;
		startwith = newStartwith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.CONCRETE_SYNTAX__STARTWITH, oldStartwith, startwith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentEList(Terminal.class, this, PccsPackage.CONCRETE_SYNTAX__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKeywords() {
		if (keywords == null) {
			keywords = new EObjectContainmentEList(Terminal.class, this, PccsPackage.CONCRETE_SYNTAX__KEYWORDS);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParsers() {
		if (parsers == null) {
			parsers = new EObjectContainmentEList(ParserDefinition.class, this, PccsPackage.CONCRETE_SYNTAX__PARSERS);
		}
		return parsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetamodels() {
		if (metamodels == null) {
			metamodels = new EObjectContainmentEList(MetaModel.class, this, PccsPackage.CONCRETE_SYNTAX__METAMODELS);
		}
		return metamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegex() {
		if (regex == null) {
			regex = new EObjectContainmentEList(RegularExpression.class, this, PccsPackage.CONCRETE_SYNTAX__REGEX);
		}
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiLineCommentIndicationStart() {
		return multiLineCommentIndicationStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLineCommentIndicationStart(String newMultiLineCommentIndicationStart) {
		String oldMultiLineCommentIndicationStart = multiLineCommentIndicationStart;
		multiLineCommentIndicationStart = newMultiLineCommentIndicationStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START, oldMultiLineCommentIndicationStart, multiLineCommentIndicationStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiLineCommentIndicationEnd() {
		return multiLineCommentIndicationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLineCommentIndicationEnd(String newMultiLineCommentIndicationEnd) {
		String oldMultiLineCommentIndicationEnd = multiLineCommentIndicationEnd;
		multiLineCommentIndicationEnd = newMultiLineCommentIndicationEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END, oldMultiLineCommentIndicationEnd, multiLineCommentIndicationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingleLineCommentIndicationStart() {
		return singleLineCommentIndicationStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleLineCommentIndicationStart(String newSingleLineCommentIndicationStart) {
		String oldSingleLineCommentIndicationStart = singleLineCommentIndicationStart;
		singleLineCommentIndicationStart = newSingleLineCommentIndicationStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START, oldSingleLineCommentIndicationStart, singleLineCommentIndicationStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.CONCRETE_SYNTAX__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
				return ((InternalEList)getOperators()).basicRemove(otherEnd, msgs);
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
				return ((InternalEList)getKeywords()).basicRemove(otherEnd, msgs);
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
				return ((InternalEList)getParsers()).basicRemove(otherEnd, msgs);
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
				return ((InternalEList)getMetamodels()).basicRemove(otherEnd, msgs);
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
				return ((InternalEList)getRegex()).basicRemove(otherEnd, msgs);
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
			case PccsPackage.CONCRETE_SYNTAX__STARTWITH:
				if (resolve) return getStartwith();
				return basicGetStartwith();
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
				return getOperators();
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
				return getKeywords();
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
				return getParsers();
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
				return getMetamodels();
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
				return getRegex();
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START:
				return getMultiLineCommentIndicationStart();
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END:
				return getMultiLineCommentIndicationEnd();
			case PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START:
				return getSingleLineCommentIndicationStart();
			case PccsPackage.CONCRETE_SYNTAX__ID:
				return getId();
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
			case PccsPackage.CONCRETE_SYNTAX__STARTWITH:
				setStartwith((ParserDefinition)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
				getParsers().clear();
				getParsers().addAll((Collection)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
				getMetamodels().clear();
				getMetamodels().addAll((Collection)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
				getRegex().clear();
				getRegex().addAll((Collection)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START:
				setMultiLineCommentIndicationStart((String)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END:
				setMultiLineCommentIndicationEnd((String)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START:
				setSingleLineCommentIndicationStart((String)newValue);
				return;
			case PccsPackage.CONCRETE_SYNTAX__ID:
				setId((String)newValue);
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
			case PccsPackage.CONCRETE_SYNTAX__STARTWITH:
				setStartwith((ParserDefinition)null);
				return;
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
				getOperators().clear();
				return;
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
				getKeywords().clear();
				return;
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
				getParsers().clear();
				return;
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
				getMetamodels().clear();
				return;
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
				getRegex().clear();
				return;
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START:
				setMultiLineCommentIndicationStart(MULTI_LINE_COMMENT_INDICATION_START_EDEFAULT);
				return;
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END:
				setMultiLineCommentIndicationEnd(MULTI_LINE_COMMENT_INDICATION_END_EDEFAULT);
				return;
			case PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START:
				setSingleLineCommentIndicationStart(SINGLE_LINE_COMMENT_INDICATION_START_EDEFAULT);
				return;
			case PccsPackage.CONCRETE_SYNTAX__ID:
				setId(ID_EDEFAULT);
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
			case PccsPackage.CONCRETE_SYNTAX__STARTWITH:
				return startwith != null;
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
				return operators != null && !operators.isEmpty();
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
				return keywords != null && !keywords.isEmpty();
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
				return parsers != null && !parsers.isEmpty();
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
				return metamodels != null && !metamodels.isEmpty();
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
				return regex != null && !regex.isEmpty();
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START:
				return MULTI_LINE_COMMENT_INDICATION_START_EDEFAULT == null ? multiLineCommentIndicationStart != null : !MULTI_LINE_COMMENT_INDICATION_START_EDEFAULT.equals(multiLineCommentIndicationStart);
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END:
				return MULTI_LINE_COMMENT_INDICATION_END_EDEFAULT == null ? multiLineCommentIndicationEnd != null : !MULTI_LINE_COMMENT_INDICATION_END_EDEFAULT.equals(multiLineCommentIndicationEnd);
			case PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START:
				return SINGLE_LINE_COMMENT_INDICATION_START_EDEFAULT == null ? singleLineCommentIndicationStart != null : !SINGLE_LINE_COMMENT_INDICATION_START_EDEFAULT.equals(singleLineCommentIndicationStart);
			case PccsPackage.CONCRETE_SYNTAX__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (multiLineCommentIndicationStart: ");
		result.append(multiLineCommentIndicationStart);
		result.append(", multiLineCommentIndicationEnd: ");
		result.append(multiLineCommentIndicationEnd);
		result.append(", singleLineCommentIndicationStart: ");
		result.append(singleLineCommentIndicationStart);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConcreteSyntaxImpl
