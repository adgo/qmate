/**
 */
package org.tud.inf.st.mbt.ocm.impl;

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
import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Configuration Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ocm.impl.OperationalConfigurationModelImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalConfigurationModelImpl extends AbstractModelElementImpl implements OperationalConfigurationModel {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationNode> nodes;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationNode start;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalConfigurationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcmPackage.Literals.OPERATIONAL_CONFIGURATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ConfigurationNode>(ConfigurationNode.class, this, OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationNode getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (ConfigurationNode)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationNode basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ConfigurationNode newStart) {
		ConfigurationNode oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES:
				return getEdges();
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES:
				return getNodes();
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START:
				if (resolve) return getStart();
				return basicGetStart();
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
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ConfigurationNode>)newValue);
				return;
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START:
				setStart((ConfigurationNode)newValue);
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
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES:
				getEdges().clear();
				return;
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES:
				getNodes().clear();
				return;
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START:
				setStart((ConfigurationNode)null);
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
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__EDGES:
				return edges != null && !edges.isEmpty();
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__NODES:
				return nodes != null && !nodes.isEmpty();
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalConfigurationModelImpl
