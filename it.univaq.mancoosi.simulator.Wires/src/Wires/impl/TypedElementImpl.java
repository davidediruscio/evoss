 package Wires.impl;
 
 import Wires.Type;
 import Wires.TypedElement;
import Wires.WiresPackage;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
 
 public abstract class TypedElementImpl extends ConnectableElementImpl
   implements TypedElement
 {
   protected Type type;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.TYPED_ELEMENT;
   }
 
   public Type getType()
   {
     if ((this.type != null) && (this.type.eIsProxy())) {
       InternalEObject oldType = (InternalEObject)this.type;
       this.type = ((Type)eResolveProxy(oldType));
       if ((this.type != oldType) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 3, oldType, this.type));
       }
     }
     return this.type;
   }
 
   public Type basicGetType()
   {
     return this.type;
   }
 
   public void setType(Type newType)
   {
     Type oldType = this.type;
     this.type = newType;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 3, oldType, this.type));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 3:
       if (resolve) return getType();
       return basicGetType();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 3:
       setType((Type)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 3:
       setType(null);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 3:
       return this.type != null;
     }
     return super.eIsSet(featureID);
   }
 }
