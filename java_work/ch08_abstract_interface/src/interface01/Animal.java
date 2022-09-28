package interface01;

public interface Animal {
	
	//상수만 변수로 가질 수 있다 - 인스턴스 변수 사용 불가
	//String kind;
	//static final String KIND = "dog";
	String OWNER = "GOD";
	
	//추상 메소드
//	void breathe() {
//		System.out.println("숨을 쉽니다~~");
//	}
	
//	public abstract void sound();
//	public abstract void eat(String food);
	void sound();
	void eat(String food);
	
}
