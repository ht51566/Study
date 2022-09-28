package InnerClass;

public class A {
	int field_A = 10;
	static int static_field_A = 20;

	public A() {
		System.out.println("A 객체 생성");
	}
	
	//인스턴스 이너 클래스
	class B {
		int field_B;

		public B() {
			System.out.println("B(inner) 객체 생성");
			field_A = 15;
		}
		
		void b_method() {
			field_A = 25;
			System.out.println("B(inner) 클래스 메소드 실행");
		}
	}
	
	//static 내부 클래스 - A클래스의 static 변수와 같은 개념
	static class C {
		int field_C;
		static int static_field_C = 55;
		public C() {
			System.out.println("C(static inner) 객체 생성");
			//field_A = 7;
			static_field_A = 7;
		}
		
		void c_method() {
			//field_A = 25;
			System.out.println("C(static inner) 클래스 메소드 실행");
		}
	}
	
	void a_method() {
		System.out.println("A(외부 클래스)의 메소드 실행");
		class D {
			int field_D;

			public D() {
				System.out.println("D(로컬 클래스) 객체 생성");
				field_A = 15;
			}
			
			void d_method() {
				field_A = 25;
				System.out.println("D(로컬 클래스) 메소드 실행");
			}
		}
		
		D d = new D();
		d.field_D = 37;
		d.d_method();
		
		//익명 내부 클래스
		B b = new B() {
			@Override
			void b_method() {
				System.out.println("외부 클래스 메소드에서 생성한 익명 내부 클래스 B의 메소드 실행 ㅋㅋㅋ 좀  복잡하지 ㅋㅋㅋ");
			}
		};
		b.b_method();
	}
}
