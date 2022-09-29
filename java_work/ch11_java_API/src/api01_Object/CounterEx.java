package api01_Object;

public class CounterEx {
	public static void main(String[] args) {
		
		Counter counter = null;
		
		for(int i= 0; i < 50; i++) {
			counter = new Counter(i);
			counter = null;
			//강제로 garbage collector를 가동
			System.gc();
		}
	}
}
