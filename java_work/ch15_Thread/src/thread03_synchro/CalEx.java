package thread03_synchro;

public class CalEx {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(cal);
		u1.start();
		
		User2 u2 = new User2();
		u2.setCalculator(cal);
		u2.start();
	}
}
