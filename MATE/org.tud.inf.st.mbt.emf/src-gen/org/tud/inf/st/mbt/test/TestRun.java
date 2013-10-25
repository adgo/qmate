/**
 */
package org.tud.inf.st.mbt.test;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestRun#getStepRuns <em>Step Runs</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.TestRun#get_case <em>case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestRun()
 * @model
 * @generated
 */
public interface TestRun extends TestExecutable {
	/**
	 * Returns the value of the '<em><b>Step Runs</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.test.TestStepRun}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Runs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Runs</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestRun_StepRuns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestStepRun> getStepRuns();

	/**
	 * Returns the value of the '<em><b>case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>case</em>' reference.
	 * @see #set_case(TestCase)
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestRun__case()
	 * @model
	 * @generated
	 */
	TestCase get_case();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestRun#get_case <em>case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>case</em>' reference.
	 * @see #get_case()
	 * @generated
	 */
	void set_case(TestCase value);

} // TestRun
