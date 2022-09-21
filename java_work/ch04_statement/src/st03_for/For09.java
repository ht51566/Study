package st03_for;

import java.util.Scanner;

public class For09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 구구단 >>> ");
		
		int num = sc.nextInt();
		System.out.println("구구단 " + num + "단");
		
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %2d\n", num, i, num*i);
		}
		sc.close();
		
		
	}
}
