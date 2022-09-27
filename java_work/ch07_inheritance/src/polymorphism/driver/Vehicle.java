package polymorphism.driver;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
	
	void meter() {
		System.out.println("요금 미터기로 계산하기");
	}
}

class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}
	
	void transit() {
		System.out.println("환승하기");
	}
}

