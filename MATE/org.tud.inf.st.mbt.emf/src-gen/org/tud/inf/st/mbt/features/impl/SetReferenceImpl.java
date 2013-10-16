/**
 */
package org.tud.inf.st.mbt.features.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tud.inf.st.mbt.features.FeaturesPackage;
import org.tud.inf.st.mbt.features.IFeatureDomain;
import org.tud.inf.st.mbt.features.SetReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.impl.SetReferenceImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetReferenceImpl extends FeatureSetImpl implements SetReference {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected IFeatureDomain features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.SET_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFeatureDomain getFeatures() {
		if (features != null && features.eIsProxy()) {
			InternalEObject oldFeatures = (InternalEObject)features;
			features = (IFeatureDomain)eResolveProxy(oldFeatures);
			if (features != oldFeatures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturesPackage.SET_REFERENCE__FEATURES, oldFeatures, features));
			}
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFeatureDomain basicGetFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(IFeatureDomain newFeatures) {
		IFeatureDomain oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.SET_REFERENCE__FEATURES, oldFeatures, features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturesPackage.SET_REFERENCE__FEATURES:
				if (resolve) return getFeatures();
				return basicGetFeatures();
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
			case FeaturesPackage.SET_REFERENCE__FEATURES:
				setFeatures((IFeatureDomain)newValue);
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
			case FeaturesPackage.SET_REFERENCE__FEATURES:
				setFeatures((IFeatureDomain)null);
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
			case FeaturesPackage.SET_REFERENCE__FEATURES:
				return features != null;
		}
		return super.eIsSet(featureID);
	}

} //SetReferenceImpl
