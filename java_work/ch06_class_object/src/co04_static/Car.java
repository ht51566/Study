package co04_static;

public class Car {
	
	int speed;
	static int static_speed;
	
	void drive() {
		System.out.println(speed + "로 달리는 중~~~");
	}
	
	static void stop() {
		System.out.println("stop!");
		static_speed = 0;
	}
	
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.stop();
		
		Car.stop();
	}
}
