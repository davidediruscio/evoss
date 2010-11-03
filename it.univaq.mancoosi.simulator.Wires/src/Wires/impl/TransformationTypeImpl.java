 package Wires.impl;
 
 import Wires.InputFormalParameter;
 import Wires.LibraryRef;
 import Wires.OutputFormalParameter;
 import Wires.TransformationType;
import Wires.WiresPackage;
 import java.util.Collection;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
 
 public abstract class TransformationTypeImpl extends TypeImpl
   implements TransformationType
 {
   protected EList<OutputFormalParameter> outParams;
   protected EList<LibraryRef> libraries;
   protected EList<InputFormalParameter> inParams;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.TRANSFORMATION_TYPE;
   }
 
   public EList<OutputFormalParameter> getOutParams()
   {
     if (this.outParams == null) {
       this.outParams = new EObjectContainmentEList(OutputFormalParameter.class, this, 4);
     }
     return this.outParams;
   }
 
   public EList<LibraryRef> getLibraries()
   {
     if (this.libraries == null) {
       this.libraries = new EObjectContainmentEList(LibraryRef.class, this, 5);
     }
     return this.libraries;
   }
 
   public EList<InputFormalParameter> getInParams()
   {
     if (this.inParams == null) {
       this.inParams = new EObjectContainmentEList(InputFormalParameter.class, this, 6);
     }
     return this.inParams;
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 4:
       return ((InternalEList)getOutParams()).basicRemove(otherEnd, msgs);
     case 5:
       return ((InternalEList)getLibraries()).basicRemove(otherEnd, msgs);
     case 6:
       return ((InternalEList)getInParams()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 4:
       return getOutParams();
     case 5:
       return getLibraries();
     case 6:
       return getInParams();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 4:
       getOutParams().clear();
       getOutParams().addAll((Collection)newValue);
       return;
     case 5:
       getLibraries().clear();
       getLibraries().addAll((Collection)newValue);
       return;
     case 6:
       getInParams().clear();
       getInParams().addAll((Collection)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 4:
       getOutParams().clear();
       return;
     case 5:
       getLibraries().clear();
       return;
     case 6:
       getInParams().clear();
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 4:
       return (this.outParams != null) && (!this.outParams.isEmpty());
     case 5:
       return (this.libraries != null) && (!this.libraries.isEmpty());
     case 6:
       return (this.inParams != null) && (!this.inParams.isEmpty());
     }
     return super.eIsSet(featureID);
   }
 }
