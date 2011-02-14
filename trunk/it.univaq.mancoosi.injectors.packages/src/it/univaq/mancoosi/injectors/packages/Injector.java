package it.univaq.mancoosi.injectors.packages;

import it.univaq.mancoosi.injectors.packages.managers.PackageManager;
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
		System.out.println("  -f|--file <package_filename>");
		System.out.println("  -c|--cachedir");
		System.out.println("  -p|--package <name> <version> <architecture>");
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
	
	
	public static void main(String[] args) {

		HashMap<String, Integer> options = new HashMap<String, Integer>();
		options.put("-i", 1);
		options.put("--installed", 1);
		options.put("-f", 2);
		options.put("--file", 2);
		options.put("-c", 3);
		options.put("--cachedir", 3);
		options.put("-p", 4);
		options.put("--package", 4);

		if (args == null || args.length == 0 || !options.containsKey(args[0])) {
			printHelpCommand();
			System.exit(1);
		}
		try {
			PackageManager manager = null;

			if ((new File("/etc/debian_version")).exists()
					|| (new File("/etc/ubuntu_version")).exists()) {

				manager = DebianPackageManager.getInstance();

			} else if ((new File("/etc/caixa_version")).exists()) {

			} else {
				System.out.println("The system is not supported.");
				System.exit(1);
			}

			switch (options.get(args[0])) {
			case 1: // -i | --installed
				manager.createModelFromInstalledPackages();
				break;
			case 2: // -f | --file
				if (args[1] != null) {
					manager.createModelFromPackageFile(args[1]);
				}
				break;
			case 3: // -c | --cachedir
				manager.createModelFromCacheDirectory();
				break;
			case 4: // -p | --package
				if (args[1] != null && args[2] != null && args[3] != null) {
					manager.createModelFromPackageData(args[1], args[2], args[3]);
				}
				break;
			default:
				printHelpCommand();
				System.exit(1);
			}
			printStats();
		 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
