package st01_if;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		int score = 0;
		String grade = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력해주세요 >>> ");
		score = sc.nextInt();

		if (60 <= score && score < 70) {
			grade = "D";
		} else if (70 <= score && score < 80) {
			grade = "C";
		} else if (80 <= score && score < 90) {
			grade = "B";
		} else if (80 <= score && score <= 100) {
			grade = "A";
		} else {
			grade = "F";
		}
		
		System.out.printf("성적은 %d점이고, 학점은 %s입니다.", score, grade);
	}
}
