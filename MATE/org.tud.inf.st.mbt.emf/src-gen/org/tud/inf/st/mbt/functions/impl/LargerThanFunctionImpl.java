/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.LargerThanFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Larger Than Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LargerThanFunctionImpl extends ArithmetricLogicBinaryFunctionImpl implements LargerThanFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargerThanFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.LARGER_THAN_FUNCTION;
	}

	@Override
	public String toString() {
		return left+">"+right;
	}
} //LargerThanFunctionImpl
