package api02_System_Class;

public class SystemTime {
	public static void main(String[] args) {
		
		//시스템 시간 반환 메소드 - 밀리초 - 1970/01/01 ~ 현재
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println("------------------------");
//		long start = System.currentTimeMillis();
		long start = System.nanoTime();
		int sum = 0;
		for(int i = 0; i < 100000; i++) {
			sum += i;
		}
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println("합계: " + sum);
		//System.out.println("소요 시간: " + (end-start) + "밀리초");
		System.out.println("소요 시간: " + (end-start) + " nano초");
		
	}
}
