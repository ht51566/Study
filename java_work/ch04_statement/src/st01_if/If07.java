package st01_if;

import java.util.Scanner;

public class If07 {

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
		} else if (score < 70) {
			grade = "D";
		} else if (score < 80) {
			grade = "C";
		} else if (score < 90) {
			grade = "B";
		} else {
			grade = "A";
		}

		if (score >= 60) {
			if (score % 10 >= 7 || score == 100) {
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
