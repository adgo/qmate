/**
 */
package org.tud.inf.st.mbt.features.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.features.Feature;
import org.tud.inf.st.mbt.features.FeatureAttribute;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.FeaturesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.features.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.impl.FeatureImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.features.impl.FeatureImpl#getCausalLinkType <em>Causal Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends AbstractModelElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureAttribute> attributes;
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureVersion> versions;
	/**
	 * The default value of the '{@link #getCausalLinkType() <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final CausalLinkType CAUSAL_LINK_TYPE_EDEFAULT = CausalLinkType.VIRTUAL;
	/**
	 * The cached value of the '{@link #getCausalLinkType() <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalLinkType()
	 * @generated
	 * @ordered
	 */
	protected CausalLinkType causalLinkType = CAUSAL_LINK_TYPE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturesPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<FeatureAttribute>(FeatureAttribute.class, this, FeaturesPackage.FEATURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<FeatureVersion>(FeatureVersion.class, this, FeaturesPackage.FEATURE__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalLinkType getCausalLinkType() {
		return causalLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalLinkType(CausalLinkType newCausalLinkType) {
		CausalLinkType oldCausalLinkType = causalLinkType;
		causalLinkType = newCausalLinkType == null ? CAUSAL_LINK_TYPE_EDEFAULT : newCausalLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturesPackage.FEATURE__CAUSAL_LINK_TYPE, oldCausalLinkType, causalLinkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FeaturesPackage.FEATURE__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case FeaturesPackage.FEATURE__VERSIONS:
				return getVersions();
			case FeaturesPackage.FEATURE__CAUSAL_LINK_TYPE:
				return getCausalLinkType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends FeatureAttribute>)newValue);
				return;
			case FeaturesPackage.FEATURE__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends FeatureVersion>)newValue);
				return;
			case FeaturesPackage.FEATURE__CAUSAL_LINK_TYPE:
				setCausalLinkType((CausalLinkType)newValue);
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
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FeaturesPackage.FEATURE__VERSIONS:
				getVersions().clear();
				return;
			case FeaturesPackage.FEATURE__CAUSAL_LINK_TYPE:
				setCausalLinkType(CAUSAL_LINK_TYPE_EDEFAULT);
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
			case FeaturesPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FeaturesPackage.FEATURE__VERSIONS:
				return versions != null && !versions.isEmpty();
			case FeaturesPackage.FEATURE__CAUSAL_LINK_TYPE:
				return causalLinkType != CAUSAL_LINK_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (causalLinkType: ");
		result.append(causalLinkType);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
