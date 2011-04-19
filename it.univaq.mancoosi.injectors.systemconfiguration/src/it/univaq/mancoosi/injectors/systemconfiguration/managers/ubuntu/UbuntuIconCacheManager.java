package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.IconCacheManager;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.IconCache;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UbuntuIconCacheManager extends IconCacheManager {

	public static IconCacheManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new UbuntuIconCacheManager();
		return INSTANCE;
	}	

	@Override
	public void createIconCacheFromSystem() {

		boolean existIconCacheFile = updateIconCache();

		if(!existIconCacheFile){
			System.out.println("vchgmgmjoh");
			return;
		}
		IconCache newIconCache;

		try {
			newIconCache = factory.createIconCache();
			File iconCache = UbuntuFileSystemManager.getInstance()
			.createFile("/usr/share/icons/hicolor/icon-theme.cache");

			if(iconCache == null){
				return;
			}
			newIconCache.setEnv(UbuntuEnvironmentManager.getInstance().getEnvironment());
			newIconCache.setIcons(iconCache);	    		

			newIconCache.setMtime(getMtimeUtil());
			UbuntuEnvironmentManager.getInstance().getEnvironment().setIconCache(newIconCache);

		} catch (Exception err) {
			err.printStackTrace();
		}			
	}

	@Override
	public void synchronize() throws IOException {

		boolean existIconCacheFile = updateIconCache();

		if(!existIconCacheFile){
			return;
		}

		String mTime = getMtimeUtil();

		if(UbuntuEnvironmentManager.getInstance().getEnvironment().getIconCache() != null){
			UbuntuEnvironmentManager.getInstance().getEnvironment().getIconCache().setMtime(mTime);
		}
	}


	protected String getMtimeUtil(){

		String mTime;

		try {
			String[] cmd = {"/bin/sh",
					"-c",
			"ls --time-style=long-iso -l /usr/share/icons/hicolor/icon-theme.cache | awk '{print $6 \"_\"  $7}'"};
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			mTime = input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return mTime;		
	}

	protected boolean updateIconCache(){

		String output;

		try {
			String[] cmd = {"gtk-update-icon-cache",
					"-t",
			"/usr/share/icons/hicolor"};
			Process p = Runtime.getRuntime().exec(cmd);

			BufferedReader input =
				new BufferedReader
				(new InputStreamReader(p.getInputStream()));

			output = input.readLine();

			java.io.File iconCacheFile = new java.io.File("/usr/share/icons/hicolor/icon-theme.cache");
			return iconCacheFile.exists();

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}


}
