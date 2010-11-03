 package Wires.impl;
 
 import Wires.DecisionNode;
 import Wires.InputActualParameter;
 import Wires.InputFormalParameter;
 import Wires.LibraryRef;
 import Wires.OutputActualParameter;
 import Wires.OutputFormalParameter;
 import Wires.Transformation;
 import Wires.TransformationType;
import Wires.WiresPackage;
 import Wires.exep.LibraryNotFoundException;
 import Wires.exep.ResourceNotFoundException;
 import java.io.File;
 import java.io.IOException;
 import java.net.MalformedURLException;
 import java.net.URL;
 import java.util.Collection;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
 import org.eclipse.emf.ecore.util.InternalEList;
 import org.eclipse.m2m.atl.engine.AtlCompiler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
 
 public abstract class TransformationImpl extends TypedElementImpl
   implements Transformation
 {
   private Boolean active = Boolean.valueOf(true);
   protected EList<InputActualParameter> inParams;
   protected EList<OutputActualParameter> outParams;
   protected DecisionNode controlNode;
 
   public void setActive(Boolean active)
   {
     this.active = active;
   }
 
   public Boolean getActive() {
     return this.active;
   }
 
   public Map<String, Object> getInputsMap()
   {
     Map models = new HashMap();
     List<InputActualParameter> inparam = getInParams();
     for (InputActualParameter parameter : inparam)
     {
       ASMModel metamodel = ((InputActualParameterImpl)parameter).getMetamodel();
       String metamodelName = ((InputFormalParameter)parameter.getType()).getTypeName();
       if (!models.keySet().contains(metamodelName)) {
         models.put(metamodelName, metamodel);
       }
 
       ASMModel model = ((InputActualParameterImpl)parameter).getModel();
       String modelName = parameter.getType().getName();
       models.put(modelName, model);
     }
     return models;
   }
 
   public void addOutputModels(Map<String, Object> models) {
     for (OutputActualParameter parameter : getOutParams())
     {
       ((OutputActualParameterImpl)parameter).loadMetamodel();
       ASMModel metamodel = ((OutputActualParameterImpl)parameter).getMetamodel();
       String metamodelName = ((OutputFormalParameter)parameter.getType()).getTypeName();
       if (!models.keySet().contains(metamodelName)) {
         models.put(metamodelName, metamodel);
       }
 
       ((OutputActualParameterImpl)parameter).newModel();
       ASMModel model = ((OutputActualParameterImpl)parameter).getModel();
       String modelName = parameter.getType().getName();
       models.put(modelName, model);
     }
   }
 
   public Map<String, URL> getLibMap() throws IOException {
     Map libMap = new HashMap();
     for (LibraryRef lib : ((TransformationType)getType()).getLibraries()) {
       addLibrary(lib, libMap);
     }
     return libMap;
   }
 
   private void addLibrary(LibraryRef lib, Map<String, URL> libMap) throws IOException {
     if (lib.getLibrary() == null) {
       throw new LibraryNotFoundException(lib);
     }
     String compiledPath = "";
     try {
       compiledPath = compileAtl(lib.getLibrary().getPath());
     } catch (Exception localException) {
       throw new ResourceNotFoundException(lib.getLibrary());
     }
     File f = new File(compiledPath);
     URL url = f.toURI().toURL();
     libMap.put(lib.getName(), url);
     for (LibraryRef libRef : lib.getLibrary().getLibraries())
       addLibrary(libRef, libMap);
   }
 
   public String compileAtl(String sourcePath)
     throws MalformedURLException, IOException
   {
     String transformationPath = sourcePath;
     int dotPos = transformationPath.lastIndexOf(".");
     String extension = transformationPath.substring(dotPos);
     if (extension.equals(new String(".atl"))) {
       String pathAsm = transformationPath.substring(0, dotPos) + ".asm";
       File fileAsm = new File(pathAsm);
       String absPath = fileAsm.getAbsolutePath();
       File fileAtl = new File(transformationPath);
       String absAtlPath = fileAtl.getAbsolutePath();
       if (!fileAsm.exists())
         AtlCompiler.getDefault().compile(new File(absAtlPath).toURI().toURL().openStream(), absPath);
       transformationPath = pathAsm;
     }
     return transformationPath;
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.TRANSFORMATION;
   }
 
   public EList<InputActualParameter> getInParams()
   {
     if (this.inParams == null) {
       this.inParams = new EObjectContainmentEList(InputActualParameter.class, this, 4);
     }
     return this.inParams;
   }
 
   public EList<OutputActualParameter> getOutParams()
   {
     if (this.outParams == null) {
       this.outParams = new EObjectContainmentEList(OutputActualParameter.class, this, 5);
     }
     return this.outParams;
   }
 
   public DecisionNode getControlNode()
   {
     if ((this.controlNode != null) && (this.controlNode.eIsProxy())) {
       InternalEObject oldControlNode = (InternalEObject)this.controlNode;
       this.controlNode = ((DecisionNode)eResolveProxy(oldControlNode));
       if ((this.controlNode != oldControlNode) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 6, oldControlNode, this.controlNode));
       }
     }
     return this.controlNode;
   }
 
   public DecisionNode basicGetControlNode()
   {
     return this.controlNode;
   }
 
   public void setControlNode(DecisionNode newControlNode)
   {
     DecisionNode oldControlNode = this.controlNode;
     this.controlNode = newControlNode;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 6, oldControlNode, this.controlNode));
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 4:
       return ((InternalEList)getInParams()).basicRemove(otherEnd, msgs);
     case 5:
       return ((InternalEList)getOutParams()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 4:
       return getInParams();
     case 5:
       return getOutParams();
     case 6:
       if (resolve) return getControlNode();
       return basicGetControlNode();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 4:
       getInParams().clear();
       getInParams().addAll((Collection)newValue);
       return;
     case 5:
       getOutParams().clear();
       getOutParams().addAll((Collection)newValue);
       return;
     case 6:
       setControlNode((DecisionNode)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 4:
       getInParams().clear();
       return;
     case 5:
       getOutParams().clear();
       return;
     case 6:
       setControlNode(null);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 4:
       return (this.inParams != null) && (!this.inParams.isEmpty());
     case 5:
       return (this.outParams != null) && (!this.outParams.isEmpty());
     case 6:
       return this.controlNode != null;
     }
     return super.eIsSet(featureID);
   }
 }
