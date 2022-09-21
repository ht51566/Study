package ex;

public class Ex02 {
	//주사위 2개 던져서 합계 보여주는 프로그램, 합계 5가 나오면 프로그램 종료
	public static void main(String[] args) {
		int count = 0;
	      int dice1, dice2;   
	      int sum;
	      
	      while(true) {         
	         dice1 = (int)(Math.random()*6)+1;
	         dice2 = (int)(Math.random()*6)+1;
	         sum = dice1 + dice2;
	         System.out.printf("주사위 1 = %d | 주사위2 = %d | 주사위의 합 = %d  \n",dice1, dice2, sum);
	         count ++;
	         if(sum == 5) {
	            break;
	         }         
	         
	      }
	      System.out.printf("시도횟수 %d", count);
	}
}
