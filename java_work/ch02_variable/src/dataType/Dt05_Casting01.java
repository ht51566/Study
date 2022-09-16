package dataType;

public class Dt05_Casting01 {
	public static void main(String[] args) {
		//형변환 - type conversion
		
		int num1 = 200;
		System.out.println(num1);
		//int 타입 변수의 값을 double 타입 변수에 대입 - 자동형변환
		//자동형변환: 작은 크기 타입을  큰 크기에 대입 
		double num2 = num1; 
		System.out.println(num2);
		
		//int num3 = num2; //Type mismatch: cannot convert from double to int
		int num3 = (int) num2; //강제 형변환: double -> int : data 손실 발생 가능
		System.out.println(num3);
		
		double num4 = 3.342443;
		System.out.println(num4);
		int num5 = (int)num4;
		System.out.println(num5);
		
		int intValue = 44032;
		char charValue = (char)intValue; //강제형변환
		System.out.println(intValue + " : " + charValue);
		
		int intV = 10;
		double douV = 5.5;
//		int result = intV + douV;
		double result = intV + douV; //int + double -> double
		int result2 = intV + (int)douV;
		int result3 = (int)(intV + douV);
		
		
		char a = 'A';
		char b = 'A' + 1;
		System.out.println(a + " - " + b);
		char c = (char)(a + 1); //char 변수를 정수와 연산하면 int로 형변환된다.
		
		//초기화 에러
		String str = ""; //빈문자열 초기화
		int num = 0;
		float f1 = 0.0f;
		//char c1 = ''; //char는 빈 문자로 초기화 불가
		char c1 = ' '; 
		
		byte b1 = 10;
		byte b2 = 20;
		//int 보다 작은 타입을 연산하면 자동으로 int로 형변환됨
		byte sum = (byte) (b1 + b2);
		
		
		
		
		
		
		
	}
}
