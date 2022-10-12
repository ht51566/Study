package thread05_threadPool;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i =0; i < 10; i++) {
			try {
				Thread.sleep(50);
				System.out.println(getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}
