package co03_method;

public class Printer {
	//이름이 같아도 매개변수의 개수, 타입, 순서로 구분 - 메소드 오버로딩
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.println(19);
		printer.println("wow");
		printer.println(3.14);
		printer.println(true);
		
		//static method 실행 - Class명.method명
		Printer.println("wow");
		
	}

	private void println(boolean b) {
		System.out.println(b);
	}

	private void println(double d) {
		System.out.println(d);
	}

	private static void println(String s) {
		System.out.println(s);
	}

	private void println(int i) {
		System.out.println(i);		
	}
}
