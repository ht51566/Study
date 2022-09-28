package interface05;

public class Unit {

	// 현재 생명력
	int hitPoint;
	// 최대 생명력
	final int MAX_HP;

	public Unit(int hp) {
		this.MAX_HP = hp;
	}

	void die() {
		System.out.println(this + ": I'm dead, I'll be back!!!");
	}
}

class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
	}
}
