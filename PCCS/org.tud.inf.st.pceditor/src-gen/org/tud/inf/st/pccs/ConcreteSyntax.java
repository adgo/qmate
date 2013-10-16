/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getStartwith <em>Startwith</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getParsers <em>Parsers</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationStart <em>Multi Line Comment Indication Start</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationEnd <em>Multi Line Comment Indication End</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getSingleLineCommentIndicationStart <em>Single Line Comment Indication Start</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ConcreteSyntax#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax()
 * @model
 * @generated
 */
public interface ConcreteSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Startwith</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startwith</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startwith</em>' reference.
	 * @see #setStartwith(ParserDefinition)
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Startwith()
	 * @model required="true"
	 * @generated
	 */
	ParserDefinition getStartwith();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ConcreteSyntax#getStartwith <em>Startwith</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startwith</em>' reference.
	 * @see #getStartwith()
	 * @generated
	 */
	void setStartwith(ParserDefinition value);

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Operators()
	 * @model type="org.tud.inf.st.pccs.Terminal" containment="true"
	 * @generated
	 */
	EList getOperators();

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Keywords()
	 * @model type="org.tud.inf.st.pccs.Terminal" containment="true"
	 * @generated
	 */
	EList getKeywords();

	/**
	 * Returns the value of the '<em><b>Parsers</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.ParserDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsers</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Parsers()
	 * @model type="org.tud.inf.st.pccs.ParserDefinition" containment="true"
	 * @generated
	 */
	EList getParsers();

	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.MetaModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Metamodels()
	 * @model type="org.tud.inf.st.pccs.MetaModel" containment="true" required="true"
	 * @generated
	 */
	EList getMetamodels();

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.RegularExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Regex()
	 * @model type="org.tud.inf.st.pccs.RegularExpression" containment="true"
	 * @generated
	 */
	EList getRegex();

	/**
	 * Returns the value of the '<em><b>Multi Line Comment Indication Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line Comment Indication Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line Comment Indication Start</em>' attribute.
	 * @see #setMultiLineCommentIndicationStart(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_MultiLineCommentIndicationStart()
	 * @model
	 * @generated
	 */
	String getMultiLineCommentIndicationStart();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationStart <em>Multi Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line Comment Indication Start</em>' attribute.
	 * @see #getMultiLineCommentIndicationStart()
	 * @generated
	 */
	void setMultiLineCommentIndicationStart(String value);

	/**
	 * Returns the value of the '<em><b>Multi Line Comment Indication End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line Comment Indication End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line Comment Indication End</em>' attribute.
	 * @see #setMultiLineCommentIndicationEnd(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_MultiLineCommentIndicationEnd()
	 * @model
	 * @generated
	 */
	String getMultiLineCommentIndicationEnd();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ConcreteSyntax#getMultiLineCommentIndicationEnd <em>Multi Line Comment Indication End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line Comment Indication End</em>' attribute.
	 * @see #getMultiLineCommentIndicationEnd()
	 * @generated
	 */
	void setMultiLineCommentIndicationEnd(String value);

	/**
	 * Returns the value of the '<em><b>Single Line Comment Indication Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Line Comment Indication Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Line Comment Indication Start</em>' attribute.
	 * @see #setSingleLineCommentIndicationStart(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_SingleLineCommentIndicationStart()
	 * @model
	 * @generated
	 */
	String getSingleLineCommentIndicationStart();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ConcreteSyntax#getSingleLineCommentIndicationStart <em>Single Line Comment Indication Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Line Comment Indication Start</em>' attribute.
	 * @see #getSingleLineCommentIndicationStart()
	 * @generated
	 */
	void setSingleLineCommentIndicationStart(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getConcreteSyntax_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ConcreteSyntax#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ConcreteSyntax
