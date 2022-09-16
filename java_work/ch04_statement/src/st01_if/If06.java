package st01_if;

import java.util.Scanner;

public class If06 {
	public static void main(String[] args) {

		int score;

		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요 >>> ");
		score = sc.nextInt();

		String grade;
		// 90이상 "A", "B", "C", "D", 60 미만 "F"
		// 1의 자리가 7 이상이면 +, 4보다 작으면 -, 그 사이는 0을 붙여서 출력

		if (score < 60) {
			grade = "F";
		} else if (score <= 69) {
			grade = "D";
			if (score  >= 97) {
				grade += "+";
			} else if (score <= 94) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (score <= 79) {
			grade = "C";
			if (score % 10 >= 7) {
				grade += "+";
			} else if (score % 10 <= 4) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (score <= 89) {
			grade = "B";
			if (score % 10 >= 7) {
				grade += "+";
			} else if (score % 10 <= 4) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else {
			grade = "A";
			if (score % 10 >= 7) {
				grade += "+";
			} else if (score % 10 <= 4) {
				grade += "-";
			} else {
				grade += "0";
			}
		}

		System.out.printf("성적은 %d점이고, 학점은 %s입니다.", score, grade);
		
		sc.close();
	}
}
