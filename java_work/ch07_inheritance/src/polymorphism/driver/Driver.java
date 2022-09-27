package polymorphism.driver;

public class Driver {
	
//	void drive(Bus b) {
//		b.run();
//	}
//	void drive(Taxi t) {
//		t.run();
//	}
	//매개변수의 다형성 - 부모 타입의 매개변수로 자식 타입을 던지면 자동 형변환되어 쑉 들어간다
	void drive(Vehicle v) {
		//메소드 실행은 자식이 재정의한 형태로 실행된다. 
		v.run();
		if(v instanceof Bus) {
			((Bus)v).transit();
		}else if(v instanceof Taxi) {
			((Taxi)v).meter();
		}
	}
}
