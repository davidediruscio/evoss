 package Wires.impl;
 
 import Wires.ModelType;
import Wires.WiresPackage;
 import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
 
 public class ModelTypeImpl extends DataTypeImpl
   implements ModelType
 {
   protected static final String URI_EDEFAULT = null;
 
   protected String uri = URI_EDEFAULT;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.MODEL_TYPE;
   }
 
   public String getUri()
   {
     return this.uri;
   }
 
   public void setUri(String newUri)
   {
     String oldUri = this.uri;
     this.uri = newUri;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 4, oldUri, this.uri));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 4:
       return getUri();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 4:
       setUri((String)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 4:
       setUri(URI_EDEFAULT);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 4:
       return this.uri != null;
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (uri: ");
     result.append(this.uri);
     result.append(')');
     return result.toString();
   }
 }
