/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.rules.And;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AndImpl extends BinaryOperatorImpl implements And {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.AND;
	}
	
	@Override
	public String toString() {
		return "("+getOperand1()+" and "+getOperand2()+")";
	}

} //AndImpl
