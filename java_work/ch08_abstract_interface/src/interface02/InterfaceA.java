package interface02;

public interface InterfaceA {
	void method_A();
}

interface InterfaceB{
	void method_B();
}
//인터페이스는 다중 상속이 가능
interface InterfaceC extends InterfaceA, InterfaceB{
	void method_C();
}
