 package Wires.impl;
 
 import Wires.AtomicModelTransformation;
 import Wires.CompositeTransformation;
 import Wires.ConnectableElement;
import Wires.GenericQuery;
 import Wires.GenericTransformation;
 import Wires.IdentityTransformation;
 import Wires.InputFormalParameter;
 import Wires.Model;
 import Wires.OutputActualParameter;
import Wires.WiresPackage;

 import Wires.exep.ResourceNotFoundException;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
 
 public class ModelImpl extends TypedElementImpl
   implements Model
 {
   protected static final String PATH_EDEFAULT = null;
 
   protected String path = PATH_EDEFAULT;
 
   public void execute(ConnectableElement incoming)
     throws IOException
   {
     if ((incoming instanceof Model))
     {
       String inPath = ((Model)incoming).getPath();
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
       if (((((OutputActualParameter)incoming).eContainer() instanceof IdentityTransformation)) || (
         ((((OutputActualParameter)incoming).eContainer() instanceof CompositeTransformation)) && 
         (((OutputActualParameterImpl)incoming).getModel() == null))) {
         File in = null;
         try {
           in = new File(((OutputActualParameterImpl)incoming).getModelPath());
         } catch (Exception localException3) {
           throw new ResourceNotFoundException(incoming);
         }
         File out = null;
         try {
           out = new File(getPath());
         } catch (Exception localException4) {
           throw new ResourceNotFoundException(this);
         }
         copy(in, out);
       }
       else if (((((OutputActualParameter)incoming).eContainer() instanceof AtomicModelTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof GenericTransformation)) || 
         ((((OutputActualParameter)incoming).eContainer() instanceof CompositeTransformation)))
       {
         AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
         String modelPath = getPath();
         File f = null;
         try {
           f = new File(modelPath);
         } catch (Exception localException5) {
           throw new ResourceNotFoundException(this);
         }
         if (f.exists())
           f.delete();
         modelHandler.saveModel(((OutputActualParameterImpl)incoming).getModel(), modelPath, false);
       }
     } else if ((incoming instanceof InputFormalParameter))
     {
       AtlEMFModelHandler modelHandler = (AtlEMFModelHandler)AtlEMFModelHandler.getDefault("EMF");
       String modelPath = getPath();
       File f = null;
       try {
         f = new File(modelPath);
       } catch (Exception localException6) {
         throw new ResourceNotFoundException(this);
       }
       if (f.exists())
         f.delete();
       modelHandler.saveModel(((InputFormalParameterImpl)incoming).getModel(), modelPath, false);
     }
   }
 
   private void copy(File src, File dst) throws IOException {
     if (dst.exists()) {
       dst.delete();
     }
     InputStream in = new FileInputStream(src);
     OutputStream out = new FileOutputStream(dst);
 
     byte[] buf = new byte[4096];
     int len;
     while ((len = in.read(buf)) != -1)
     {
       out.write(buf, 0, len);
     }
     in.close();
     out.close();
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.MODEL;
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
