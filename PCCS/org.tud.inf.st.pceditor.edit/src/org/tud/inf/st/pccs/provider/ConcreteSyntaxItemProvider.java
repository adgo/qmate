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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pccs.PccsFactory;
import org.tud.inf.st.pccs.PccsPackage;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.pccs.ConcreteSyntax} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteSyntaxItemProvider
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
	public ConcreteSyntaxItemProvider(AdapterFactory adapterFactory) {
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

			addStartwithPropertyDescriptor(object);
			addMultiLineCommentIndicationStartPropertyDescriptor(object);
			addMultiLineCommentIndicationEndPropertyDescriptor(object);
			addSingleLineCommentIndicationStartPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Startwith feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartwithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConcreteSyntax_startwith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConcreteSyntax_startwith_feature", "_UI_ConcreteSyntax_type"),
				 PccsPackage.Literals.CONCRETE_SYNTAX__STARTWITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Line Comment Indication Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiLineCommentIndicationStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConcreteSyntax_multiLineCommentIndicationStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConcreteSyntax_multiLineCommentIndicationStart_feature", "_UI_ConcreteSyntax_type"),
				 PccsPackage.Literals.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Line Comment Indication End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiLineCommentIndicationEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConcreteSyntax_multiLineCommentIndicationEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConcreteSyntax_multiLineCommentIndicationEnd_feature", "_UI_ConcreteSyntax_type"),
				 PccsPackage.Literals.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Single Line Comment Indication Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingleLineCommentIndicationStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConcreteSyntax_singleLineCommentIndicationStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConcreteSyntax_singleLineCommentIndicationStart_feature", "_UI_ConcreteSyntax_type"),
				 PccsPackage.Literals.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConcreteSyntax_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConcreteSyntax_id_feature", "_UI_ConcreteSyntax_type"),
				 PccsPackage.Literals.CONCRETE_SYNTAX__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PccsPackage.Literals.CONCRETE_SYNTAX__OPERATORS);
			childrenFeatures.add(PccsPackage.Literals.CONCRETE_SYNTAX__KEYWORDS);
			childrenFeatures.add(PccsPackage.Literals.CONCRETE_SYNTAX__PARSERS);
			childrenFeatures.add(PccsPackage.Literals.CONCRETE_SYNTAX__METAMODELS);
			childrenFeatures.add(PccsPackage.Literals.CONCRETE_SYNTAX__REGEX);
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
	 * This returns ConcreteSyntax.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConcreteSyntax"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ConcreteSyntax)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ConcreteSyntax_type") :
			getString("_UI_ConcreteSyntax_type") + " " + label;
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

		switch (notification.getFeatureID(ConcreteSyntax.class)) {
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_START:
			case PccsPackage.CONCRETE_SYNTAX__MULTI_LINE_COMMENT_INDICATION_END:
			case PccsPackage.CONCRETE_SYNTAX__SINGLE_LINE_COMMENT_INDICATION_START:
			case PccsPackage.CONCRETE_SYNTAX__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PccsPackage.CONCRETE_SYNTAX__OPERATORS:
			case PccsPackage.CONCRETE_SYNTAX__KEYWORDS:
			case PccsPackage.CONCRETE_SYNTAX__PARSERS:
			case PccsPackage.CONCRETE_SYNTAX__METAMODELS:
			case PccsPackage.CONCRETE_SYNTAX__REGEX:
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
				(PccsPackage.Literals.CONCRETE_SYNTAX__OPERATORS,
				 PccsFactory.eINSTANCE.createTerminal()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.CONCRETE_SYNTAX__KEYWORDS,
				 PccsFactory.eINSTANCE.createTerminal()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.CONCRETE_SYNTAX__PARSERS,
				 PccsFactory.eINSTANCE.createParserDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.CONCRETE_SYNTAX__METAMODELS,
				 PccsFactory.eINSTANCE.createMetaModel()));

		newChildDescriptors.add
			(createChildParameter
				(PccsPackage.Literals.CONCRETE_SYNTAX__REGEX,
				 PccsFactory.eINSTANCE.createRegularExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PccsPackage.Literals.CONCRETE_SYNTAX__OPERATORS ||
			childFeature == PccsPackage.Literals.CONCRETE_SYNTAX__KEYWORDS;

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
	public ResourceLocator getResourceLocator() {
		return PccsEditPlugin.INSTANCE;
	}

}
