package st03_for;

public class For05 {
	public static void main(String[] args) {
		
		// for문에서 사용하는 변수를 바깥에서 선언 - 바깥에서 사용 가능
		int i, j;

		for (i = 1, j = 10; i <= 10; i++, j--) {
			System.out.printf("i: %d \t j: %d \n", i, j);
			System.out.println(i + "번 일했음");
		}

		System.out.printf("for문 빠져나올 때의 i: %d \t j: %d \n", i, j);
	}
}
