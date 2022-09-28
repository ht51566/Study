package InnerClass;

public class Vehicle {
	
	int wheel;
	
	void drive() {
		System.out.println("부우웅~~~");
	}
	
	void transform(String name, int wheel) {
		//로컬 이너 클래스
		class RobotCar extends Vehicle{
			public RobotCar() {
				System.out.println(name + " 변신!!!");
			}
			
			@Override
			void drive() {
				System.out.println("바퀴 " + wheel +"개로 우당탕 우당탕~~");
			}
		}
		
		RobotCar rc = new RobotCar();
		rc.wheel = wheel;
		rc.drive();
	}
}
