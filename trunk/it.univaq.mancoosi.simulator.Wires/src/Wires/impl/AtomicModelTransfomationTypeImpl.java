package Wires.impl;
 
import Wires.AtomicModelTransfomationType;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
 
 public class AtomicModelTransfomationTypeImpl extends TransformationTypeImpl
   implements AtomicModelTransfomationType
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.ATOMIC_MODEL_TRANSFOMATION_TYPE;
   }
 }
