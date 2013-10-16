/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.functions.IDataNodeFunction;
import org.tud.inf.st.mbt.functions.IValueFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Data Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.SetDataAction#getValues <em>Values</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.SetDataAction#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetDataAction()
 * @model
 * @generated
 */
public interface SetDataAction extends ReconfigurationAction {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference.
	 * @see #setValues(IValueFunction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetDataAction_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IValueFunction getValues();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.SetDataAction#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' containment reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(IValueFunction value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(IDataNodeFunction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getSetDataAction_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IDataNodeFunction getNode();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.SetDataAction#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(IDataNodeFunction value);

} // SetDataAction
