package it.univaq.mancoosi.injectors.packages;

import it.univaq.mancoosi.injectors.packages.managers.debian.DebianPackageManager;

import java.io.File;
import java.util.HashMap;


public class Injector {

	public static void printHelpCommand() {
		System.out.println("Commands:");
		System.out.println("  -i|--installed");
		System.out.println("  -p|--package   <package file name>");
		System.out.println("  -c|--cachedir");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		HashMap<String, Integer> options =  new HashMap<String, Integer>();
		options.put("-i", 1);
		options.put("--installed", 1);
		options.put("-p", 2);
		options.put("--package", 2);
		options.put("-c", 3);
		options.put("--cachedir", 3);
		
		if (args == null || args.length ==0 || args.length >2 || !options.containsKey(args[0])) {
			printHelpCommand();
			System.exit(1);
		}
		
		if ((new File("/etc/debian_version")).exists()
		   ||(new File("/etc/ubuntu_version")).exists()) {
			
			switch (options.get(args[0])) {
				case 1: 
					DebianPackageManager.getInstance().createModelFromInstalledPackages();
					break;
				case 2:
					DebianPackageManager.getInstance().createModelFromPackageFile(args[1]);
					break;
				case 3:
					DebianPackageManager.getInstance().createModelFromCacheDirectory();
					break;
				default:
					printHelpCommand();
					System.exit(1);
			}
			
		} else if ((new File("/etc/caixa_version")).exists()) {
		}
	}

}
