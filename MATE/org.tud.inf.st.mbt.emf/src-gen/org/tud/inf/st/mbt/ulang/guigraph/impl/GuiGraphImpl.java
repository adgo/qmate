/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

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
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.GuiGraphImpl#getInvariantText <em>Invariant Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiGraphImpl extends AbstractModelElementImpl implements GuiGraph {
	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GuiGraphNode> nodes;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected Predicate invariant;

	/**
	 * The default value of the '{@link #getInvariantText() <em>Invariant Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantText()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_TEXT_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getInvariantText() <em>Invariant Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantText()
	 * @generated
	 * @ordered
	 */
	protected String invariantText = INVARIANT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigraphPackage.Literals.GUI_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, GuigraphPackage.GUI_GRAPH__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuiGraphNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<GuiGraphNode>(GuiGraphNode.class, this, GuigraphPackage.GUI_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariant(Predicate newInvariant, NotificationChain msgs) {
		Predicate oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigraphPackage.GUI_GRAPH__INVARIANT, oldInvariant, newInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(Predicate newInvariant) {
		if (newInvariant != invariant) {
			NotificationChain msgs = null;
			if (invariant != null)
				msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.GUI_GRAPH__INVARIANT, null, msgs);
			if (newInvariant != null)
				msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigraphPackage.GUI_GRAPH__INVARIANT, null, msgs);
			msgs = basicSetInvariant(newInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.GUI_GRAPH__INVARIANT, newInvariant, newInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantText() {
		return invariantText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantText(String newInvariantText) {
		String oldInvariantText = invariantText;
		invariantText = newInvariantText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.GUI_GRAPH__INVARIANT_TEXT, oldInvariantText, invariantText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigraphPackage.GUI_GRAPH__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case GuigraphPackage.GUI_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GuigraphPackage.GUI_GRAPH__INVARIANT:
				return basicSetInvariant(null, msgs);
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
			case GuigraphPackage.GUI_GRAPH__ARCS:
				return getArcs();
			case GuigraphPackage.GUI_GRAPH__NODES:
				return getNodes();
			case GuigraphPackage.GUI_GRAPH__INVARIANT:
				return getInvariant();
			case GuigraphPackage.GUI_GRAPH__INVARIANT_TEXT:
				return getInvariantText();
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
			case GuigraphPackage.GUI_GRAPH__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case GuigraphPackage.GUI_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GuiGraphNode>)newValue);
				return;
			case GuigraphPackage.GUI_GRAPH__INVARIANT:
				setInvariant((Predicate)newValue);
				return;
			case GuigraphPackage.GUI_GRAPH__INVARIANT_TEXT:
				setInvariantText((String)newValue);
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
			case GuigraphPackage.GUI_GRAPH__ARCS:
				getArcs().clear();
				return;
			case GuigraphPackage.GUI_GRAPH__NODES:
				getNodes().clear();
				return;
			case GuigraphPackage.GUI_GRAPH__INVARIANT:
				setInvariant((Predicate)null);
				return;
			case GuigraphPackage.GUI_GRAPH__INVARIANT_TEXT:
				setInvariantText(INVARIANT_TEXT_EDEFAULT);
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
			case GuigraphPackage.GUI_GRAPH__ARCS:
				return arcs != null && !arcs.isEmpty();
			case GuigraphPackage.GUI_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case GuigraphPackage.GUI_GRAPH__INVARIANT:
				return invariant != null;
			case GuigraphPackage.GUI_GRAPH__INVARIANT_TEXT:
				return INVARIANT_TEXT_EDEFAULT == null ? invariantText != null : !INVARIANT_TEXT_EDEFAULT.equals(invariantText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return super.toString();
	}

} //GuiGraphImpl
