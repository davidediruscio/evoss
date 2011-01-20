package failuresdetector;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.Attributes;

//This class is used by the JarExecutor for loading a class of a jar file
public class JarClassLoader extends URLClassLoader
{
	URL url = null;
	
    public JarClassLoader(URL url)
    {
        super (new URL[] {url});
        this.url = url;
    }

    //This method retrieves the name of the main class contained in the jar file
    public String getMainClassName() throws IOException {
        //URL u = new URL("jar:file://", "", url + "!/");
    	URL u = new URL(url.getProtocol(), "", url.getFile());
        JarURLConnection uc = (JarURLConnection)u.openConnection();
        Attributes attr = (Attributes) uc.getMainAttributes();
        return attr != null
                       ? attr.getValue(Attributes.Name.MAIN_CLASS)
                       : null;
    }
    
    //This method invokes the class name with args
    @SuppressWarnings("unchecked")
	public void invokeClass(String name, String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoClassDefFoundError {
    	try {
    		Class c = loadClass(name);
    		Method m = c.getMethod("main", new Class[] { args.getClass() });
    		m.setAccessible(true);
    		int mods = m.getModifiers();
    		if (m.getReturnType() != void.class || !Modifier.isStatic(mods) || !Modifier.isPublic(mods)) {
    			throw new NoSuchMethodException("main");
    		}
    		m.invoke(null, new Object[] { args });
    	} catch (IllegalAccessException e) {
    		// This should not happen, as we have disabled access checks
    	} catch (NoClassDefFoundError e) {
    		throw e;
    	} catch (NoSuchMethodException e) {
    		throw e;
    	}
    }
    
}
