/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.data.DataBag;

import org.tud.inf.st.mbt.functions.BagElementFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.IArithmetricFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag Element Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.BagElementFunctionImpl#getIdx <em>Idx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BagElementFunctionImpl extends EObjectImpl implements BagElementFunction {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataBag data;

	/**
	 * The cached value of the '{@link #getIdx() <em>Idx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdx()
	 * @generated
	 * @ordered
	 */
	protected IArithmetricFunction idx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagElementFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.BAG_ELEMENT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (DataBag)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(DataBag newData) {
		DataBag oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IArithmetricFunction getIdx() {
		return idx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdx(IArithmetricFunction newIdx, NotificationChain msgs) {
		IArithmetricFunction oldIdx = idx;
		idx = newIdx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX, oldIdx, newIdx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdx(IArithmetricFunction newIdx) {
		if (newIdx != idx) {
			NotificationChain msgs = null;
			if (idx != null)
				msgs = ((InternalEObject)idx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX, null, msgs);
			if (newIdx != null)
				msgs = ((InternalEObject)newIdx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX, null, msgs);
			msgs = basicSetIdx(newIdx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX, newIdx, newIdx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX:
				return basicSetIdx(null, msgs);
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
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA:
				if (resolve) return getData();
				return basicGetData();
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX:
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
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA:
				setData((DataBag)newValue);
				return;
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX:
				setIdx((IArithmetricFunction)newValue);
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
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA:
				setData((DataBag)null);
				return;
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX:
				setIdx((IArithmetricFunction)null);
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
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__DATA:
				return data != null;
			case FunctionsPackage.BAG_ELEMENT_FUNCTION__IDX:
				return idx != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return data+"["+idx+"]";
	}

} //BagElementFunctionImpl
