/**
 */
package organisations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;
import org.eclipse.jwt.meta.model.organisations.Role;

import organisations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see organisations.OrganisationsPackage
 * @generated
 */
public class OrganisationsAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static OrganisationsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OrganisationsAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = OrganisationsPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected OrganisationsSwitch<Adapter> modelSwitch =
      new OrganisationsSwitch<Adapter>() {
         @Override
         public Adapter caseRole(Role object) {
            return createRoleAdapter();
         }
         @Override
         public Adapter caseOrganisationUnit(OrganisationUnit object) {
            return createOrganisationUnitAdapter();
         }
         @Override
         public Adapter caseModelElement(ModelElement object) {
            return createModelElementAdapter();
         }
         @Override
         public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
         }
         @Override
         public Adapter casePackageableElement(PackageableElement object) {
            return createPackageableElementAdapter();
         }
         @Override
         public Adapter caseReferenceableElement(ReferenceableElement object) {
            return createReferenceableElementAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.organisations.Role <em>Role</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.organisations.Role
    * @generated
    */
   public Adapter createRoleAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit <em>Organisation Unit</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit
    * @generated
    */
   public Adapter createOrganisationUnitAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.ModelElement <em>Model Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.ModelElement
    * @generated
    */
   public Adapter createModelElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.PackageableElement <em>Packageable Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.PackageableElement
    * @generated
    */
   public Adapter createPackageableElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.jwt.meta.model.core.ReferenceableElement <em>Referenceable Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.jwt.meta.model.core.ReferenceableElement
    * @generated
    */
   public Adapter createReferenceableElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //OrganisationsAdapterFactory
