 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.InputActualParameter;
 import Wires.OutputActualParameter;
 import Wires.Query;
import Wires.WiresPackage;
 import Wires.exep.QueryFailedException;
 import Wires.exep.ResourceNotFoundException;
 import Wires.exep.TypeNotFoundException;
 import java.io.File;
 import java.net.URL;
 import java.util.Collections;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Map;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.m2m.atl.engine.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
 
 public class QueryImpl extends TransformationImpl
   implements Query
 {
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     List<InputActualParameter> inparam = getInParams();
 
     boolean ready = true;
     for (InputActualParameter parameter : inparam) {
       ready = (ready) && (((InputActualParameterImpl)parameter).getActive().booleanValue());
     }
 
     if ((super.getActive().booleanValue()) && (ready)) {
       if (getType() == null) {
         throw new TypeNotFoundException(this);
       }
       String transformationPath = getType().getPath();
       File f = new File(transformationPath);
       if ((getType().getPath() == null) || (getType().getPath().equals("")) || (!f.exists())) {
         throw new ResourceNotFoundException(getType());
       }
 
       transformationPath = super.compileAtl(transformationPath);
 
       File transformationFile = null;
       try {
         transformationFile = new File(transformationPath);
       } catch (Exception localException) {
         throw new ResourceNotFoundException(getType());
       }
       URL transformationResource = transformationFile.toURI().toURL();
 
       Map models = super.getInputsMap();
 
       Map libMap = super.getLibMap();
 
       ASMOclAny res = (ASMOclAny)AtlLauncher.getDefault().launch(transformationResource, libMap, 
         models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_MAP);
 
       if (res == null) {
         throw new QueryFailedException(this);
       }
 
       for (OutputActualParameter parameter : getOutParams()) {
         ((OutputActualParameterImpl)parameter).setBasicDataValue(res);
       }
 
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
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.QUERY;
   }
 }
