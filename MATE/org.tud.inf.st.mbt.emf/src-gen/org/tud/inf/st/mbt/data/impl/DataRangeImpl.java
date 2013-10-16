/**
 */
package org.tud.inf.st.mbt.data.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.DataPackage;
import org.tud.inf.st.mbt.data.DataRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataRangeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataRangeImpl#getEventID <em>Event ID</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.data.impl.DataRangeImpl#getLeaf <em>Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataRangeImpl extends AbstractModelElementImpl implements DataRange {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElement> values;

	/**
	 * The default value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected String eventID = EVENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeaf() <em>Leaf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaf()
	 * @generated
	 * @ordered
	 */
	protected DataLeaf leaf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElement> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<DataElement>(DataElement.class, this, DataPackage.DATA_RANGE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventID() {
		return eventID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventID(String newEventID) {
		String oldEventID = eventID;
		eventID = newEventID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RANGE__EVENT_ID, oldEventID, eventID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLeaf getLeaf() {
		if (leaf != null && leaf.eIsProxy()) {
			InternalEObject oldLeaf = (InternalEObject)leaf;
			leaf = (DataLeaf)eResolveProxy(oldLeaf);
			if (leaf != oldLeaf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_RANGE__LEAF, oldLeaf, leaf));
			}
		}
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLeaf basicGetLeaf() {
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaf(DataLeaf newLeaf) {
		DataLeaf oldLeaf = leaf;
		leaf = newLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RANGE__LEAF, oldLeaf, leaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_RANGE__VALUES:
				return getValues();
			case DataPackage.DATA_RANGE__EVENT_ID:
				return getEventID();
			case DataPackage.DATA_RANGE__LEAF:
				if (resolve) return getLeaf();
				return basicGetLeaf();
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
			case DataPackage.DATA_RANGE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends DataElement>)newValue);
				return;
			case DataPackage.DATA_RANGE__EVENT_ID:
				setEventID((String)newValue);
				return;
			case DataPackage.DATA_RANGE__LEAF:
				setLeaf((DataLeaf)newValue);
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
			case DataPackage.DATA_RANGE__VALUES:
				getValues().clear();
				return;
			case DataPackage.DATA_RANGE__EVENT_ID:
				setEventID(EVENT_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RANGE__LEAF:
				setLeaf((DataLeaf)null);
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
			case DataPackage.DATA_RANGE__VALUES:
				return values != null && !values.isEmpty();
			case DataPackage.DATA_RANGE__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventID != null : !EVENT_ID_EDEFAULT.equals(eventID);
			case DataPackage.DATA_RANGE__LEAF:
				return leaf != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append(super.toString());
		b.append("[");
		Iterator<DataElement> i = getValues().iterator();
		while(i.hasNext()){
			DataElement e = i.next();
			b.append(e);
			if(i.hasNext())b.append(",");
		}
		b.append("]->!");
		b.append(getEventID());
		return b.toString();
	}

} //DataRangeImpl
