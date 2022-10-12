package thread04_daemon;

public class DaemonEx {
	
	public static void main(String[] args)  {
		AutoSave as = new AutoSave();
		
		as.setDaemon(true);
		
		as.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main end!!!");
	}
}
