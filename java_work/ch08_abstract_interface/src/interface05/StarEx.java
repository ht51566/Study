package interface05;

public class StarEx {
	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s = new SCV();
		
		s.repair(t);
		s.repair(d);
		s.repair(s);
		//s.repair(m);
		
		m.attack(d);
		m.attack(d);
		m.attack(d);
		m.attack(d);
		m.attack(d);
		m.attack(d);
		m.attack(d);
		
		s.repair(d);
		
	}
}
