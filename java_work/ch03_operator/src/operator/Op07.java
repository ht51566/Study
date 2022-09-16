package operator;

public class Op07 {
	public static void main(String[] args) {
		// shift 연산자
		// <<(left 연산자), >>(right 연산자)

		int n1 = 5;
		System.out.println(n1 << 1);
		// left 연산자: 좌항의 변수값에 2의 n승을 곱한 결과
		// 5: 0000 0101
		// <<1:0000 1010 => 10 //5 * 2^1
		// <<2:0001 0100 => 20 //5 * 2^2
		System.out.println(n1 << 2);
		System.out.println(n1 << 3);

		// right 연산자: 좌항의 변수값에 2의 n승으로 나눈 결과
		System.out.println(n1 >> 1); // 5/2^1
		System.out.println(n1 >> 2); // 5/2^2
	}
}
