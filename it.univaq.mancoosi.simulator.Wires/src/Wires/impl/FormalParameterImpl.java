 package Wires.impl;
 
 import Wires.DataType;
 import Wires.FormalParameter;
 import Wires.Model;
 import Wires.ModelType;
import Wires.WiresPackage;
 import Wires.exep.MetamodelNotFoundException;
 import Wires.exep.ResourceNotFoundException;
 import org.eclipse.emf.common.util.URI;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.EObject;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
 import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
 import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
 
 public abstract class FormalParameterImpl extends TypeImpl
   implements FormalParameter
 {
   ASMModel model;
   ASMModel metamodel;
   ASMOclAny basicDataValue;
   String modelPath;
   protected DataType typeEl;
   protected static final String TYPE_NAME_EDEFAULT = null;
 
   protected String typeName = TYPE_NAME_EDEFAULT;
 
   public String getModelPath()
   {
     return this.modelPath;
   }
 
   public void setModelPath(String modelPath) {
     this.modelPath = modelPath;
   }
 
   public ASMModel getModel() {
     return this.model;
   }
 
   public ASMModel getMetamodel() {
     return this.metamodel;
   }
 
   public ASMOclAny getBasicDataValue() {
     return this.basicDataValue;
   }
 
   public void setBasicDataValue(ASMOclAny newValue) {
     this.basicDataValue = newValue;
   }
 
   public void loadMetamodel()
   {
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     if (getTypeEl() == null) {
       throw new MetamodelNotFoundException(this);
     }
     String metamodelPath = getTypeEl().getPath();
 
     if ((getTypeEl().getPath() != null) && (!getTypeEl().getPath().equals("")))
     {
	       URI metamodelResource;
       try {
         metamodelResource = URI.createFileURI(metamodelPath);
       }
       catch (Exception localException)
       {

         throw new ResourceNotFoundException(getTypeEl());
       }
       String mmName = getTypeName();
       this.metamodel = modelHandler.loadModel(mmName, modelHandler.getMof(), metamodelResource);
     } else {
       metamodelPath = ((ModelType)getTypeEl()).getUri();
 
       if ((metamodelPath != null) && (!metamodelPath.trim().equals(""))) {
         String mmName = getTypeName();
         this.metamodel = modelHandler.loadModel(mmName, modelHandler.getMof(), "uri:" + metamodelPath);
       }
       else {
         String metamodelName = getTypeEl().getName();
 
         EObject o = this;
         while (!(o instanceof WiresSpecificationImpl)) {
           o = o.eContainer();
         }
 
         Model m = ((WiresSpecificationImpl)o).getModelByName(metamodelName);
         if (m == null)
           throw new MetamodelNotFoundException(this);
         String modelPath = m.getPath();
         URI modelResource = URI.createFileURI(modelPath);
         String modelName = m.getName();
         this.metamodel = modelHandler.loadModel(modelName, modelHandler.getMof(), modelResource);
       }
     }
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.FORMAL_PARAMETER;
   }
 
   public DataType getTypeEl()
   {
     if ((this.typeEl != null) && (this.typeEl.eIsProxy())) {
       InternalEObject oldTypeEl = (InternalEObject)this.typeEl;
       this.typeEl = ((DataType)eResolveProxy(oldTypeEl));
       if ((this.typeEl != oldTypeEl) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 4, oldTypeEl, this.typeEl));
       }
     }
     return this.typeEl;
   }
 
   public DataType basicGetTypeEl()
   {
     return this.typeEl;
   }
 
   public void setTypeEl(DataType newTypeEl)
   {
     DataType oldTypeEl = this.typeEl;
     this.typeEl = newTypeEl;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 4, oldTypeEl, this.typeEl));
   }
 
   public String getTypeName()
   {
     return this.typeName;
   }
 
   public void setTypeName(String newTypeName)
   {
     String oldTypeName = this.typeName;
     this.typeName = newTypeName;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 5, oldTypeName, this.typeName));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 4:
       if (resolve) return getTypeEl();
       return basicGetTypeEl();
     case 5:
       return getTypeName();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 4:
       setTypeEl((DataType)newValue);
       return;
     case 5:
       setTypeName((String)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 4:
       setTypeEl(null);
       return;
     case 5:
       setTypeName(TYPE_NAME_EDEFAULT);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 4:
       return this.typeEl != null;
     case 5:
       return this.typeName != null;
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (typeName: ");
     result.append(this.typeName);
     result.append(')');
     return result.toString();
   }
 }
