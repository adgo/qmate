/**
 */
package org.tud.inf.st.mbt.functions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;

import org.tud.inf.st.mbt.functions.BinaryFunction;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.functions.BinaryFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryFunctionItemProvider
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
	public BinaryFunctionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT);
			childrenFeatures.add(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinaryFunction_type");
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

		switch (notification.getFeatureID(BinaryFunction.class)) {
			case FunctionsPackage.BINARY_FUNCTION__LEFT:
			case FunctionsPackage.BINARY_FUNCTION__RIGHT:
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
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__LEFT,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FunctionsPackage.Literals.BINARY_FUNCTION__LEFT ||
			childFeature == FunctionsPackage.Literals.BINARY_FUNCTION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
