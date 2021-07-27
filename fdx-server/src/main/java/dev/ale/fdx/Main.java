package dev.ale.fdx;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
private static final int PORT_1988 = 2020;

public static void main(String[] args) {
	FdxListener server = new FdxListener(PORT_1988);
	System.out.println("||Server start waiting client||");
	System.out.println("|| ========================= ||");
	server.start();
	
	
}

}