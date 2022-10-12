package net03_chattig.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class RecieverThread extends Thread {

	Socket socket;

	public RecieverThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// 서버에서 소켓을 타고 넘어오는 instream을 받을 BufferedReader 객체 생성
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 소켓을 통해 들어오는 메시지를 읽어서 null이면 끝내고 아니면 출력
			while (true) {
				try {
					String str = reader.readLine();
					if (str == null)
						break;
					System.out.println(str);
				} catch (SocketException e) {
					System.out.println("통신 종료, bye");
					break;
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
