/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;

import org.tud.inf.st.mbt.core.IContextVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node Reference Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.DataNodeReferenceFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeReferenceFunction()
 * @model
 * @generated
 */
public interface DataNodeReferenceFunction extends ReferenceFunction, IDataNodeFunction {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(DataNodeStandAloneFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeReferenceFunction_Function()
	 * @model required="true"
	 * @generated
	 */
	DataNodeStandAloneFunction getFunction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.DataNodeReferenceFunction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(DataNodeStandAloneFunction value);

} // DataNodeReferenceFunction
