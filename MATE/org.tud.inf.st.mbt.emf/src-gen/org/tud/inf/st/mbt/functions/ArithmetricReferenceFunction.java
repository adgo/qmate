/**
 */
package org.tud.inf.st.mbt.functions;

import org.eclipse.emf.common.util.EList;
import org.tud.inf.st.mbt.core.IContextVariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetric Reference Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getArithmetricReferenceFunction()
 * @model
 * @generated
 */
public interface ArithmetricReferenceFunction extends IArithmetricFunction, ReferenceFunction {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(ArithmetricStandAloneFunction)
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#getArithmetricReferenceFunction_Function()
	 * @model required="true"
	 * @generated
	 */
	ArithmetricStandAloneFunction getFunction();

	/**
	 * Sets the value of the '{@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ArithmetricStandAloneFunction value);

} // ArithmetricReferenceFunction
