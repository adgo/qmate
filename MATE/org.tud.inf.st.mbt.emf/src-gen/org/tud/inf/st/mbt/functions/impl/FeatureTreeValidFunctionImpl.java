/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.featuretree.FeatureTree;

import org.tud.inf.st.mbt.functions.FeatureTreeValidFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Tree Valid Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.FeatureTreeValidFunctionImpl#getTree <em>Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureTreeValidFunctionImpl extends EObjectImpl implements FeatureTreeValidFunction {
	/**
	 * The cached value of the '{@link #getTree() <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree()
	 * @generated
	 * @ordered
	 */
	protected FeatureTree tree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTreeValidFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FEATURE_TREE_VALID_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTree getTree() {
		if (tree != null && tree.eIsProxy()) {
			InternalEObject oldTree = (InternalEObject)tree;
			tree = (FeatureTree)eResolveProxy(oldTree);
			if (tree != oldTree) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE, oldTree, tree));
			}
		}
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTree basicGetTree() {
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTree(FeatureTree newTree) {
		FeatureTree oldTree = tree;
		tree = newTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE, oldTree, tree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE:
				if (resolve) return getTree();
				return basicGetTree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE:
				setTree((FeatureTree)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE:
				setTree((FeatureTree)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionsPackage.FEATURE_TREE_VALID_FUNCTION__TREE:
				return tree != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return "valid("+getTree()+")";
	}

} //FeatureTreeValidFunctionImpl
