package inheritance;

class Airplane{
	void takeoff() {
		System.out.println("tack off!!!");
	}
	void fly() {
		System.out.println("normal flying!!!");
	}
	void land() {
		System.out.println("landing!!!");
	}
}

class Supersonic extends Airplane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flymode = NORMAL;
	
	@Override
	void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("sonic boom! supersonic power!!!");
		}else {
			super.fly();
		}
	}
	
	@Override
	public String toString() {
		String[] mode = {"", "NORMAL","SUPERSONIC"};
		return "현재 비행모드: " + mode[this.flymode]; 
	}
}

public class In04 {
	public static void main(String[] args) {
		Airplane a1 = new Supersonic();
		a1.takeoff();
		a1.fly();
		System.out.println(a1);
		((Supersonic)a1).flymode = Supersonic.SUPERSONIC;
		a1.fly();
		System.out.println(a1);
		((Supersonic)a1).flymode = Supersonic.NORMAL;
		a1.fly();
		System.out.println(a1);
		a1.land();
	}
}
