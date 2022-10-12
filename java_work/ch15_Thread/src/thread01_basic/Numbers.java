package thread01_basic;

public class Numbers {
	
	void list(int start, int end) {
		for(int i = start; i <=end; i++) {
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
