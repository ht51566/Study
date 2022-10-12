package net03_chattig.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("192.168.0.111", 9002));
			System.out.println("[연결 대기...]");
			while(true) {
				socket = server.accept();
				
				Thread thread = new ClientThread(socket);
				thread.start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
