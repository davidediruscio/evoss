package Wires.exep;
 
 import Wires.LibraryRef;
 
 public class LibraryNotFoundException extends WiresException
 {
   private static final long serialVersionUID = 8133674773671279761L;
   private LibraryRef lib;
 
   public LibraryNotFoundException()
   {
   }
 
   public LibraryNotFoundException(LibraryRef lib)
   {
     this.lib = lib;
   }
 
   public LibraryRef getLibraryRef() {
     return this.lib;
   }
 }
