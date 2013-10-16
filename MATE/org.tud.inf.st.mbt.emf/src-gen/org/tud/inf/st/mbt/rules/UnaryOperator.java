/**
 */
package org.tud.inf.st.mbt.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.UnaryOperator#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.rules.RulesPackage#getUnaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface UnaryOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Predicate)
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#getUnaryOperator_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getOperand();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.rules.UnaryOperator#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Predicate value);

} // UnaryOperator
