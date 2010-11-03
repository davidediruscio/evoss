 package Wires.impl;
 
 import Wires.InputFormalParameter;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
 
 public class InputFormalParameterImpl extends FormalParameterImpl
   implements InputFormalParameter
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.INPUT_FORMAL_PARAMETER;
   }
 }
