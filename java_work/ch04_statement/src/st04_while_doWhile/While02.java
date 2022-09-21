package st04_while_doWhile;

public class While02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int i = 11;
		
		System.out.println("카운트 다운  start!!!");
		while(i-- > 1) {
			System.out.println(i);
//			for(int j = 0; j < 2_000_000_000; j++) {
//				for(int k = 0; k < 2_000_000_000; k++) {
//					
//				}
//			}
			
			Thread.sleep(1000);
		}
		
		System.out.println(i + " : rocket launch!!!");
	}
}
