package lambda;

public class AddTest {
	
	public static void main(String[] args) {
		
		//Anonymous inner interface(익명 구현 인터페이스)
		Add add = new Add() {
			//인터페이스의 추상 메소드 오버라이드
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println(add.add(9, 7));
		
		//구현하는 인터페이스가 Functional interface(함수적 인터페이스 - 추상 메소드가 하 이기 때문
		Add addLambda = (x, y) -> x + y;
		System.out.println(addLambda.add(9, 7));
	}
}	
