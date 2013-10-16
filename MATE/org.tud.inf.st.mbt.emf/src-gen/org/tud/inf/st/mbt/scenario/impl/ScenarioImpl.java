/**
 */
package org.tud.inf.st.mbt.scenario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.scenario.Placement;
import org.tud.inf.st.mbt.scenario.Scenario;
import org.tud.inf.st.mbt.scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.scenario.impl.ScenarioImpl#getPlacements <em>Placements</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.scenario.impl.ScenarioImpl#getGeneratedDomain <em>Generated Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends AbstractModelElementImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getPlacements() <em>Placements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacements()
	 * @generated
	 * @ordered
	 */
	protected EList<Placement> placements;

	/**
	 * The cached value of the '{@link #getGeneratedDomain() <em>Generated Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDomain()
	 * @generated
	 * @ordered
	 */
	protected DataClass generatedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Placement> getPlacements() {
		if (placements == null) {
			placements = new EObjectContainmentEList<Placement>(Placement.class, this, ScenarioPackage.SCENARIO__PLACEMENTS);
		}
		return placements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getGeneratedDomain() {
		return generatedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedDomain(DataClass newGeneratedDomain, NotificationChain msgs) {
		DataClass oldGeneratedDomain = generatedDomain;
		generatedDomain = newGeneratedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__GENERATED_DOMAIN, oldGeneratedDomain, newGeneratedDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedDomain(DataClass newGeneratedDomain) {
		if (newGeneratedDomain != generatedDomain) {
			NotificationChain msgs = null;
			if (generatedDomain != null)
				msgs = ((InternalEObject)generatedDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScenarioPackage.SCENARIO__GENERATED_DOMAIN, null, msgs);
			if (newGeneratedDomain != null)
				msgs = ((InternalEObject)newGeneratedDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScenarioPackage.SCENARIO__GENERATED_DOMAIN, null, msgs);
			msgs = basicSetGeneratedDomain(newGeneratedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__GENERATED_DOMAIN, newGeneratedDomain, newGeneratedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__PLACEMENTS:
				return ((InternalEList<?>)getPlacements()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO__GENERATED_DOMAIN:
				return basicSetGeneratedDomain(null, msgs);
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
			case ScenarioPackage.SCENARIO__PLACEMENTS:
				return getPlacements();
			case ScenarioPackage.SCENARIO__GENERATED_DOMAIN:
				return getGeneratedDomain();
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
			case ScenarioPackage.SCENARIO__PLACEMENTS:
				getPlacements().clear();
				getPlacements().addAll((Collection<? extends Placement>)newValue);
				return;
			case ScenarioPackage.SCENARIO__GENERATED_DOMAIN:
				setGeneratedDomain((DataClass)newValue);
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
			case ScenarioPackage.SCENARIO__PLACEMENTS:
				getPlacements().clear();
				return;
			case ScenarioPackage.SCENARIO__GENERATED_DOMAIN:
				setGeneratedDomain((DataClass)null);
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
			case ScenarioPackage.SCENARIO__PLACEMENTS:
				return placements != null && !placements.isEmpty();
			case ScenarioPackage.SCENARIO__GENERATED_DOMAIN:
				return generatedDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
