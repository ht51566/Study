package co01_basic;

public class PersonEx {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand = "Lambourguini";
		c1.color = "limegreen";
		c1.maxSpeed = 380;
		
		
		Person p1 = new Person(); 
		Person p2 = new Person(); 
		Person p3 = new Person(); 
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.name = "tom";
		p1.age = 19;
		p1.gender = "m";
		
		p2.name = "jane";
		p2.age = 26;
		p2.gender = "f";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p1.smile();
		p2.smile();
		
		p1.smile(p1);
		p2.smile(p2);
		System.out.println("--------------");
		Person[] persons = {p1, p2};
		for(Person p : persons) {
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.gender);
			System.out.println("--------------");
		}
		
		p3.name = "손예림";
		p3.myCar = c1;
		
		System.out.println(p3.name);
		System.out.println(p3.myCar.brand);
		System.out.println(p3.myCar.color);
		
	}
}
