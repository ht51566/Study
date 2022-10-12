package thread03_synchro;

public class User1 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		try {
			calculator.setMemory(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
