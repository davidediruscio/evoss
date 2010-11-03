 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class ATLExtractionFailedException extends WiresException
 {
   private static final long serialVersionUID = 7584881093966190586L;
 
   public ATLExtractionFailedException()
   {
   }
 
   public ATLExtractionFailedException(WiresElement wEl)
   {
     super(wEl);
   }
 }
