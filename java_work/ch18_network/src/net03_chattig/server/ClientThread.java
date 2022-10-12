package net03_chattig.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientThread extends Thread {

	// 클라이언트들이 사용할 PrintWriter 객체를 담은 동기화된 ArrayList를 부모 타입(List)으로 생성함.
	// static이므로 클라이언트들이 공유하는 메모리
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	// 필드(멤버변수) 선언
	Socket socket;
	PrintWriter writer;

	// 생성자: 연결된 socket 받아서 클라이언트 객체 생성
	public ClientThread(Socket socket) {
		// 서버에서 연결된 소켓을 멤버변수로 주입 받음
		this.socket = socket;
		try {
			// 소켓으로 내보낼 스트림(바이트)를 담은 PrintWriter 객체를 생성하여 만들어 놓은 리스트에 저장
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = null;

		try {
			// 소켓으로 들어오는 instream을 버퍼를 통해 읽기 위한 BufferedReader 객체 생성
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 클라이언트 접속하면서 전하는 최초 메시지를 읽어서 name에 저장
			name = reader.readLine();
			// 메시지를 접속한 클라이언트 전체에게 발송하는 메소드
			sendAll(">>" + name + "님이 입장하셨습니다.");
			while (true) {
				// 클라이언트의 메시지를 줄 단위로 읽어와서 null 아니면 모두에게 출력
				String str = reader.readLine();
				// System.out.println(str);
				if (str == null)
					break;

				sendAll(name + ">> " + str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			list.remove(writer);
			sendAll(name + "님이 나가셨습니다.");
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void sendAll(String str) {
		for(PrintWriter writer: list) {
			writer.println(str);
			writer.flush();
		}
	}
}
