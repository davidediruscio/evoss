 package Wires.impl;
 
 import Wires.Type;
import Wires.WiresPackage;
 import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
 
 public abstract class TypeImpl extends ConnectableElementImpl
   implements Type
 {
   protected static final String PATH_EDEFAULT = null;
 
   protected String path = PATH_EDEFAULT;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.TYPE;
   }
 
   public String getPath()
   {
     return this.path;
   }
 
   public void setPath(String newPath)
   {
     String oldPath = this.path;
     this.path = newPath;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 3, oldPath, this.path));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 3:
       return getPath();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 3:
       setPath((String)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 3:
       setPath(PATH_EDEFAULT);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 3:
       return this.path != null;
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (path: ");
     result.append(this.path);
     result.append(')');
     return result.toString();
   }
 }
