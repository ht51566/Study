package net03_chattig.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {

	// 필드: 소켓, 클라이언트 별명
	Socket socket;
	String name;

	public SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			//콘솔에서 입력되는 메시지 읽어들일 InputStream 생성
			BufferedReader reader = 
					new	BufferedReader(new InputStreamReader(System.in));
			//읽어들인 내용을 서버로 전송할 oupstream 객체 생성
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//출력 스트림으로 별명 전송
			writer.println(name);
			writer.flush();
			while(true) {
				//연결 이후 클라이언트가 입력하는 내용을 읽어서 저장 
				String str = reader.readLine();
				//내용이 bye면 종료 -> finally로 가서 소켓 닫음
				if(str.equals("bye")) {
					break;
				}
				//출력 스트림으로 서버로 전송
				writer.println(str);
				writer.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
