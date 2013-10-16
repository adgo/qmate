/**
 */
package org.tud.inf.st.mbt.test;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.ITopLevelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.TestReport#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.test.TestPackage#getTestReport()
 * @model
 * @generated
 */
public interface TestReport extends AbstractModelElement, ITopLevelElement {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.test.TestRun}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.test.TestPackage#getTestReport_Runs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestRun> getRuns();

} // TestReport
