package mancoosi.injectors.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

import mancoosi.File;
import mancoosi.InstalledPackage;
import mancoosi.MancoosiFactory;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;
import mancoosi.MimeTypeHandlerCache;


public abstract class MimeTypeHandlerCacheManager {
	   protected static MimeTypeHandlerCacheManager INSTANCE ;
	 
	   
	   protected MimeTypeHandlerCache mimeTypeHandlerCache;
	   protected HashMap<String, MimeTypeHandler> mimeTypeHandlerCacheMap;
	   protected HashMap<String, MimeType> mimeTypeMap;
	   protected MancoosiFactory factory;

	   
	   // Private constructor prevents instantiation from other classes
	   protected MimeTypeHandlerCacheManager() {
		   factory = MancoosiFactory.eINSTANCE; 
		   mimeTypeHandlerCache = factory.createMimeTypeHandlerCache();
		   mimeTypeHandlerCacheMap = new HashMap<String, MimeTypeHandler>();
		   mimeTypeMap = new HashMap<String, MimeType>();
	   }
	 
	   public static MimeTypeHandlerCacheManager getInstance() {
	      return INSTANCE;
	   }
	   
	   public MimeTypeHandlerCache getMimeTypeHandlerCache() {
		   return mimeTypeHandlerCache;
	   }
	   
	   public abstract void createMimeTypeHandlerCacheFromSystem();
	   
	   public abstract void synchronize() throws IOException;
		


}
