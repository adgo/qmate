/**
 */
package org.tud.inf.st.mbt.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.data.DataPackage;
import org.tud.inf.st.mbt.data.DataRange;
import org.tud.inf.st.mbt.data.DataScenario;
import org.tud.inf.st.mbt.data.StepDataBinding;
import org.tud.inf.st.mbt.featuretree.TreeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataScenarioImpl#getStepDataBindings <em>Step Data Bindings</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataScenarioImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataScenarioImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataScenarioImpl extends AbstractModelElementImpl implements DataScenario {
	/**
	 * The cached value of the '{@link #getStepDataBindings() <em>Step Data Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDataBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<StepDataBinding> stepDataBindings;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRange> ranges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepDataBinding> getStepDataBindings() {
		if (stepDataBindings == null) {
			stepDataBindings = new EObjectContainmentEList<StepDataBinding>(StepDataBinding.class, this, DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS);
		}
		return stepDataBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SCENARIO__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> getRanges() {
		if (ranges == null) {
			ranges = new EObjectContainmentEList<DataRange>(DataRange.class, this, DataPackage.DATA_SCENARIO__RANGES);
		}
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS:
				return ((InternalEList<?>)getStepDataBindings()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_SCENARIO__RANGES:
				return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
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
			case DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS:
				return getStepDataBindings();
			case DataPackage.DATA_SCENARIO__LENGTH:
				return getLength();
			case DataPackage.DATA_SCENARIO__RANGES:
				return getRanges();
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
			case DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS:
				getStepDataBindings().clear();
				getStepDataBindings().addAll((Collection<? extends StepDataBinding>)newValue);
				return;
			case DataPackage.DATA_SCENARIO__LENGTH:
				setLength((Integer)newValue);
				return;
			case DataPackage.DATA_SCENARIO__RANGES:
				getRanges().clear();
				getRanges().addAll((Collection<? extends DataRange>)newValue);
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
			case DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS:
				getStepDataBindings().clear();
				return;
			case DataPackage.DATA_SCENARIO__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DataPackage.DATA_SCENARIO__RANGES:
				getRanges().clear();
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
			case DataPackage.DATA_SCENARIO__STEP_DATA_BINDINGS:
				return stepDataBindings != null && !stepDataBindings.isEmpty();
			case DataPackage.DATA_SCENARIO__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DataPackage.DATA_SCENARIO__RANGES:
				return ranges != null && !ranges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		String str = "<scenario>";
		if(name != null && name != "")str = name;
		else if(id != null && id != "")str = id;
		return str;
	}

} //DataScenarioImpl
