/**
 */
package org.tud.inf.st.mbt.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.featuretree.TreeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractModelElementImpl extends EObjectImpl implements AbstractModelElement {
	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceableTo() <em>Traceable To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceableTo()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractModelElement> traceableTo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_MODEL_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModelElement> getTraceableTo() {
		if (traceableTo == null) {
			traceableTo = new EObjectResolvingEList<AbstractModelElement>(AbstractModelElement.class, this, CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO);
		}
		return traceableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE:
				return getNote();
			case CorePackage.ABSTRACT_MODEL_ELEMENT__ID:
				return getId();
			case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO:
				return getTraceableTo();
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME:
				return getName();
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
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE:
				setNote((String)newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__ID:
				setId((String)newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO:
				getTraceableTo().clear();
				getTraceableTo().addAll((Collection<? extends AbstractModelElement>)newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME:
				setName((String)newValue);
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
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO:
				getTraceableTo().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case CorePackage.ABSTRACT_MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO:
				return traceableTo != null && !traceableTo.isEmpty();
			case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		String str = "<?>";
		if(name != null && name.length()!=0)str = name;
		else if(id != null && id.length()!=0)str = id;
		return str;
	}

} //AbstractModelElementImpl
