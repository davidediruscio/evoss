package Wires.impl;
 
import Wires.WiresElement;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
 
 public abstract class WiresElementImpl extends EObjectImpl
   implements WiresElement
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.WIRES_ELEMENT;
   }
 }
