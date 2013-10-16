/**
 */
package org.tud.inf.st.mbt.test;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.features.ExplicitSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestSuite#getCases <em>Cases</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.TestSuite#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.TestSuite#getRiskReduction <em>Risk Reduction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends AbstractModelElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.test.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestSuite_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getCases();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestSuite_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestSuite#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

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
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestSuite_RiskReduction()
	 * @model required="true"
	 * @generated
	 */
	double getRiskReduction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestSuite#getRiskReduction <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Reduction</em>' attribute.
	 * @see #getRiskReduction()
	 * @generated
	 */
	void setRiskReduction(double value);

} // TestSuite
