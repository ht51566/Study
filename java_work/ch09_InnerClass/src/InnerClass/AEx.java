package InnerClass;


public class AEx {
	public static void main(String[] args) {
		
		System.out.println(A.static_field_A);
		A a = new A();
		System.out.println(a.field_A);
		System.out.println(A.static_field_A);
		
		//외부 클래스 객체를 통해서만 접근 가능
		A.B b = a.new B();
		System.out.println(b.field_B);
		b.b_method();
		System.out.println(a.field_A);
		
		A.C ac = new A.C();
		System.out.println(ac.field_C);
		ac.c_method();
		
		a.a_method();
	}
}
