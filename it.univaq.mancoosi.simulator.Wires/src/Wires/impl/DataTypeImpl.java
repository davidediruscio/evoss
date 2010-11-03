package Wires.impl;
 
import Wires.DataType;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
 
public abstract class DataTypeImpl extends TypeImpl
   implements DataType
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.DATA_TYPE;
   }
 }
