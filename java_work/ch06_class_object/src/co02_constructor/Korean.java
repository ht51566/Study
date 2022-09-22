package co02_constructor;

public class Korean {
	
	//field
	String nation = "Korea";
	String name;
	int age;
	String gender; //null로 초기화
	
	//constuctor
	
	//기본 생성자: 다른 생성자가 없으면 안 보여도 자동으로 만들어져서 있는 것임.
	// 다른 생성자 있으면 자동으로 만들어지지 않음. 
	public Korean() {}
	
	//매개변수 있는 생성자
	public Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Korean(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//method
	void say() {
		System.out.println("중얼중얼~~");
	}
	void smile() {
		switch(this.gender) {
		case "male":
			System.out.println("하하하~");
			break;
		case "female":
			System.out.println("호호호~");
			break;
		default:
			System.out.println("우하하~~");
		}
		
	}
}
