package dev.ale.fdx;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import dev.ale.fdx.client.FdxClient;

public class Main {
	private static final String SOURCE_PATH = "/fdx_workspace/fdx-client/src/main/resource/Send";
	private static String HOST_IP = "127.0.0.1";
	private static int PORT_1988 = 2020;
	public static void main(String[] args) throws IOException {
		File pwd = new File(SOURCE_PATH);
		System.out.println(pwd.getPath());
		System.out.println(pwd.getAbsolutePath());
		System.out.println("Terhubung Port : " +PORT_1988);
		for (File file : pwd.listFiles()) {
			FdxClient client = new FdxClient(HOST_IP, PORT_1988, file);
			//client.moveFile();
		}
//		File file = new File(TARGET_PATH);
//				for(File f : file.listFiles()) {
//					Path movefrom = FileSystems.getDefault().getPath(TARGET_PATH+f.getName());
//					Path target = FileSystems.getDefault().getPath(CONVERT_PATH+f.getName());
//					
//					try
//					{
//						Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
//					}catch(IOException e) {x
//						System.err.println(e);
//					}
//				}
	}
}