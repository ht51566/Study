package st02_switch;

import java.util.Scanner;

public class Sw01 {
	public static void main(String[] args) {
		/*
		switch(판별식/값) {
		case 1(정수): ~~~~~~ break;
		case 2(정수): ~~~~~~ break;
		case 3(정수): ~~~~~~ break;
		default: ~~~~~~;
		}
		*/

		// Scanner로 입력받아 숫자에 맞는 단어 출력
		// msg 1: "Love", 2: "Belief", 3:"Hope", 4:"Money" 비인간적인 수: "Hate"

		Scanner sc = new Scanner(System.in);
		System.out.println("1~4 사이의 숫자를 입력하세요 >>> ");
		String kind = sc.nextLine();
		int num = Integer.parseInt(kind);
		
		String msg = "";

		switch (num) {
		case 1:
			System.out.println("LOVE");
			//msg = "LOVE";
			break;
		case 2:
			System.out.println("Belief");
			break;
		case 3:
			System.out.println("Hope");
			break;
		case 4:
			System.out.println("Money");
			break;
		default:
			System.out.println("Hate");
		}
		
		sc.close();
	}
}
