/**
 */
package org.tud.inf.st.mbt.ocm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.inf.st.mbt.actions.ActionsPackage;

import org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl;

import org.tud.inf.st.mbt.core.CorePackage;

import org.tud.inf.st.mbt.core.impl.CorePackageImpl;

import org.tud.inf.st.mbt.data.DataPackage;

import org.tud.inf.st.mbt.data.impl.DataPackageImpl;

import org.tud.inf.st.mbt.features.FeaturesPackage;

import org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl;

import org.tud.inf.st.mbt.featuretree.FeaturetreePackage;

import org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl;

import org.tud.inf.st.mbt.functions.FunctionsPackage;

import org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl;

import org.tud.inf.st.mbt.ocm.ConfigurationNode;
import org.tud.inf.st.mbt.ocm.Edge;
import org.tud.inf.st.mbt.ocm.EventGuardedEdge;
import org.tud.inf.st.mbt.ocm.OcmFactory;
import org.tud.inf.st.mbt.ocm.OcmPackage;
import org.tud.inf.st.mbt.ocm.OperationalConfigurationModel;
import org.tud.inf.st.mbt.ocm.OperationalEdge;
import org.tud.inf.st.mbt.ocm.ReconfigurationActionNode;
import org.tud.inf.st.mbt.ocm.StandardConfigurationNode;
import org.tud.inf.st.mbt.ocm.TimedEdge;

import org.tud.inf.st.mbt.rules.RulesPackage;

import org.tud.inf.st.mbt.rules.impl.RulesPackageImpl;

import org.tud.inf.st.mbt.scenario.ScenarioPackage;

import org.tud.inf.st.mbt.scenario.impl.ScenarioPackageImpl;

import org.tud.inf.st.mbt.terms.TermsPackage;

import org.tud.inf.st.mbt.terms.impl.TermsPackageImpl;

import org.tud.inf.st.mbt.test.TestPackage;

import org.tud.inf.st.mbt.test.impl.TestPackageImpl;

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

