/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.RemoveBagAction;

import org.tud.inf.st.mbt.data.DataBag;

import org.tud.inf.st.mbt.functions.IArithmetricFunction;
import org.tud.inf.st.mbt.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Bag Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.actions.impl.RemoveBagActionImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveBagActionImpl extends ReconfigurationActionImpl implements RemoveBagAction {
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
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected IArithmetricFunction index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveBagActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.REMOVE_BAG_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.REMOVE_BAG_ACTION__BAG, oldBag, bag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.REMOVE_BAG_ACTION__BAG, oldBag, bag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IArithmetricFunction getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(IArithmetricFunction newIndex, NotificationChain msgs) {
		IArithmetricFunction oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionsPackage.REMOVE_BAG_ACTION__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(IArithmetricFunction newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.REMOVE_BAG_ACTION__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.REMOVE_BAG_ACTION__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.REMOVE_BAG_ACTION__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.REMOVE_BAG_ACTION__INDEX:
				return basicSetIndex(null, msgs);
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
			case ActionsPackage.REMOVE_BAG_ACTION__BAG:
				if (resolve) return getBag();
				return basicGetBag();
			case ActionsPackage.REMOVE_BAG_ACTION__INDEX:
				return getIndex();
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
			case ActionsPackage.REMOVE_BAG_ACTION__BAG:
				setBag((DataBag)newValue);
				return;
			case ActionsPackage.REMOVE_BAG_ACTION__INDEX:
				setIndex((IArithmetricFunction)newValue);
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
			case ActionsPackage.REMOVE_BAG_ACTION__BAG:
				setBag((DataBag)null);
				return;
			case ActionsPackage.REMOVE_BAG_ACTION__INDEX:
				setIndex((IArithmetricFunction)null);
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
			case ActionsPackage.REMOVE_BAG_ACTION__BAG:
				return bag != null;
			case ActionsPackage.REMOVE_BAG_ACTION__INDEX:
				return index != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return "unset "+bag+"["+index+"]";
	}

} //RemoveBagActionImpl
