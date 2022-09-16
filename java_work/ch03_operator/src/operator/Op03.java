package operator;

public class Op03 {
	public static void main(String[] args) {
		// 논리 연산자: 비교연산자보다 순위가 뒤
		// &&(and), ||(or), !(not), ^(xor)

		int n1 = 10, n2 = 4, n3 = 7, n4 = 15;
		
		// &&: 좌항, 우항이 모두 참일 경우에만 참
		// ||: 좌항, 우항 어느 한쪽이라도 참이면 참
		
		System.out.println(n1 > n2 && n3 > n4);
		System.out.println(n1 > n2 && n3 < n4);
		System.out.println(n1 > n2 || n3 < n4);
		System.out.println(n1 > n2 || n3 < n4);
		System.out.println(n1 < n2 || n3 > n4);
		System.out.println("-------------------------");
		
		//^: 좌항 우항의 값이 같으면 false, 다르면 true
		System.out.println(n1 > n2 ^ n3 < n4); //true ^ true => false
		System.out.println(n1 > n2 ^ n3 > n4); //true ^ false => true
		System.out.println(n1 < n2 ^ n3 < n4); //false ^ true => true
		System.out.println(n1 < n2 ^ n3 > n4); //false ^ false => false
		System.out.println("-------------------------");
		
		//!: 단항연산자, 우항의 반대값 반환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(n1 > n2));
		System.out.println(!(n1 < n2));
		
	}
}
