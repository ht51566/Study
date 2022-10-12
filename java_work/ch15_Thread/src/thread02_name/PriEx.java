package thread02_name;

public class PriEx {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {
			Thread th = new Priority("thread" + i);
			if(i == 10) {
				th.setPriority(Thread.MAX_PRIORITY);
			}else if(i == 5) {
				th.setPriority(Thread.NORM_PRIORITY);
			}else {
				th.setPriority(Thread.MIN_PRIORITY);
			}
			th.start();
		}
	}
}
