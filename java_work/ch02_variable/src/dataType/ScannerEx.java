package dataType;

import java.io.File;
import java.io.FileNotFoundException;
//java.lang 패키지를 제외한 다른 패키지의 클래스를 사용하려면 import 필수
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws FileNotFoundException {

		// Scanner를 사용하려면 먼저 객체를 생성해야 함 - 시스템으로부터 입력을 받기 위한 스캐너 객체
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 >>> ");
//		int num1 = scan.nextInt();
//		String tmp = scan.nextLine();
//		int num1 = Integer.parseInt(tmp);

		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("두 번째 정수를 입력하세요 >>> ");
		int num2 = scan.nextInt();

		System.out.printf("num1 %d + num2 %d = %d\n", num1, num2, num1 + num2);

		scan.close();

		String input = "1 fish 2 fish red fish blue fish";
		//String을 읽어들이는 입력 장치 s를 생성함. 문자열을 읽으면서 사용할 구분기호 지정
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		
		Scanner sc = new Scanner(new File("a.txt"));
		System.out.println(sc.nextLine());
		sc.close();
		
		
		
	}
}
