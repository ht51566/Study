package net03_chattig.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("이름이 필요합니다.");
			return;
		}
		
		try {
			Socket socket = new Socket("192.168.0.111", 9002);
			Thread thread1 = new RecieverThread(socket);
			Thread thread2 = new SenderThread(socket, args[0]);
//			thread1.setDaemon(true);
//			thread2.setDaemon(true);
			thread1.start();
			thread2.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
