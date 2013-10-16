/**
 */
package org.tud.inf.st.mbt.actions;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;

import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Condition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimedConditionAction()
 * @model
 * @generated
 */
public interface TimedConditionAction extends AbstractModelElement, ITopLevelElement, IRealTimeConsumer {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(PreGenerationAction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimedConditionAction_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreGenerationAction getAction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(PreGenerationAction value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimedConditionAction_Frequency()
	 * @model required="true"
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ILogicFunction)
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#getTimedConditionAction_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ILogicFunction getCondition();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.actions.TimedConditionAction#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ILogicFunction value);

} // TimedConditionAction
