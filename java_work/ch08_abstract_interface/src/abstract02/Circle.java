package abstract02;

public class Circle extends Shape{

	public Circle() {
		System.out.println(this.getClass() + " 생성자");
	}
	
	@Override
	void draw() {
		System.out.println("원 그리기");
	}

	@Override
	void delete() {
		System.out.println("원 지우기");
	}
	
	void kill(String name) {
		System.out.println(name + "을(를) 죽일거양~~~");
	}
}
