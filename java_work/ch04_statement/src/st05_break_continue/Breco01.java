package st05_break_continue;

public class Breco01 {
	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
			
			if(i % 2 == 0) {
				if(i == 8) {
					break;
				}
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("wow");
	}
}
