package failuresdetector;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

//This class is able to receive a file and save it on the filesystem
public class FileReceiverManager implements Runnable {

  private static final String DEFAULT_SAVE_DIR = "tmp";
	
  private String saveDir = DEFAULT_SAVE_DIR;
  private String fileName;
  private Socket socket;

  public static String pathSep = File.separator;
  
  public FileReceiverManager(Socket socket, String fileName) {
      this.socket = socket;
      this.saveDir = DEFAULT_SAVE_DIR;
      this.fileName = fileName;
  }

  public FileReceiverManager(Socket socket, String saveDir, String fileName) {
      this.socket = socket;
      this.saveDir = saveDir;
      this.fileName = fileName;
  }
  
  public static final String getDefaultSaveDir() {
	  return DEFAULT_SAVE_DIR;
  }
  
  public String getSaveDir() {
	  return saveDir;
  }
  
  public void setSaveDir(String saveDir) {
	  this.saveDir = saveDir;
  }
  
  public void run() {
	  getFile();
  }
  
  /*
  private void getSmallFile() {
      try {    	  
    	  	byte[] mybytearray = new byte[65536];
    	    InputStream is = socket.getInputStream();
    	    FileOutputStream fos = new FileOutputStream(getSaveDir() + pathSep + fileName);
    	    BufferedOutputStream bos = new BufferedOutputStream(fos);
    	    int bytesRead = is.read(mybytearray, 0, mybytearray.length);    	    
    	    bos.write(mybytearray, 0, bytesRead);
    	    bos.close();
    	    fos.close();
      } catch (IOException e) {
    	  System.out.println("An error occurred when trying to receive a file.");
      } catch (ArrayIndexOutOfBoundsException e) {
    	  System.out.println("An error occurred when trying to receive a file.");
      }
  }
  */
  
  private void getFile() {
	 try {
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		int dim = dis.readInt();

		DataOutputStream bos = new DataOutputStream((new FileOutputStream(getSaveDir() + pathSep + fileName)));
		System.out.println("Receiving the file " + getSaveDir() + pathSep + fileName + " ...");		
	   
		byte[] buf = new byte[dim];
		dis.readFully(buf);
		bos.write(buf);
		
		/* int auxDim = 0;
	    byte buf;
	    
	    while (auxDim < dim) {
	    		buf = dis.readByte();
	    		bos.writeByte(buf);
	    		auxDim++;
	    }
	  */
	    System.out.println("The file " + getSaveDir() + pathSep + fileName + " has been received");
	    	    
		bos.flush();
		bos.close();
		
	    
	} catch (IOException e) {
		System.out.println("An error occurred when trying to receive a file.");
	}
   }
  }
