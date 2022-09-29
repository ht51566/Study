package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				
				int[] num = new int[2];
				System.out.println("정수 하나 입력하셈 >>> ");
				int num1 = Integer.parseInt(sc.next()); //InputMismatchException
				num[0] = num1;
				System.out.println("정수 하나 더 입력하셈 >>> ");
	
				int num2 = Integer.parseInt(sc.next());//NumberFormatException
				num[1] = num2;
				num[2] = num[0] + num[1]; //ArrayIndexOutOfBoundsException
			}catch(InputMismatchException e) {
				System.out.println("정수 입력 ㅋㅋㅋ");
			}catch(NumberFormatException e) {
				System.out.println("정수 입력 ㅋㅋㅋ");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인데스도 모르나, 바보 ㅋㅋㅋ");
			}finally {
				System.out.println("program 고고씽!!!");
			}
			
		}
		
	}
}
