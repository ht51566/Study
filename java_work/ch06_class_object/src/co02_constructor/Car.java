package co02_constructor;

public class Car {
	
	//field : 인스턴스 변수
	String brand = "HD";
	String model;
	String color;
	int maxSpeed;
	
	//constructor
	//기본 생성자 
	public Car() {
		this("EQ900", "white", 330); //String String int 매개변수 3개짜리 생성자 빌려 쓰기
		System.out.println("EQ900 생성됨");
	}
	//매개변수 1개짜리 생성자
	public Car(String model) {
		this("yellow", 250);//매개변수 2개짜리 생성자(String int) 빌려 쓰기
		this.model = model;
	}
//	public Car(String color) {
//		this.color = color;
//	}
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car(int maxSpeed, String model, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

	//method
	void print() {
		System.out.printf("brand: %s, model: %s, color: %s, maxSpeed: %d \n", brand, model, color, maxSpeed);
	}
	
}
