/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.tud.inf.st.mbt.data.DataBag;

import org.tud.inf.st.mbt.rules.BagElementAssignedAtom;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag Element Assigned Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.BagElementAssignedAtomImpl#getIdx <em>Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BagElementAssignedAtomImpl extends EObjectImpl implements BagElementAssignedAtom {
	/**
	 * The cached value of the '{@link #getBag() <em>Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBag()
	 * @generated
	 * @ordered
	 */
	protected DataBag bag;

	/**
	 * The default value of the '{@link #getIdx() <em>Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int IDX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdx() <em>Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdx()
	 * @generated
	 * @ordered
	 */
	protected int idx = IDX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagElementAssignedAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.BAG_ELEMENT_ASSIGNED_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag getBag() {
		if (bag != null && bag.eIsProxy()) {
			InternalEObject oldBag = (InternalEObject)bag;
			bag = (DataBag)eResolveProxy(oldBag);
			if (bag != oldBag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG, oldBag, bag));
			}
		}
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag basicGetBag() {
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBag(DataBag newBag) {
		DataBag oldBag = bag;
		bag = newBag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG, oldBag, bag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdx() {
		return idx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdx(int newIdx) {
		int oldIdx = idx;
		idx = newIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__IDX, oldIdx, idx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG:
				if (resolve) return getBag();
				return basicGetBag();
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__IDX:
				return getIdx();
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
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG:
				setBag((DataBag)newValue);
				return;
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__IDX:
				setIdx((Integer)newValue);
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
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG:
				setBag((DataBag)null);
				return;
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__IDX:
				setIdx(IDX_EDEFAULT);
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
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__BAG:
				return bag != null;
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM__IDX:
				return idx != IDX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return getBag().getGeneratedElements().get(idx)+" is assigned";
	}

} //BagElementAssignedAtomImpl
