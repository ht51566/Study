package thread03_synchro;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

//	public synchronized void setMemory(int money) {
	public void setMemory(int money) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i + "번");
			Thread.sleep(10);
		}
		//
		synchronized (this) {
			this.memory = money;
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
			Thread.sleep(10);
			System.out.println(Thread.currentThread().getName() + " - 전액출금  : " + this.memory);
		}
	}
}
