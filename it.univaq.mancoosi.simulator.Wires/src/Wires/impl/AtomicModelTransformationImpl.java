package Wires.impl;
 
import Wires.AtomicModelTransformation;
import Wires.ConnectableElement;
import Wires.InputActualParameter;
import Wires.OutputActualParameter;
import Wires.WiresPackage;
import Wires.exep.ResourceNotFoundException;
import Wires.exep.TransformationFailedException;
import Wires.exep.TypeNotFoundException;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.atl.engine.AtlLauncher;
 
 public class AtomicModelTransformationImpl extends TransformationImpl
   implements AtomicModelTransformation
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
 
       File transformationFile = new File(transformationPath);
       URL transformationResource = transformationFile.toURI().toURL();
 
       Map models = super.getInputsMap();
 
       super.addOutputModels(models);
 
       Map libMap = super.getLibMap();
       try
       {
         AtlLauncher.getDefault().launch(transformationResource, libMap, 
           models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_MAP);
       } catch (Exception localException) {
         throw new TransformationFailedException(this);
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
     return WiresPackage.Literals.ATOMIC_MODEL_TRANSFORMATION;
   }
 }
