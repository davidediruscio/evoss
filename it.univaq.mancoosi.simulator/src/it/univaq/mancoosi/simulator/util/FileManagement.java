/**
 * 
 */

package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * The class handles file copying,
 * the creation of temporary files.
 * 
 * @author max
 */
public class FileManagement {

	/**
	 * Private constructor
	 */
	private FileManagement() {
	}

	/**
	 * Manages the file copy based on the parameters
	 * 
	 * @param source Source file
	 * @param target Copy file
	 * @throws SimulatorException
	 */
	public static void copyFile(final File source, final File target)
			throws SimulatorException {

		if (!target.exists()) {
			try {
				target.createNewFile();
			} catch (IOException e) {
				throw new SimulatorException("Error creating file for copying",
						e);
			}
		}

		FileChannel sourceChannel = null;
		FileChannel targetChannel = null;

		try {
			sourceChannel = new FileInputStream(source).getChannel();
			targetChannel = new FileOutputStream(target).getChannel();
			targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		} catch (FileNotFoundException e) {
			throw new SimulatorException("Error file not found", e);
		} catch (IOException e) {
			throw new SimulatorException("Error file for copying", e);
		} finally {
			if (targetChannel != null) {
				try {
					targetChannel.close();
				} catch (IOException e) {
					throw new SimulatorException(
							"Error closing file in the copy", e);
				}
			}

			if (sourceChannel != null) {
				try {
					sourceChannel.close();
				} catch (IOException e) {
					throw new SimulatorException(
							"Error closing file in the copy", e);
				}
			}
		}
	}

	
	/**
	 * Create a temporary file in temporary folder 
	 * (specified in the properties file settings.properties)
	 * 
	 * @param pattern
	 * @param suffix
	 * @return File
	 * @throws SimulatorException
	 */
	public static File createTempFile(String pattern, String suffix)
			throws SimulatorException {
		
		File temp;
		try {
			temp = File.createTempFile(pattern, "." + suffix, new File(
					SimulatorConfig.getInstance().getTmpDir()));
		} catch (IOException e) {
			throw new SimulatorException("Error creating temporary file", e);
		}

		if (!SimulatorConfig.getInstance().isSaveTempFiles()) {
			temp.deleteOnExit();
		}

		return temp;
	}
	
	
	/**
	 * Delete the contents of the directory passed as input (path)
	 * @param path
	 */
	public static void cleanDirectory(String path) {
		File directory = new File(path);
		if (directory.exists()) {
			File[] files = directory.listFiles();
			for (File f : files)
				f.delete();
		}
	}
}
