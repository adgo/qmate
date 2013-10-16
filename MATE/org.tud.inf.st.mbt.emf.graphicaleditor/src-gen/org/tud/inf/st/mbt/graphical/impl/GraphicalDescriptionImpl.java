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

import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicalDescriptionImpl extends EObjectImpl implements GraphicalDescription {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GraphicalPackage.Literals.GRAPHICAL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList(GraphicalNodeDefinition.class, this, GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList(GraphicalConnectionDefinition.class, this, GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES:
				return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS:
				return ((InternalEList)getConnections()).basicRemove(otherEnd, msgs);
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
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES:
				return getNodes();
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS:
				return getConnections();
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
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection)newValue);
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
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES:
				getNodes().clear();
				return;
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS:
				getConnections().clear();
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
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__NODES:
				return nodes != null && !nodes.isEmpty();
			case GraphicalPackage.GRAPHICAL_DESCRIPTION__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphicalDescriptionImpl
