package thread02_name;

public class Priority extends Thread {
	
	public Priority(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName());
	}
}
