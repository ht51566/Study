package dataType;

public class Dt02_Char {
	public static void main(String[] args) {
		
		char c1 = 65; //ascii 값
		System.out.println(c1);
		char c2 = 'A'; //char 값은 외따옴표로 표시
		if(c1 == c2) {
			System.out.println("같구마이!!!");
		}
		char c3 = '\u0041'; //unicode 값
		System.out.println(c3);
		
		int ic = c1;  //char 타입 변수의 값을  int 타입으로 형변환- 자동형변환
		System.out.println(ic); // 정수 65 출력
		
		char c4 = '가';
		System.out.println(c4);
		ic = c4;
		System.out.println(ic); //44032
		char c5 = '\uac00'; 
		System.out.println(c5);
		char c6 = 44033;
		System.out.println(c6);
		char c7 = 44034;
		System.out.println(c7);
		
		
		
		
	}
}
