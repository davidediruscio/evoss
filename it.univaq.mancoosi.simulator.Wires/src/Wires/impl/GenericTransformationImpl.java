 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.GenericTransformation;
 import Wires.InputActualParameter;
 import Wires.OutputActualParameter;
 import Wires.Type;
 import Wires.TypeParameter;
import Wires.WiresPackage;
 import Wires.exep.ATLExtractionFailedException;
 import Wires.exep.ResourceNotFoundException;
 import Wires.exep.TypeNotFoundException;
 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.OutputStream;
 import java.net.URL;
 import java.util.Collections;
 import java.util.HashMap;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Map;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.tcs.extractor.TCSExtractor;
 import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
 import org.eclipse.m2m.atl.engine.AtlLauncher;
 import org.eclipse.m2m.atl.engine.extractors.Extractor;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
 
 public class GenericTransformationImpl extends AtomicModelTransformationImpl
   implements GenericTransformation
 {
   protected TypeParameter typeParam;
 
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     List<InputActualParameter> inparam = getInParams();
 
     boolean ready = true;
     for (InputActualParameter parameter : inparam) {
       ready = (ready) && (((InputActualParameterImpl)parameter).getActive().booleanValue());
     }
 
     if (!((TypeParameterImpl)getTypeParam()).getActive().booleanValue()) {
       ready = false;
     }
     if ((super.getActive().booleanValue()) && (ready))
     {
       ASMModel ATLmodel = ((TypeParameterImpl)getTypeParam()).getModel();
 
       Type t = ((TransformationImpl)getTypeParam().eContainer()).getType();
       if (t == null) {
         throw new TypeNotFoundException(this);
       }
       String path = t.getPath();
       String atlPath = ((TransformationImpl)getTypeParam().eContainer()).getType().getPath();
 
       if ((path == null) || (path.equals(""))) {
         throw new ResourceNotFoundException(t);
       }
 
       extractCode(ATLmodel, atlPath);
 
       String asmPath = compileAtl(atlPath);
 
       File transformationFile = new File(asmPath);
       URL transformationResource = transformationFile.toURI().toURL();
 
       Map models = getInputsMap();
 
       addOutputModels(models);
 
       Map libMap = getLibMap();
 
       AtlLauncher.getDefault().launch(transformationResource, libMap, 
         models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_MAP);
 
       List outParamlist = new LinkedList();
       for (OutputActualParameter oap : getOutParams()) {
         outParamlist.add(oap);
       }
 
       for (InputActualParameter iap : getInParams()) {
         ((InputActualParameterImpl)iap).setActive(Boolean.valueOf(false));
       }
 
       if (getControlNode() != null) {
         super.setActive(Boolean.valueOf(false));
       }
 
       WiresSpecificationImpl.execute(outParamlist, null);
     }
   }
 
   private void extractCode(ASMModel ATLmodel, String file)
     throws Exception
   {
     try
     {
       URL TCS = getClass().getResource("/extractATL/TCS.ecore");
       URL ATL_tcs = getClass().getResource("/extractATL/ATL-tcs.ecore");
 
       AtlEMFModelHandler emfamh = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
 
       ASMModel tcsEMFmm = emfamh.loadModel("TCS", emfamh.getMof(), TCS.openStream());
       ASMModel ATLTcsEMFmm = emfamh.loadModel("ATL.tcs", tcsEMFmm, ATL_tcs.openStream());
 
       Extractor ext = new TCSExtractor();
       HashMap params = new HashMap();
 
       params.put("format", ATLTcsEMFmm);
       params.put("identEsc", "");
       params.put("indentString", "\t");
 
       OutputStream out = null;
       out = new FileOutputStream(file);
       ext.extract(ATLmodel, out, params);
 
       out.close();
     } catch (Exception localException) {
       throw new ATLExtractionFailedException(this);
     }
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.GENERIC_TRANSFORMATION;
   }
 
   public TypeParameter getTypeParam()
   {
     return this.typeParam;
   }
 
   public NotificationChain basicSetTypeParam(TypeParameter newTypeParam, NotificationChain msgs)
   {
     TypeParameter oldTypeParam = this.typeParam;
     this.typeParam = newTypeParam;
     if (eNotificationRequired()) {
       ENotificationImpl notification = new ENotificationImpl(this, 1, 7, oldTypeParam, newTypeParam);
       if (msgs == null) msgs = notification; else msgs.add(notification);
     }
     return msgs;
   }
 
   public void setTypeParam(TypeParameter newTypeParam)
   {
     if (newTypeParam != this.typeParam) {
       NotificationChain msgs = null;
       if (this.typeParam != null)
         msgs = ((InternalEObject)this.typeParam).eInverseRemove(this, -8, null, msgs);
       if (newTypeParam != null)
         msgs = ((InternalEObject)newTypeParam).eInverseAdd(this, -8, null, msgs);
       msgs = basicSetTypeParam(newTypeParam, msgs);
       if (msgs != null) msgs.dispatch();
     }
     else if (eNotificationRequired()) {
       eNotify(new ENotificationImpl(this, 1, 7, newTypeParam, newTypeParam));
     }
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 7:
       return basicSetTypeParam(null, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 7:
       return getTypeParam();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 7:
       setTypeParam((TypeParameter)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 7:
       setTypeParam(null);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 7:
       return this.typeParam != null;
     }
     return super.eIsSet(featureID);
   }
 }
