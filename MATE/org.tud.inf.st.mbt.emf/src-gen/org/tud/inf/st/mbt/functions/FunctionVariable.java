/**
 */
package org.tud.inf.st.mbt.functions;

import org.tud.inf.st.mbt.core.IContextVariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.FunctionVariable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getFunctionVariable()
 * @model
 * @generated
 */
public interface FunctionVariable extends IFunction, IContextVariable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getFunctionVariable_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.FunctionVariable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FunctionVariable
