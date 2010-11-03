 package Wires.impl;
 
 import Wires.CompositeTransformation;
 import Wires.ConnectableElement;
 import Wires.InputActualParameter;
 import Wires.InputFormalParameter;
 import Wires.OutputActualParameter;
 import Wires.WiresPackage;
 import Wires.exep.TypeNotFoundException;
 import java.util.LinkedList;
 import java.util.List;
 import org.eclipse.emf.ecore.EClass;
 
 public class CompositeTransformationImpl extends TransformationImpl
   implements CompositeTransformation
 {
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     List<InputActualParameter> inparam = getInParams();
     List<InputFormalParameter> formalInParameter = new LinkedList();
 
     boolean ready = true;
     for (InputActualParameter parameter : inparam) {
       if (parameter.getType() == null)
         throw new TypeNotFoundException(parameter);
       ready = (ready) && (((InputActualParameterImpl)parameter).getActive().booleanValue());
       ((InputFormalParameterImpl)parameter.getType()).basicDataValue = ((InputActualParameterImpl)parameter).basicDataValue;
       ((InputFormalParameterImpl)parameter.getType()).metamodel = ((InputActualParameterImpl)parameter).metamodel;
       ((InputFormalParameterImpl)parameter.getType()).model = ((InputActualParameterImpl)parameter).model;
       ((InputFormalParameterImpl)parameter.getType()).modelPath = ((InputActualParameterImpl)parameter).modelPath;
       formalInParameter.add((InputFormalParameter)parameter.getType());
     }
 
     if ((super.getActive().booleanValue()) && (ready))
     {
       for (OutputActualParameter p : getOutParams()) {
         if (p.getType() == null)
           throw new TypeNotFoundException(p);
         ((OutputFormalParameterImpl)p.getType()).actualParameter = p;
       }
 
       List<InputFormalParameter> list = new LinkedList();
       for (InputFormalParameter p : formalInParameter) {
         list.add(p);
       }
 
       WiresSpecificationImpl.execute(list, null);
 
       for (InputActualParameter iap : getInParams()) {
         ((InputActualParameterImpl)iap).setActive(Boolean.valueOf(false));
       }
 
       if (getControlNode() != null)
         super.setActive(Boolean.valueOf(false));
     }
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.COMPOSITE_TRANSFORMATION;
   }
 }
