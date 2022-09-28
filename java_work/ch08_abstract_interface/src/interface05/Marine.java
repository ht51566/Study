package interface05;

public class Marine extends GroundUnit implements Attackable{

	public Marine() {
		super(30);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine";
	}

	@Override
	public void attack(Unit u) {
		int damage = 10;
		System.out.println(this + ": " + u + "를 죽이고야 말거야 ㅋㅋㅋ");
		u.hitPoint -= damage;
		System.out.println(u.hitPoint);
	}
}

class Tank extends GroundUnit implements Reparable, Attackable{

	public Tank() {
		super(300);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}

	@Override
	public void attack(Unit u) {
		int damage = 100;
		System.out.println(this + ": " + u + "를 죽이고야 말거야 ㅋㅋㅋ");
		u.hitPoint -= damage;
		if(u.hitPoint <= 0) {
			u.die();
		}
		System.out.println(u.hitPoint);
	}
}

class Dropship extends AirUnit implements Reparable{

	public Dropship() {
		super(100);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}

class SCV extends AirUnit implements Reparable{

	public SCV() {
		super(80);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	//기계류만 수리 가능
	void repair(Reparable r) {
		Unit u = (Unit)r;
		System.out.println(u.hitPoint);
		while(u.hitPoint < u.MAX_HP) {
			u.hitPoint++;
			System.out.println(u.hitPoint);
		}
		System.out.println(u + "의 수리 완료!!!");
		
	}
}


