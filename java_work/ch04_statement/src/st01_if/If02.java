package st01_if;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		
		//Scanner로 정수 하나를 입력 받아(nextInt()) 절대값을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력하셈 >>> ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println(num);
		}else {
			System.out.println(num * -1);
		}
		
		sc.close();
		
		
	}
}
