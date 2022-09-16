package operator;

public class Op02 {
	public static void main(String[] args) {
		//비교연산자: 결과값을 boolean 타입으로 반환
		// >, <, >=, <=, ==, !=
		
		int n1 = 33, n2 = 10;
		boolean result;
		
		result = n1 < n2;
		System.out.printf("%d %c %d = %b\n", n1, '<', n2, result);
		result = n1 > n2;
		System.out.printf("%d %c %d = %b\n", n1, '>', n2, result);
		result = n1 <= n2;
		System.out.printf("%d %s %d = %b\n", n1, "<=", n2, result);
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);
	}
}
