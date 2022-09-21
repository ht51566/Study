package array;

public class Arr05 {
	public static void main(String[] args) {
		// 정수 2차원 배열 3*3짜리 생성해서 값 넣고 일반 for, 확장 for로 출력
		// 출력 끝에서 sum, avg, max, min 출력
		int[][] num = { { 77, 69, 93 }, { 88, 69, 72 }, { 59, 82, 100 } };
		int sum = 0, max = num[0][0], min = num[0][0];
		// double avg;
		int numberOfStudents = 0;

		System.out.println("------------- 일반 for -------------");
		int leng = num.length;
		for (int i = 0; i < leng; i++) {
			// numberOfStudents += num[i].length;
			for (int j = 0; j < num[i].length; j++) {
				numberOfStudents++;
				// System.out.println(num[i][j]);
				sum += num[i][j];

				if (max < num[i][j]) {
					max = num[i][j];
				}
				if (min > num[i][j]) {
					min = num[i][j];
				}
			}
		}

		System.out.println("총점: " + sum);
		System.out.printf("평균: %.2f \n", (double) sum / numberOfStudents);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

		System.out.println("------------- 확장 for -------------");

		sum = 0;
		numberOfStudents = 0;
		for (int[] row : num) {
			for (int col : row) {
				sum += col;
				numberOfStudents++;
				if (max < col) {
					max = col;
				}
				if (min > col) {
					min = col;
				}
			}
		}
		System.out.printf("총 합계는 %d\n", sum);
		System.out.printf("평균은 %.2f\n", sum / (double) numberOfStudents);
		System.out.printf("max값은 %d\n", max);
		System.out.printf("min값은 %d\n", min);

	}
}
