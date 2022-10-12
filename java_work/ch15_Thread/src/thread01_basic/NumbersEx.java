package thread01_basic;

public class NumbersEx {

	public static void main(String[] args) {

		Numbers nb = new Numbers();
		long start = System.currentTimeMillis();
		nb.list(1, 10);
		nb.list(1, 10);
		long end = System.currentTimeMillis();
		System.out.println("실행 시간: " + (end - start));

		Thread thread1 = new NumbersThread();
		Thread thread2 = new NumbersThread();

		// thread: run 메소드 재정의, 시작은 start()
		
		thread1.start();
		thread2.start();
		
		// Runnable 구현한 객체를 Thread 생성자 매개변수 전달
		Thread thread3 = new Thread(new NumbersRunnable());
		thread3.start();

		// Thread 익명 객체 만들어서 run 재정의
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.printf("(%d)", i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
			}
		};
		thread4.start();
		//Runnable 익명 구현 인터페이스로 쓰레드 객체 생성
		Thread thread5 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.printf("(%d)", i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
			}
		});
		thread5.start();
		
		//Runnable 익명 구현 인터페이스의 람다식으로 쓰레드 객체 생성
		Thread thread6 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("(%d)", i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		});
		thread6.start();
	}
}
