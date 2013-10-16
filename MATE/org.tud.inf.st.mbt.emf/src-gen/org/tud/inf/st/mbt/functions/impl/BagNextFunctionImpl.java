/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.data.DataBag;

import org.tud.inf.st.mbt.functions.BagNextFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag Next Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.BagNextFunctionImpl#getBag <em>Bag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BagNextFunctionImpl extends EObjectImpl implements BagNextFunction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagNextFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.BAG_NEXT_FUNCTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.BAG_NEXT_FUNCTION__BAG, oldBag, bag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_NEXT_FUNCTION__BAG, oldBag, bag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.BAG_NEXT_FUNCTION__BAG:
				if (resolve) return getBag();
				return basicGetBag();
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
			case FunctionsPackage.BAG_NEXT_FUNCTION__BAG:
				setBag((DataBag)newValue);
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
			case FunctionsPackage.BAG_NEXT_FUNCTION__BAG:
				setBag((DataBag)null);
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
			case FunctionsPackage.BAG_NEXT_FUNCTION__BAG:
				return bag != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return "next("+bag+")";
	}

} //BagNextFunctionImpl
