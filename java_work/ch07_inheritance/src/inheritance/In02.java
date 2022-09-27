package inheritance;

import java.util.Date;

class Tire{
	String brand;
	Date produced;
}

class Car{
	String color;
	int door;
	//포함관계 - 자동차가 타이어를 갖는다 Car has a Tire
	Tire[] tires;
	
	void drive() {
		System.out.println("차가 달려간다");
	}
	void stop() {
		System.out.println("차가 멈춘다");
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + "]";
	}
}

//상속관계: 앰뷸런스는 자동차다 Ambulance is a Car
class Ambulance extends Car{
	
	String cross;
	
	void siren() {
		System.out.println("삐요삐요~~");
	}
	@Override
	void drive() {
		super.drive();
		System.out.println("앰뷸런스다, 길을 비켜라!!");
	}
}

class FireEngine extends Car{
	
	void extinguish() {
		System.out.println("물을 뿌려서 불을 끄자, 영차 영차 ㅋㅋㅋ");
	}
	@Override
	void drive() {
		super.drive();
		System.out.println("불자동차다, 길을 비켜라!!!");
	}
}

public class In02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		c1.door = 4;
		System.out.println(c1);
		System.out.println("-------------------------");
		Ambulance am1 = new Ambulance();
		FireEngine fe1 = new FireEngine();
		c1.drive();
		am1.drive();
		fe1.drive();
		am1.siren();
		fe1.extinguish();
		System.out.println("-------------------------");
		Car c2 = new Ambulance(); //부모(Car) 타입으로 자식(Ambulance) 객체 생성
		c2.color = "white";
		c2.door = 4;
		System.out.println(c2);
		c2.drive(); //부모 타입으로 메소드 실행해도 자식이 오버라이딩 했으면 수정된 내용으로 실행됨
		//c2.siren();  //부모 타입이어서 자기 메소드라도 보이지 않음
		Car c3 = new FireEngine();
		c3.color = "gold";
		c3.drive();
		//c3.extinguish()
		System.out.println("--------------------------");
		//상속의 장점 - 확장성, 다형성
		//다형성 - 여러 상이한 타입을 하나의 타입으로 처리할 수 있다.
		Car[] garage = new Car[3];
		garage[0] = c1;
		garage[1] = am1; //자동 형변환되어 Car(부모) 타입으로 바뀜
		garage[2] = fe1;
		
		for(Car c : garage) {
			c.drive();
			//c.siren();
			//instanceof: 객체 타입 확인하는 연산자
			if(c instanceof Ambulance) {
				((Ambulance) c).siren();
			}else if(c instanceof FireEngine) {
				((FireEngine)c).extinguish();
			}
			c.stop();
			System.out.println("------------------");
		}
	
	}
}
