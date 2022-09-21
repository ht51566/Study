package st03_for;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {

		int start, end;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값 >>> ");
		start = sc.nextInt();
		System.out.println("끝값 >>> ");
		end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합계: %d\n", start, end, sum);

		sc.close();
	}
}
