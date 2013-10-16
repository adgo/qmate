/**
 */
package org.tud.inf.st.mbt.functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction;
import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.IArithmetricFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetric Logic Binary Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.ArithmetricLogicBinaryFunctionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArithmetricLogicBinaryFunctionImpl extends EObjectImpl implements ArithmetricLogicBinaryFunction {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected IArithmetricFunction left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected IArithmetricFunction right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmetricLogicBinaryFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.ARITHMETRIC_LOGIC_BINARY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IArithmetricFunction getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(IArithmetricFunction newLeft, NotificationChain msgs) {
		IArithmetricFunction oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(IArithmetricFunction newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IArithmetricFunction getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(IArithmetricFunction newRight, NotificationChain msgs) {
		IArithmetricFunction oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(IArithmetricFunction newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT:
				return basicSetLeft(null, msgs);
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT:
				return basicSetRight(null, msgs);
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
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT:
				return getLeft();
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT:
				return getRight();
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
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT:
				setLeft((IArithmetricFunction)newValue);
				return;
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT:
				setRight((IArithmetricFunction)newValue);
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
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT:
				setLeft((IArithmetricFunction)null);
				return;
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT:
				setRight((IArithmetricFunction)null);
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
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT:
				return left != null;
			case FunctionsPackage.ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //ArithmetricLogicBinaryFunctionImpl
