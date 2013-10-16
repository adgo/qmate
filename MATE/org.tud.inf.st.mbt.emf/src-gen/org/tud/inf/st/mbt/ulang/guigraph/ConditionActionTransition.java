/**
 */
package org.tud.inf.st.mbt.ulang.guigraph;

import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Action Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationCondition <em>Application Condition</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActions <em>Actions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationConditionText <em>Application Condition Text</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActionsText <em>Actions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getConditionActionTransition()
 * @model
 * @generated
 */
public interface ConditionActionTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Application Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Condition</em>' containment reference.
	 * @see #setApplicationCondition(Predicate)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getConditionActionTransition_ApplicationCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getApplicationCondition();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationCondition <em>Application Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Condition</em>' containment reference.
	 * @see #getApplicationCondition()
	 * @generated
	 */
	void setApplicationCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(PreGenerationSequence)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getConditionActionTransition_Actions()
	 * @model containment="true"
	 * @generated
	 */
	PreGenerationSequence getActions();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(PreGenerationSequence value);

	/**
	 * Returns the value of the '<em><b>Application Condition Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Condition Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Condition Text</em>' attribute.
	 * @see #setApplicationConditionText(String)
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getConditionActionTransition_ApplicationConditionText()
	 * @model required="true"
	 * @generated
	 */
	String getApplicationConditionText();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getApplicationConditionText <em>Application Condition Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Condition Text</em>' attribute.
	 * @see #getApplicationConditionText()
	 * @generated
	 */
	void setApplicationConditionText(String value);

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
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#getConditionActionTransition_ActionsText()
	 * @model required="true"
	 * @generated
	 */
	String getActionsText();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition#getActionsText <em>Actions Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Text</em>' attribute.
	 * @see #getActionsText()
	 * @generated
	 */
	void setActionsText(String value);

} // ConditionActionTransition
