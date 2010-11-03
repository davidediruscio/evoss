 package Wires.impl;
 
 import Wires.Library;
 import Wires.LibraryRef;
import Wires.WiresPackage;
 import java.util.Collection;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
 
 public class LibraryImpl extends WiresElementImpl
   implements Library
 {
   protected static final String NAME_EDEFAULT = null;
 
   protected String name = NAME_EDEFAULT;
 
   protected static final String PATH_EDEFAULT = null;
 
   protected String path = PATH_EDEFAULT;
   protected EList<LibraryRef> libraries;
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.LIBRARY;
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
       eNotify(new ENotificationImpl(this, 1, 0, oldName, this.name));
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
       eNotify(new ENotificationImpl(this, 1, 1, oldPath, this.path));
   }
 
   public EList<LibraryRef> getLibraries()
   {
     if (this.libraries == null) {
       this.libraries = new EObjectContainmentEList(LibraryRef.class, this, 2);
     }
     return this.libraries;
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 2:
       return ((InternalEList)getLibraries()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 0:
       return getName();
     case 1:
       return getPath();
     case 2:
       return getLibraries();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 0:
       setName((String)newValue);
       return;
     case 1:
       setPath((String)newValue);
       return;
     case 2:
       getLibraries().clear();
       getLibraries().addAll((Collection)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 0:
       setName(NAME_EDEFAULT);
       return;
     case 1:
       setPath(PATH_EDEFAULT);
       return;
     case 2:
       getLibraries().clear();
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 0:
       return this.name != null;
     case 1:
       return this.path != null;
     case 2:
       return (this.libraries != null) && (!this.libraries.isEmpty());
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (name: ");
     result.append(this.name);
     result.append(", path: ");
     result.append(this.path);
     result.append(')');
     return result.toString();
   }
 }
