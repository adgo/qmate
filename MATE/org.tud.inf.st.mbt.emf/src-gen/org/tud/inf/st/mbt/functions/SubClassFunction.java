/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.SubClassFunction#getSub <em>Sub</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.SubClassFunction#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getSubClassFunction()
 * @model
 * @generated
 */
public interface SubClassFunction extends ILogicFunction {
	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(IValueFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getSubClassFunction_Sub()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IValueFunction getSub();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.SubClassFunction#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(IValueFunction value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(IValueFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getSubClassFunction_In()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IValueFunction getIn();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.SubClassFunction#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(IValueFunction value);

} // SubClassFunction
