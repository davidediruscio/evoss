package failuresdetector;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//This class is able to send a file on the filesystem
public class FileSenderManager implements Runnable {

  private static final String DEFAULT_OPEN_DIR = "tmp";
	
  private String openDir = DEFAULT_OPEN_DIR;
  private String fileName;
  private Socket socket;
  
  public FileSenderManager(Socket socket, String fileName) throws IOException {
      this.socket = socket;
      this.openDir = DEFAULT_OPEN_DIR;
      this.fileName = fileName;
  }
  
  public FileSenderManager(Socket socket, String saveDir, String fileName) {
      this.socket = socket;
      this.openDir = saveDir;
      this.fileName = fileName;
  }
  
  public static final String getDefaultOpenDir() {
	  return DEFAULT_OPEN_DIR;
  }
  
  public String getOpenDir() {
	  return openDir;
  }
  
  public void setOpenDir(String openDir) {
	  this.openDir = openDir;
  }  
  
  public void run() {
	  sendFile();
  }
  
  public void sendSmallFile() {
	  File fileToSend = new File(getOpenDir() + "/" + fileName);
      try {
    	  if(fileToSend.exists()) {
    		  byte[] mybytearray = new byte[(int) fileToSend.length()];
    		  BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileToSend));
    		  bis.read(mybytearray, 0, mybytearray.length);
    		  OutputStream os = socket.getOutputStream();
    		  os.write(mybytearray, 0, mybytearray.length);
    		  os.flush();
    		  bis.close();
    	  }
      } catch (IOException e) {
    	  System.out.println("An error occurred when trying to send the file " + fileToSend.getName());
      }
  }
  
  public void sendFile() {
	  File fileToSend = new File(getOpenDir() + "/" + fileName);
      try {
    	  if(fileToSend.exists()) {
    		  byte[] mybytearray = new byte[(int) fileToSend.length()];
    		  DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
    		  dos.writeInt(mybytearray.length);
    		  if(fileToSend.length() <= 65536) {
    			  sendSmallFile();
    		  } else {
    			  byte[] buf = new byte[1024];
    			  BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileToSend));
    			  while ((bis.read(buf))!= -1){
    				  dos.write(buf);
    			  }
    			  bis.close();
    		  }
    		  dos.flush();
    	  }
      } catch (IOException e) {
    	  System.out.println("An error occurred when trying to send the file " + fileToSend.getName());
      }
  }

}
