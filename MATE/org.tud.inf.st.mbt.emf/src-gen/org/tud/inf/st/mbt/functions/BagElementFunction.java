/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.data.DataBag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Element Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.BagElementFunction#getData <em>Data</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.BagElementFunction#getIdx <em>Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagElementFunction()
 * @model
 * @generated
 */
public interface BagElementFunction extends IDataNodeFunction {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(DataBag)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagElementFunction_Data()
	 * @model required="true"
	 * @generated
	 */
	DataBag getData();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BagElementFunction#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataBag value);

	/**
	 * Returns the value of the '<em><b>Idx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idx</em>' containment reference.
	 * @see #setIdx(IArithmetricFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagElementFunction_Idx()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IArithmetricFunction getIdx();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BagElementFunction#getIdx <em>Idx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idx</em>' containment reference.
	 * @see #getIdx()
	 * @generated
	 */
	void setIdx(IArithmetricFunction value);

} // BagElementFunction
