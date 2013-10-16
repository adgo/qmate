/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.FailAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fail Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FailActionImpl extends EObjectImpl implements FailAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.FAIL_ACTION;
	}
	
	@Override
	public String toString(){
		return "&fail";
	}

} //FailActionImpl
