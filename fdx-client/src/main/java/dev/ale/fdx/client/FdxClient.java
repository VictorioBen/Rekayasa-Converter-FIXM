package dev.ale.fdx.client;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FdxClient {

	private Socket socket;
	private static String HOST_IP = "127.0.0.1";
	private static int PORT_1988 = 2020;
	private static final String CONVERT_PATH ="/fdx_workspace/fdx-client/src/main/resource/OutBox";
	private static final String SOURCE_PATH = "/fdx_workspace/fdx-client/src/main/resource/Send";
	private static String FILENAME = "test1.txt";

	public FdxClient(String host, int port, File file) {
		try {
			socket = new Socket(host, port); 
			sendFile(file);
			//saveFile();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendFile(File file) throws IOException, ClassNotFoundException {
		//ObjectInputStream ois;
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		FileInputStream fis = new FileInputStream(file);
		byte[] buffer = new byte[(int)file.length()];
		dos.writeUTF(file.getName());
		while((fis.read(buffer)) >= 0) 
		{
			dos.write(buffer);
			System.out.println("File terkirim  : " +file.getName());
			
		}
		//saveFile();
		
		//validation();
		//ois = new ObjectInputStream(socket.getInputStream());
//		String message = (String) ois.readObject();
//		System.out.println("Server: " + message);
//		//ois.close();
		
		fis.close();
		dos.close();
	}
	
//	public void closeConnection() {
//		try {
//			if(fis!=null) {
//				
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void moveFile() throws IOException
	{


		File files = new File(SOURCE_PATH);
		for(File f : files.listFiles()) {
			Path movefrom = FileSystems.getDefault().getPath(SOURCE_PATH+f.getName());
			Path target = FileSystems.getDefault().getPath(CONVERT_PATH+f.getName());

			try
			{
				Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Berhasil dipindah ke convert_path");
			}catch(IOException e) {
				System.err.println(e);
			}
		}
	}
	
	public void saveFile() throws IOException {
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		FileOutputStream fos = new FileOutputStream(CONVERT_PATH+dis.readUTF());
		byte[] buffer = new byte[4096];

		int filesize = 15123; // Send file size in separate msg
		int read = 0;
		int totalRead = 0;
		int remaining = filesize;
		while((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {
			totalRead += read;
			remaining -= read;
			fos.write(buffer, 0, read);
		}
	}


		//		System.out.println(pwd.listFiles()[0]);
		//		ClassLoader loader = FileClient.class.getClassLoader(); 
		//		FileClient client = new FileClient(HOST_IP, PORT_1988, pwd.listFiles()[0]);
		//		System.out.println(loader.getResource(FILENAME).getPath());
	}


