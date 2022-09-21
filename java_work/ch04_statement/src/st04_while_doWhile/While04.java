package st04_while_doWhile;

import java.util.Scanner;

public class While04 {
	// 보고 싶은 구구단 출력, 0 입력시 중단
	// 2~9 사이일 경우에만 출력하고, 그 밖의 경우 에러 출력하고 다시 입력 받음
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean flag = true;

		// while (flag) {
		while (true) {
			System.out.println("보고 싶은 구구단은? 끝내려면 0 입력>>> ");
			
			num = sc.nextInt();
			
			if (num == 0) {
//				flag = false;
				break;
//				System.exit(0);
			}
			
			if (num >= 2 && num <= 9) {
				System.out.println("<<<<<<<" + num + "단>>>>>>");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %2d\n", num, i, num * i);
				}
			}  else {
				System.out.println("2 이상 9이하의 수를 입력하시오!!!");
			}
		}

		System.out.println("Program End !");
		sc.close();
	}
}
