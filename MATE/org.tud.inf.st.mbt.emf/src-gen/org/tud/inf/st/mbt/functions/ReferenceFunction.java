/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.tud.inf.st.mbt.core.IContextVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.ReferenceFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getReferenceFunction()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceFunction extends IFunction {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getReferenceFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getParameters();

} // ReferenceFunction
