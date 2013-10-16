/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.mbt.graphical;

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
 * @see org.tud.inf.st.mbt.graphical.GraphicalFactory
 * @model kind="package"
 * @generated
 */
public interface GraphicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://st.inf.tud.org/mbt/graphical#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicalPackage eINSTANCE = org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalDescription()
	 * @generated
	 */
	int GRAPHICAL_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_DESCRIPTION__NODES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_DESCRIPTION__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl <em>Node Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalNodeDefinition()
	 * @generated
	 */
	int GRAPHICAL_NODE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION__REFERENCE_ID = 4;

	/**
	 * The number of structural features of the '<em>Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_NODE_DEFINITION_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl <em>Connection Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalConnectionDefinition()
	 * @generated
	 */
	int GRAPHICAL_CONNECTION_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS = 1;

	/**
	 * The number of structural features of the '<em>Connection Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONNECTION_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tud.inf.st.mbt.graphical.impl.BendpointImpl <em>Bendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tud.inf.st.mbt.graphical.impl.BendpointImpl
	 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getBendpoint()
	 * @generated
	 */
	int BENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINT__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Bendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.graphical.GraphicalDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalDescription
	 * @generated
	 */
	EClass getGraphicalDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.graphical.GraphicalDescription#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalDescription#getNodes()
	 * @see #getGraphicalDescription()
	 * @generated
	 */
	EReference getGraphicalDescription_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.graphical.GraphicalDescription#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalDescription#getConnections()
	 * @see #getGraphicalDescription()
	 * @generated
	 */
	EReference getGraphicalDescription_Connections();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Definition</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition
	 * @generated
	 */
	EClass getGraphicalNodeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getX()
	 * @see #getGraphicalNodeDefinition()
	 * @generated
	 */
	EAttribute getGraphicalNodeDefinition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getY()
	 * @see #getGraphicalNodeDefinition()
	 * @generated
	 */
	EAttribute getGraphicalNodeDefinition_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getWidth()
	 * @see #getGraphicalNodeDefinition()
	 * @generated
	 */
	EAttribute getGraphicalNodeDefinition_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getHeight()
	 * @see #getGraphicalNodeDefinition()
	 * @generated
	 */
	EAttribute getGraphicalNodeDefinition_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getReferenceId <em>Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Id</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalNodeDefinition#getReferenceId()
	 * @see #getGraphicalNodeDefinition()
	 * @generated
	 */
	EAttribute getGraphicalNodeDefinition_ReferenceId();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition <em>Connection Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Definition</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition
	 * @generated
	 */
	EClass getGraphicalConnectionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getReferenceId <em>Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Id</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getReferenceId()
	 * @see #getGraphicalConnectionDefinition()
	 * @generated
	 */
	EAttribute getGraphicalConnectionDefinition_ReferenceId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see org.tud.inf.st.mbt.graphical.GraphicalConnectionDefinition#getBendpoints()
	 * @see #getGraphicalConnectionDefinition()
	 * @generated
	 */
	EReference getGraphicalConnectionDefinition_Bendpoints();

	/**
	 * Returns the meta object for class '{@link org.tud.inf.st.mbt.graphical.Bendpoint <em>Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bendpoint</em>'.
	 * @see org.tud.inf.st.mbt.graphical.Bendpoint
	 * @generated
	 */
	EClass getBendpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.Bendpoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tud.inf.st.mbt.graphical.Bendpoint#getX()
	 * @see #getBendpoint()
	 * @generated
	 */
	EAttribute getBendpoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.Bendpoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tud.inf.st.mbt.graphical.Bendpoint#getY()
	 * @see #getBendpoint()
	 * @generated
	 */
	EAttribute getBendpoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tud.inf.st.mbt.graphical.Bendpoint#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.tud.inf.st.mbt.graphical.Bendpoint#getIndex()
	 * @see #getBendpoint()
	 * @generated
	 */
	EAttribute getBendpoint_Index();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphicalFactory getGraphicalFactory();

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
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalDescriptionImpl
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalDescription()
		 * @generated
		 */
		EClass GRAPHICAL_DESCRIPTION = eINSTANCE.getGraphicalDescription();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_DESCRIPTION__NODES = eINSTANCE.getGraphicalDescription_Nodes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_DESCRIPTION__CONNECTIONS = eINSTANCE.getGraphicalDescription_Connections();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl <em>Node Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalNodeDefinitionImpl
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalNodeDefinition()
		 * @generated
		 */
		EClass GRAPHICAL_NODE_DEFINITION = eINSTANCE.getGraphicalNodeDefinition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_NODE_DEFINITION__X = eINSTANCE.getGraphicalNodeDefinition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_NODE_DEFINITION__Y = eINSTANCE.getGraphicalNodeDefinition_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_NODE_DEFINITION__WIDTH = eINSTANCE.getGraphicalNodeDefinition_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_NODE_DEFINITION__HEIGHT = eINSTANCE.getGraphicalNodeDefinition_Height();

		/**
		 * The meta object literal for the '<em><b>Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_NODE_DEFINITION__REFERENCE_ID = eINSTANCE.getGraphicalNodeDefinition_ReferenceId();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl <em>Connection Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalConnectionDefinitionImpl
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getGraphicalConnectionDefinition()
		 * @generated
		 */
		EClass GRAPHICAL_CONNECTION_DEFINITION = eINSTANCE.getGraphicalConnectionDefinition();

		/**
		 * The meta object literal for the '<em><b>Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_CONNECTION_DEFINITION__REFERENCE_ID = eINSTANCE.getGraphicalConnectionDefinition_ReferenceId();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_CONNECTION_DEFINITION__BENDPOINTS = eINSTANCE.getGraphicalConnectionDefinition_Bendpoints();

		/**
		 * The meta object literal for the '{@link org.tud.inf.st.mbt.graphical.impl.BendpointImpl <em>Bendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tud.inf.st.mbt.graphical.impl.BendpointImpl
		 * @see org.tud.inf.st.mbt.graphical.impl.GraphicalPackageImpl#getBendpoint()
		 * @generated
		 */
		EClass BENDPOINT = eINSTANCE.getBendpoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENDPOINT__X = eINSTANCE.getBendpoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENDPOINT__Y = eINSTANCE.getBendpoint_Y();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENDPOINT__INDEX = eINSTANCE.getBendpoint_Index();

	}

} //GraphicalPackage
