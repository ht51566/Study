package st04_while_doWhile;

public class While01 {
	public static void main(String[] args) {
		/*
		 while(조건){
		 	수행할 명령
		 }
		 *조건이 false이면 while문 벗어남: 빠져나갈 조건 설정 필요
		 *조건이 잘못 설정되면 한 번도 안 돌거나 무한루프 걸림
		 */
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println(i + "번째 인사!!!");
			
		}
	}
}
