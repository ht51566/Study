package array;

import java.util.Arrays;

public class Arr09 {
	public static void main(String[] args) {
		
		//배열은 생성 후 크기 변경 불가능
		//크기 변경을 원하면 - 새로운 배열 생성 - 값 복사
		
		int[] num = new int[5];
		System.out.println(num);
		 
		for(int i = 0; i < num.length; i++) {
			num[i] = i * 2;
		}
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
		
		//num 배열의 길이를 늘려준 것이 아니라 새로운 10칸짜리 배열을 만들고 그 주소를 num에 저장
//		num = new int[10];
//		System.out.println(num.length);
//		System.out.println(Arrays.toString(num));
		
		int[] tmp = new int[num.length * 2];
		for(int i = 0; i < num.length; i++) {
			tmp[i] = num[i];
		}
		System.out.println(Arrays.toString(tmp));
		System.out.println(tmp);
		num = tmp;
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		num[0] = 100;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(tmp));
		
	}
}
