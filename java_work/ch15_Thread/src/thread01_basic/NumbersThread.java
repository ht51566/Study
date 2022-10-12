package thread01_basic;

public class NumbersThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("(%d)", i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
