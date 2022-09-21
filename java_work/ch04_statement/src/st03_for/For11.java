package st03_for;

public class For11 {
	// 주사위 두 개 굴려서 합이 6이 나오는 경우를 출력
	/*
	주사위1 	| 주사위2 |합계 
	----------------------
	1		| 5		| 6
	----------------------
	2		| 4		| 6
	----------------------
	3		| 3		| 6
	----------------------
	4		| 2		| 6
	----------------------
	5		| 1		| 6
	*/
	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		System.out.println("주사위1 	| 주사위2 |합계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				count++;
				sum = i + j;
				if (sum == 6) {
					System.out.println("----------------------");
					System.out.printf("%d \t| %d \t| %d\n", i, j, sum);
					break;
				}
			}
		}
		System.out.println("총 횟수: " + count);
	}

}
