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
 * A representation of the model object '<em><b>Operator Table Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.OperatorTableParser#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getOperatorTableParser()
 * @model
 * @generated
 */
public interface OperatorTableParser extends AbstractParser {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.pccs.OperatorTableEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.tud.inf.st.pccs.PccsPackage#getOperatorTableParser_Entries()
	 * @model type="org.tud.inf.st.pccs.OperatorTableEntry" containment="true"
	 * @generated
	 */
	EList getEntries();

} // OperatorTableParser
