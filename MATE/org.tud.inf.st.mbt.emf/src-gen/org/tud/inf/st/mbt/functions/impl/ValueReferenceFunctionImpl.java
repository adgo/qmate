/**
 */
package org.tud.inf.st.mbt.functions.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.ReferenceFunction;
import org.tud.inf.st.mbt.functions.ValueReferenceFunction;
import org.tud.inf.st.mbt.functions.ValueStandAloneFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Reference Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.functions.impl.ValueReferenceFunctionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueReferenceFunctionImpl extends EObjectImpl implements ValueReferenceFunction {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> parameters;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected ValueStandAloneFunction function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueReferenceFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.VALUE_REFERENCE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueStandAloneFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (ValueStandAloneFunction)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueStandAloneFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(ValueStandAloneFunction newFunction) {
		ValueStandAloneFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<EObject>(EObject.class, this, FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS:
				return getParameters();
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends EObject>)newValue);
				return;
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION:
				setFunction((ValueStandAloneFunction)newValue);
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
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION:
				setFunction((ValueStandAloneFunction)null);
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
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case FunctionsPackage.VALUE_REFERENCE_FUNCTION__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ReferenceFunction.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS: return FunctionsPackage.REFERENCE_FUNCTION__PARAMETERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ReferenceFunction.class) {
			switch (baseFeatureID) {
				case FunctionsPackage.REFERENCE_FUNCTION__PARAMETERS: return FunctionsPackage.VALUE_REFERENCE_FUNCTION__PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
	@Override
	public String toString() {
		String str=""+getFunction()+"(";
		
		Iterator<EObject> i = getParameters().iterator();
		while(i.hasNext()){
			str+=i.next();
			if(i.hasNext())str+=",";
		}			
	
		return str+")";
	}

} //ValueReferenceFunctionImpl
