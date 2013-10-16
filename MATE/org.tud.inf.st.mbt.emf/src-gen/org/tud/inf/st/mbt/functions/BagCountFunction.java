/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.data.DataBag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Count Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.BagCountFunction#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.BagCountFunction#getNeedle <em>Needle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagCountFunction()
 * @model
 * @generated
 */
public interface BagCountFunction extends IArithmetricFunction {
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
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagCountFunction_Bag()
	 * @model required="true"
	 * @generated
	 */
	DataBag getBag();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BagCountFunction#getBag <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag</em>' reference.
	 * @see #getBag()
	 * @generated
	 */
	void setBag(DataBag value);

	/**
	 * Returns the value of the '<em><b>Needle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needle</em>' containment reference.
	 * @see #setNeedle(IValueFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getBagCountFunction_Needle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IValueFunction getNeedle();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.BagCountFunction#getNeedle <em>Needle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needle</em>' containment reference.
	 * @see #getNeedle()
	 * @generated
	 */
	void setNeedle(IValueFunction value);

} // BagCountFunction
