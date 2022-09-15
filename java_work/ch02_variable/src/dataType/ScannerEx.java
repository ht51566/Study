package dataType;

//java.lang 패키지를 제외한 다른 패키지의 클래스를 사용하려면 import 필수
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//Scanner를 사용하려면  먼저 객체를 생성해야 함 - 시스템으로부터 입력을 받기 위한 스캐너 객체
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 >>> ");
//		int num1 = scan.nextInt();
//		String tmp = scan.nextLine();
//		int num1 = Integer.parseInt(tmp);
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("두 번째 정수를 입력하세요 >>> ");
		int num2 = scan.nextInt();
		
		System.out.printf("num1 %d + num2 %d = %d\n", num1, num2, num1+num2);
		
		
	}
}
