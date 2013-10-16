/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.TerminalParser#getTerminal <em>Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getTerminalParser()
 * @model
 * @generated
 */
public interface TerminalParser extends AbstractParser {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see org.tud.inf.st.pccs.PccsPackage#getTerminalParser_Terminal()
	 * @model required="true"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.TerminalParser#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

} // TerminalParser
