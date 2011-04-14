package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.GConfManager;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.Schema;

public class UbuntuGConfManager extends GConfManager {
	
	protected ArrayList<String> allFiles = new ArrayList<String>();
	
	public static GConfManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new UbuntuGConfManager();
		return INSTANCE;
	}
	
	@Override
	public void createGConfFromSystem() {

		Schema newSchema;
		System.out.println("Processing Schemas and gconfFiles....");
		try {

			ArrayList<String> schemas = getSchemaFile();
			ArrayList<String> gConfFiles = getGconfFile();

			gconf.setEnv(UbuntuEnvironmentManager.getInstance().getEnvironment());
			
			if  (schemas.size() > 0) {
				for(int i=0; i<schemas.size(); i++){
					
					newSchema = factory.createSchema();
					newSchema.setName(schemas.get(i));
					UbuntuFileSystemManager.getInstance().createFile("/usr/share/gconf/schemas/"+schemas.get(i));
					newSchema.setLocation("/usr/share/gconf/schemas/"+schemas.get(i));				
					gconf.getSchemas().add(newSchema);	
				}
			}
			
			if (gConfFiles.size() > 0){
				for(int i=0; i<gConfFiles.size(); i++){
					File file = UbuntuFileSystemManager.getInstance().createFile(gConfFiles.get(i));
					UbuntuGConfManager.getInstance().getGconf().getConfFiles().add(file);
				}
			}

		} catch (Exception err) {
			err.printStackTrace();
		}
	}
	
	protected ArrayList<String> getSchemaFile(){
		ArrayList<String> result = new ArrayList<String>();
		String line;

		try {
			String[] cmd = {"/bin/sh","-c","ls --time-style=long-iso -l /usr/share/gconf/schemas | awk '{print $8}'"};
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			line = input.readLine(); 
			while ((line = input.readLine()) != null) {
				result.add(line);
			}

			input.close();

		} catch (Exception err) {
			err.printStackTrace();
		}

		return result;			
	}
	
	protected ArrayList<String> getGconfFile(){
		
		ArrayList<String> result = new ArrayList<String>();
		String output;
		
		try {
			String[] cmd = {"/bin/sh", "-c","echo ${HOME}"};
			
			Process p = Runtime.getRuntime().exec(cmd);

			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			output = input.readLine();
			
			getFiles(output + "/.gconf");
			
			if(!output.equals("/root")){
				getFiles("/root/.gconf");
			}
			
			input.close();
			
			}catch (Exception e ) {
				e.printStackTrace();
			}
			
			result = allFiles;
			return result;
	}
	
	public void getFiles (String dir) {

		java.io.File file = new java.io.File(dir);
		java.io.File[] listFiles = file.listFiles();
		for (java.io.File f : listFiles) {
			if (!f.isDirectory()) {
				if (f.getPath().endsWith("%gconf.xml"))
					allFiles.add(f.getPath());
			}
			else getFiles(f.getPath());
		}
	}


	@Override
	public void synchronize() throws IOException {

	}
}
