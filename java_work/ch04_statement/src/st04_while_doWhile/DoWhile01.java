package st04_while_doWhile;

/*
do {
	조건과 관계없이 1회 실행되는 명령
}while(조건);
*/
//3,6,9 게임
public class DoWhile01 {
	public static void main(String[] args) {
		
		for(int i = 1; i <=3333; i++) {
			//3273
			System.out.printf("i: %d /", i);
			int tmp = i;
			
			do { // 3273 => 327 => 32 => 3
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print("짝! ");
				}
			}while((tmp/=10) != 0);
			System.out.println();
		}
		
	}
}
