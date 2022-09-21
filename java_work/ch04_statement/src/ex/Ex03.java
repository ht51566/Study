package ex;

public class Ex03 {
	// 4*x + 5*y = 60 식을 만족하는 x와 y의 쌍을 구하시오
	// x, y 값의 범위는 1~10

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("%d - %d \n", x, y);
				}
			}
		}
	}
}
