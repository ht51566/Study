package st04_while_doWhile;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {

		// while문 대표적 사용 형태: 특정한 조건이 될 때까지 무한루프

		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("1부터 합계를 구하고 싶은 숫자 입력하셈 ㅋㅋㅋ, 프로그램 중단: 0 입력 >>> ");
			num = sc.nextInt();
//			if (num == 0) {
//				break;
//				flag = false;
//			}
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1부터 " + num + "까지의 합계: " + sum);
				sum = 0;
			} else if (num < 0) {
				System.out.println("1 이상의 수를 입력하시오!!!");
			} else {
				flag = false;
			}

		}

		System.out.println("Program End!!!");
		sc.close();
	}
}
