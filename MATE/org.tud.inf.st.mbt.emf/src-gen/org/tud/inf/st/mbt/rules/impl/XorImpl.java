/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XorImpl extends BinaryOperatorImpl implements Xor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.XOR;
	}
	
	@Override
	public String toString() {
		return "("+getOperand1()+" xor "+getOperand2()+")";
	}

} //XorImpl
