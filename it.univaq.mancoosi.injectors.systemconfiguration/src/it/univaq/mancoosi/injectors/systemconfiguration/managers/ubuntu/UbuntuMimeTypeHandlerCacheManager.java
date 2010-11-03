package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MimeType;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.MimeTypeHandlerCacheManager;

public class UbuntuMimeTypeHandlerCacheManager extends MimeTypeHandlerCacheManager{

	public static MimeTypeHandlerCacheManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuMimeTypeHandlerCacheManager();
		return INSTANCE;
	}
	
	   public void createMimeTypeHandlerCacheFromSystem(){
		    String path, mimeType;
		    MimeTypeHandler mth;
		    MimeType mt;
		    String[] mimeTypeInfo;
		    File file;
		    BufferedReader input, input2=null;
		    Process p, p2=null;

		    System.out.println("Processing MimeTypes....");
			try {
				String[] cmd1 = {"/bin/sh","-c"," cat /etc/mailcap"};
				p = Runtime.getRuntime().exec(cmd1);
				input =
					new BufferedReader
					(new InputStreamReader(p.getInputStream()));
			      	      
		    	while ((mimeType = input.readLine()) != null) {
		    		mimeTypeInfo = mimeType.split(";");
		    		if ((mimeTypeHandlerCacheMap.get(mimeTypeInfo[0]) == null) &&  ! ( ( mimeTypeInfo[0].startsWith("#")) ||  (mimeTypeInfo[0].isEmpty())) ){
		    			mth = factory.createMimeTypeHandler();
		    			mt = factory.createMimeType();
		    			mt.setName(mimeTypeInfo[0]);
		    			mth.setType(mt);

		    		
		    			if (!(mimeTypeInfo[1].split(" "))[1].equals("false")) {				// Instead of the executable file, the string false may occur
		    			
			    			String[] cmd2 = {"/bin/sh","-c"," which " + (mimeTypeInfo[1].split(" "))[1]};
							p2 = Runtime.getRuntime().exec(cmd2);
							input2 =
								new BufferedReader
								(new InputStreamReader(p2.getInputStream()));
							path = input2.readLine();
							
							if (! (path == null) ) {
								file = FileSystemManager.getInstance().createFile(path);
								mth.setHandler(file);
			    			
								mimeTypeHandlerCacheMap.put(mimeTypeInfo[0], mth);
								mimeTypeHandlerCache.getHandlers().add(mth);
								mimeTypeHandlerCache.getMimeTypes().add(mt);
							} else {
								
System.out.println("WARNING: The file \"" + (mimeTypeInfo[1].split(" "))[1] + "\" handling the mime type \"" + mimeTypeInfo[0] + "\" is missing !");								
					
							}
		    			}
		    		}	
		    	}	
		    	
		    	input.close();
		    	p.destroy();
//		    	input2.close();
//		    	p2.destroy();
				  
		    } catch (Exception err) {
		    	err.printStackTrace();
		    }
		}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
