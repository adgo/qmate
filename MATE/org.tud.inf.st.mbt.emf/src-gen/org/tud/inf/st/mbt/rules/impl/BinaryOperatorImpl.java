/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.tud.inf.st.mbt.rules.BinaryOperator;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.rules.impl.BinaryOperatorImpl#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryOperatorImpl extends EObjectImpl implements BinaryOperator {
	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected Predicate operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected Predicate operand2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.BINARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand1(Predicate newOperand1, NotificationChain msgs) {
		Predicate oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.BINARY_OPERATOR__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(Predicate newOperand1) {
		if (newOperand1 != operand1) {
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BINARY_OPERATOR__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BINARY_OPERATOR__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BINARY_OPERATOR__OPERAND1, newOperand1, newOperand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand2(Predicate newOperand2, NotificationChain msgs) {
		Predicate oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.BINARY_OPERATOR__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(Predicate newOperand2) {
		if (newOperand2 != operand2) {
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BINARY_OPERATOR__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BINARY_OPERATOR__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BINARY_OPERATOR__OPERAND2, newOperand2, newOperand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RulesPackage.BINARY_OPERATOR__OPERAND1:
				return basicSetOperand1(null, msgs);
			case RulesPackage.BINARY_OPERATOR__OPERAND2:
				return basicSetOperand2(null, msgs);
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
			case RulesPackage.BINARY_OPERATOR__OPERAND1:
				return getOperand1();
			case RulesPackage.BINARY_OPERATOR__OPERAND2:
				return getOperand2();
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
			case RulesPackage.BINARY_OPERATOR__OPERAND1:
				setOperand1((Predicate)newValue);
				return;
			case RulesPackage.BINARY_OPERATOR__OPERAND2:
				setOperand2((Predicate)newValue);
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
			case RulesPackage.BINARY_OPERATOR__OPERAND1:
				setOperand1((Predicate)null);
				return;
			case RulesPackage.BINARY_OPERATOR__OPERAND2:
				setOperand2((Predicate)null);
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
			case RulesPackage.BINARY_OPERATOR__OPERAND1:
				return operand1 != null;
			case RulesPackage.BINARY_OPERATOR__OPERAND2:
				return operand2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOperatorImpl
