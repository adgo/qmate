/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Reference Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.LogicReferenceFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getLogicReferenceFunction()
 * @model
 * @generated
 */
public interface LogicReferenceFunction extends ReferenceFunction, ILogicFunction {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(LogicStandAloneFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getLogicReferenceFunction_Function()
	 * @model required="true"
	 * @generated
	 */
	LogicStandAloneFunction getFunction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.LogicReferenceFunction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(LogicStandAloneFunction value);

} // LogicReferenceFunction
