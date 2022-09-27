package inheritance;

class Parent{
	String name;
	int age;
	int allowance = 5000;
		
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

class Student extends Parent{
	int grade;
	int allowance = 30000;
	
	public Student(String name, int age, int grade) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.grade = grade;
	}
	
	@Override
	void print() {
		super.print();
		System.out.println("grade: " + grade);
	}
}

public class In03 {
	public static void main(String[] args) {
		Parent p1 = new Parent("titan", 58);
		Parent p2 = new Student("ace", 15, 5);
		p1.print();
		p2.print();
		System.out.println("******************************");
		Parent[] pr = new Parent[3];
		pr[0] = p1;
		pr[1] = p2;
		pr[2] = new Student("jack", 28, 3);
		
		for(Parent p : pr) {
			p.print();
			if(p instanceof Student) {
				System.out.println(((Student)p).allowance);
			}else {
				System.out.println(p.allowance);
			}
			System.out.println("-----------------------");
			
		}
	}
}
