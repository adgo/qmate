/**
 */
package org.tud.inf.st.mbt.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Real Time Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.GetRealTimeAction#getTimeHint <em>Time Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetRealTimeAction()
 * @model
 * @generated
 */
public interface GetRealTimeAction extends DependentAction, PreGenerationAction {

	/**
	 * Returns the value of the '<em><b>Time Hint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Hint</em>' attribute.
	 * @see #setTimeHint(long)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getGetRealTimeAction_TimeHint()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getTimeHint();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.GetRealTimeAction#getTimeHint <em>Time Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Hint</em>' attribute.
	 * @see #getTimeHint()
	 * @generated
	 */
	void setTimeHint(long value);

} // GetRealTimeAction
