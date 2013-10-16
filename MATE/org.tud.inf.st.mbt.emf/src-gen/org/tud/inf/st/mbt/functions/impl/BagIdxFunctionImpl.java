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

import org.tud.inf.st.mbt.functions.BagIdxFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.IValueFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag Idx Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.BagIdxFunctionImpl#getNeedle <em>Needle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BagIdxFunctionImpl extends EObjectImpl implements BagIdxFunction {
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
	 * The cached value of the '{@link #getNeedle() <em>Needle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedle()
	 * @generated
	 * @ordered
	 */
	protected IValueFunction needle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagIdxFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.BAG_IDX_FUNCTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.BAG_IDX_FUNCTION__BAG, oldBag, bag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_IDX_FUNCTION__BAG, oldBag, bag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IValueFunction getNeedle() {
		return needle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeedle(IValueFunction newNeedle, NotificationChain msgs) {
		IValueFunction oldNeedle = needle;
		needle = newNeedle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE, oldNeedle, newNeedle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedle(IValueFunction newNeedle) {
		if (newNeedle != needle) {
			NotificationChain msgs = null;
			if (needle != null)
				msgs = ((InternalEObject)needle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE, null, msgs);
			if (newNeedle != null)
				msgs = ((InternalEObject)newNeedle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE, null, msgs);
			msgs = basicSetNeedle(newNeedle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE, newNeedle, newNeedle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				return basicSetNeedle(null, msgs);
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
			case FunctionsPackage.BAG_IDX_FUNCTION__BAG:
				if (resolve) return getBag();
				return basicGetBag();
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				return getNeedle();
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
			case FunctionsPackage.BAG_IDX_FUNCTION__BAG:
				setBag((DataBag)newValue);
				return;
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				setNeedle((IValueFunction)newValue);
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
			case FunctionsPackage.BAG_IDX_FUNCTION__BAG:
				setBag((DataBag)null);
				return;
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				setNeedle((IValueFunction)null);
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
			case FunctionsPackage.BAG_IDX_FUNCTION__BAG:
				return bag != null;
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				return needle != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return "index("+bag+","+needle+")";
	}

} //BagIdxFunctionImpl
