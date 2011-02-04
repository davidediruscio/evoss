package it.univaq.mancoosi.injectors.packages;

import it.univaq.mancoosi.injectors.packages.managers.debian.DebianPackageManager;
import it.univaq.mancoosi.injectors.packages.util.InjectorStatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;


public class Injector {

	public static void printHelpCommand() {
		System.out.println("Commands:");
		System.out.println("  -i|--installed");
		System.out.println("  -p|--package   <package file name>");
		System.out.println("  -c|--cachedir");
	}
	
	private static void printStats() throws FileNotFoundException {
		
		InjectorStatistics stat = InjectorStatistics.getInstance();
		
		Integer correctPackageNoScript = stat.getCorrectPackageNoScript();
		Integer correctPackageWithScript = stat.getCorrectPackageWithScript();
		Integer errorPackageNoScript = stat.getErrorPackageNoScript();
		Integer errorPackageWithScript = stat.getErrorPackageWithScript();
		Integer total = correctPackageNoScript + correctPackageWithScript + errorPackageNoScript + errorPackageWithScript;
		
	    FileOutputStream file = new FileOutputStream("stats.txt");
	    PrintStream Output = new PrintStream(file);

		
	    Output.println("Total packages processed: " + total);
	    Output.println("   packages processed correctly with scripts: " + correctPackageWithScript);
	    Output.println("   packages processed correctly without scripts: " + correctPackageNoScript);
	    Output.println("   packages not processed correctly with scripts: " + errorPackageWithScript);
	    Output.println("   packages not processed correctly without scripts: " + errorPackageNoScript);

	    Output.close();
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
		
		printStats();
	}

}
