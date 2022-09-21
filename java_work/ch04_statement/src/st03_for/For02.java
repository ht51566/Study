package st03_for;

public class For02 {
	public static void main(String[] args) {

		// 1~10 까지의 합계
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("1부터 %d까지의 합: %d\n", i, sum);
		}
		System.out.println("sum = " + sum);
	}
}
