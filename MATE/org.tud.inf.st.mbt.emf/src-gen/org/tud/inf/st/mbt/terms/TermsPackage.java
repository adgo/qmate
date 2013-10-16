/**
 */
package org.tud.inf.st.mbt.terms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
public interface TermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.int.tud.org/mbt/terms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsPackage eINSTANCE = org.tud.inf.st.mbt.terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.Term <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.Term
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.FunctorTermImpl <em>Functor Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.FunctorTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFunctorTerm()
	 * @generated
	 */
	int FUNCTOR_TERM = 1;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_TERM__FUNCTOR = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_TERM__ARGUMENTS = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functor Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.StringTermImpl <em>String Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.StringTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getStringTerm()
	 * @generated
	 */
	int STRING_TERM = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TERM__VALUE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.NumberTerm <em>Number Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.NumberTerm
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getNumberTerm()
	 * @generated
	 */
	int NUMBER_TERM = 3;

	/**
	 * The number of structural features of the '<em>Number Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.FloatTermImpl <em>Float Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.FloatTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFloatTerm()
	 * @generated
	 */
	int FLOAT_TERM = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TERM__VALUE = NUMBER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TERM_FEATURE_COUNT = NUMBER_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.IntegerTermImpl <em>Integer Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.IntegerTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getIntegerTerm()
	 * @generated
	 */
	int INTEGER_TERM = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TERM__VALUE = NUMBER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TERM_FEATURE_COUNT = NUMBER_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.ListTermImpl <em>List Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.ListTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getListTerm()
	 * @generated
	 */
	int LIST_TERM = 7;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.FunctionTermImpl <em>Function Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.FunctionTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFunctionTerm()
	 * @generated
	 */
	int FUNCTION_TERM = 8;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.LongTermImpl <em>Long Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.LongTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getLongTerm()
	 * @generated
	 */
	int LONG_TERM = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TERM__VALUE = NUMBER_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TERM_FEATURE_COUNT = NUMBER_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM__ELEMENTS = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM__FUNCTION = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.ReferenceTermImpl <em>Reference Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.ReferenceTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getReferenceTerm()
	 * @generated
	 */
	int REFERENCE_TERM = 9;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TERM__REFERENCE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.ContainerTermImpl <em>Container Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.ContainerTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getContainerTerm()
	 * @generated
	 */
	int CONTAINER_TERM = 10;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TERM__CONTAINMENT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.BoolTermImpl <em>Bool Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.BoolTermImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getBoolTerm()
	 * @generated
	 */
	int BOOL_TERM = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM__VALUE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.terms.impl.TermVariableImpl <em>Term Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.terms.impl.TermVariableImpl
	 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getTermVariable()
	 * @generated
	 */
	int TERM_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VARIABLE__ID = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.FunctorTerm <em>Functor Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.FunctorTerm
	 * @generated
	 */
	EClass getFunctorTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.FunctorTerm#getFunctor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functor</em>'.
	 * @see org.tud.inf.st.mbt.terms.FunctorTerm#getFunctor()
	 * @see #getFunctorTerm()
	 * @generated
	 */
	EAttribute getFunctorTerm_Functor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.terms.FunctorTerm#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.tud.inf.st.mbt.terms.FunctorTerm#getArguments()
	 * @see #getFunctorTerm()
	 * @generated
	 */
	EReference getFunctorTerm_Arguments();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.StringTerm <em>String Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.StringTerm
	 * @generated
	 */
	EClass getStringTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.StringTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.terms.StringTerm#getValue()
	 * @see #getStringTerm()
	 * @generated
	 */
	EAttribute getStringTerm_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.NumberTerm <em>Number Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.NumberTerm
	 * @generated
	 */
	EClass getNumberTerm();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.FloatTerm <em>Float Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.FloatTerm
	 * @generated
	 */
	EClass getFloatTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.FloatTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.terms.FloatTerm#getValue()
	 * @see #getFloatTerm()
	 * @generated
	 */
	EAttribute getFloatTerm_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.IntegerTerm <em>Integer Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.IntegerTerm
	 * @generated
	 */
	EClass getIntegerTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.IntegerTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.terms.IntegerTerm#getValue()
	 * @see #getIntegerTerm()
	 * @generated
	 */
	EAttribute getIntegerTerm_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.ListTerm <em>List Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.ListTerm
	 * @generated
	 */
	EClass getListTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.terms.ListTerm#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.mbt.terms.ListTerm#getElements()
	 * @see #getListTerm()
	 * @generated
	 */
	EReference getListTerm_Elements();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.FunctionTerm <em>Function Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.FunctionTerm
	 * @generated
	 */
	EClass getFunctionTerm();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.terms.FunctionTerm#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.tud.inf.st.mbt.terms.FunctionTerm#getFunction()
	 * @see #getFunctionTerm()
	 * @generated
	 */
	EReference getFunctionTerm_Function();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.ReferenceTerm <em>Reference Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.ReferenceTerm
	 * @generated
	 */
	EClass getReferenceTerm();

	/**
	 * Returns the meta object for the reference '{@link org.tud.inf.st.mbt.terms.ReferenceTerm#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.tud.inf.st.mbt.terms.ReferenceTerm#getReference()
	 * @see #getReferenceTerm()
	 * @generated
	 */
	EReference getReferenceTerm_Reference();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.ContainerTerm <em>Container Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.ContainerTerm
	 * @generated
	 */
	EClass getContainerTerm();

	/**
	 * Returns the meta object for the containment reference '{@link org.tud.inf.st.mbt.terms.ContainerTerm#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containment</em>'.
	 * @see org.tud.inf.st.mbt.terms.ContainerTerm#getContainment()
	 * @see #getContainerTerm()
	 * @generated
	 */
	EReference getContainerTerm_Containment();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.BoolTerm <em>Bool Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.BoolTerm
	 * @generated
	 */
	EClass getBoolTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.BoolTerm#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.terms.BoolTerm#isValue()
	 * @see #getBoolTerm()
	 * @generated
	 */
	EAttribute getBoolTerm_Value();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.TermVariable <em>Term Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Variable</em>'.
	 * @see org.tud.inf.st.mbt.terms.TermVariable
	 * @generated
	 */
	EClass getTermVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.TermVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tud.inf.st.mbt.terms.TermVariable#getId()
	 * @see #getTermVariable()
	 * @generated
	 */
	EAttribute getTermVariable_Id();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.terms.LongTerm <em>Long Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Term</em>'.
	 * @see org.tud.inf.st.mbt.terms.LongTerm
	 * @generated
	 */
	EClass getLongTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.terms.LongTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tud.inf.st.mbt.terms.LongTerm#getValue()
	 * @see #getLongTerm()
	 * @generated
	 */
	EAttribute getLongTerm_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.FunctorTermImpl <em>Functor Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.FunctorTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFunctorTerm()
		 * @generated
		 */
		EClass FUNCTOR_TERM = eINSTANCE.getFunctorTerm();

		/**
		 * The meta object literal for the '<em><b>Functor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTOR_TERM__FUNCTOR = eINSTANCE.getFunctorTerm_Functor();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR_TERM__ARGUMENTS = eINSTANCE.getFunctorTerm_Arguments();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.Term <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.Term
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.StringTermImpl <em>String Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.StringTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getStringTerm()
		 * @generated
		 */
		EClass STRING_TERM = eINSTANCE.getStringTerm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TERM__VALUE = eINSTANCE.getStringTerm_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.NumberTerm <em>Number Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.NumberTerm
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getNumberTerm()
		 * @generated
		 */
		EClass NUMBER_TERM = eINSTANCE.getNumberTerm();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.FloatTermImpl <em>Float Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.FloatTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFloatTerm()
		 * @generated
		 */
		EClass FLOAT_TERM = eINSTANCE.getFloatTerm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TERM__VALUE = eINSTANCE.getFloatTerm_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.IntegerTermImpl <em>Integer Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.IntegerTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getIntegerTerm()
		 * @generated
		 */
		EClass INTEGER_TERM = eINSTANCE.getIntegerTerm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TERM__VALUE = eINSTANCE.getIntegerTerm_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.ListTermImpl <em>List Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.ListTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getListTerm()
		 * @generated
		 */
		EClass LIST_TERM = eINSTANCE.getListTerm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TERM__ELEMENTS = eINSTANCE.getListTerm_Elements();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.FunctionTermImpl <em>Function Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.FunctionTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getFunctionTerm()
		 * @generated
		 */
		EClass FUNCTION_TERM = eINSTANCE.getFunctionTerm();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TERM__FUNCTION = eINSTANCE.getFunctionTerm_Function();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.ReferenceTermImpl <em>Reference Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.ReferenceTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getReferenceTerm()
		 * @generated
		 */
		EClass REFERENCE_TERM = eINSTANCE.getReferenceTerm();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TERM__REFERENCE = eINSTANCE.getReferenceTerm_Reference();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.ContainerTermImpl <em>Container Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.ContainerTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getContainerTerm()
		 * @generated
		 */
		EClass CONTAINER_TERM = eINSTANCE.getContainerTerm();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TERM__CONTAINMENT = eINSTANCE.getContainerTerm_Containment();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.BoolTermImpl <em>Bool Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.BoolTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getBoolTerm()
		 * @generated
		 */
		EClass BOOL_TERM = eINSTANCE.getBoolTerm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_TERM__VALUE = eINSTANCE.getBoolTerm_Value();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.TermVariableImpl <em>Term Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.TermVariableImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getTermVariable()
		 * @generated
		 */
		EClass TERM_VARIABLE = eINSTANCE.getTermVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_VARIABLE__ID = eINSTANCE.getTermVariable_Id();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.terms.impl.LongTermImpl <em>Long Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.terms.impl.LongTermImpl
		 * @see org.tud.inf.st.mbt.terms.impl.TermsPackageImpl#getLongTerm()
		 * @generated
		 */
		EClass LONG_TERM = eINSTANCE.getLongTerm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_TERM__VALUE = eINSTANCE.getLongTerm_Value();

	}

} //TermsPackage
