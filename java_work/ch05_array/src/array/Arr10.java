package array;

import java.util.Arrays;

public class Arr10 {
	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		System.out.println(Arrays.toString(numArr));
		
		for(int i =0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		System.out.println(Arrays.toString(numArr));
		
				
		//배열을 랜덤값으로 채웠지만 중복값 발생
//		for(int i = 0 ; i < numArr.length; i++) {
//			numArr[i] = (int) (Math.random() * 10) + 1;
//		}
//		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0 ; i < 1000; i++) {
			int num = (int) (Math.random() * 10);
			//임시 변수 이용해서 각 칸에 저장된 값들을 랜덤하게 교환
			int tmp = numArr[0];
			numArr[0] = numArr[num];
			numArr[num] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
	}
}
