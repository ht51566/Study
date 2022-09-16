package operator;

public class Op05 {
	public static void main(String[] args) {
		//대입연산자: 우항의 연산 결과를 좌항에 대입
		// =, +=, -=, *=, /=, %=
		
		int n1 = 10;
		n1 = 3;
		System.out.println(n1); //3
		
		n1 += 3; //n1 = n1 + 3
		System.out.println(n1); //6
		
		n1 -= 4;
		System.out.println(n1); //2
		
		n1 *= 3;
		System.out.println(n1); //6
		
		n1 /= 4;
		System.out.println(n1); //1
		
		n1 %= 10;
		System.out.println(n1); //1
	}
}
