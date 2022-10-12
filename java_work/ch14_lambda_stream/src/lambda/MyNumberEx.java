package lambda;

public class MyNumberEx {
	
	public static void main(String[] args) {
		
//		MyNumber bigger = new MyNumber() {
//			
//			@Override
//			public int getMax(int x, int y) {
//				return x >= y? x : y ;
//			}
//		};
		
		MyNumber bigger = (x, y) -> x >= y? x : y ;
		
		System.out.println(bigger.getMax(33, 22));
		
	}
}
