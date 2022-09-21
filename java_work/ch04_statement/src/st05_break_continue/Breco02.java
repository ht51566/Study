package st05_break_continue;

public class Breco02 {
	public static void main(String[] args) {
		
	Loop:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				if(lower == 'g') {
					//continue;
					//break;
					//continue Loop;
					break Loop;
					
				}
				System.out.println(upper + " - " + lower);
			}
		}
		
		System.out.println("alphabet study end!!!");
	}
}
