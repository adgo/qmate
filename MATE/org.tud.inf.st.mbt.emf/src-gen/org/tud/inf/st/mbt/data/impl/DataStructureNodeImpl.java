/**
 */
package org.tud.inf.st.mbt.data.impl;

import org.eclipse.emf.ecore.EClass;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.data.DataPackage;
import org.tud.inf.st.mbt.data.DataStructureNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataStructureNodeImpl extends AbstractModelElementImpl implements DataStructureNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStructureNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_STRUCTURE_NODE;
	}
	
	@Override
	public String toString() {
		return "$"+getId();
	}

} //DataStructureNodeImpl
