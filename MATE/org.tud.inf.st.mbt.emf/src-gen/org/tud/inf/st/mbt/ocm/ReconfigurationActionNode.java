/**
 */
package org.tud.inf.st.mbt.ocm;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.actions.ReconfigurationAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Action Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActions <em>Actions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActionsText <em>Actions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getReconfigurationActionNode()
 * @model
 * @generated
 */
public interface ReconfigurationActionNode extends ConfigurationNode {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.actions.ReconfigurationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getReconfigurationActionNode_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationAction> getActions();

	/**
	 * Returns the value of the '<em><b>Actions Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Text</em>' attribute.
	 * @see #setActionsText(String)
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#getReconfigurationActionNode_ActionsText()
	 * @model required="true"
	 * @generated
	 */
	String getActionsText();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode#getActionsText <em>Actions Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Text</em>' attribute.
	 * @see #getActionsText()
	 * @generated
	 */
	void setActionsText(String value);

} // ReconfigurationActionNode
