package inheritance;

final class Ant{
	
}
//final 클래스 상속 불가능
//class SuperAnt extends Ant{
//	
//}

class Vehicle{
	final int price = 50000;
	final void stop() {
		//final 변수의 초기값 수정 불가능
		//price = 100000;
		System.out.println("Stop");
	}
	
	void drive(int speed) throws Exception {
		System.out.println(speed +"로 달립니다~");
	}
}

class Bus extends Vehicle{
	int price = 100000;
	
	//final 메소드 오버라이딩 불가능
//	@Override
//	void stop() {
//		System.out.println("bus stop!!!");
//	}
	
	@Override //annotation - 재정의 문법 체크
	//자식이 부모의 접근 제한자를 강화시킬 수 없다.
	void drive(int speed) throws Exception {
		if(speed < 0) {
			//익셉션 발생 시킴 - 부모에게 없는 익셉션 발생시킬 수 없다
			throw new Exception("니네 우주로 떠나거라~~~");
		}else {
			super.drive(speed);
		}
	}
}


public class In05 {
	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		//vh.price = 2000;
	}
	
}
