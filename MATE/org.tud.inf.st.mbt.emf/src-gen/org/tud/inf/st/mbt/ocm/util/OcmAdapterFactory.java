/**
 */
package org.tud.inf.st.mbt.ocm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.ocm.*;
import org.tud.inf.st.mbt.rules.ITimeConsumer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.ocm.OcmPackage
 * @generated
 */
public class OcmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OcmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcmSwitch<Adapter> modelSwitch =
		new OcmSwitch<Adapter>() {
			@Override
			public Adapter caseOperationalConfigurationModel(OperationalConfigurationModel object) {
				return createOperationalConfigurationModelAdapter();
			}
			@Override
			public Adapter caseConfigurationNode(ConfigurationNode object) {
				return createConfigurationNodeAdapter();
			}
			@Override
			public Adapter caseOperationalEdge(OperationalEdge object) {
				return createOperationalEdgeAdapter();
			}
			@Override
			public Adapter caseStandardConfigurationNode(StandardConfigurationNode object) {
				return createStandardConfigurationNodeAdapter();
			}
			@Override
			public Adapter caseReconfigurationActionNode(ReconfigurationActionNode object) {
				return createReconfigurationActionNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseTimedEdge(TimedEdge object) {
				return createTimedEdgeAdapter();
			}
			@Override
			public Adapter caseEventGuardedEdge(EventGuardedEdge object) {
				return createEventGuardedEdgeAdapter();
			}
			@Override
			public Adapter caseAbstractModelElement(AbstractModelElement object) {
				return createAbstractModelElementAdapter();
			}
			@Override
			public Adapter caseITimeConsumer(ITimeConsumer object) {
				return createITimeConsumerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.OperationalConfigurationModel <em>Operational Configuration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.OperationalConfigurationModel
	 * @generated
	 */
	public Adapter createOperationalConfigurationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.ConfigurationNode <em>Configuration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.ConfigurationNode
	 * @generated
	 */
	public Adapter createConfigurationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.OperationalEdge <em>Operational Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.OperationalEdge
	 * @generated
	 */
	public Adapter createOperationalEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.StandardConfigurationNode <em>Standard Configuration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.StandardConfigurationNode
	 * @generated
	 */
	public Adapter createStandardConfigurationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.ReconfigurationActionNode <em>Reconfiguration Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.ReconfigurationActionNode
	 * @generated
	 */
	public Adapter createReconfigurationActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.TimedEdge <em>Timed Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.TimedEdge
	 * @generated
	 */
	public Adapter createTimedEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.ocm.EventGuardedEdge <em>Event Guarded Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.ocm.EventGuardedEdge
	 * @generated
	 */
	public Adapter createEventGuardedEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.AbstractModelElement <em>Abstract Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement
	 * @generated
	 */
	public Adapter createAbstractModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.rules.ITimeConsumer <em>ITime Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.rules.ITimeConsumer
	 * @generated
	 */
	public Adapter createITimeConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OcmAdapterFactory
