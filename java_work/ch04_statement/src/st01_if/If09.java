package st01_if;

import java.util.Scanner;

public class If09 {
	public static void main(String[] args) {

		int month;
		String season;

		// Scanner로 태어난 달을 입력 받아 계절 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월생입니까? >>> ");
		month = sc.nextInt();

		// 12, 1, 2 => 겨울, ... , 9, 10, 11 => 가을
		// if문 사용

		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "악마";
		}

		System.out.printf("%d월에 태어난 당신은 사랑스런 %s의 선물", month, season);

		sc.close();

	}
}
