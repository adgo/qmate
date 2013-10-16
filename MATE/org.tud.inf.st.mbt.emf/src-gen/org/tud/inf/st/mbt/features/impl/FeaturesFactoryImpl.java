/**
 */
package org.tud.inf.st.mbt.features.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.features.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturesFactoryImpl extends EFactoryImpl implements FeaturesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturesFactory init() {
		try {
			FeaturesFactory theFeaturesFactory = (FeaturesFactory)EPackage.Registry.INSTANCE.getEFactory(FeaturesPackage.eNS_URI);
			if (theFeaturesFactory != null) {
				return theFeaturesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesFactoryImpl() {
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
			case FeaturesPackage.FEATURE: return createFeature();
			case FeaturesPackage.EXPLICIT_SET: return createExplicitSet();
			case FeaturesPackage.UNION: return createUnion();
			case FeaturesPackage.INTERSECTION: return createIntersection();
			case FeaturesPackage.WITHOUT: return createWithout();
			case FeaturesPackage.SET_REFERENCE: return createSetReference();
			case FeaturesPackage.STANDALONE_FEATURE_SET: return createStandaloneFeatureSet();
			case FeaturesPackage.SUB_SET: return createSubSet();
			case FeaturesPackage.FEATURE_REFERENCE: return createFeatureReference();
			case FeaturesPackage.FEATURE_ATTRIBUTE: return createFeatureAttribute();
			case FeaturesPackage.CONFIGURATION: return createConfiguration();
			case FeaturesPackage.FEATURE_VERSION: return createFeatureVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitSet createExplicitSet() {
		ExplicitSetImpl explicitSet = new ExplicitSetImpl();
		return explicitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intersection createIntersection() {
		IntersectionImpl intersection = new IntersectionImpl();
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Without createWithout() {
		WithoutImpl without = new WithoutImpl();
		return without;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetReference createSetReference() {
		SetReferenceImpl setReference = new SetReferenceImpl();
		return setReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandaloneFeatureSet createStandaloneFeatureSet() {
		StandaloneFeatureSetImpl standaloneFeatureSet = new StandaloneFeatureSetImpl();
		return standaloneFeatureSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSet createSubSet() {
		SubSetImpl subSet = new SubSetImpl();
		return subSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureReference createFeatureReference() {
		FeatureReferenceImpl featureReference = new FeatureReferenceImpl();
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAttribute createFeatureAttribute() {
		FeatureAttributeImpl featureAttribute = new FeatureAttributeImpl();
		return featureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureVersion createFeatureVersion() {
		FeatureVersionImpl featureVersion = new FeatureVersionImpl();
		return featureVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesPackage getFeaturesPackage() {
		return (FeaturesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturesPackage getPackage() {
		return FeaturesPackage.eINSTANCE;
	}

} //FeaturesFactoryImpl
