package co09_dto;

public class PersonEx {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("tom", "newyork", 12);
		Person p2 = new Person("sam", "paris", 37);
		Person p3 = new Person("jane", "berlin", 42);
		Person p4 = new Person("steve", "vienna", 29);
		
		Person[] persons = {p1, p2, p3, p4};
		
//		System.out.println(p1.name);
//		p1.name = "홍길동";
//		System.out.println(p1.name);
		
		System.out.println(p1.getName());
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		p2.setAge(11);
		System.out.println(p2.getAge());
		
//		System.out.println(p2);
		
		for(Person p : persons) {
			System.out.println(p);
			System.out.println("-----------------------------");
		}
	}
}
