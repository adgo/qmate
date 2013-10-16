/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.LowerThanFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lower Than Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LowerThanFunctionImpl extends ArithmetricLogicBinaryFunctionImpl implements LowerThanFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerThanFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.LOWER_THAN_FUNCTION;
	}

	@Override
	public String toString() {
		return left+"<"+right;
	}
} //LowerThanFunctionImpl
