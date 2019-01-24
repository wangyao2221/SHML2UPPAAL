/**
 */
package TSHS_Ecore.provider;


import TSHS_Ecore.TSHS;
import TSHS_Ecore.TSHS_EcoreFactory;
import TSHS_Ecore.TSHS_EcorePackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TSHS_Ecore.TSHS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TSHSItemProvider 
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
	public TSHSItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addInitialstatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TSHS_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TSHS_name_feature", "_UI_TSHS_type"),
				 TSHS_EcorePackage.Literals.TSHS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TSHS_initialstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TSHS_initialstate_feature", "_UI_TSHS_type"),
				 TSHS_EcorePackage.Literals.TSHS__INITIALSTATE,
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
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__OWNEDODES);
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__LOCALVARIABLES);
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__LOCALEVENTS);
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__LOCALCLOCK);
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__OWNEDTRANSITIONS);
			childrenFeatures.add(TSHS_EcorePackage.Literals.TSHS__OWNEDSTATES);
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
	 * This returns TSHS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TSHS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TSHS)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TSHS_type") :
			getString("_UI_TSHS_type") + " " + label;
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

		switch (notification.getFeatureID(TSHS.class)) {
			case TSHS_EcorePackage.TSHS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TSHS_EcorePackage.TSHS__OWNEDODES:
			case TSHS_EcorePackage.TSHS__LOCALVARIABLES:
			case TSHS_EcorePackage.TSHS__LOCALEVENTS:
			case TSHS_EcorePackage.TSHS__LOCALCLOCK:
			case TSHS_EcorePackage.TSHS__OWNEDTRANSITIONS:
			case TSHS_EcorePackage.TSHS__OWNEDSTATES:
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
				(TSHS_EcorePackage.Literals.TSHS__OWNEDODES,
				 TSHS_EcoreFactory.eINSTANCE.createODE()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__LOCALVARIABLES,
				 TSHS_EcoreFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__LOCALEVENTS,
				 TSHS_EcoreFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__LOCALCLOCK,
				 TSHS_EcoreFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__OWNEDTRANSITIONS,
				 TSHS_EcoreFactory.eINSTANCE.createComTransition()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__OWNEDTRANSITIONS,
				 TSHS_EcoreFactory.eINSTANCE.createProbTransition()));

		newChildDescriptors.add
			(createChildParameter
				(TSHS_EcorePackage.Literals.TSHS__OWNEDSTATES,
				 TSHS_EcoreFactory.eINSTANCE.createState()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TSHS_EcoreEditPlugin.INSTANCE;
	}

}
