package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.EList;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.AlternativesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.IconCacheManager;
import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.IconCache;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.impl.FileImpl;

public class UbuntuIconCacheManager extends IconCacheManager {
	
	protected MancoosiFactory factory; 
	
	public static IconCacheManager getInstance() {
		if (INSTANCE == null)
				INSTANCE = new UbuntuIconCacheManager();
		return INSTANCE;
	}	
	
	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean exists(String IconName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createIconCacheFromSystem() {
		   IconCache newIconCache;
		   String line;
		   
			try {
				newIconCache = factory.createIconCache();
	    		File iconCache = UbuntuFileSystemManager.getInstance()
	    							.createFile("/usr/share/icons/hicolor/icon-theme.cache");
	    		newIconCache.setEnv(UbuntuEnvironmentManager.getInstance().getEnvironment());
	    		newIconCache.setIcons(iconCache);
	    		
	    		String[] cmd = {"/bin/sh","-c","ls --time-style=long-iso -l /usr/share/icons/hicolor/icon-theme.cache | awk '{print $6 \"_\"  $7}'"};
			    Process p = Runtime.getRuntime().exec(cmd);
			    BufferedReader input =
			      new BufferedReader
			        (new InputStreamReader(p.getInputStream()));
			      
			    line = input.readLine();
	    		
	    		newIconCache.setMtime(line);
		    	UbuntuEnvironmentManager.getInstance().getEnvironment().setIconCache(newIconCache);

			} catch (Exception err) {
			      err.printStackTrace();
		    }
			
	   }
}
