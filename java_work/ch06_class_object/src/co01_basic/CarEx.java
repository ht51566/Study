package co01_basic;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "HD";
		c1.color = "black";
		c1.maxSpeed = 180;
		
		c1.start();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.speedUp();
		c1.stop();
		System.out.println("---------------------");
		Car dreamCar = new Car();
		dreamCar.brand = "benz g63";
		dreamCar.color = "black";
		dreamCar.start();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.speedUp();
		dreamCar.stop();
		
	}
}
