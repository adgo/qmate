/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.OperatorTableEntry#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getOperatorTableEntry()
 * @model abstract="true"
 * @generated
 */
public interface OperatorTableEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Parser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser</em>' containment reference.
	 * @see #setParser(AbstractParser)
	 * @see org.tud.inf.st.pccs.PccsPackage#getOperatorTableEntry_Parser()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractParser getParser();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.OperatorTableEntry#getParser <em>Parser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser</em>' containment reference.
	 * @see #getParser()
	 * @generated
	 */
	void setParser(AbstractParser value);

} // OperatorTableEntry
