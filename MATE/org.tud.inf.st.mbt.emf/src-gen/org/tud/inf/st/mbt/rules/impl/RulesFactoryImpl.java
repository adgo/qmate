/**
 */
package org.tud.inf.st.mbt.rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory)EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
			case RulesPackage.SUB_PREDICATE: return createSubPredicate();
			case RulesPackage.REASONABLE_ATOM: return createReasonableAtom();
			case RulesPackage.NOT: return createNot();
			case RulesPackage.AND: return createAnd();
			case RulesPackage.OR: return createOr();
			case RulesPackage.XOR: return createXor();
			case RulesPackage.IMPLICATION: return createImplication();
			case RulesPackage.TRUE: return createTrue();
			case RulesPackage.FEATURE_ATOM: return createFeatureAtom();
			case RulesPackage.DATA_ATOM: return createDataAtom();
			case RulesPackage.LOGIC_FUNCTION_ATOM: return createLogicFunctionAtom();
			case RulesPackage.TOKEN_ATOM: return createTokenAtom();
			case RulesPackage.INSTRUCTION_POINTER_ATOM: return createInstructionPointerAtom();
			case RulesPackage.CONFIGURATION_ATOM: return createConfigurationAtom();
			case RulesPackage.BAG_ELEMENT_ASSIGNED_ATOM: return createBagElementAssignedAtom();
			case RulesPackage.TIME_ATOM: return createTimeAtom();
			case RulesPackage.REAL_TIME_ATOM: return createRealTimeAtom();
			case RulesPackage.CONTEXT_ENTRY: return createContextEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPredicate createSubPredicate() {
		SubPredicateImpl subPredicate = new SubPredicateImpl();
		return subPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonableAtom createReasonableAtom() {
		ReasonableAtomImpl reasonableAtom = new ReasonableAtomImpl();
		return reasonableAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAtom createFeatureAtom() {
		FeatureAtomImpl featureAtom = new FeatureAtomImpl();
		return featureAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAtom createDataAtom() {
		DataAtomImpl dataAtom = new DataAtomImpl();
		return dataAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFunctionAtom createLogicFunctionAtom() {
		LogicFunctionAtomImpl logicFunctionAtom = new LogicFunctionAtomImpl();
		return logicFunctionAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagElementAssignedAtom createBagElementAssignedAtom() {
		BagElementAssignedAtomImpl bagElementAssignedAtom = new BagElementAssignedAtomImpl();
		return bagElementAssignedAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextEntry createContextEntry() {
		ContextEntryImpl contextEntry = new ContextEntryImpl();
		return contextEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAtom createTokenAtom() {
		TokenAtomImpl tokenAtom = new TokenAtomImpl();
		return tokenAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionPointerAtom createInstructionPointerAtom() {
		InstructionPointerAtomImpl instructionPointerAtom = new InstructionPointerAtomImpl();
		return instructionPointerAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAtom createTimeAtom() {
		TimeAtomImpl timeAtom = new TimeAtomImpl();
		return timeAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTimeAtom createRealTimeAtom() {
		RealTimeAtomImpl realTimeAtom = new RealTimeAtomImpl();
		return realTimeAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationAtom createConfigurationAtom() {
		ConfigurationAtomImpl configurationAtom = new ConfigurationAtomImpl();
		return configurationAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
