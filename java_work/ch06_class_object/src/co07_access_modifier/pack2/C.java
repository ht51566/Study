package co07_access_modifier.pack2;

//패키지가 다르면 public이라도 import 해야 사용 가능
import co07_access_modifier.pack1.A;

public class C {
	public static void main(String[] args) {
		A a1 = new A();
		
		//다른 패키지에서는 public만 사용 가능
//		A a2 = new A(true);
//		A a3= new A("wow");
//		A a4= new A(7);
		
		System.out.println(a1.public_int);
//		System.out.println(a1.protected_int);
//		System.out.println(a1.default_int);
//		System.out.println(a1.private_int);
		
		
	}
}
