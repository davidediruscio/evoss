 package Wires.impl;
 
 import Wires.AtomicModelTransformation;
 import Wires.BasicData;
 import Wires.CompositeTransformation;
 import Wires.ConnectableElement;
 import Wires.DataFlow;
 import Wires.GenericTransformation;
 import Wires.IdentityTransformation;
 import Wires.Model;
 import Wires.OutputActualParameter;
 import Wires.OutputFormalParameter;
import Wires.WiresPackage;
 import Wires.exep.ResourceNotFoundException;
 import Wires.exep.TypeNotFoundException;
 import java.io.File;
 import java.util.LinkedList;
 import java.util.List;
 import org.eclipse.emf.common.util.URI;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
 
 public class OutputFormalParameterImpl extends FormalParameterImpl
   implements OutputFormalParameter
 {
   OutputActualParameter actualParameter;
 
   public void loadModel()
   {
     String modelName = getName();
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     this.model = modelHandler.loadModel(modelName, this.metamodel, URI.createFileURI(this.modelPath));
   }
 
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     if ((incoming instanceof Model))
     {
       if (((Model)incoming).getPath() == null) {
         throw new TypeNotFoundException(incoming);
       }
 
       this.modelPath = ((Model)incoming).getPath();
 
       File f = new File(this.modelPath);
       if (!f.exists()) {
         throw new ResourceNotFoundException(incoming);
       }
 
       loadMetamodel();
       loadModel();
     }
     else if ((incoming instanceof BasicData))
     {
       setBasicDataValue(((BasicDataImpl)incoming).getValue());
     }
     else if ((incoming instanceof OutputActualParameter)) {
       if ((((OutputActualParameter)incoming).eContainer() instanceof IdentityTransformation))
       {
         setModelPath(((OutputActualParameterImpl)incoming).getModelPath());
       } else if (((((OutputActualParameter)incoming).eContainer() instanceof AtomicModelTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof GenericTransformation)))
       {
         copyASMModel(((OutputActualParameterImpl)incoming).getModel());
       }
       else if ((((OutputActualParameter)incoming).eContainer() instanceof CompositeTransformation))
       {
         if (((OutputActualParameterImpl)incoming).basicDataValue == null)
         {
           copyASMModel(((OutputActualParameterImpl)incoming).getModel());
         }
         else {
           setBasicDataValue(((OutputActualParameterImpl)incoming).getBasicDataValue());
         }
       }
     }
 
     ((ActualParameterImpl)this.actualParameter).basicDataValue = this.basicDataValue;
     ((ActualParameterImpl)this.actualParameter).metamodel = this.metamodel;
     ((ActualParameterImpl)this.actualParameter).model = this.model;
     ((ActualParameterImpl)this.actualParameter).modelPath = this.modelPath;
 
     List outgoingElements = new LinkedList();
     for (DataFlow f : this.actualParameter.getOutgoing()) {
       outgoingElements.add(f.getTarget());
     }
 
     WiresSpecificationImpl.execute(outgoingElements, this.actualParameter);
   }
 
   private void copyASMModel(ASMModel model)
   {
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     modelHandler.saveModel(model, "tmp", false);
     this.modelPath = "tmp";
     loadMetamodel();
     loadModel();
 
     File f = new File("tmp");
     f.delete();
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.OUTPUT_FORMAL_PARAMETER;
   }
 }
