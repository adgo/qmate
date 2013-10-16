/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.data.DataStructureNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.DataNodeFunction#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeFunction()
 * @model
 * @generated
 */
public interface DataNodeFunction extends IDataNodeFunction {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(DataStructureNode)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataNodeFunction_Data()
	 * @model required="true"
	 * @generated
	 */
	DataStructureNode getData();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.DataNodeFunction#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataStructureNode value);

} // DataNodeFunction
