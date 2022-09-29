package anonymous;

import java.util.Scanner;

public class Chatting {
	
	void startChat(String chatID) {
		String nickName = chatID;
		System.out.println(nickName + "님이 입장했음 ㅋㅋㅋ");
		//중첩 인터페이스를 익명 객체로 활용 - 익명 내부 인터페이스 - GUI, Thread에 주로 사용
		Chat chat = new Chat() {
			Scanner sc = new Scanner(System.in);
			@Override
			public void start() {
				while(true) {
					System.out.println("message >>> ");
					String input = sc.nextLine();
					String msg = "["+nickName+"] " + input;
					sendMessage(msg);
				}
			}
		};
		chat.start();
	}
	
	//중첩 인터페이스
	interface Chat{
		void start();
		default void sendMessage(String msg) {
			System.out.println(msg);
		}
	}
}
