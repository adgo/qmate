/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node Case Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.DataNodeCaseFunction#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeCaseFunction()
 * @model
 * @generated
 */
public interface DataNodeCaseFunction extends IDataNodeFunction {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.functions.DataNodeCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeCaseFunction_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataNodeCase> getCases();

} // DataNodeCaseFunction
