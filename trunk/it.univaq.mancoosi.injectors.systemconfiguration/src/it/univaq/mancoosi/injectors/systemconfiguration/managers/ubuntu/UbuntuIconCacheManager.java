package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.AlternativesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.IconCacheManager;
import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.IconCache;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.impl.FileImpl;

public class UbuntuIconCacheManager extends IconCacheManager {

	public UbuntuIconCacheManager() {
		super();
	}
	
	public static IconCacheManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new UbuntuIconCacheManager();
		return INSTANCE;
	}	

	@Override
	public void createIconCacheFromSystem() {

		try {

			iconCache.setEnv(UbuntuEnvironmentManager.getInstance().getEnvironment());
			UbuntuEnvironmentManager.getInstance().getEnvironment().setIconCache(iconCache);

			boolean existIconCacheFile = updateIconCache();

			if(existIconCacheFile){
				File iconCacheFile = UbuntuFileSystemManager.getInstance()
									.createFile("/usr/share/icons/hicolor/icon-theme.cache");
		
				iconCache.setIcons(iconCacheFile);
				iconCache.setMtime(getMtimeUtil());
			}

		} catch (Exception err) {
			err.printStackTrace();
		}   
	}

	@Override
	public void synchronize() throws IOException {
		
		File iconCacheFile2 = UbuntuFileSystemManager.getInstance()
								.createFileInTheModel("/home/mirco/Desktop/model/data.txt");
		
		//UbuntuFileSystemManager.getInstance().deleteFile("/cb/martina.txt");
		
		//createIconCacheFromSystem();
//		File iconCacheFile = 
//			UbuntuFileSystemManager.getInstance()
//				.getFileFromModel("/usr/share/icons/hicolor/icon-theme.cache");
//		System.out.println(iconCacheFile2);
		/*
		if(UbuntuEnvironmentManager.getInstance().getEnvironment().getIconCache() != null){
			
			boolean existIconCacheFile = updateIconCache();

			if(existIconCacheFile){
				
//				String[] a = UbuntuFileSystemManager.getInstance().getFile(path)
//						.getFileInformation("/usr/share/icons/hicolor/icon-theme.cache");
				
				File iconCache = null;
				
				FileSystem fs = UbuntuFileSystemManager.getInstance().getFileSystem();
				Iterator i = fs.getAllFiles().iterator();
				boolean found = false;
				while (i.hasNext() && !found) {
					File curr = (File)i.next();
					if(curr.getLocation().equals("/usr/share/icons/hicolor/icon-theme.cache")) {
						iconCache = curr;
						found = true;
					}
				}
				
				if (!found) {
					iconCache = UbuntuFileSystemManager.getInstance()
					.createFile("/usr/share/icons/hicolor/icon-theme.cache");
					System.out.println(iconCache.eResource());
				}
				
				//System.out.println(UbuntuFileSystemManager.getInstance().getFileSystem().getAllFiles());
				/*
				File iconCache = UbuntuFileSystemManager.getInstance()
				.createFile("/usr/share/icons/hicolor/icon-theme.cache");
				
				System.out.println(UbuntuFileSystemManager.getInstance().getFileSystem().getAllFiles());
				
//				iconCache.setFs(UbuntuFileSystemManager.getInstance().getFileSystem());
				System.out.println(iconCache.eResource());
			
				UbuntuEnvironmentManager.getInstance().getEnvironment().getIconCache().setIcons(iconCache);
				String mTime = getMtimeUtil();
				UbuntuEnvironmentManager.getInstance().getEnvironment().getIconCache().setMtime(mTime);
			}
			else {
				UbuntuFileSystemManager.getInstance().deleteFile("/usr/share/icons/hicolor/icon-theme.cache");
				/////////////////////////
				MancoosiFactory factory = MancoosiFactory.eINSTANCE;
				IconCache newIconCache = factory.createIconCache();
				
				newIconCache.setEnv(UbuntuEnvironmentManager.getInstance().getEnvironment());
				UbuntuEnvironmentManager.getInstance().getEnvironment().setIconCache(newIconCache);
			}
			}	
*/
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
