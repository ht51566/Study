package thread04_daemon;

public class AutoSave extends Thread {
	
	void save() {
		System.out.println("saved");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}
	
}
