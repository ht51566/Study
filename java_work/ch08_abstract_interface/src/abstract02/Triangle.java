package abstract02;

public class Triangle extends Shape{
	
	public Triangle() {
		System.out.println(this.getClass() + " 생성자");
	}
	
	@Override
	void draw() {
		System.out.println("삼각형 그리기");
	}

	@Override
	void delete() {
		System.out.println("삼각형 지우기");
	}

}
