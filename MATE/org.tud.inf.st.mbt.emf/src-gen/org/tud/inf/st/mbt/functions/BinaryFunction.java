/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.BinaryFunction#getLeft <em>Left</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.BinaryFunction#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBinaryFunction()
 * @model abstract="true"
 * @generated
 */
public interface BinaryFunction extends IArithmetricFunction {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBinaryFunction_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getLeft();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BinaryFunction#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(IArithmetricFunction value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBinaryFunction_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getRight();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BinaryFunction#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(IArithmetricFunction value);

} // BinaryFunction
