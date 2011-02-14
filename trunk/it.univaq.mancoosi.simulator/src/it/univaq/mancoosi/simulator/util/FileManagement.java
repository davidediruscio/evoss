/**
 * 
 */

package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;

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
			throw new SimulatorException("File not found", e);
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
	 * Create a temporary file (deleteOnExit) in temporary folder 
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
	 * 
	 * @return
	 * @throws IOException
	 */
	public static File createTempDirectory() throws Exception {
		
		final File temp;

		temp = File.createTempFile("simulation", Long.toString(System.nanoTime()), new File(
				SimulatorConfig.getInstance().getTmpDir()));

		if (!(temp.delete())) {
			throw new SimulatorException("Could not delete temp file: " + temp.getAbsolutePath());
		}

		if (!(temp.mkdir())) {
			throw new SimulatorException("Could not create temp directory: " + temp.getAbsolutePath());
		}

		return (temp);
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
	
	
	/**
	 * 
	 * @param daysBack
	 * @param dir
	 * @throws Exception
	 */
	public static void deleteFilesOlderThanNdays(int daysBack, String dir) throws Exception {

		File directory = new File(dir);
		if (directory.exists()) {
			File[] listFiles = directory.listFiles();
			long purgeTime = System.currentTimeMillis() - Math.abs(daysBack * 24 * 60 * 60 * 1000);
			for (File listFile : listFiles) {
				if (listFile.lastModified() < purgeTime) {
					if (!listFile.isDirectory() &&  !listFile.delete()) {
						throw new SimulatorException("Unable to delete file: " + listFile);
					}
				}
			}
		} else {
			throw new SimulatorException("Files were not deleted, directory "+dir+" does not exist!");
		}
	}
	
	
	/**
	 * 
	 * @param dir
	 */
	public static void renameFilesDir(String dir) {

		File directory = new File(dir);

		File files[] = directory.listFiles();

		int max = 0;

		ArrayList<File> notOlds = new ArrayList<File>();

		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();

			int j = name.indexOf('.');
			int k = name.indexOf('_');

			if (k > 0) {
				int tmp = Integer.valueOf(name.substring(k+1, j));
				if (tmp > max) {
					max = tmp;
				}
			} else {
				if (!files[i].isDirectory()) {
					notOlds.add(files[i]);
				}
			}
		}	

		for (File f : notOlds) {
			String n = f.getName();

			int index = n.indexOf('.');

			String newname = n.substring(0, index) + "_" + (max + 1)
						+ n.substring(index, n.length());
			File newFileName = new File(f.getParentFile(), newname);

			f.renameTo(newFileName);

			}
		}
	
	
	/**
	 * 
	 * @param directoryPath
	 * @param tarGzPath
	 * @throws Exception 
	 * @throws IOException
	 */
	public static void createTarGzOfDirectory(String directoryPath, String tarGzPath) throws Exception {
	   
		FileOutputStream fOut = null;
	    BufferedOutputStream bOut = null;
	    GzipCompressorOutputStream gzOut = null;
	    TarArchiveOutputStream tOut = null;
	 
	    try {
	        fOut = new FileOutputStream(new File(tarGzPath));
	        bOut = new BufferedOutputStream(fOut);
	        gzOut = new GzipCompressorOutputStream(bOut);
	        tOut = new TarArchiveOutputStream(gzOut);
	 
	        addFileToTarGz(tOut, directoryPath, "");
	    } catch (Exception e) {
			throw new SimulatorException("Error in the creation of the tar.gz file", e);
		} finally {
	        try {
				tOut.finish();
		        tOut.close();
		        gzOut.close();
		        bOut.close();
		        fOut.close();
			} catch (IOException e) {
				throw new SimulatorException("Error in the creation of the tar.gz file", e);
			} 
	    }
	}

	
	/**
	 * 
	 * @param tOut
	 * @param path
	 * @param base
	 * @throws Exception 
	 * @throws IOException
	 */
	private static void addFileToTarGz(TarArchiveOutputStream tOut, String path, String base) throws Exception {
	    File f = new File(path);
	    String entryName = base + f.getName();
	    TarArchiveEntry tarEntry = new TarArchiveEntry(f, entryName);
	 
	    tOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
		try {
			tOut.putArchiveEntry(tarEntry);

			if (f.isFile()) {
				IOUtils.copy(new FileInputStream(f), tOut);

				tOut.closeArchiveEntry();
			} else {
				tOut.closeArchiveEntry();

				File[] children = f.listFiles();

				if (children != null) {
					for (File child : children) {
						addFileToTarGz(tOut, child.getAbsolutePath(), entryName
								+ "/");
					}
				}
			}
		} catch (IOException e) {
			throw new SimulatorException("Error in the creation of the tar.gz file", e);
		}
	}
	
	
	/**
	 * 
	 * @param dir
	 * @return
	 */
	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		// The directory is now empty so delete it
		return dir.delete();
	}
}
