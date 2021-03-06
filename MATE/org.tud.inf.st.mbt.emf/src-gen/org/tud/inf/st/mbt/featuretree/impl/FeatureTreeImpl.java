/**
 */
package org.tud.inf.st.mbt.featuretree.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.featuretree.FeatureTree;
import org.tud.inf.st.mbt.featuretree.FeaturetreePackage;
import org.tud.inf.st.mbt.featuretree.TreeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.featuretree.impl.FeatureTreeImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureTreeImpl extends AbstractModelElementImpl implements FeatureTree {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected TreeFeature root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturetreePackage.Literals.FEATURE_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeFeature getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(TreeFeature newRoot, NotificationChain msgs) {
		TreeFeature oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturetreePackage.FEATURE_TREE__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(TreeFeature newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturetreePackage.FEATURE_TREE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturetreePackage.FEATURE_TREE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturetreePackage.FEATURE_TREE__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturetreePackage.FEATURE_TREE__ROOT:
				return basicSetRoot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturetreePackage.FEATURE_TREE__ROOT:
				return getRoot();
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
			case FeaturetreePackage.FEATURE_TREE__ROOT:
				setRoot((TreeFeature)newValue);
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
			case FeaturetreePackage.FEATURE_TREE__ROOT:
				setRoot((TreeFeature)null);
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
			case FeaturetreePackage.FEATURE_TREE__ROOT:
				return root != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureTreeImpl
