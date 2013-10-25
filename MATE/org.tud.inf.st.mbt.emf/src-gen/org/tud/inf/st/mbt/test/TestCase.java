/**
 */
package org.tud.inf.st.mbt.test;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestCase#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.TestCase#getRiskReduction <em>Risk Reduction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends TestExecutable {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.test.TestStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestCase_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Risk Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Reduction</em>' attribute.
	 * @see #setRiskReduction(double)
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestCase_RiskReduction()
	 * @model required="true"
	 * @generated
	 */
	double getRiskReduction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestCase#getRiskReduction <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Reduction</em>' attribute.
	 * @see #getRiskReduction()
	 * @generated
	 */
	void setRiskReduction(double value);

} // TestCase
