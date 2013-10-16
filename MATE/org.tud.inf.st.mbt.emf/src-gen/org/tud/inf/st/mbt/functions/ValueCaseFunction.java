/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Case Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.ValueCaseFunction#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getValueCaseFunction()
 * @model
 * @generated
 */
public interface ValueCaseFunction extends IValueFunction {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.tud.inf.st.mbt.functions.ValueCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getValueCaseFunction_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueCase> getCases();

} // ValueCaseFunction
