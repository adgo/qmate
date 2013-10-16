/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.pccs.Assignment;
import org.tud.inf.st.pccs.EcoreMapping;
import org.tud.inf.st.pccs.MetaModel;
import org.tud.inf.st.pccs.PccsPackage;
import org.tud.inf.st.pccs.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.pccs.impl.EcoreMappingImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.EcoreMappingImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.tud.inf.st.pccs.impl.EcoreMappingImpl#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreMappingImpl extends EObjectImpl implements EcoreMapping {
	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList assignments;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected MetaModel metamodel;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName eClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PccsPackage.Literals.ECORE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClass(QualifiedName newEClass, NotificationChain msgs) {
		QualifiedName oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PccsPackage.ECORE_MAPPING__ECLASS, oldEClass, newEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(QualifiedName newEClass) {
		if (newEClass != eClass) {
			NotificationChain msgs = null;
			if (eClass != null)
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PccsPackage.ECORE_MAPPING__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PccsPackage.ECORE_MAPPING__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.ECORE_MAPPING__ECLASS, newEClass, newEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList(Assignment.class, this, PccsPackage.ECORE_MAPPING__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (MetaModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PccsPackage.ECORE_MAPPING__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(MetaModel newMetamodel) {
		MetaModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PccsPackage.ECORE_MAPPING__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PccsPackage.ECORE_MAPPING__ASSIGNMENTS:
				return ((InternalEList)getAssignments()).basicRemove(otherEnd, msgs);
			case PccsPackage.ECORE_MAPPING__ECLASS:
				return basicSetEClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PccsPackage.ECORE_MAPPING__ASSIGNMENTS:
				return getAssignments();
			case PccsPackage.ECORE_MAPPING__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case PccsPackage.ECORE_MAPPING__ECLASS:
				return getEClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PccsPackage.ECORE_MAPPING__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection)newValue);
				return;
			case PccsPackage.ECORE_MAPPING__METAMODEL:
				setMetamodel((MetaModel)newValue);
				return;
			case PccsPackage.ECORE_MAPPING__ECLASS:
				setEClass((QualifiedName)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PccsPackage.ECORE_MAPPING__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case PccsPackage.ECORE_MAPPING__METAMODEL:
				setMetamodel((MetaModel)null);
				return;
			case PccsPackage.ECORE_MAPPING__ECLASS:
				setEClass((QualifiedName)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PccsPackage.ECORE_MAPPING__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case PccsPackage.ECORE_MAPPING__METAMODEL:
				return metamodel != null;
			case PccsPackage.ECORE_MAPPING__ECLASS:
				return eClass != null;
		}
		return super.eIsSet(featureID);
	}

} //EcoreMappingImpl
