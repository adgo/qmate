/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.rules.ITimeConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.TimeAction#getTime <em>Time</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.TimeAction#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimeAction()
 * @model
 * @generated
 */
public interface TimeAction extends PreGenerationAction {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimeAction_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.TimeAction#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(ITimeConsumer)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimeAction_Consumer()
	 * @model
	 * @generated
	 */
	ITimeConsumer getConsumer();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.TimeAction#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(ITimeConsumer value);

} // TimeAction
