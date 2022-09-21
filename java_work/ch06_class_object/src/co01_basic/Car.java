package co01_basic;

public class Car {
	
	//field
	String brand;
	String color;
	int maxSpeed = 250;
	int speed;
	
	//constructor
	
	//method
	void start() {
		System.out.println("부우우웅~");
	}
	void speedUp() {
		System.out.println("gogo");
		this.speed += 10;
		System.out.println(this.speed);
	}
	void brake() {
		System.out.println("아이 무셔~");
		this.speed -= 10;
		System.out.println(this.speed);
	}
	void stop() {
		System.out.println("끼이익~");
		this.speed = 0;
		System.out.println(this.speed);
	}
	
}
