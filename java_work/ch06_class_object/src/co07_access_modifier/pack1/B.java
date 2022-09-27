package co07_access_modifier.pack1;

public class B {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A(true);
		A a3= new A("wow");
		//다른 클래스의 private 생성자, 필드 사용 불가
		//A a4= new A(7);
		
		System.out.println(a1.public_int);
		System.out.println(a1.protected_int);
		System.out.println(a1.default_int);
		//System.out.println(a1.private_int);
	}
}
