package ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0;
		int max = 0;

		while (flag) {
			System.out.println("============================================");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료 ");
			System.out.println("============================================");

			System.out.println("선택 >>> ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생수 >>> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (select == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("%d번 학생 점수는? ", i + 1);
					scores[i] = sc.nextInt();
				}
			} else if (select == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("%d번 학생 점수: %d \n", i + 1, scores[i]);
				}
			} else if (select == 4) {
				int bunho = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
						bunho = i + 1;
					}
				}
				System.out.printf("총점: %d \n", sum);
				System.out.printf("평균: %.2f \n", (double) sum / scores.length);
				System.out.printf("1등: %d(%d번) \n", max, bunho);

			} else {
				flag = false;
			}

		}

		System.out.println("Program End");
		sc.close();
	}
}
