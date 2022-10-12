package thread02_name;

public class ThreadEx {
	
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("main: " + mainThread.getName() + " 출발!!!");
		
		Thread thA = new ThreadA();
		System.out.println(thA.getName() + "출발 준비 완료");
		Thread thB = new ThreadB();
		System.out.println(thB.getName() + "출발 준비 완료");
		
		thA.start();
		thB.start();
		
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0; i< 20; i++) {
					System.out.println("main th가 출력한 내용");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		th.start();
		
		System.out.println("main: " + mainThread.getName() + " 완료!!!");
	}
}
