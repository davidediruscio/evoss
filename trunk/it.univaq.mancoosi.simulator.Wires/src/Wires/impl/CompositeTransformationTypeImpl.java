 package Wires.impl;
 
 import Wires.CompositeTransformationType;
 import Wires.WiresElement;
 import Wires.WiresPackage;
 import Wires.WiresSpecification;
 import java.util.Collection;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
 import org.eclipse.emf.ecore.util.InternalEList;
 
 public class CompositeTransformationTypeImpl extends TransformationTypeImpl
   implements CompositeTransformationType
 {
   protected EList<WiresElement> els;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.COMPOSITE_TRANSFORMATION_TYPE;
   }
 
   public EList<WiresElement> getEls()
   {
     if (this.els == null) {
       this.els = new EObjectContainmentEList(WiresElement.class, this, 7);
     }
     return this.els;
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 7:
       return ((InternalEList)getEls()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 7:
       return getEls();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 7:
       getEls().clear();
       getEls().addAll((Collection)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 7:
       getEls().clear();
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 7:
       return (this.els != null) && (!this.els.isEmpty());
     }
     return super.eIsSet(featureID);
   }
 
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
   {
     if (baseClass == WiresSpecification.class) {
       switch (derivedFeatureID) { case 7:
         return 0; }
       return -1;
     }
 
     return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }
 
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
   {
     if (baseClass == WiresSpecification.class) {
       switch (baseFeatureID) { case 0:
         return 7; }
       return -1;
     }
 
     return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }
 }
