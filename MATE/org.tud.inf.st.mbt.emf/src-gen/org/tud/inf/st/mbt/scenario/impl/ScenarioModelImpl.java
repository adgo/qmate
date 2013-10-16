/**
 */
package org.tud.inf.st.mbt.scenario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.scenario.ScenarioEntity;
import org.tud.inf.st.mbt.scenario.ScenarioModel;
import org.tud.inf.st.mbt.scenario.ScenarioPackage;
import org.tud.inf.st.mbt.scenario.SpatialBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.scenario.impl.ScenarioModelImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.impl.ScenarioModelImpl#getBases <em>Bases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioModelImpl extends AbstractModelElementImpl implements ScenarioModel {
	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioEntity> inventory;

	/**
	 * The cached value of the '{@link #getBases() <em>Bases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases()
	 * @generated
	 * @ordered
	 */
	protected EList<SpatialBase> bases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioEntity> getInventory() {
		if (inventory == null) {
			inventory = new EObjectContainmentEList<ScenarioEntity>(ScenarioEntity.class, this, ScenarioPackage.SCENARIO_MODEL__INVENTORY);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpatialBase> getBases() {
		if (bases == null) {
			bases = new EObjectContainmentEList<SpatialBase>(SpatialBase.class, this, ScenarioPackage.SCENARIO_MODEL__BASES);
		}
		return bases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO_MODEL__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO_MODEL__BASES:
				return ((InternalEList<?>)getBases()).basicRemove(otherEnd, msgs);
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
			case ScenarioPackage.SCENARIO_MODEL__INVENTORY:
				return getInventory();
			case ScenarioPackage.SCENARIO_MODEL__BASES:
				return getBases();
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
			case ScenarioPackage.SCENARIO_MODEL__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends ScenarioEntity>)newValue);
				return;
			case ScenarioPackage.SCENARIO_MODEL__BASES:
				getBases().clear();
				getBases().addAll((Collection<? extends SpatialBase>)newValue);
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
			case ScenarioPackage.SCENARIO_MODEL__INVENTORY:
				getInventory().clear();
				return;
			case ScenarioPackage.SCENARIO_MODEL__BASES:
				getBases().clear();
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
			case ScenarioPackage.SCENARIO_MODEL__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case ScenarioPackage.SCENARIO_MODEL__BASES:
				return bases != null && !bases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioModelImpl
