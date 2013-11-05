/**
 */
package org.tud.inf.st.mbt.test;

import org.tud.inf.st.mbt.core.AbstractModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestExecutable#getRiskReduction <em>Risk Reduction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestExecutable()
 * @model abstract="true"
 * @generated
 */
public interface TestExecutable extends AbstractModelElement {

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
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestExecutable_RiskReduction()
	 * @model required="true"
	 * @generated
	 */
	double getRiskReduction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.test.TestExecutable#getRiskReduction <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Reduction</em>' attribute.
	 * @see #getRiskReduction()
	 * @generated
	 */
	void setRiskReduction(double value);
} // TestExecutable
