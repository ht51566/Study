package array;

import java.util.Arrays;

public class Arr14 {
//버블정렬: 둘 씩 비교해서 큰 쪽을 오른쪽으로 이동 - 한 바퀴 돌면 마지막 자리에 최대값이 위치

	public static void main(String[] args) {
		int[] score = new int[10];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100);
		}

		int tmp;
		int count = 0;
		boolean change;

		System.out.println(Arrays.toString(score));

		for (int i = 0; i < score.length - 1; i++) {
			change = false;
			for (int j = 0; j < score.length - 1 - i; j++) {
				count++;
				if (score[j] > score[j + 1]) {
					tmp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = tmp;
					change = true;
				}
			}
			if (!change)
				break;
		}
		System.out.println(Arrays.toString(score));
		System.out.println("비교 횟수: " + count);
	}
}
