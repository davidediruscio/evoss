package failuresdetector;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.emf.common.util.WrappedException;

//This class is able to execute jar files
public class JarExecutor {
	
	//This method executes the jar file in input passing also an ecore resource
	public static void executeJar(String jarFilePath, String ecoreModelPath) {
		File jarFile = new File(jarFilePath);
		URL[] url = null;
		String name = null;
		try {
			if(jarFile.exists()) {
				url = new URL[]{new URL("jar:file:" + jarFile.getAbsolutePath() + "!/")};
				JarClassLoader cl = new JarClassLoader(url[0]);
				name = cl.getMainClassName();
				if (name != null) {
					// Get arguments for the application
				    String[] newArgs = new String[url.length - 1];
				    System.arraycopy(url, 1, newArgs, 0, newArgs.length);
				    // Invoke application's main class
				    System.out.println(jarFilePath + " execution started...");
				    cl.invokeClass(name, newArgs);
				    System.out.println(jarFilePath + " execution terminated!");
			    } else
			    	System.out.println("Specified jar file " + jarFilePath + " does not contain a 'Main-Class' manifest attribute");
			}
			else {
				System.out.println(jarFilePath + " doesn't exists.");
			}
		} catch (WrappedException e) {
			// TODO Auto-generated catch block
			System.out.println("Ecore resource was not loaded because a WrappedException has been thrown. Please check the metamodel is registered.");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("Ecore resource was not loaded because a RuntimeException has been thrown.");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while loading JAR file " + jarFilePath + " .");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found: " + name);
		} catch (NoClassDefFoundError e) {
			System.out.println("Class not found: " + name);
    	} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			System.out.println("Class does not define a 'main' method: " + name);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getTargetException().getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	//This method executes the jar files in input passing also an ecore resource
	public static void executeJars(String[] jarFilesPaths, String ecoreModelPath) {
		if(jarFilesPaths != null && jarFilesPaths.length > 0)
			for(int i = 0; i < jarFilesPaths.length; i++) {
				if(jarFilesPaths[i] != null) {
					System.out.println((i + 1) + ") Executing " + jarFilesPaths[i] + " ...");
					executeJar(jarFilesPaths[i], ecoreModelPath);
				}
				else
					System.out.println("Error when trying to execute jar file " + jarFilesPaths[i]);
			}
		else
			System.out.println("No jars to execute.");
	}
}
