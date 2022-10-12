package net02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client01 {
	
	public static void main(String[] args) {
		
		Socket socket = null;
	
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello Server, " +socket.getLocalAddress();  
			out.write(str.getBytes());
			
			byte[] msg = new byte[100];
			in.read(msg);
			System.out.println(new String(msg));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
