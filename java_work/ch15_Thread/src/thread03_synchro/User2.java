package thread03_synchro;

public class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		try {
			calculator.setMemory(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
