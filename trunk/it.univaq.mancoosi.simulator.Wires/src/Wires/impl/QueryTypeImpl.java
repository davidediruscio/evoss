package Wires.impl;
 
import Wires.QueryType;
import Wires.WiresPackage;
import org.eclipse.emf.ecore.EClass;
 
public class QueryTypeImpl extends TransformationTypeImpl
   implements QueryType
 {
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.QUERY_TYPE;
   }
 }
