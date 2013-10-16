/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.OrParser#getParsers <em>Parsers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getOrParser()
 * @model
 * @generated
 */
public interface OrParser extends AbstractParser {
	/**
	 * Returns the value of the '<em><b>Parsers</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.AbstractParser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsers</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getOrParser_Parsers()
	 * @model type="org.tud.inf.st.pccs.AbstractParser" containment="true" required="true"
	 * @generated
	 */
	EList getParsers();

} // OrParser
