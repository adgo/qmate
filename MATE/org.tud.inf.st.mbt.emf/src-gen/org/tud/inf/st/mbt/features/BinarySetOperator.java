/**
 */
package org.tud.inf.st.mbt.features;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Set Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getBinarySetOperator()
 * @model abstract="true"
 * @generated
 */
public interface BinarySetOperator extends FeatureSet {
	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(FeatureSet)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getBinarySetOperator_Operand1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureSet getOperand1();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand1 <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(FeatureSet value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(FeatureSet)
	 * @see org.tud.inf.st.mbt.features.FeaturesPackage#getBinarySetOperator_Operand2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureSet getOperand2();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.features.BinarySetOperator#getOperand2 <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(FeatureSet value);

} // BinarySetOperator
