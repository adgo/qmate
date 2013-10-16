/**
 */
package org.tud.inf.st.mbt.terms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.terms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TermsFactory init() {
		try {
			TermsFactory theTermsFactory = (TermsFactory)EPackage.Registry.INSTANCE.getEFactory(TermsPackage.eNS_URI);
			if (theTermsFactory != null) {
				return theTermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactoryImpl() {
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
			case TermsPackage.FUNCTOR_TERM: return createFunctorTerm();
			case TermsPackage.STRING_TERM: return createStringTerm();
			case TermsPackage.FLOAT_TERM: return createFloatTerm();
			case TermsPackage.INTEGER_TERM: return createIntegerTerm();
			case TermsPackage.LONG_TERM: return createLongTerm();
			case TermsPackage.LIST_TERM: return createListTerm();
			case TermsPackage.FUNCTION_TERM: return createFunctionTerm();
			case TermsPackage.REFERENCE_TERM: return createReferenceTerm();
			case TermsPackage.CONTAINER_TERM: return createContainerTerm();
			case TermsPackage.BOOL_TERM: return createBoolTerm();
			case TermsPackage.TERM_VARIABLE: return createTermVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctorTerm createFunctorTerm() {
		FunctorTermImpl functorTerm = new FunctorTermImpl();
		return functorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTerm createStringTerm() {
		StringTermImpl stringTerm = new StringTermImpl();
		return stringTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatTerm createFloatTerm() {
		FloatTermImpl floatTerm = new FloatTermImpl();
		return floatTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTerm createIntegerTerm() {
		IntegerTermImpl integerTerm = new IntegerTermImpl();
		return integerTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTerm createListTerm() {
		ListTermImpl listTerm = new ListTermImpl();
		return listTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTerm createFunctionTerm() {
		FunctionTermImpl functionTerm = new FunctionTermImpl();
		return functionTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTerm createReferenceTerm() {
		ReferenceTermImpl referenceTerm = new ReferenceTermImpl();
		return referenceTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTerm createContainerTerm() {
		ContainerTermImpl containerTerm = new ContainerTermImpl();
		return containerTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolTerm createBoolTerm() {
		BoolTermImpl boolTerm = new BoolTermImpl();
		return boolTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermVariable createTermVariable() {
		TermVariableImpl termVariable = new TermVariableImpl();
		return termVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongTerm createLongTerm() {
		LongTermImpl longTerm = new LongTermImpl();
		return longTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsPackage getTermsPackage() {
		return (TermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermsPackage getPackage() {
		return TermsPackage.eINSTANCE;
	}

} //TermsFactoryImpl
