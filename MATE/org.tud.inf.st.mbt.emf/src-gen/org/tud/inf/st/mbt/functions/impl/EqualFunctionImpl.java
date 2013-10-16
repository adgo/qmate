/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.EqualFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equal Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EqualFunctionImpl extends ArithmetricLogicBinaryFunctionImpl implements EqualFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.EQUAL_FUNCTION;
	}
	
	@Override
	public String toString() {
		return left+"="+right;
	}

} //EqualFunctionImpl
