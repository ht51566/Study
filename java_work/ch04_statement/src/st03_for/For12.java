package st03_for;

public class For12 {
	// 1~100까지의 합계 출력
	// 출력의 예
	// 1 ~ 10까지의 합: 55
	// 11 ~ 20까지의 합: 155(1~20까지의 합 - 1~10까지의 합 )~~

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("1부터 %d까지의 합계 = %d\n", i, sum);
			}
		}
		System.out.printf("1부터 100까지의 합계 = %d\n", sum);
		System.out.println("----------------------");

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("%2d부터 %3d까지의 합계 = %3d\n", i - 9, i, sum);
				sum = 0;
			}
		}
		System.out.println("----------------------");
		sum = 0;
		int one = 1;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("%2d ~ %3d까지의 합: %3d \n", one, i, sum);
				sum = 0;
				one = i + 1;
			}
		}
		System.out.println("----------------------");
		sum = 0; int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 10 == 0) {
				System.out.printf("%2d ~ %3d까지의 합: %3d \n", i-9, i, sum - sum2);
				sum2 = sum;
			}
		}
		System.out.printf("1부터 100까지의 합계 = %d\n", sum);
		
	}
}
