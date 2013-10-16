/**
 */
package org.tud.inf.st.mbt.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBinaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(Predicate)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBinaryOperator_Operand1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getOperand1();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand1 <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(Predicate value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(Predicate)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getBinaryOperator_Operand2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getOperand2();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.BinaryOperator#getOperand2 <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(Predicate value);

} // BinaryOperator
