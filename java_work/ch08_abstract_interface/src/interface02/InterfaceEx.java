package interface02;

class Iex implements InterfaceC{

	@Override
	public void method_A() {
		System.out.println("method_A 실행");
	}

	@Override
	public void method_B() {
		System.out.println("method_B 실행");
	}

	@Override
	public void method_C() {
		System.out.println("method_C 실행");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		
		Iex iex = new Iex();
		iex.method_A();
		iex.method_B();
		iex.method_C();
		
		InterfaceA ia = iex;
		ia.method_A();
		InterfaceB ib = iex;
		ib.method_B();
		InterfaceC ic = iex;
		ic.method_A();
		ic.method_B();
		ic.method_C();
	}
}
