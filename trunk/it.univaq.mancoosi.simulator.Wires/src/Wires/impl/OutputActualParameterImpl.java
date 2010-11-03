 package Wires.impl;
 
 import Wires.OutputActualParameter;
 import Wires.OutputFormalParameter;
import Wires.WiresPackage;
 import Wires.exep.TypeNotFoundException;
 import org.eclipse.emf.common.util.URI;
 import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
 
 public class OutputActualParameterImpl extends ActualParameterImpl
   implements OutputActualParameter
 {
   public void newModel()
   {
     if ((OutputFormalParameter)getType() == null) {
       throw new TypeNotFoundException(this);
     }
     String modelName = ((OutputFormalParameter)getType()).getName();
 
     AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
     this.model = modelHandler.newModel(modelName, URI.createFileURI("temp").toFileString(), this.metamodel);
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.OUTPUT_ACTUAL_PARAMETER;
   }
 }
