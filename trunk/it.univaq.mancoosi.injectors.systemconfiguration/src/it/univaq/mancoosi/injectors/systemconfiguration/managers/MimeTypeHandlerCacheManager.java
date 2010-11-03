package it.univaq.mancoosi.injectors.systemconfiguration.managers;


import java.io.IOException;
import java.util.HashMap;

import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.MimeType;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache;


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
