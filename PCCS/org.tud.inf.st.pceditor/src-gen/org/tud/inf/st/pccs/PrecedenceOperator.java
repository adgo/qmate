/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.PrecedenceOperator#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.PrecedenceOperator#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.pccs.PccsPackage#getPrecedenceOperator()
 * @model abstract="true"
 * @generated
 */
public interface PrecedenceOperator extends OperatorTableEntry {
	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' attribute.
	 * @see #setPrecedence(int)
	 * @see org.tud.inf.st.pccs.PccsPackage#getPrecedenceOperator_Precedence()
	 * @model required="true"
	 * @generated
	 */
	int getPrecedence();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.PrecedenceOperator#getPrecedence <em>Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' attribute.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(int value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see org.tud.inf.st.pccs.PccsPackage#getPrecedenceOperator_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.pccs.PrecedenceOperator#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

} // PrecedenceOperator
