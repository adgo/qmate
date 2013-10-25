/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.ocm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcmFactoryImpl extends EFactoryImpl implements OcmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OcmFactory init() {
		try {
			OcmFactory theOcmFactory = (OcmFactory)EPackage.Registry.INSTANCE.getEFactory(OcmPackage.eNS_URI);
			if (theOcmFactory != null) {
				return theOcmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OcmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OcmPackage.OPERATIONAL_CONFIGURATION_MODEL: return createOperationalConfigurationModel();
			case OcmPackage.STANDARD_CONFIGURATION_NODE: return createStandardConfigurationNode();
			case OcmPackage.RECONFIGURATION_ACTION_NODE: return createReconfigurationActionNode();
			case OcmPackage.TIMED_EDGE: return createTimedEdge();
			case OcmPackage.EVENT_GUARDED_EDGE: return createEventGuardedEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalConfigurationModel createOperationalConfigurationModel() {
		OperationalConfigurationModelImpl operationalConfigurationModel = new OperationalConfigurationModelImpl();
		return operationalConfigurationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardConfigurationNode createStandardConfigurationNode() {
		StandardConfigurationNodeImpl standardConfigurationNode = new StandardConfigurationNodeImpl();
		return standardConfigurationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationActionNode createReconfigurationActionNode() {
		ReconfigurationActionNodeImpl reconfigurationActionNode = new ReconfigurationActionNodeImpl();
		return reconfigurationActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEdge createTimedEdge() {
		TimedEdgeImpl timedEdge = new TimedEdgeImpl();
		return timedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuardedEdge createEventGuardedEdge() {
		EventGuardedEdgeImpl eventGuardedEdge = new EventGuardedEdgeImpl();
		return eventGuardedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcmPackage getOcmPackage() {
		return (OcmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OcmPackage getPackage() {
		return OcmPackage.eINSTANCE;
	}

} //OcmFactoryImpl
