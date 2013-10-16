/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.tud.inf.st.pccs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.pccs.OrParser;
import org.tud.inf.st.pccs.PccsFactory;
import org.tud.inf.st.pccs.PccsPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.pccs.OrParser} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrParserItemProvider
	extends AbstractParserItemProvider
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
	public OrParserItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PccsPackage.Literals.OR_PARSER__PARSERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OrParser.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrParser"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((OrParser)object).getMultiplicity();
		return label == null || label.length() == 0 ?
			getString("_UI_OrParser_type") :
			getString("_UI_OrParser_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OrParser.class)) {
			case PccsPackage.OR_PARSER__PARSERS:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createOrParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createSequenceParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createTerminalParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createRefParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createIdentifierParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createStringParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createIdentityParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createIntParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createDoubleParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createFloatParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createOperatorTableParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createLongParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createBoolParser()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.OR_PARSER__PARSERS,
				 PccsFactory.eINSTANCE.createImportParser()));
	}

}
