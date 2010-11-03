 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.IdentityTransformation;
 import Wires.InputActualParameter;
 import Wires.OutputActualParameter;
import Wires.WiresPackage;
 import Wires.exep.IdOutParamNotFound;
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.List;

import org.eclipse.emf.ecore.EClass;
 
 public class IdentityTransformationImpl extends AtomicModelTransformationImpl
   implements IdentityTransformation
 {
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     List<InputActualParameter> inparam = getInParams();
 
     boolean ready = true;
     for (InputActualParameter parameter : inparam) {
       ready = (ready) && (((InputActualParameterImpl)parameter).getActive().booleanValue());
     }
 
     if ((super.getActive().booleanValue()) && (ready))
     {
       Iterator it;
       for (InputActualParameter parameter : inparam) {
         it = getOutParams().iterator();
         boolean found = false;
         OutputActualParameter outParam = null;
         while ((it.hasNext()) && (!found)) {
           outParam = (OutputActualParameter)it.next();
           if (outParam.getName().equals(parameter.getName()))
             found = true;
         }
         if (found)
           ((OutputActualParameterImpl)outParam).setModelPath(((InputActualParameterImpl)parameter).getModelPath());
         else {
           throw new IdOutParamNotFound(parameter);
         }
 
       }
 
       getOutParams();
       List outParamlist = new LinkedList();
       for (OutputActualParameter oap : getOutParams()) {
         outParamlist.add(oap);
       }
 
       super.setActive(Boolean.valueOf(false));
 
       WiresSpecificationImpl.execute(outParamlist, null);
     }
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.IDENTITY_TRANSFORMATION;
   }
 }
