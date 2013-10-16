/**
 */
package org.tud.inf.st.mbt.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.mbt.core.CausalLinkType;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Leaf</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataLeafImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataLeafImpl#getCausalLinkType <em>Causal Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLeafImpl extends DataStructureNodeImpl implements DataLeaf {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DataClass domain;

	/**
	 * The default value of the '{@link #getCausalLinkType() <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCausalLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final CausalLinkType CAUSAL_LINK_TYPE_EDEFAULT = CausalLinkType.UPLINK;
	/**
	 * The cached value of the '{@link #getCausalLinkType() <em>Causal Link Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCausalLinkType()
	 * @generated
	 * @ordered
	 */
	protected CausalLinkType causalLinkType = CAUSAL_LINK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_LEAF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (DataClass)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LEAF__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DataClass newDomain) {
		DataClass oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LEAF__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CausalLinkType getCausalLinkType() {
		return causalLinkType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalLinkType(CausalLinkType newCausalLinkType) {
		CausalLinkType oldCausalLinkType = causalLinkType;
		causalLinkType = newCausalLinkType == null ? CAUSAL_LINK_TYPE_EDEFAULT : newCausalLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LEAF__CAUSAL_LINK_TYPE, oldCausalLinkType, causalLinkType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_LEAF__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case DataPackage.DATA_LEAF__CAUSAL_LINK_TYPE:
				return getCausalLinkType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA_LEAF__DOMAIN:
				setDomain((DataClass)newValue);
				return;
			case DataPackage.DATA_LEAF__CAUSAL_LINK_TYPE:
				setCausalLinkType((CausalLinkType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_LEAF__DOMAIN:
				setDomain((DataClass)null);
				return;
			case DataPackage.DATA_LEAF__CAUSAL_LINK_TYPE:
				setCausalLinkType(CAUSAL_LINK_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_LEAF__DOMAIN:
				return domain != null;
			case DataPackage.DATA_LEAF__CAUSAL_LINK_TYPE:
				return causalLinkType != CAUSAL_LINK_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		String str = (causalLinkType == null ? "undefined " : causalLinkType
				.equals(CausalLinkType.VIRTUAL) ? "?" : causalLinkType
				.equals(CausalLinkType.DOWNLINK) ? "%" : "§");
		if (eContainer() != null && eContainer instanceof DataBag) {
			DataBag bag = (DataBag) eContainer();
			bag.organize();
			int idx = bag.getGeneratedElements().indexOf(this);
			str += bag + "[" + idx + "]";
		} else
			str += (name == null ? id == null ? "_" : id : name) + ":"
					+ (domain == null ? "undefined" : domain);
		return str;
	}

} // DataLeafImpl
