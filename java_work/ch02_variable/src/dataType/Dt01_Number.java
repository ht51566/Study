package dataType;

public class Dt01_Number {
	//변수: 기본형(primitive) / 참조형(reference)
	public static void main(String[] args) {
		//number type: 정수형, 실수형
		
		//정수형: byte, char, short, int, long
		//byte수: 1  /  2   /  2  /  4  /  8
		
		//byte: 1byte = 8bit  / bit: 0이나 1을 담을 수 있는 공간(메모리 최소 크기)
		//1byte: 0000 0000 - 2^8 = 256가지의 경우의 수 => -128~127까지 표현 가능
		
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = 127;
		//byte b4 = 128; //Type mismatch: cannot convert from int to byte
		//-2^7 ~ 2^7-1
		
		byte b5 = 125; //1byte에 저장됨
		int num1 = 125; //4byte에 저장됨
		
		for(int i = 0; i < 260; i++) {
			b5++;
			num1++;
			System.out.println("b5: " + b5 + " / num1: " + num1);
		}
		
		//int의 범위: -2^31 ~ 2^31-1: -2147483648 ~ 2147483647
		int num2 = 2111111111;
		//long의 범위: -2^63 ~ 2^63-1: 
		long num3 = 9111111111111111111L; //long 타입은 l, L로 표시
		
		int num4 = num2 * 2;
		System.out.println(num4);
		
		//실수 타입: float / double
		//byte 수:   4   /   8
		//부동소수점 오류 - 소수점 연산은 주의 
		float f1 = 3.14f;  //float 타입은 f, F로 표시
		double d1 = 3.14;
		
		int num6 = 300000;
//		Integer in99 = 2342423;
//		Integer in98 = new Integer(3423432);
		float num7 = 3e5f;
		double num8 = 3e5;
		double num9 = 2e-3;
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		
		
		
		
		
		
		
		
		
		
		
	}
}
