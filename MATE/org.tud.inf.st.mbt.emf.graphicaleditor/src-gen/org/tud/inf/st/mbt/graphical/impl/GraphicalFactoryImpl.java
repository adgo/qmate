/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.graphical.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalFactoryImpl extends EFactoryImpl implements GraphicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphicalFactory init() {
		try {
			GraphicalFactory theGraphicalFactory = (GraphicalFactory)EPackage.Registry.INSTANCE.getEFactory("http://st.inf.tud.org/mbt/graphical#"); 
			if (theGraphicalFactory != null) {
				return theGraphicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphicalPackage.GRAPHICAL_DESCRIPTION: return createGraphicalDescription();
			case GraphicalPackage.GRAPHICAL_NODE_DEFINITION: return createGraphicalNodeDefinition();
			case GraphicalPackage.GRAPHICAL_CONNECTION_DEFINITION: return createGraphicalConnectionDefinition();
			case GraphicalPackage.BENDPOINT: return createBendpoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalDescription createGraphicalDescription() {
		GraphicalDescriptionImpl graphicalDescription = new GraphicalDescriptionImpl();
		return graphicalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalNodeDefinition createGraphicalNodeDefinition() {
		GraphicalNodeDefinitionImpl graphicalNodeDefinition = new GraphicalNodeDefinitionImpl();
		return graphicalNodeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalConnectionDefinition createGraphicalConnectionDefinition() {
		GraphicalConnectionDefinitionImpl graphicalConnectionDefinition = new GraphicalConnectionDefinitionImpl();
		return graphicalConnectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bendpoint createBendpoint() {
		BendpointImpl bendpoint = new BendpointImpl();
		return bendpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalPackage getGraphicalPackage() {
		return (GraphicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GraphicalPackage getPackage() {
		return GraphicalPackage.eINSTANCE;
	}

} //GraphicalFactoryImpl
