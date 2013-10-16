/**
 */
package org.tud.inf.st.mbt.rules.impl;

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

import org.tud.inf.st.mbt.ocm.OcmPackage;

import org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl;

import org.tud.inf.st.mbt.rules.And;
import org.tud.inf.st.mbt.rules.Atom;
import org.tud.inf.st.mbt.rules.BagElementAssignedAtom;
import org.tud.inf.st.mbt.rules.BinaryOperator;
import org.tud.inf.st.mbt.rules.ConfigurationAtom;
import org.tud.inf.st.mbt.rules.ContextEntry;
import org.tud.inf.st.mbt.rules.DataAtom;
import org.tud.inf.st.mbt.rules.FeatureAtom;
import org.tud.inf.st.mbt.rules.IRealTimeConsumer;
import org.tud.inf.st.mbt.rules.ITimeConsumer;
import org.tud.inf.st.mbt.rules.Implication;
import org.tud.inf.st.mbt.rules.InstructionPointerAtom;
import org.tud.inf.st.mbt.rules.LogicFunctionAtom;
import org.tud.inf.st.mbt.rules.Not;
import org.tud.inf.st.mbt.rules.Or;
import org.tud.inf.st.mbt.rules.Predicate;
import org.tud.inf.st.mbt.rules.RealTimeAtom;
import org.tud.inf.st.mbt.rules.ReasonableAtom;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.RulesPackage;
import org.tud.inf.st.mbt.rules.SubPredicate;
import org.tud.inf.st.mbt.rules.TimeAtom;
import org.tud.inf.st.mbt.rules.TokenAtom;
import org.tud.inf.st.mbt.rules.True;
import org.tud.inf.st.mbt.rules.UnaryOperator;
import org.tud.inf.st.mbt.rules.Xor;

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
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTimeConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonableAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionPointerAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRealTimeConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTimeAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicFunctionAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagElementAssignedAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEntryEClass = null;

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
	 * @see org.tud.inf.st.mbt.rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited) return (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RulesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) : GuigraphPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) instanceof FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) : FeaturesPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		OcmPackageImpl theOcmPackage = (OcmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) instanceof OcmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) : OcmPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theGuigraphPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTestPackage.createPackageContents();
		theFeaturesPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theOcmPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theGuigraphPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theFeaturesPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theOcmPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITimeConsumer() {
		return iTimeConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryOperator_Operand() {
		return (EReference)unaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Operand1() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Operand2() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPredicate() {
		return subPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPredicate_Operand() {
		return (EReference)subPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplication() {
		return implicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureAtom() {
		return featureAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAtom_Feature() {
		return (EReference)featureAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureAtom_Version() {
		return (EReference)featureAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonableAtom() {
		return reasonableAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenAtom() {
		return tokenAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAtom_Count() {
		return (EAttribute)tokenAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenAtom_Place() {
		return (EReference)tokenAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionPointerAtom() {
		return instructionPointerAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionPointerAtom_Sequence() {
		return (EReference)instructionPointerAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionPointerAtom_Instruction() {
		return (EAttribute)instructionPointerAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionPointerAtom_StackLevel() {
		return (EAttribute)instructionPointerAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionPointerAtom_Context() {
		return (EReference)instructionPointerAtomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAtom() {
		return timeAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAtom_Time() {
		return (EAttribute)timeAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeAtom_Consumer() {
		return (EReference)timeAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRealTimeConsumer() {
		return iRealTimeConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTimeAtom() {
		return realTimeAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTimeAtom_Time() {
		return (EAttribute)realTimeAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealTimeAtom_Consumer() {
		return (EReference)realTimeAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationAtom() {
		return configurationAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationAtom_Configuration() {
		return (EReference)configurationAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAtom() {
		return dataAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAtom_Leaf() {
		return (EReference)dataAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAtom_Value() {
		return (EReference)dataAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicFunctionAtom() {
		return logicFunctionAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicFunctionAtom_Function() {
		return (EReference)logicFunctionAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagElementAssignedAtom() {
		return bagElementAssignedAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagElementAssignedAtom_Bag() {
		return (EReference)bagElementAssignedAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBagElementAssignedAtom_Idx() {
		return (EAttribute)bagElementAssignedAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextEntry() {
		return contextEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextEntry_Id() {
		return (EAttribute)contextEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextEntry_Value() {
		return (EReference)contextEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory)getEFactoryInstance();
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
		predicateEClass = createEClass(PREDICATE);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);
		createEReference(unaryOperatorEClass, UNARY_OPERATOR__OPERAND);

		binaryOperatorEClass = createEClass(BINARY_OPERATOR);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__OPERAND1);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__OPERAND2);

		subPredicateEClass = createEClass(SUB_PREDICATE);
		createEReference(subPredicateEClass, SUB_PREDICATE__OPERAND);

		atomEClass = createEClass(ATOM);

		reasonableAtomEClass = createEClass(REASONABLE_ATOM);

		notEClass = createEClass(NOT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		xorEClass = createEClass(XOR);

		implicationEClass = createEClass(IMPLICATION);

		trueEClass = createEClass(TRUE);

		featureAtomEClass = createEClass(FEATURE_ATOM);
		createEReference(featureAtomEClass, FEATURE_ATOM__FEATURE);
		createEReference(featureAtomEClass, FEATURE_ATOM__VERSION);

		dataAtomEClass = createEClass(DATA_ATOM);
		createEReference(dataAtomEClass, DATA_ATOM__LEAF);
		createEReference(dataAtomEClass, DATA_ATOM__VALUE);

		logicFunctionAtomEClass = createEClass(LOGIC_FUNCTION_ATOM);
		createEReference(logicFunctionAtomEClass, LOGIC_FUNCTION_ATOM__FUNCTION);

		tokenAtomEClass = createEClass(TOKEN_ATOM);
		createEAttribute(tokenAtomEClass, TOKEN_ATOM__COUNT);
		createEReference(tokenAtomEClass, TOKEN_ATOM__PLACE);

		instructionPointerAtomEClass = createEClass(INSTRUCTION_POINTER_ATOM);
		createEReference(instructionPointerAtomEClass, INSTRUCTION_POINTER_ATOM__SEQUENCE);
		createEAttribute(instructionPointerAtomEClass, INSTRUCTION_POINTER_ATOM__INSTRUCTION);
		createEAttribute(instructionPointerAtomEClass, INSTRUCTION_POINTER_ATOM__STACK_LEVEL);
		createEReference(instructionPointerAtomEClass, INSTRUCTION_POINTER_ATOM__CONTEXT);

		configurationAtomEClass = createEClass(CONFIGURATION_ATOM);
		createEReference(configurationAtomEClass, CONFIGURATION_ATOM__CONFIGURATION);

		bagElementAssignedAtomEClass = createEClass(BAG_ELEMENT_ASSIGNED_ATOM);
		createEReference(bagElementAssignedAtomEClass, BAG_ELEMENT_ASSIGNED_ATOM__BAG);
		createEAttribute(bagElementAssignedAtomEClass, BAG_ELEMENT_ASSIGNED_ATOM__IDX);

		iTimeConsumerEClass = createEClass(ITIME_CONSUMER);

		timeAtomEClass = createEClass(TIME_ATOM);
		createEAttribute(timeAtomEClass, TIME_ATOM__TIME);
		createEReference(timeAtomEClass, TIME_ATOM__CONSUMER);

		iRealTimeConsumerEClass = createEClass(IREAL_TIME_CONSUMER);

		realTimeAtomEClass = createEClass(REAL_TIME_ATOM);
		createEAttribute(realTimeAtomEClass, REAL_TIME_ATOM__TIME);
		createEReference(realTimeAtomEClass, REAL_TIME_ATOM__CONSUMER);

		contextEntryEClass = createEClass(CONTEXT_ENTRY);
		createEAttribute(contextEntryEClass, CONTEXT_ENTRY__ID);
		createEReference(contextEntryEClass, CONTEXT_ENTRY__VALUE);
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
		FeaturesPackage theFeaturesPackage = (FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		GuigraphPackage theGuigraphPackage = (GuigraphPackage)EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		OcmPackage theOcmPackage = (OcmPackage)EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryOperatorEClass.getESuperTypes().add(this.getPredicate());
		binaryOperatorEClass.getESuperTypes().add(this.getPredicate());
		subPredicateEClass.getESuperTypes().add(this.getPredicate());
		atomEClass.getESuperTypes().add(this.getPredicate());
		reasonableAtomEClass.getESuperTypes().add(this.getAtom());
		notEClass.getESuperTypes().add(this.getUnaryOperator());
		andEClass.getESuperTypes().add(this.getBinaryOperator());
		orEClass.getESuperTypes().add(this.getBinaryOperator());
		xorEClass.getESuperTypes().add(this.getBinaryOperator());
		implicationEClass.getESuperTypes().add(this.getBinaryOperator());
		trueEClass.getESuperTypes().add(this.getReasonableAtom());
		featureAtomEClass.getESuperTypes().add(this.getReasonableAtom());
		dataAtomEClass.getESuperTypes().add(this.getReasonableAtom());
		logicFunctionAtomEClass.getESuperTypes().add(this.getReasonableAtom());
		tokenAtomEClass.getESuperTypes().add(this.getAtom());
		instructionPointerAtomEClass.getESuperTypes().add(this.getAtom());
		configurationAtomEClass.getESuperTypes().add(this.getAtom());
		bagElementAssignedAtomEClass.getESuperTypes().add(this.getAtom());
		timeAtomEClass.getESuperTypes().add(this.getAtom());
		realTimeAtomEClass.getESuperTypes().add(this.getAtom());

		// Initialize classes and features; add operations and parameters
		initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperator_Operand(), this.getPredicate(), null, "operand", null, 1, 1, UnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperatorEClass, BinaryOperator.class, "BinaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperator_Operand1(), this.getPredicate(), null, "operand1", null, 1, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperator_Operand2(), this.getPredicate(), null, "operand2", null, 1, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subPredicateEClass, SubPredicate.class, "SubPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubPredicate_Operand(), this.getPredicate(), null, "operand", null, 1, 1, SubPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reasonableAtomEClass, ReasonableAtom.class, "ReasonableAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureAtomEClass, FeatureAtom.class, "FeatureAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureAtom_Feature(), theFeaturesPackage.getIFeature(), null, "feature", null, 1, 1, FeatureAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureAtom_Version(), theFeaturesPackage.getFeatureVersion(), null, "version", null, 0, 1, FeatureAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAtomEClass, DataAtom.class, "DataAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAtom_Leaf(), theDataPackage.getDataLeaf(), null, "leaf", null, 1, 1, DataAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAtom_Value(), theDataPackage.getDataElement(), null, "value", null, 1, 1, DataAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicFunctionAtomEClass, LogicFunctionAtom.class, "LogicFunctionAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicFunctionAtom_Function(), theFunctionsPackage.getILogicFunction(), null, "function", null, 1, 1, LogicFunctionAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenAtomEClass, TokenAtom.class, "TokenAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenAtom_Count(), ecorePackage.getEInt(), "count", null, 1, 1, TokenAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenAtom_Place(), theGuigraphPackage.getPlace(), null, "place", null, 1, 1, TokenAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionPointerAtomEClass, InstructionPointerAtom.class, "InstructionPointerAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionPointerAtom_Sequence(), theActionsPackage.getPreGenerationSequence(), null, "sequence", null, 1, 1, InstructionPointerAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionPointerAtom_Instruction(), ecorePackage.getEInt(), "instruction", null, 1, 1, InstructionPointerAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionPointerAtom_StackLevel(), ecorePackage.getEInt(), "stackLevel", "0", 1, 1, InstructionPointerAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionPointerAtom_Context(), this.getContextEntry(), null, "context", null, 0, -1, InstructionPointerAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationAtomEClass, ConfigurationAtom.class, "ConfigurationAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationAtom_Configuration(), theOcmPackage.getConfigurationNode(), null, "configuration", null, 1, 1, ConfigurationAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagElementAssignedAtomEClass, BagElementAssignedAtom.class, "BagElementAssignedAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagElementAssignedAtom_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagElementAssignedAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBagElementAssignedAtom_Idx(), ecorePackage.getEInt(), "idx", null, 1, 1, BagElementAssignedAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTimeConsumerEClass, ITimeConsumer.class, "ITimeConsumer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeAtomEClass, TimeAtom.class, "TimeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeAtom_Time(), ecorePackage.getEInt(), "time", null, 0, 1, TimeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeAtom_Consumer(), this.getITimeConsumer(), null, "consumer", null, 1, 1, TimeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iRealTimeConsumerEClass, IRealTimeConsumer.class, "IRealTimeConsumer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTimeAtomEClass, RealTimeAtom.class, "RealTimeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealTimeAtom_Time(), ecorePackage.getELong(), "time", "0", 1, 1, RealTimeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealTimeAtom_Consumer(), this.getIRealTimeConsumer(), null, "consumer", null, 1, 1, RealTimeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEntryEClass, ContextEntry.class, "ContextEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextEntry_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContextEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextEntry_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, ContextEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RulesPackageImpl
