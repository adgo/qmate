/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.LiteralParser#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getLiteralParser()
 * @model abstract="true"
 * @generated
 */
public interface LiteralParser extends AbstractParser {

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' reference.
	 * @see #setRegex(RegularExpression)
	 * @see org.tud.inf.st.pccs.PccsPackage#getLiteralParser_Regex()
	 * @model
	 * @generated
	 */
	RegularExpression getRegex();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.LiteralParser#getRegex <em>Regex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' reference.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(RegularExpression value);
} // LiteralParser
