package ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 10000;
		Scanner sc = new Scanner(System.in);
		int menu;

		while (run) {
			System.out.println("--------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");

			System.out.println("원하는 메뉴를 선택하세요~~ >>> ");
			menu = sc.nextInt();

			if (menu > 4 || menu < 1) {
				System.out.println("1~4까지의 메뉴를 선택하세요 >>>> ");
				continue;
			}

			switch (menu) {
	         case 1: //입금: 예금을 받아서 잔고에 더함
	            System.out.println("입금할 금액을 입력하세요 >>> ");
//	            int plus = sc.nextInt();
//	            balance += plus;
	            balance += sc.nextInt();
	            break;
	         case 2: //출금: 잔고에서 뺌
	            System.out.println("출금할 금액을 입력하세요 >>> ");
	            int minus = sc.nextInt();
	            balance -= minus;
	            break;
	         case 3: //현재 잔고 출력
	            System.out.println("잔고: " + balance);
	            break;
	         case 4:
	            run = false;
	            break;
	         }
		}
		System.out.println("See you next time!!!");
		sc.close();

	}
}
