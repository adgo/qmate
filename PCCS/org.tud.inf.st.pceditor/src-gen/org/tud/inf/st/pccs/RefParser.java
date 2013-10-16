/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.RefParser#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getRefParser()
 * @model
 * @generated
 */
public interface RefParser extends AbstractParser {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ParserDefinition)
	 * @see org.tud.inf.st.pccs.PccsPackage#getRefParser_Ref()
	 * @model required="true"
	 * @generated
	 */
	ParserDefinition getRef();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.RefParser#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ParserDefinition value);

} // RefParser
