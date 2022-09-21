package st04_while_doWhile;

import java.util.Scanner;

public class While05 {
	public static void main(String[] args) {
		// rock-scissors-paper game: 어느 한 쪽이 3승을 거두면 game 종료
		
//		프로그램에서 사용할 변수 선언 및 초기화
		int me, com, myWin = 0, comWin = 0, count = 0;
//		입력한 정수값을 문자로 바꿔 출력하기 위해 배열 생성
		String[] rsp = { "가위", "바위", "보" };
//		스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
//		while문으로 무한루프 시작
		while (true) {
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>");
			//입력값 정수로 받아서 저장
			me = sc.nextInt();
			//입력값 검증
			if(me < 1 || me > 3) {
				System.out.println("1~3 사이의 숫자 입력하셈 >>> ");
				//입력값이 조건에 맞지 않으면 이하의 명령 수행하지 않고 반복문 처음 자리에서 다시 시작
				continue;
			}
			//1~3사이의 랜덤 정수 추출하여 저장
			com = (int) (Math.random() * 3) + 1;

			//System.out.printf("나: %d vs 컴퓨터: %d \n", me, com);
			//입력값을 index로 사용하여 rsp 배열에서 문자값 빼서 출력
			System.out.printf("나: %s vs 컴퓨터: %s \n", rsp[me - 1], rsp[com - 1]);

			// switch문으로 승패 판별
			switch (me - com) {
			case 1:
			case -2:
				System.out.println("내가 이김");
				//승수 증가
				myWin++;
				break;
			case 2:
			case -1:
				System.out.println("컴이 이김");
				comWin++;
				break;
			case 0:
				System.out.println("비김");
				break;
//			default:
//				System.out.println("wrong input, try again!");
			}
			//총 경기수 증가
			count++;
			//현재까지의 승수 출력
			System.out.printf("me: %d승 vs com: %d승\n", myWin, comWin);
			System.out.println("--------------------------");
			//어느쪽이든 3승이면 while문 빠져나감
			if(myWin == 3 || comWin == 3) {
				break;
			}
		}
		
		System.out.println("Game End!!!");
		System.out.printf("총 %d판 겨룬 결과는 ..............\n", count);
		System.out.printf("me: %d승 vs com: %d승\n", myWin, comWin);
		
		sc.close();
	}
}
