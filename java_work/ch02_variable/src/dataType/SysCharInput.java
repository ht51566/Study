package dataType;

import java.io.IOException;

public class SysCharInput {

	public static void main(String[] args) throws IOException {

		char a = '0';
		System.out.println(a + " - " + (int) a); // '0'의 ascii 코드값 - 48

		System.out.println("2~9 사이의 숫자를 입력하세요 >>> ");

		// int num = System.in.read() - 48;
		int num = System.in.read() - '0';
		System.out.printf("입력한 숫자는 %d입니다. \n", num);
		
		// enter값 발생: 다음 입력을 위해 처리해줘야 함.
		// \r\n: \r => cr 13 \n => 10
		// 두 값을 받아서 변수에 저장하지 않으면 쓰레기 처리반(garbage collector)이 처리함
//		System.in.read(); //cr값 처리
//		System.in.read(); //lf값 처리
		System.in.skip(2);
		
		System.out.println("a~z 사이의 문자 하나를 입력하셈 >>> ");
		char input = (char) System.in.read();
		System.out.printf("입력한 키는 %c입니다.", input);

	}
}
