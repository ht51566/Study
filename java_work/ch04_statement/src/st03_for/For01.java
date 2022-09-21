package st03_for;

public class For01 {
	public static void main(String[] args) {
		/*
		for(초기식; 반복 조건; 증감식) {
			for(시작값; 끝값; step) {
				수행할 명령;
			}
		}
		*/

		// 0/1/2/3/4/5/6/7/8/9/
		// int i = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf(i + "/");
		}
		// System.out.println(i);
		System.out.println("\n--------------------");
		// 5/4/3/2/1
		for (int i = 5; i >= 1; i--) {
			System.out.printf(i + "/");
		}
		System.out.println("\n--------------------");
		// 2/4/6/8/10/
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.printf(i + "/");
			}
		}
		System.out.println("\n--------------------");
		for (int i = 2; i <= 10; i += 2) {
			System.out.printf(i + "/");
		}
		System.out.println("\n--------------------");
		// 1/3/9/
		for (int i = 1; i < 10; i *= 3) {
			System.out.printf(i + "/");
		}
		System.out.println("\n--------------------");
	}
}
