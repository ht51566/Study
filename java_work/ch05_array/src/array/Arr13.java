package array;

import java.util.Arrays;

public class Arr13 {
	public static void main(String[] args) {
		
		//선택 정렬: 한 바퀴 돌때마다 가장 작은 수가 왼쪽으로 이동
		int[] score = new int[10];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100);
		}
		
		int tmp; int count = 0;
		
		System.out.println(Arrays.toString(score));
		for(int i = 0; i <score.length - 1; i++) {
			for(int j = i+1; j<score.length; j++ ) {
				count++;
				if(score[i] > score[j]) {
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(score));
		System.out.println("비교 횟수: " + count);
		
	}
}
