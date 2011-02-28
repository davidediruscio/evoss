package it.univaq.mancoosi.validator.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import it.univaq.mancoosi.validator.exceptions.ValidatorException;

public class FileManagement {

	public static void copyFile(final File source, final File target)
			throws ValidatorException {

		if (!target.exists()) {
			try {
				target.createNewFile();
			} catch (IOException e) {
				throw new ValidatorException("Error creating file for copying",
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
			throw new ValidatorException("Error file not found", e);
		} catch (IOException e) {
			throw new ValidatorException("Error file for copying", e);
		} finally {
			if (targetChannel != null) {
				try {
					targetChannel.close();
				} catch (IOException e) {
					throw new ValidatorException(
							"Error closing file in the copy", e);
				}
			}

			if (sourceChannel != null) {
				try {
					sourceChannel.close();
				} catch (IOException e) {
					throw new ValidatorException(
							"Error closing file in the copy", e);
				}
			}
		}
	}

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
		System.gc();
		// The directory is now empty so delete it
		return dir.delete();
	}

	static public List<File> getFileListing(File aStartingDir)
			throws FileNotFoundException {

		validateDirectory(aStartingDir);

		List<File> result = getFileListingNoSort(aStartingDir);

		Collections.sort(result);

		return result;
	}

	static private List<File> getFileListingNoSort(File aStartingDir)
			throws FileNotFoundException {

		List<File> result = new ArrayList<File>();

		File[] filesAndDirs = aStartingDir.listFiles();

		List<File> filesDirs = Arrays.asList(filesAndDirs);

		for (File file : filesDirs) {

			result.add(file);

			if (!file.isFile()) {

				List<File> deeperList = getFileListingNoSort(file);

				result.addAll(deeperList);

			}
		}
		return result;
	}


	public static File createTempDirectory() throws Exception {
		
		final File temp;

		temp = new File("validation"+Long.toString(System.nanoTime()));

		temp.delete();

		if (!(temp.mkdir())) {
			throw new ValidatorException("Could not create temp directory: " + temp.getAbsolutePath());
		}

		return (temp);
	}
	
	
	static private void validateDirectory(File aDirectory)
			throws FileNotFoundException {

		if (aDirectory == null) {

			throw new IllegalArgumentException("Directory should not be null.");

		}

		if (!aDirectory.exists()) {
			throw new FileNotFoundException("Directory does not exist: "
					+ aDirectory);
		}

		if (!aDirectory.isDirectory()) {
			throw new IllegalArgumentException("Is not a directory: "
					+ aDirectory);
		}

		if (!aDirectory.canRead()) {
			throw new IllegalArgumentException("Directory cannot be read: "
					+ aDirectory);
		}
	}
}
