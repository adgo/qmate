/**
 */
package org.tud.inf.st.mbt.test;

import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.terms.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestStep#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestStep()
 * @model
 * @generated
 */
public interface TestStep extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(PostGenerationAction)
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestStep_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PostGenerationAction getAction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestStep#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(PostGenerationAction value);

} // TestStep
