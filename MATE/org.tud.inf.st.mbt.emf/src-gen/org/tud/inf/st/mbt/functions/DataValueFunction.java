/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.data.DataElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.DataValueFunction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataValueFunction()
 * @model
 * @generated
 */
public interface DataValueFunction extends IArithmetricFunction, ILogicFunction, IValueFunction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(DataElement)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getDataValueFunction_Value()
	 * @model required="true"
	 * @generated
	 */
	DataElement getValue();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.DataValueFunction#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataElement value);

} // DataValueFunction
