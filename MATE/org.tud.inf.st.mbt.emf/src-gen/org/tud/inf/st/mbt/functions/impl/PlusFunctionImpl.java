/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.PlusFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plus Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlusFunctionImpl extends BinaryFunctionImpl implements PlusFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.PLUS_FUNCTION;
	}

	@Override
	public String toString() {
		return left+"+"+right;
	}
} //PlusFunctionImpl
