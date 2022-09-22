package co03_method;

public class Calculator {

	// field
	int memory;
	String owner;

	public Calculator(String owner) {
		this.owner = owner;
	}

	// method
	void powerOn() {
		System.out.println("Power on, Welcome " + owner + "!");
	}

	void powerOff() {
		System.out.println("Power off, "+ owner + " byebye!");
	}

	// void: return 없는 메소드
	void plus(int x, int y) {
		int result = x + y;
		this.memory = result;
		System.out.println(result);
	}

	// return 있는 메소드 - 반환값의 데이터 타입으로 시작, 호출한 쪽으로 결과값 반환
	int minus(int x, int y) {
		int result = x - y;
		this.memory = result;
		return result;
	}

	void multi(int x, int y) {
		int result = x * y;
		this.memory = result;
		System.out.println(result);
	}

	int devide(int x, int y) {
		int result = x / y;
		this.memory = result;
		return x / y;
	}

	void resetMemory() {
		this.memory = 0;
	}

}
