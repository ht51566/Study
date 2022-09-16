package operator;

import java.util.Scanner;

public class Op09 {
	//주민번호 입력받아(Scanner) 해당 숫자 뽑아서
	// 3항식을 이용해 성별 구분하여 출력
	// 8번째 자리 문자를 뽑아서(charAt(7)) 홀수면 남자, 짝수면 여자 출력
	
	public static void main(String[] args) {
		String str = ""; //남자, 여자 입력할 문자열 변수
		int gender = 0; //
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하세요(123456-1234567)>>> ");
		//스캐너 메소드 nextLine()으로 입력된 값을 받아서 inNo에 저장
		String idNo = sc.nextLine();
		System.out.println("idNo >>> " + idNo);
		//입력받은  문자열의 여덟 번째 문자(7)를 꺼내서 문자 0(48)을 뺀 값을 gender에 저장 - 7
		gender = idNo.charAt(7) - '0';
		System.out.println("gender >>> " + gender); // 1 => 49
//		str = gender % 2 == 0? "여자" : "남자";
//		System.out.printf("당신은 %s입니다.", str);
		
		// 1 or 3 => 남자, 2 or 4 => 여자, 그외엔 외계인
		
		str = (gender == 1 || gender == 3)? "남자" : (gender == 2 || gender == 4)? "여자": "외계인";
		System.out.printf("당신은 %s입니다.", str);
		
		sc.close();
	}
}