import org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcmPackageImpl extends EPackageImpl implements OcmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalConfigurationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardConfigurationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventGuardedEdgeEClass = null;

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
	 * @see org.tud.inf.st.mbt.ocm.OcmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OcmPackageImpl() {
		super(eNS_URI, OcmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OcmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OcmPackage init() {
		if (isInited) return (OcmPackage)EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI);

		// Obtain or create and register package
		OcmPackageImpl theOcmPackage = (OcmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OcmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OcmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) : GuigraphPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) instanceof FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) : FeaturesPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theOcmPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theGuigraphPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTestPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theFeaturesPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theOcmPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theGuigraphPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theFeaturesPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOcmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OcmPackage.eNS_URI, theOcmPackage);
		return theOcmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalConfigurationModel() {
		return operationalConfigurationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalConfigurationModel_Edges() {
		return (EReference)operationalConfigurationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalConfigurationModel_Nodes() {
		return (EReference)operationalConfigurationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalConfigurationModel_Start() {
		return (EReference)operationalConfigurationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationNode() {
		return configurationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationNode_PostConfEventID() {
		return (EAttribute)configurationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalEdge() {
		return operationalEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalEdge_Source() {
		return (EReference)operationalEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalEdge_Target() {
		return (EReference)operationalEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardConfigurationNode() {
		return standardConfigurationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardConfigurationNode_Configuration() {
		return (EReference)standardConfigurationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationActionNode() {
		return reconfigurationActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationActionNode_Actions() {
		return (EReference)reconfigurationActionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationActionNode_ActionsText() {
		return (EAttribute)reconfigurationActionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedEdge() {
		return timedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedEdge_Duration() {
		return (EAttribute)timedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventGuardedEdge() {
		return eventGuardedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventGuardedEdge_GuardEventID() {
		return (EAttribute)eventGuardedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcmFactory getOcmFactory() {
		return (OcmFactory)getEFactoryInstance();
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
		operationalConfigurationModelEClass = createEClass(OPERATIONAL_CONFIGURATION_MODEL);
		createEReference(operationalConfigurationModelEClass, OPERATIONAL_CONFIGURATION_MODEL__EDGES);
		createEReference(operationalConfigurationModelEClass, OPERATIONAL_CONFIGURATION_MODEL__NODES);
		createEReference(operationalConfigurationModelEClass, OPERATIONAL_CONFIGURATION_MODEL__START);

		configurationNodeEClass = createEClass(CONFIGURATION_NODE);
		createEAttribute(configurationNodeEClass, CONFIGURATION_NODE__POST_CONF_EVENT_ID);

		operationalEdgeEClass = createEClass(OPERATIONAL_EDGE);
		createEReference(operationalEdgeEClass, OPERATIONAL_EDGE__SOURCE);
		createEReference(operationalEdgeEClass, OPERATIONAL_EDGE__TARGET);

		standardConfigurationNodeEClass = createEClass(STANDARD_CONFIGURATION_NODE);
		createEReference(standardConfigurationNodeEClass, STANDARD_CONFIGURATION_NODE__CONFIGURATION);

		reconfigurationActionNodeEClass = createEClass(RECONFIGURATION_ACTION_NODE);
		createEReference(reconfigurationActionNodeEClass, RECONFIGURATION_ACTION_NODE__ACTIONS);
		createEAttribute(reconfigurationActionNodeEClass, RECONFIGURATION_ACTION_NODE__ACTIONS_TEXT);

		edgeEClass = createEClass(EDGE);

		timedEdgeEClass = createEClass(TIMED_EDGE);
		createEAttribute(timedEdgeEClass, TIMED_EDGE__DURATION);

		eventGuardedEdgeEClass = createEClass(EVENT_GUARDED_EDGE);
		createEAttribute(eventGuardedEdgeEClass, EVENT_GUARDED_EDGE__GUARD_EVENT_ID);
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

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		FeaturesPackage theFeaturesPackage = (FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationalConfigurationModelEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		operationalConfigurationModelEClass.getESuperTypes().add(theRulesPackage.getITimeConsumer());
		configurationNodeEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		operationalEdgeEClass.getESuperTypes().add(this.getEdge());
		standardConfigurationNodeEClass.getESuperTypes().add(this.getConfigurationNode());
		reconfigurationActionNodeEClass.getESuperTypes().add(this.getConfigurationNode());
		edgeEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		timedEdgeEClass.getESuperTypes().add(this.getOperationalEdge());
		eventGuardedEdgeEClass.getESuperTypes().add(this.getOperationalEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(operationalConfigurationModelEClass, OperationalConfigurationModel.class, "OperationalConfigurationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalConfigurationModel_Edges(), this.getEdge(), null, "edges", null, 0, -1, OperationalConfigurationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalConfigurationModel_Nodes(), this.getConfigurationNode(), null, "nodes", null, 0, -1, OperationalConfigurationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalConfigurationModel_Start(), this.getConfigurationNode(), null, "start", null, 1, 1, OperationalConfigurationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationNodeEClass, ConfigurationNode.class, "ConfigurationNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationNode_PostConfEventID(), ecorePackage.getEString(), "postConfEventID", null, 0, 1, ConfigurationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalEdgeEClass, OperationalEdge.class, "OperationalEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalEdge_Source(), this.getConfigurationNode(), null, "source", null, 1, 1, OperationalEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalEdge_Target(), this.getConfigurationNode(), null, "target", null, 1, 1, OperationalEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardConfigurationNodeEClass, StandardConfigurationNode.class, "StandardConfigurationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardConfigurationNode_Configuration(), theFeaturesPackage.getConfiguration(), null, "configuration", null, 1, 1, StandardConfigurationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationActionNodeEClass, ReconfigurationActionNode.class, "ReconfigurationActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationActionNode_Actions(), theActionsPackage.getReconfigurationAction(), null, "actions", null, 0, -1, ReconfigurationActionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationActionNode_ActionsText(), ecorePackage.getEString(), "actionsText", null, 1, 1, ReconfigurationActionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedEdgeEClass, TimedEdge.class, "TimedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedEdge_Duration(), ecorePackage.getEInt(), "duration", "1", 1, 1, TimedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventGuardedEdgeEClass, EventGuardedEdge.class, "EventGuardedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventGuardedEdge_GuardEventID(), ecorePackage.getEString(), "guardEventID", null, 0, 1, EventGuardedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OcmPackageImpl
