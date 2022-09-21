package array;

import java.util.Arrays;

public class Arr11 {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println(Arrays.toString(lotto));

		// 45칸 짜리 생성 후 랜덤 인덱스의 값을 앞쪽 6칸에 넣음.
		// 랜덤 값은 중복되어도 cell의 값은 중복 불가능

		lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		System.out.println(Arrays.toString(lotto));

		// lotto 배열의 앞쪽 6칸에 로또 번호가 들어갈 수 있도록 랜덤 인덱스 추출해서 숫자 바꾸기
		for(int i = 0; i < 6; i++) {
			int index = (int)(Math.random()*45);
			
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("====== 금주의 로또 당첨 예상 번호 =======");
		for(int i= 0; i< 6; i++) {
			if(i < 5) {
				System.out.print(lotto[i] + " - ");
			}else {
				System.out.print(lotto[i]);
			}
		}
		
		
	}
}
