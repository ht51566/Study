package array;

import java.util.Arrays;

public class Arr12 {
	public static void main(String[] args) {

		// 다른 방법: 6칸짜리 정수 배열 생성
		// 1~45까지의 random 수를 뽑아서 저장하는데
		// 매 번 그때까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고
		// i값을 1빼서 다시 돌린다.

		int[] lotto = new int[6];
		int count = 0;
		for (int i = 0; i < lotto.length; i++) {
			//난수 뽑아서 index 3번에 저장
			lotto[i] = (int) (Math.random() * 45) + 1;
			count++;
			//저장된 수가 0번, 1번, 2번에 저장된 숫자와 중복되는지 하나씩 검사하고 중복이면 올라가서 3번 칸 다시 뽑자
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("랜덤 수 추출 횟수: " + count);
		//Arrays의 메소드 sort 사용하여 오름차순 정렬
		//Arrays.sort(lotto);
		
		//버블정렬
		int tmp; boolean change;
		for(int i = 0; i < lotto.length - 1; i++) {
			change = false;
	         for(int j = 0; j < lotto.length - 1 - i; j++) {
	            if(lotto[j] > lotto[j + 1]) {
	               tmp = lotto[j];
	               lotto[j] = lotto[j + 1];
	               lotto[j + 1] = tmp;
	               change = true;
	            }
	         }
	         if(!change) break;
	      }
	      System.out.println(Arrays.toString(lotto));
		
	}
}
