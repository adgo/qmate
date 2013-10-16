/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Stand Alone Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.LogicStandAloneFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getLogicStandAloneFunction()
 * @model
 * @generated
 */
public interface LogicStandAloneFunction extends StandAloneFunction {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(ILogicFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getLogicStandAloneFunction_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ILogicFunction getFunction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.LogicStandAloneFunction#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ILogicFunction value);

} // LogicStandAloneFunction
