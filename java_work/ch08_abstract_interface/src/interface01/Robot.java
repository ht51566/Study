package interface01;

//자식 클래스들의 설계도 - 
//상수, 추상메소드만 가질 수 있다
//인터페이스를 구현한 자식 클래스들은 추상메소드를 오버라이딩 해야 한다
//자식 클래스들의 연결고리 역할을 한다 - 다형성 이용

public interface Robot {
	//추상메소드: 나를 구현하는 클래스들은 각자의 충전 방식을 사용하라
	void recharge();
}

class DanceRobot implements Robot{

	@Override
	public void recharge() {
		System.out.println("dance ~~~ recharge");
	}
	
	void dance() {
		System.out.println("움칫 탁치 흔들 흔들~~");
	}
}

class SingRobot implements Robot{

	@Override
	public void recharge() {
		System.out.println("sing ~~~ recharge");
	}
	
	void sing() {
		System.out.println("nanana ucjadnhkfls~~");
	}
	
}

class DrawRobot implements Robot{

	@Override
	public void recharge() {
		System.out.println("draw ~~~ recharge");
	}
	void draw() {
		System.out.println("monariza~~ ");
	}
}

//Robot 인터페이스를 구현한 추상메소드
abstract class CodingRobot implements Robot{
	
	String name;
	
	abstract void programm();
}

interface Calculatable{
	void cal();
}

class JavaRobot extends CodingRobot implements Calculatable{
	//Robot interface의 추상메소드
	@Override
	public void recharge() {
		System.out.println("java ~~~ recharge");
	}
	//CodingRobot 추상 클래스의 추상메소드
	@Override
	void programm() {
		System.out.println("DooDada~~~");
	}
	
	@Override
	public void cal() {
		System.out.println("계산 잘 하지~~");
	}
	
}


