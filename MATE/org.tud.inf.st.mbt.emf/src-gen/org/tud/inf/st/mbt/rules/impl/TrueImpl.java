/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.True;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TrueImpl extends ReasonableAtomImpl implements True {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.TRUE;
	}
	
	@Override
	public String toString() {
		return "true";
	}

} //TrueImpl
