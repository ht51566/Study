package thread02_name;

public class ThreadB extends Thread{
	
	public ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i =0; i< 20; i++) {
			System.out.println(getName() + "가 출력한 내용");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
