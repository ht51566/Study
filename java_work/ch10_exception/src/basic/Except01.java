package basic;

import java.util.Scanner;

public class Except01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		// runtime exception - 실행 하면서 발생하는 익셉션 - 개발자가 알아서 처리해줘야 함
		while (flag) {
			int num1 = 0, num2 = 0;
			try {
				System.out.println("정수 하나 입력 하셈 >>>");
				num1 = Integer.parseInt(sc.nextLine());// java.lang.NumberFormatException
				System.out.println("정수 하나 더 입력 하셈 >>>");
				num2 = Integer.parseInt(sc.nextLine()); // java.util.InputMismatchException
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				// System.out.println(e.getMessage());
				System.out.println("정수 입력하라니까 다시 해 인마!!! >>> ");
			}

			System.out.println("여기까지 올 수 있을까?");
//			try {
//				int num3 = num1 / num2; // java.lang.ArithmeticException: / by zero
//				System.out.println(num3);
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없음 ㅋㅋㅋ");
//			}
			int result = divide(num1, num2);
			
			System.out.println("여기까지 올 수 있을까 2?");
		}
	}

	private static int divide(int num1, int num2) {
		
//		try~catch~finally
		try { //try 블록: 익셉션 발생 가능 코드 포함
			int result = num1 / num2;
			return result;
		}catch(ArithmeticException e) { //catch 블록: 예외 발생시 처리
			//예외 발생 코드 추적 콘솔에 출력
//			e.printStackTrace();
			//예외 코드에 포함된 문자열 출력
			//System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없음 ㅋㅋㅋ");
		}finally {
			//exception 발생과 무관하게 해야 하는 일
			//주로 입출력 객체 닫을 때 사용
			System.out.println("finally, 난 말이지 항상 실행되는 그런 느낌적인 느낌이랄까 뭐랄까 ㅋㅋㅋ");
		}
		return 0;
		
		
	}
}
