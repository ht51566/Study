package co04_static;

public class Static_Careful {
	
	int field1;
	void method1() {
		System.out.println("method1");
	}
	
	static int field2;
	static void method2() {
		System.out.println("method2");
	}
	
	public Static_Careful() {
		System.out.println("생성자");
		field1 = 15;
		method1();
		field2 = 77;
		method2();
	}
	
	//static 초기화 블록
	static {
		System.out.println("static block");
		field2 = 33;
		method2();
		
		//static 블록에서 인스턴스 변수, 메소드로 접근 불가
//		field1 = 33;
//		method1();
		
		Static_Careful sc = new Static_Careful();
		sc.field1 = 21;
		sc.method1();
	}
}
