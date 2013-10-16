/**
 */
package org.tud.inf.st.mbt.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.ThrowAction#getEventID <em>Event ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getThrowAction()
 * @model
 * @generated
 */
public interface ThrowAction extends PreGenerationAction {
	/**
	 * Returns the value of the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event ID</em>' attribute.
	 * @see #setEventID(String)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getThrowAction_EventID()
	 * @model required="true"
	 * @generated
	 */
	String getEventID();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.ThrowAction#getEventID <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event ID</em>' attribute.
	 * @see #getEventID()
	 * @generated
	 */
	void setEventID(String value);

} // ThrowAction
