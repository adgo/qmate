/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.inf.st.mbt.graphical.Bendpoint;
import org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalDescription;
import org.tud.inf.st.mbt.graphical.GraphicalFactory;
import org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition;
import org.tud.inf.st.mbt.graphical.GraphicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalPackageImpl extends EPackageImpl implements GraphicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalNodeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalConnectionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bendpointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tud.inf.st.mbt.graphical.GraphicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphicalPackageImpl() {
		super(eNS_URI, GraphicalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraphicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphicalPackage init() {
		if (isInited) return (GraphicalPackage)EPackage.Registry.INSTANCE.getEPackage(GraphicalPackage.eNS_URI);

		// Obtain or create and register package
		GraphicalPackageImpl theGraphicalPackage = (GraphicalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphicalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphicalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGraphicalPackage.createPackageContents();

		// Initialize created meta-data
		theGraphicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphicalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphicalPackage.eNS_URI, theGraphicalPackage);
		return theGraphicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalDescription() {
		return graphicalDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalDescription_Nodes() {
		return (EReference)graphicalDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalDescription_Connections() {
		return (EReference)graphicalDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalNodeDefinition() {
		return graphicalNodeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalNodeDefinition_X() {
		return (EAttribute)graphicalNodeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalNodeDefinition_Y() {
		return (EAttribute)graphicalNodeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalNodeDefinition_Width() {
		return (EAttribute)graphicalNodeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalNodeDefinition_Height() {
		return (EAttribute)graphicalNodeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalNodeDefinition_ReferenceId() {
		return (EAttribute)graphicalNodeDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalConnectionDefinition() {
		return graphicalConnectionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalConnectionDefinition_ReferenceId() {
		return (EAttribute)graphicalConnectionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalConnectionDefinition_Bendpoints() {
		return (EReference)graphicalConnectionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBendpoint() {
		return bendpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBendpoint_X() {
		return (EAttribute)bendpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBendpoint_Y() {
		return (EAttribute)bendpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBendpoint_Index() {
		return (EAttribute)bendpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalFactory getGraphicalFactory() {
		return (GraphicalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		graphicalDescriptionEClass = createEClass(GRAPHICAL_DESCRIPTION);
		createEReference(graphicalDescriptionEClass, GRAPHICAL_DESCRIPTION__NODES);
		createEReference(graphicalDescriptionEClass, GRAPHICAL_DESCRIPTION__CONNECTIONS);

		graphicalNodeDefinitionEClass = createEClass(GRAPHICAL_NODE_DEFINITION);
		createEAttribute(graphicalNodeDefinitionEClass, GRAPHICAL_NODE_DEFINITION__X);
		createEAttribute(graphicalNodeDefinitionEClass, GRAPHICAL_NODE_DEFINITION__Y);
		createEAttribute(graphicalNodeDefinitionEClass, GRAPHICAL_NODE_DEFINITION__WIDTH);
		createEAttribute(graphicalNodeDefinitionEClass, GRAPHICAL_NODE_DEFINITION__HEIGHT);
		createEAttribute(graphicalNodeDefinitionEClass, GRAPHICAL_NODE_DEFINITION__REFERENCE_ID);

		graphicalConnectionDefinitionEClass = createEClass(GRAPHICAL_CONNECTION_DEFINITION);
		createEAttribute(graphicalConnectionDefinitionEClass, GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID);
		createEReference(graphicalConnectionDefinitionEClass, GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS);

		bendpointEClass = createEClass(BENDPOINT);
		createEAttribute(bendpointEClass, BENDPOINT__X);
		createEAttribute(bendpointEClass, BENDPOINT__Y);
		createEAttribute(bendpointEClass, BENDPOINT__INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(graphicalDescriptionEClass, GraphicalDescription.class, "GraphicalDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicalDescription_Nodes(), this.getGraphicalNodeDefinition(), null, "nodes", null, 0, -1, GraphicalDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalDescription_Connections(), this.getGraphicalConnectionDefinition(), null, "connections", null, 0, -1, GraphicalDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalNodeDefinitionEClass, GraphicalNodeDefinition.class, "GraphicalNodeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalNodeDefinition_X(), ecorePackage.getEInt(), "x", null, 1, 1, GraphicalNodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalNodeDefinition_Y(), ecorePackage.getEInt(), "y", null, 1, 1, GraphicalNodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalNodeDefinition_Width(), ecorePackage.getEInt(), "width", null, 1, 1, GraphicalNodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalNodeDefinition_Height(), ecorePackage.getEInt(), "height", null, 1, 1, GraphicalNodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalNodeDefinition_ReferenceId(), ecorePackage.getEString(), "referenceId", null, 1, 1, GraphicalNodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalConnectionDefinitionEClass, GraphicalConnectionDefinition.class, "GraphicalConnectionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalConnectionDefinition_ReferenceId(), ecorePackage.getEString(), "referenceId", null, 1, 1, GraphicalConnectionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalConnectionDefinition_Bendpoints(), this.getBendpoint(), null, "bendpoints", null, 0, -1, GraphicalConnectionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bendpointEClass, Bendpoint.class, "Bendpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBendpoint_X(), ecorePackage.getEInt(), "x", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBendpoint_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBendpoint_Index(), ecorePackage.getEInt(), "index", null, 1, 1, Bendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphicalPackageImpl
