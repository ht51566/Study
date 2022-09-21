package st02_switch;

import java.util.Scanner;

public class Sw06 {
	public static void main(String[] args) {
		int me, com;
		
		String[] rsp = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>");
		me = sc.nextInt();
		com = (int)(Math.random()*3) + 1;
		
		//System.out.printf("나: %d vs 컴퓨터: %d \n", me, com);
		System.out.printf("나: %s vs 컴퓨터: %s \n", rsp[me-1], rsp[com-1]);
		
		//switch문으로 승패 판별
		switch(me-com) {
	      case 1: case -2:
	         System.out.println("내가 이김");  
	         break;
	      case 2: case -1:
	         System.out.println("컴이 이김");           
	         break;
	      case 0:
	         System.out.println("비김");
	         break;
	      default:
	    	  System.out.println("wrong input, try again!");
	     }
		
		
		sc.close();
	}
}
