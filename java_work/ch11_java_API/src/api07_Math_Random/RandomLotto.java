package api07_Math_Random;

import java.util.Arrays;
import java.util.Random;

public class RandomLotto {
	
	public static void main(String[] args) {
		
		int[] selNum = new int[6];
		Random rd1 = new Random(5);
		System.out.print("선택 번호: ");
		for(int i = 0; i <selNum.length; i++) {
			selNum[i] = rd1.nextInt(45) + 1;
			System.out.print(selNum[i]  + " ");
		}
		System.out.println();
		int[] winNum = new int[6];
		Random rd2 = new Random(3);
		System.out.print("당첨 번호: ");
		for(int i = 0; i <winNum.length; i++) {
			winNum[i] = rd2.nextInt(45) + 1;
			System.out.print(winNum[i]  + " ");
		}
		System.out.println();
		
		Arrays.sort(selNum);
		Arrays.sort(winNum);
		System.out.println(Arrays.toString(selNum));
		System.out.println(Arrays.toString(winNum));
		
		boolean result = Arrays.equals(selNum, winNum);
		if(result){
			System.out.println("wow, 천원 만~~~");
		}else {
			System.out.println("다음 기회에~~~");
		}
	}
}
