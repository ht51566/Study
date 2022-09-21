package array;

import java.util.Arrays;

public class Arr03 {
	public static void main(String[] args) {

		int[] scores = { 79, 88, 91, 69, 12, 82, 97, 56, 74, 100, 39, 48, 92, 73 };
		System.out.println(scores); // 객체 자체를 출력하면 주소값
		System.out.println(scores.toString()); // 주소값 - 객체의 문자열
		System.out.println(Arrays.toString(scores));
		System.out.println("-----------------------------");

		// sum, avg, max, min
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " / ");
		}
		System.out.println("\n-------------------------------------");
		// 확장 for
		for (int val : scores) {
			System.out.print(val + " / ");
		}
		System.out.println("\n-------------------------------------");
		int sum = 0; double avg;
		
		for (int val : scores) {
			sum += val;
		}
		avg = sum / (double) scores.length;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f \n", avg);
		System.out.println("-------------------------------------");
//		int max = scores[0], min = scores[0];
		int max, min;
		max = min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
