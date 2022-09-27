package co04_static;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed = 60;
		System.out.println(c1.speed + " : "+ c1.static_speed);
		
		Car c2 = new Car();
		c2.speed = 90;
		System.out.println(c2.speed + " : "+ c2.static_speed);
		
		c1.static_speed = 123;
		System.out.println(c1.speed + " : "+ c1.static_speed);
		System.out.println(c2.speed + " : "+ c2.static_speed);
//		System.out.println(Car.speed);
		System.out.println(Car.static_speed);
		c1.stop();
		System.out.println(c1.speed + " : "+ c1.static_speed);
		System.out.println(c2.speed + " : "+ c2.static_speed);
//		System.out.println(Car.speed);
		System.out.println(Car.static_speed);
		
	}
}
