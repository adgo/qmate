/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.functions.IDataNodeFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Data Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.GetDataAction#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetDataAction()
 * @model
 * @generated
 */
public interface GetDataAction extends PreGenerationAction {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(IDataNodeFunction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetDataAction_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IDataNodeFunction getNode();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.GetDataAction#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(IDataNodeFunction value);

} // GetDataAction
