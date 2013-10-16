/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.MultiplyFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiply Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultiplyFunctionImpl extends BinaryFunctionImpl implements MultiplyFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.MULTIPLY_FUNCTION;
	}

	@Override
	public String toString() {
		return left+"*"+right;
	}
} //MultiplyFunctionImpl
