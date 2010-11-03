package Wires.impl;
 
import Wires.BasicData;
import Wires.CompositeTransformation;
import Wires.ConnectableElement;
import Wires.GenericQuery;
import Wires.IdentityTransformation;
import Wires.InputFormalParameter;
import Wires.OutputActualParameter;
import Wires.Query;
import Wires.WiresPackage;
import Wires.exep.ResourceNotFoundException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
 
 public class BasicDataImpl extends TypedElementImpl
   implements BasicData
 {
   ASMOclAny value;
   protected static final String PATH_EDEFAULT = null;
 
   protected String path = PATH_EDEFAULT;
 
   public ASMOclAny getValue()
   {
     return this.value;
   }
 
   public void execute(ConnectableElement incoming) throws Exception
   {
     if ((incoming instanceof BasicData))
     {
       String inPath = ((BasicDataImpl)incoming).getPath();
       String outPath = getPath();
 
       File in = null;
       try {
         in = new File(inPath);
       } catch (Exception localException1) {
         throw new ResourceNotFoundException(incoming);
       }
 
       File out = null;
       try {
         out = new File(outPath);
       } catch (Exception localException2) {
         throw new ResourceNotFoundException(this);
       }
 
       copy(in, out);
     } else if ((incoming instanceof OutputActualParameter))
     {
       if (((((OutputActualParameter)incoming).eContainer() instanceof Query)) || 
					((((OutputActualParameter)incoming).eContainer() instanceof GenericQuery)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof CompositeTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof IdentityTransformation))) {
         this.value = ((OutputActualParameterImpl)incoming).getBasicDataValue();
         writeValueToFile();
       } else if ((incoming instanceof InputFormalParameter)) {
         this.value = ((InputFormalParameterImpl)incoming).getBasicDataValue();
         writeValueToFile();
       }
     }
   }
 
   private void writeValueToFile() throws Exception {
     if (getPath() == null)
       throw new ResourceNotFoundException(this);
     FileWriter out = new FileWriter(getPath());
     BufferedWriter bw = new BufferedWriter(out);
     bw.write(this.value.toString());
     bw.close();
     out.close();
   }
 
   private void copy(File src, File dst) throws IOException {
     InputStream in = new FileInputStream(src);
     OutputStream out = new FileOutputStream(dst);
 
     byte[] buf = new byte[1024];
     int len;
     while ((len = in.read(buf)) > 0)
     {
       out.write(buf, 0, len);
     }
     in.close();
     out.close();
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.BASIC_DATA;
   }
 
   public String getPath()
   {
     return this.path;
   }
 
   public void setPath(String newPath)
   {
     String oldPath = this.path;
     this.path = newPath;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 4, oldPath, this.path));
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 4:
       return getPath();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 4:
       setPath((String)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 4:
       setPath(PATH_EDEFAULT);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 4:
       return this.path != null;
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (path: ");
     result.append(this.path);
     result.append(')');
     return result.toString();
   }
 }
