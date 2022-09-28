package abstract02;

public abstract class Shape {
	
	public Shape() {
		System.out.println("부모 생성자");
	}
	//일반 메소드
	void title() {
		System.out.println("도형 그리기");
	}
	//추상 메소드
	abstract void draw();
	abstract void delete();
	
}
