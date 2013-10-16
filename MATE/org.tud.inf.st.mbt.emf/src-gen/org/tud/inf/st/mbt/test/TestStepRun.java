/**
 */
package org.tud.inf.st.mbt.test;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.rules.Atom;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestStepRun#getStep <em>Step</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.TestStepRun#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestStepRun()
 * @model
 * @generated
 */
public interface TestStepRun extends AbstractModelElement {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(TestStep)
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestStepRun_Step()
	 * @model required="true"
	 * @generated
	 */
	TestStep getStep();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestStepRun#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(TestStep value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.rules.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestStepRun_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atom> getState();

} // TestStepRun
