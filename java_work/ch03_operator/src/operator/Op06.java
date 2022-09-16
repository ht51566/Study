package operator;

public class Op06 {
	public static void main(String[] args) {
		//비트 연산자: 비트 단위(0과 1)로 연산
		// &, |, ^, !
		
		int n1 = 10;
		int n2 = 5;
		
		int result = n1 & n2;
		System.out.println(result);
		
		// 10: 0000 1010
		// 5 : 0000 0101
		// & :-----------
		//     0000 0000  => 0
		
		result = n1 | n2;
		System.out.println(result);
		
		// 10: 0000 1010
		// 5 : 0000 0101
		// | :-----------
		//     0000 1111  => 15
		
		
		n1 = 14;
		result = n1 ^ n2;
		System.out.println(result);
		
		// 10: 0000 1110
		// 5 : 0000 0101
		// ^ :-----------
		//     0000 1011  => 11
	}
}
