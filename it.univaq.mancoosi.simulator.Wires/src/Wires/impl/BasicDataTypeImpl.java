 package Wires.impl;
 
 import Wires.BasicDataType;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
 
 public class BasicDataTypeImpl extends DataTypeImpl
   implements BasicDataType
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.BASIC_DATA_TYPE;
   }
 }
