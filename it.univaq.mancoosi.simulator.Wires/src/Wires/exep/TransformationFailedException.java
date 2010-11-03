 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class TransformationFailedException extends WiresException
 {
   private static final long serialVersionUID = 4193013533137122589L;
 
   public TransformationFailedException()
   {
   }
 
   public TransformationFailedException(WiresElement wEl)
   {
     super(wEl);
   }
 }
