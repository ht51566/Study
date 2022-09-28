package abstract01;

//추상 클래스 - 자식 클래스들의 핵심 만을 추출하여 재정의를 강요하는 클래스
//생성이 안 된다 - 설계도 역할과 자식들을 같은 타입으로 묶어주는 역할
public abstract class Animal {
	String kind;
		
	public Animal(String kind) {
		this.kind = kind;
	}
	
	//상속받은 자식 클래스들이 재정의하지 않고 사용하는 일반 메소드
	void breathe() {
		System.out.println(kind + "이(가) 숨을 쉽니다~~");
	}
	
	//구현부{}가 없는 추상메소드 - 추상 클래스에서만 사용 가능
	//이 클래스를 상속 받은 자식  클래스들은 추상 메소드를 무조건 재정의해야 한다 
	abstract void sound();
	abstract void eat(String food);
	
	
}
