/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.UnaryFunction#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getUnaryFunction()
 * @model abstract="true"
 * @generated
 */
public interface UnaryFunction extends IArithmetricFunction {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getUnaryFunction_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getOperand();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.UnaryFunction#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(IArithmetricFunction value);

} // UnaryFunction
