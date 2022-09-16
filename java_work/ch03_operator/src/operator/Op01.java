package operator;

public class Op01 {
	public static void main(String[] args) {

		// 산술연산자
		// +, -, *, /, %
		int n1 = 33, n2 = 10;
		int result;
		
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		//java의 나눗셈 - 몫만 반환
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);
		
	}
}
