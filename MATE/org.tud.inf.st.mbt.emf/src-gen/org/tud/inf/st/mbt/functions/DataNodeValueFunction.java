/**
 */
package org.tud.inf.st.mbt.functions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node Value Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.DataNodeValueFunction#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeValueFunction()
 * @model
 * @generated
 */
public interface DataNodeValueFunction extends IArithmetricFunction, ILogicFunction, IValueFunction {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(DataNodeFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeValueFunction_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataNodeFunction getNode();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.DataNodeValueFunction#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(DataNodeFunction value);

} // DataNodeValueFunction
