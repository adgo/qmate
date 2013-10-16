/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.rules.Implication;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl extends BinaryOperatorImpl implements Implication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.IMPLICATION;
	}
	
	@Override
	public String toString() {
		return getOperand1()+" -> "+getOperand2();
	}

} //ImplicationImpl
