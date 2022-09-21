package st02_switch;

import java.util.Scanner;

public class Sw05 {

	public static void main(String[] args) {
		String idNo;
		char gender;

		System.out.println("주민번호 입력하셈(1213456-1234567))>>>>");
		Scanner sc = new Scanner(System.in);
		idNo = sc.nextLine();
		gender = idNo.charAt(7);
		// 1, 3 - System.out.println("당신은 남자요!");
		// 1~4 이외의 경우: System.out.println("go to see a doctor!");

		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자요!");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자요!");
			break;
		default:
			System.out.println("go to see a doctor!");
		}
		
		sc.close();
	}

}
