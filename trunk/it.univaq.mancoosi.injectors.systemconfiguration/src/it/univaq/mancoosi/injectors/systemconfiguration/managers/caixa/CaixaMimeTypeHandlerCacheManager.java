package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MimeType;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.MimeTypeHandlerCacheManager;

public class CaixaMimeTypeHandlerCacheManager extends MimeTypeHandlerCacheManager{

	public static MimeTypeHandlerCacheManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaMimeTypeHandlerCacheManager();
		return INSTANCE;
	}
	
	   public void createMimeTypeHandlerCacheFromSystem(){
		    String path, mimeType;
		    MimeTypeHandler mth;
		    MimeType mt;
		    String[] mimeTypeInfo;
		    File file;
		    BufferedReader input, input2,input_which=null;
		    Process p, p2,p3 = null,p4=null;

		    System.out.println("Processing MimeTypes....");
			try {
				
				String[] mt_cmd = {"/bin/sh","-c","cat /usr/share/applications/defaults.list"};
				p = Runtime.getRuntime().exec(mt_cmd);
				input =
					new BufferedReader
					(new InputStreamReader(p.getInputStream()));
				
		    	while ((mimeType = input.readLine()) != null) {
		    		mimeTypeInfo = mimeType.split("=");
		    		if ((mimeTypeHandlerCacheMap.get(mimeTypeInfo[0]) == null) &&  ! ( ( mimeTypeInfo[0].startsWith("#")) || ((mimeTypeInfo[0]).contains("Default Applications")) || (mimeTypeInfo[0].isEmpty())) ){
		    			mth = factory.createMimeTypeHandler();
		    			mt = factory.createMimeType();
		    			mt.setName(mimeTypeInfo[0]);
		    			mth.setType(mt);

		    			if ((mimeTypeInfo.length > 1) && !(mimeTypeInfo[1].split(";")==null)) //If there is a handler
		    			{
		    				String[] mt_handlers = mimeTypeInfo[1].split(";");
		    				boolean found = false;
		    				String base_path = "/usr/share/applications/";
		    				BufferedReader desk_reader=null;
		    				for (int a=0; a<mt_handlers.length; a++){ //Loop until first handler found
		    					String[] desk_cmd = {"/bin/sh","-c","cat "+base_path+mt_handlers[a]}; //, " |grep Exec"
		    					p3 = Runtime.getRuntime().exec(desk_cmd);
		    					desk_reader =
		    						new BufferedReader
		    						(new InputStreamReader(p3.getInputStream()));
		    					String desk_str = desk_reader.readLine();
		    					while ((desk_str = desk_reader.readLine()) != null){
		    						if (!desk_str.contains("No such file or directory")){
		    							String[] exec_cmd = desk_str.split("=");
		    							if (exec_cmd[0].equals("Exec") && exec_cmd.length >1){
		    								String Exec = exec_cmd[1].split(" ")[0]; //trims %f or %u... consider revising
		    					    			
		    					    			String[] cmd2 = {"/bin/sh","-c"," which " + Exec};
		    									p4 = Runtime.getRuntime().exec(cmd2);
		    									input_which =
		    										new BufferedReader
		    										(new InputStreamReader(p4.getInputStream()));
		    									path = input_which.readLine();
		    									
		    									if (! (path == null) ) {
		    										file = FileSystemManager.getInstance().createFile(path);
		    										mth.setHandler(file);
		    										mimeTypeHandlerCacheMap.put(mimeTypeInfo[0], mth);
		    										mimeTypeHandlerCache.getHandlers().add(mth);
		    										mimeTypeHandlerCache.getMimeTypes().add(mt);
		    					//					System.out.println("Associating MIME type "+ mimeTypeInfo[0] + " with application " +mt_handlers[a] + " whose exec is at "+Exec);
		    										p4.destroy();
				    								found = true;
				    								break; //hopefully just break out of for loop
		    									} else {
		    										System.out.println("WARNING: The file \"" + (mimeTypeInfo[1].split(" "))[1] + "\" handling the mime type \"" + mimeTypeInfo[0] + "\" is missing !");								
		    									}
		    									p4.destroy();
		    							}
		    						}
		    						else{
		    							//file not found
		    						}
		    						
		    					}
/*		    					else {
		    						//Error- no output
		    					}*/
		    					
		    				}//End of for loop
		    				p3.destroy();
		    				input_which.close();
		    				desk_reader.close();
		    				if (!found){
		    					System.out.println("WARNING: There is no handler for mime-type " + mimeTypeInfo[0] + " !");
		    				}
		    			}
		    			else {
							System.out.println("WARNING: There is no handler for mime-type " + mimeTypeInfo[0] + " !");								
						}
		    		}	
		    	}	
		    	
		    	input.close();
		    	p.destroy();			      	      				
				
				
	
		    } catch (Exception err) {
		    	err.printStackTrace();
		    }
		}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}	
	
/*	   public void createMimeTypeHandlerCacheFromSystem(){
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
*/
