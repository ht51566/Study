package st01_if;

import java.util.Scanner;

public class If09 {
	public static void main(String[] args) {
		// Scanner로 태어난 달을 입력 받아 계절 출력
		System.out.println("몇 월생입니까? >>> ");

		int month;
		String season;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();

		// 12, 1, 2 => 겨울, ... , 9, 10, 11 => 가을
		// if문 사용
		
		if (3 <= month && month <= 5)
			season = "봄";
		else if (6 <= month && month <= 8)
			season = "여름";
		else if (9 <= month && month <= 11)
			season = "가을";
		else if (month == 12 || (1 <= month && month <= 2))
			season = "겨울";
		else
			System.out.println("1~12월 중에 입력해주세요!");
				
		System.out.printf("%d월에 태어난 당신은 사랑스런 %s의 선물", month, season);
		sc.close();
	}
}
