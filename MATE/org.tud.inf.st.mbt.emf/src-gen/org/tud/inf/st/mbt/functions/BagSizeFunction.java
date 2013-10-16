/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.data.DataBag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Size Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.BagSizeFunction#getBag <em>Bag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagSizeFunction()
 * @model
 * @generated
 */
public interface BagSizeFunction extends IArithmetricFunction {
	/**
	 * Returns the value of the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag</em>' reference.
	 * @see #setBag(DataBag)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagSizeFunction_Bag()
	 * @model required="true"
	 * @generated
	 */
	DataBag getBag();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BagSizeFunction#getBag <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag</em>' reference.
	 * @see #getBag()
	 * @generated
	 */
	void setBag(DataBag value);

} // BagSizeFunction
