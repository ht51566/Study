package api07_Math_Random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		System.out.println("int 형 난수 발생: " + rd.nextInt());
		System.out.println("float 형 난수 발생: " + rd.nextFloat());
		System.out.println("double 형 난수 발생: " + rd.nextDouble());
		System.out.println("long 형 난수 발생: " + rd.nextLong());
		System.out.println("boolean 형 난수 발생: " + rd.nextBoolean());
		System.out.println("gaussian 형 난수 발생: " + rd.nextGaussian());
		
		int dice = rd.nextInt(6) + 1;
		System.out.println(dice);
	}
}
