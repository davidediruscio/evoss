 package Wires.impl;
 
 import Wires.AtomicModelTransformation;
 import Wires.CompositeTransformation;
 import Wires.ConnectableElement;
 import Wires.GenericTransformation;
 import Wires.IdentityTransformation;
 import Wires.InputFormalParameter;
 import Wires.Model;
 import Wires.OutputActualParameter;
 import Wires.TypeParameter;
import Wires.WiresPackage;
 import Wires.exep.ResourceNotFoundException;
 import Wires.exep.TypeNotFoundException;
 import java.io.File;
import java.util.UUID;

 import org.eclipse.emf.common.util.URI;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
 
 public class TypeParameterImpl extends ActualParameterImpl
   implements TypeParameter
 {
   private Boolean active = Boolean.valueOf(false);
 
   public void setActive(Boolean active) {
     this.active = active;
   }
 
   public Boolean getActive() {
     return this.active;
   }
 
   public void loadModel() {
     String modelName = getType().getName();
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     this.model = modelHandler.loadModel(modelName, this.metamodel, URI.createFileURI(this.modelPath));
   }
 
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     if ((incoming instanceof Model))
     {
       if ((((Model)incoming).getPath() == null) || (((Model)incoming).getPath().equals(""))) {
         throw new ResourceNotFoundException(incoming);
       }
 
       this.modelPath = ((Model)incoming).getPath();
 
       if (!(eContainer() instanceof IdentityTransformation)) {
         loadMetamodel();
         loadModel();
       }
       setActive(Boolean.valueOf(true));
     }
     else if ((incoming instanceof OutputActualParameter))
     {
       if (((((OutputActualParameter)incoming).eContainer() instanceof AtomicModelTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof GenericTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof CompositeTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof IdentityTransformation))) {
         if (((OutputActualParameter)incoming).getType() == null) {
           throw new TypeNotFoundException(incoming);
         }
         this.type = ((OutputActualParameter)incoming).getType();
         copyASMModel(((OutputActualParameterImpl)incoming).getModel());
       } else if ((incoming instanceof InputFormalParameter)) {
         copyASMModel(((InputFormalParameterImpl)incoming).getModel());
       }
       setActive(Boolean.valueOf(true));
     }
 
     ((ConnectableElementImpl)eContainer()).execute(incoming);
   }

	
	private void copyASMModel(ASMModel model) {
		String name = "tmp" + UUID.randomUUID().toString();
		AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlEMFModelHandler.getDefault("EMF");
		modelHandler.saveModel(model, name, false);
		this.modelPath = name;
		loadMetamodel();
		loadModel();

		File f = new File(name);
		f.delete();
	}
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.TYPE_PARAMETER;
   }
 }
