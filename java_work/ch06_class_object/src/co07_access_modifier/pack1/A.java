package co07_access_modifier.pack1;

public class A {
	
	public int public_int = 0;
	protected int protected_int = 1;
	int default_int = 2;
	private int private_int = 3;
	
	
	public A() {}	
	protected A(boolean b) {}	
	A(String s) {}	
	private A(int d) {}	
	
	public static void main(String[] args) {
		//같은 클래스 안에선 접근제한자의 종류와 무관하게 모두 사용 가능
		A a1 = new A();
		A a2 = new A(true);
		A a3= new A("wow");
		A a4= new A(7);
		
		System.out.println(a1.public_int);
		System.out.println(a1.protected_int);
		System.out.println(a1.default_int);
		System.out.println(a1.private_int);
		
	}
	
}
