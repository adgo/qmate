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
 * A representation of the model object '<em><b>Parser Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.ParserDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.ParserDefinition#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getParserDefinition()
 * @model
 * @generated
 */
public interface ParserDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tud.inf.st.pccs.PccsPackage#getParserDefinition_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ParserDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(AbstractParser)
	 * @see org.tud.inf.st.pccs.PccsPackage#getParserDefinition_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractParser getRule();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.ParserDefinition#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractParser value);

} // ParserDefinition
