package co07_access_modifier.pack2;

import co07_access_modifier.pack1.A;

public class D extends A{

	public static void main(String[] args) {
		A a1 = new A();

		// 다른 패키지에서는 public만 사용 가능
//		A a2 = new A(true);
//		A a3= new A("wow");
//		A a4= new A(7);

		System.out.println(a1.public_int);
//		System.out.println(a1.protected_int);
//		System.out.println(a1.default_int);
//		System.out.println(a1.private_int);
		
		//다른 패키지의 클래스를 상속 받았을 경우 자기 객체를 생성하면 부모 클래스의 protected에 접근 가능
		D d = new D();
		System.out.println(d.public_int);
		System.out.println(d.protected_int);
	}
}
