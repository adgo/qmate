/**
 */
package org.tud.inf.st.mbt.functions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;

import org.tud.inf.st.mbt.functions.BagIdxFunction;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.functions.BagIdxFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BagIdxFunctionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagIdxFunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBagPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BagIdxFunction_bag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BagIdxFunction_bag_feature", "_UI_BagIdxFunction_type"),
				 FunctionsPackage.Literals.BAG_IDX_FUNCTION__BAG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BagIdxFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BagIdxFunction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BagIdxFunction_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BagIdxFunction.class)) {
			case FunctionsPackage.BAG_IDX_FUNCTION__NEEDLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createValueReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createValueFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BAG_IDX_FUNCTION__NEEDLE,
				 FunctionsFactory.eINSTANCE.createValueCaseFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AllEditPlugin.INSTANCE;
	}

}
