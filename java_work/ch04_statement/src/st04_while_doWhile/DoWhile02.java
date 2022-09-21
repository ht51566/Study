package st04_while_doWhile;

import java.util.Scanner;

public class DoWhile02 {
	// UpDown Game(1~100사이의 임의의 숫자 맞추기)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int select; // 게임 중단 여부
		int answer; // 게임 정답(무작위수)
		int input; // 게이머 입력값
		int times = 0; // 추측 횟수

		while (true) {
			System.out.println("게임 하고 싶으면 아무 숫자나 입력, 게임 중단 - 0 입력 >>> ");
			select = sc.nextInt();

			if (select == 0) {
				break;
			}
			answer = (int) (Math.random() * 100) + 1;
			do {
				System.out.println("1부터 100 사이의 정수를 입력하세요 >>> ");
				input = sc.nextInt();
				times++;
				if(input > answer) {
					System.out.println("down");
				}else if(input < answer){
					System.out.println("up");
				}
			} while (input != answer);
			
			System.out.println("congratulation!!! " + times + "번에 맞췄습니다!!!");
		}
		
		System.out.println("Did you have fun??? See you next time!!!");
	}

}
