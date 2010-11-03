 package Wires.impl;
 
 import Wires.Library;
 import Wires.LibraryRef;
import Wires.WiresPackage;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
 
 public class LibraryRefImpl extends EObjectImpl
   implements LibraryRef
 {
   protected Library library;
   protected static final String NAME_EDEFAULT = null;
 
   protected String name = NAME_EDEFAULT;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.LIBRARY_REF;
   }
 
   public Library getLibrary()
   {
     if ((this.library != null) && (this.library.eIsProxy())) {
       InternalEObject oldLibrary = (InternalEObject)this.library;
       this.library = ((Library)eResolveProxy(oldLibrary));
       if ((this.library != oldLibrary) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 0, oldLibrary, this.library));
       }
     }
     return this.library;
   }
 
   public Library basicGetLibrary()
   {
     return this.library;
   }
 
   public void setLibrary(Library newLibrary)
   {
     Library oldLibrary = this.library;
     this.library = newLibrary;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 0, oldLibrary, this.library));
   }
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String newName)
   {
     String oldName = this.name;
     this.name = newName;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 1, oldName, this.name));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 0:
       if (resolve) return getLibrary();
       return basicGetLibrary();
     case 1:
       return getName();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 0:
       setLibrary((Library)newValue);
       return;
     case 1:
       setName((String)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 0:
       setLibrary(null);
       return;
     case 1:
       setName(NAME_EDEFAULT);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 0:
       return this.library != null;
     case 1:
       return this.name != null;
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (name: ");
     result.append(this.name);
     result.append(')');
     return result.toString();
   }
 }
