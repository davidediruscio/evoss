 package Wires.impl;
 
 import Wires.AtomicModelTransformation;
 import Wires.BasicData;
 import Wires.CompositeTransformation;
 import Wires.ConnectableElement;
 import Wires.DecisionNode;
import Wires.GenericQuery;
 import Wires.GenericTransformation;
 import Wires.IdentityTransformation;
 import Wires.InputActualParameter;
 import Wires.InputFormalParameter;
 import Wires.Model;
 import Wires.OutputActualParameter;
 import Wires.Transformation;
import Wires.WiresPackage;
 import Wires.exep.ResourceNotFoundException;
 import Wires.exep.TypeNotFoundException;
 import java.io.File;
import java.util.UUID;

 import org.eclipse.emf.common.util.URI;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
 
 public class InputActualParameterImpl extends ActualParameterImpl
   implements InputActualParameter
 {
   private Boolean active = Boolean.valueOf(false);
 
   public void setActive(Boolean active) {
     this.active = active;
   }
 
   public Boolean getActive() {
     return this.active;
   }
 
   public void loadModel() {
     if (getType() == null)
       throw new TypeNotFoundException(this);
     String modelName = ((InputFormalParameter)getType()).getName();
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     this.model = modelHandler.loadModel(modelName, this.metamodel, URI.createFileURI(this.modelPath));
   }
 
   public void execute(ConnectableElement incoming) throws Exception
   {
     if ((incoming instanceof Model))
     {
       if (((Model)incoming).getPath() == null) {
         throw new ResourceNotFoundException(incoming);
       }
 
       this.modelPath = ((Model)incoming).getPath();
 
       File f = new File(this.modelPath);
       if (!f.exists()) {
         throw new ResourceNotFoundException(incoming);
       }
 
       if (!(eContainer() instanceof IdentityTransformation)) {
         loadMetamodel();
         loadModel();
       }
     }
     else if ((incoming instanceof BasicData))
     {
       setBasicDataValue(((BasicDataImpl)incoming).getValue());
     }
     else if (((incoming instanceof OutputActualParameter)) && (!(eContainer() instanceof DecisionNode)))
     {
       if (((((OutputActualParameter)incoming).eContainer() instanceof AtomicModelTransformation)) || 
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
       else if ((((OutputActualParameter)incoming).eContainer() instanceof IdentityTransformation))
       {
         setModelPath(((OutputActualParameterImpl)incoming).getModelPath());
       }
     } else if (((incoming instanceof OutputActualParameter)) && ((eContainer() instanceof DecisionNode)))
     {
       setBasicDataValue(((OutputActualParameterImpl)incoming).getBasicDataValue());
     }
     else if (((incoming instanceof InputFormalParameter)) && (!(eContainer() instanceof IdentityTransformation))) {
       copyASMModel(((InputFormalParameterImpl)incoming).getModel());
     } else if (((incoming instanceof InputFormalParameter)) && ((eContainer() instanceof IdentityTransformation))) {
       this.modelPath = ((InputFormalParameterImpl)incoming).getModelPath();
     }
 
     setActive(Boolean.valueOf(true));
     if ((eContainer() instanceof Transformation))
       ((ConnectableElementImpl)eContainer()).execute(incoming);
     else if ((eContainer() instanceof DecisionNode))
       ((DecisionNodeImpl)eContainer()).execute(incoming);
   }
 
   private void copyASMModel(ASMModel model)
   {
			  String name = "tmp" + UUID.randomUUID().toString();
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     modelHandler.saveModel(model, name, false);
     this.modelPath = name;
     loadMetamodel();
     loadModel();
 
     File f = new File(name);
     f.delete();
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.INPUT_ACTUAL_PARAMETER;
   }
 }
