package api02_System_Class;

class Car{
	void run() {
		System.out.println("haha");
	}
}

public class GetClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Car car = new Car();
		Class c1 = car.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getTypeName());
		System.out.println(c1.getCanonicalName());
		System.out.println(c1.getPackage().getName());
		System.out.println(c1.getModifiers());
		
		try {
			Class c2 = Class.forName("api02_System_Class.Car");
			System.out.println(c2.getName());
			Car car2 = (Car) c2.newInstance();
			car2.run();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
