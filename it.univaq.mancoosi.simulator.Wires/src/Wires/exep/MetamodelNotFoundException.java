 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class MetamodelNotFoundException extends WiresException
 {
   private static final long serialVersionUID = 1517485813390389373L;
 
   public MetamodelNotFoundException()
   {
   }
 
   public MetamodelNotFoundException(WiresElement wEl)
   {
     super(wEl);
   }
 }
