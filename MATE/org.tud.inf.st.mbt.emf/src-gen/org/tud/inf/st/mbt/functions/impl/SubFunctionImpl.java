/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.SubFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubFunctionImpl extends UnaryFunctionImpl implements SubFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SUB_FUNCTION;
	}

	@Override
	public String toString() {
		return "("+getOperand()+")";
	}
} //SubFunctionImpl
