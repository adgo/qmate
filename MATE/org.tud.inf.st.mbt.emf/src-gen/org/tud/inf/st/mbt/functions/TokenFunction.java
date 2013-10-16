/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.ulang.guigraph.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.TokenFunction#getPlace <em>Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getTokenFunction()
 * @model
 * @generated
 */
public interface TokenFunction extends IArithmetricFunction {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getTokenFunction_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.TokenFunction#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // TokenFunction
