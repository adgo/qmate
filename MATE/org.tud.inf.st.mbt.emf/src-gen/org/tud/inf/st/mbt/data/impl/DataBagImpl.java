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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.tud.inf.st.mbt.data.DataBag;
import org.tud.inf.st.mbt.data.DataPackage;
import org.tud.inf.st.mbt.data.DataStructureNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Bag</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataBagImpl#getSingleElementPrototype <em>Single Element Prototype</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataBagImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataBagImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBagImpl extends DataStructureNodeImpl implements DataBag {
	/**
	 * The cached value of the '{@link #getSingleElementPrototype()
	 * <em>Single Element Prototype</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSingleElementPrototype()
	 * @generated
	 * @ordered
	 */
	protected DataStructureNode singleElementPrototype;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratedElements()
	 * <em>Generated Elements</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGeneratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructureNode> generatedElements;

	private boolean hasBeenOrganized = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_BAG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureNode getSingleElementPrototype() {
		return singleElementPrototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleElementPrototype(
			DataStructureNode newSingleElementPrototype, NotificationChain msgs) {
		DataStructureNode oldSingleElementPrototype = singleElementPrototype;
		singleElementPrototype = newSingleElementPrototype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE, oldSingleElementPrototype, newSingleElementPrototype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleElementPrototype(
			DataStructureNode newSingleElementPrototype) {
		if (newSingleElementPrototype != singleElementPrototype) {
			NotificationChain msgs = null;
			if (singleElementPrototype != null)
				msgs = ((InternalEObject)singleElementPrototype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE, null, msgs);
			if (newSingleElementPrototype != null)
				msgs = ((InternalEObject)newSingleElementPrototype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE, null, msgs);
			msgs = basicSetSingleElementPrototype(newSingleElementPrototype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE, newSingleElementPrototype, newSingleElementPrototype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(int newMaxSize) {
		int oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_BAG__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructureNode> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectContainmentEList<DataStructureNode>(DataStructureNode.class, this, DataPackage.DATA_BAG__GENERATED_ELEMENTS);
		}
		return generatedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void organize() {
		if (!hasBeenOrganized){
			for (int i = 0; i < getMaxSize(); i++) {
				getGeneratedElements().add(EcoreUtil.copy(getSingleElementPrototype()));
			}
			singleElementPrototype = null;
			hasBeenOrganized = true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE:
				return basicSetSingleElementPrototype(null, msgs);
			case DataPackage.DATA_BAG__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE:
				return getSingleElementPrototype();
			case DataPackage.DATA_BAG__MAX_SIZE:
				return getMaxSize();
			case DataPackage.DATA_BAG__GENERATED_ELEMENTS:
				return getGeneratedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE:
				setSingleElementPrototype((DataStructureNode)newValue);
				return;
			case DataPackage.DATA_BAG__MAX_SIZE:
				setMaxSize((Integer)newValue);
				return;
			case DataPackage.DATA_BAG__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends DataStructureNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE:
				setSingleElementPrototype((DataStructureNode)null);
				return;
			case DataPackage.DATA_BAG__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case DataPackage.DATA_BAG__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_BAG__SINGLE_ELEMENT_PROTOTYPE:
				return singleElementPrototype != null;
			case DataPackage.DATA_BAG__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
			case DataPackage.DATA_BAG__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		String str = name == null ? id == null ? "bag" : id : name;;
		if (eContainer() != null && eContainer instanceof DataBag) {
			DataBag bag = (DataBag) eContainer();
			bag.organize();
			int idx = bag.getGeneratedElements().indexOf(this);
			str += bag + "[" + idx + "]";
		} 
		return str;
	}

} // DataBagImpl
