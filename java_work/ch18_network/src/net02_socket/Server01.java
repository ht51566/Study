package net02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket();
//			server.bind(new InetSocketAddress("localhost", 5001));
			server.bind(new InetSocketAddress("192.168.0.111", 5001));
			
			while(true){
				System.out.println("[waiting connection...]");
				Socket socket = server.accept();
				InetSocketAddress ias = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[connection 생성] - " +  ias.getHostName());
				
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				byte[] msg = new byte[100];
				in.read(msg);
				System.out.println(new String(msg));
				
				String str = "Welcome, here is KK!!!";
				out.write(str.getBytes());
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(server != null && !server.isClosed()) {
				try {
					server.close();
					System.out.println("서버 소켓 닫음");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
