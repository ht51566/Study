package st02_switch;

import java.util.Scanner;

public class Sw03 {
	public static void main(String[] args) {
		int month;
		String season = "";
		System.out.println("태어난 달을 입력하세요>>> ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
//			//중첩 switch문: 중첩 빠져나갈 때 바깥쪽에도 break 하는 것 잊지 말기
			switch(month) {
			case 6: case 7:
				season = "초여름";
				break;
			case 8:
				season = "한여름";
				break;
			}
//			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
//		default:
//			season = "악마";
//			break;

		}
		
		if(month<= 12 && month >= 1) {
			System.out.printf("%d월에 태어난 당신은 사랑스런 %s의 선물", month, season);
		}else {
			System.out.println("멍청한 ~~~ ㅋㅋㅋ");
		}
		
		sc.close();
	}

}
