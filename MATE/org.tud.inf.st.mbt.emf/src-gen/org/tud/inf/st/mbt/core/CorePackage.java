/**
 */
package org.tud.inf.st.mbt.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.tud.inf.st.mbt.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.tud.inf.st.mbt.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl <em>Abstract Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl
	 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getAbstractModelElement()
	 * @generated
	 */
	int ABSTRACT_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENT__NOTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Abstract Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.core.impl.GenericModelContainerImpl <em>Generic Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.core.impl.GenericModelContainerImpl
	 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getGenericModelContainer()
	 * @generated
	 */
	int GENERIC_MODEL_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER__NOTE = ABSTRACT_MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER__ID = ABSTRACT_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER__TRACEABLE_TO = ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER__NAME = ABSTRACT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER__ELEMENTS = ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MODEL_CONTAINER_FEATURE_COUNT = ABSTRACT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.core.ITopLevelElement <em>ITop Level Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.core.ITopLevelElement
	 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getITopLevelElement()
	 * @generated
	 */
	int ITOP_LEVEL_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>ITop Level Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITOP_LEVEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.core.IContextVariable <em>IContext Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.core.IContextVariable
	 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getIContextVariable()
	 * @generated
	 */
	int ICONTEXT_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>IContext Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTEXT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.core.CausalLinkType <em>Causal Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getCausalLinkType()
	 * @generated
	 */
	int CAUSAL_LINK_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.core.AbstractModelElement <em>Abstract Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Model Element</em>'.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement
	 * @generated
	 */
	EClass getAbstractModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement#getNote()
	 * @see #getAbstractModelElement()
	 * @generated
	 */
	EAttribute getAbstractModelElement_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement#getId()
	 * @see #getAbstractModelElement()
	 * @generated
	 */
	EAttribute getAbstractModelElement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getTraceableTo <em>Traceable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceable To</em>'.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement#getTraceableTo()
	 * @see #getAbstractModelElement()
	 * @generated
	 */
	EReference getAbstractModelElement_TraceableTo();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.core.AbstractModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement#getName()
	 * @see #getAbstractModelElement()
	 * @generated
	 */
	EAttribute getAbstractModelElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.core.GenericModelContainer <em>Generic Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Model Container</em>'.
	 * @see org.tud.inf.st.mbt.core.GenericModelContainer
	 * @generated
	 */
	EClass getGenericModelContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.core.GenericModelContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.tud.inf.st.mbt.core.GenericModelContainer#getElements()
	 * @see #getGenericModelContainer()
	 * @generated
	 */
	EReference getGenericModelContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.core.ITopLevelElement <em>ITop Level Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITop Level Element</em>'.
	 * @see org.tud.inf.st.mbt.core.ITopLevelElement
	 * @generated
	 */
	EClass getITopLevelElement();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.core.IContextVariable <em>IContext Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IContext Variable</em>'.
	 * @see org.tud.inf.st.mbt.core.IContextVariable
	 * @generated
	 */
	EClass getIContextVariable();

	/**
	 * Returns the meta object for enum '{@link org.tud.inf.st.mbt.core.CausalLinkType <em>Causal Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Causal Link Type</em>'.
	 * @see org.tud.inf.st.mbt.core.CausalLinkType
	 * @generated
	 */
	EEnum getCausalLinkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl <em>Abstract Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl
		 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getAbstractModelElement()
		 * @generated
		 */
		EClass ABSTRACT_MODEL_ELEMENT = eINSTANCE.getAbstractModelElement();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODEL_ELEMENT__NOTE = eINSTANCE.getAbstractModelElement_Note();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODEL_ELEMENT__ID = eINSTANCE.getAbstractModelElement_Id();

		/**
		 * The meta object literal for the '<em><b>Traceable To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO = eINSTANCE.getAbstractModelElement_TraceableTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODEL_ELEMENT__NAME = eINSTANCE.getAbstractModelElement_Name();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.core.impl.GenericModelContainerImpl <em>Generic Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.core.impl.GenericModelContainerImpl
		 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getGenericModelContainer()
		 * @generated
		 */
		EClass GENERIC_MODEL_CONTAINER = eINSTANCE.getGenericModelContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MODEL_CONTAINER__ELEMENTS = eINSTANCE.getGenericModelContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.core.ITopLevelElement <em>ITop Level Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.core.ITopLevelElement
		 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getITopLevelElement()
		 * @generated
		 */
		EClass ITOP_LEVEL_ELEMENT = eINSTANCE.getITopLevelElement();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.core.IContextVariable <em>IContext Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.core.IContextVariable
		 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getIContextVariable()
		 * @generated
		 */
		EClass ICONTEXT_VARIABLE = eINSTANCE.getIContextVariable();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.core.CausalLinkType <em>Causal Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.core.CausalLinkType
		 * @see org.tud.inf.st.mbt.core.impl.CorePackageImpl#getCausalLinkType()
		 * @generated
		 */
		EEnum CAUSAL_LINK_TYPE = eINSTANCE.getCausalLinkType();

	}

} //CorePackage
