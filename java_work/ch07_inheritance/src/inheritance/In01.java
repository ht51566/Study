package inheritance;

class A{
	int a = 1;
	
	void a() {
		System.out.println("a() - parent");
	}

	//부모인 Object 클래스의 toString 메소드를 재정의하여 객체 출력시 주소가 아니라 인스턴스 변수값을 출력하도록 함.
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}

}
class C{
	
}
//상속: extends(확장하다) : 부모 클래스(super class)의 변수와 메소드를 그대로 물려받음
//java에서 상속은 하나만 할 수 있다~~~~ 즉 다중 상속 불가
//추가로 자기 변수와 자기 메소드를 가질 수도 있다.
//물려받은 변수와 메소드를 고쳐서 쓸 수 있다 -> 다형성
class B extends A{
	int b = 7;
	int a = 3; //상속받은 변수값 수정
	
	void b() {
		System.out.println("b() - child");
	}
	
	//부모인 A클래스의 a() 메소드 재정의
	@Override
	void a() {
		//부모의 a() 메소드 실행
//		super.a();
		System.out.println("a() - child");
	}
}

public class In01 extends B{
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.a);
		a1.a();
		System.out.println(a1);
		System.out.println("--------------------");
		B b1 = new B();
		System.out.println(b1.b);
		b1.b();
		System.out.println(b1.a);
		b1.a();
		//a1.b();//부모가 자식의 변수나 메소드 사용 불가
		System.out.println("----------------------------");
		
		//A 타입의 변수 a2에 B 타입의 객체를 생성하여 저장 - 자식 하나 낳아서 부모 옷 입혔다.
		A a2 = new B(); //자동 형변환 - 부모 타입으로 자식 객체 저장
		B b2 = (B)a2; //부모 타입을 자식 타입으로 강제 형변환
		//b2 = (B)a1; // 부모 타입(실제로도 부모 객체)을 자식 타입으로 강제 형변환 - 런타임(실행환경)에서 익셉션 발생
		
//		int n = 12; 
//		double d = n; //자동 형변환 
//		n = (int) d; //강제 형변환
		
		//자식 객체가 부모 타입으로 부모 필드 사용 : 자식이 고친 값이 아니라 부모의 필드값이 나옴
		System.out.println(a2.a); 
		//자식 객체가 부모 타입으로 부모 메소드 사용 : 자식이 고친(override) 메소드가 실행됨 -> 다형성 
		a2.a();
		//부모 타입의 자식 객체(부모 옷 입고 있을 때)는 자기 필드와 메소드 사용 불가
//		System.out.println(a2.b);
//		a2.b();
		
		System.out.println("--------------------------------");
		In01 in = new In01();
		in.a();
		in.b();
		A a3 = in;
		B b3 = in;
		System.out.println(a3.a);
		System.out.println(b3.a);
		
	}

}
