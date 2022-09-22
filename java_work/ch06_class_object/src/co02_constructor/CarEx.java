package co02_constructor;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car(); //기본 생성자
		c1.model = "sonata";
		c1.color = "silver";
		c1.print();
		
		Car c2 = new Car("grandure");
		c2.print();
		Car c3 = new Car("grandure", "white");
		c3.print();
		Car c4 = new Car("grandure", "white", 250);
		c4.print();
		System.out.println("-------------------------------------");
		Car[] garage = {c1, c2, c3, c4};
		
		for(Car myCar : garage) {
			myCar.print();
		}
		
	}
}
