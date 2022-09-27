package co04_static;

public class Accumulator {
	
	int total; //인스턴스 변수(이 클래스로 생성하는 객체마다 갖게 되는 변수, 자동초기화) 
	static int grandTotal = 10; //클래스 변수, 객체들이 공유하는 저장 공간
	
	
	void accumulate(int num) {
		total += num;
		grandTotal += num;
	}
}
