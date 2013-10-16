/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical.impl;

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

import org.tud.inf.st.mbt.graphical.Bendpoint;
import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicalConnectionDefinitionImpl extends EObjectImpl implements GraphicalConnectionDefinition {
	/**
	 * The default value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String referenceId = REFERENCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList bendpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalConnectionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GraphicalPackage.Literals.GRAPHICAL_CONNECTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceId(String newReferenceId) {
		String oldReferenceId = referenceId;
		referenceId = newReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID, oldReferenceId, referenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EObjectContainmentEList(Bendpoint.class, this, GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS:
				return ((InternalEList)getBendpoints()).basicRemove(otherEnd, msgs);
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
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID:
				return getReferenceId();
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS:
				return getBendpoints();
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
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID:
				setReferenceId((String)newValue);
				return;
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection)newValue);
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
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID:
				setReferenceId(REFERENCE_ID_EDEFAULT);
				return;
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS:
				getBendpoints().clear();
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
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID:
				return REFERENCE_ID_EDEFAULT == null ? referenceId != null : !REFERENCE_ID_EDEFAULT.equals(referenceId);
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceId: ");
		result.append(referenceId);
		result.append(')');
		return result.toString();
	}

} //GraphicalConnectionDefinitionImpl
