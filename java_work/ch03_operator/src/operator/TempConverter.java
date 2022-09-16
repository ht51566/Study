package operator;

import java.util.Scanner;

//온도 변환기: 화씨, 섭씨 온도를 입력 받아 변환 출력
//fahrenheit -> celsius : (ft-32) * 5 / 9
// 소수점 2째자리까지 출력(float)
public class TempConverter {
	public static void main(String[] args) {
		double ft = 0.0;
		double ct = 0.0;
		String kind = "";
		int select = 0;

		// system으로부터 값을 받을 Scanner 객체를 생성
		Scanner sc = new Scanner(System.in);
		// 값 달라는 메시지 출력 : 화씨->섭씨: 1, 섭씨 -> 화씨:2
		System.out.println("화씨->섭씨: 1, 섭씨 -> 화씨:2 >>> ");
		// 스캐너로 받은 값을 문자열 변수 kind에 넣음
		kind = sc.nextLine();
		// kind 변수에 저장된 문자열 타입의 값을 int로 읽어서 select에 저장
		select = Integer.parseInt(kind);
		// 1 이면 "화씨 온도를 입력하세요 >>> " 입력값 받아서 ft에 저장
		if (select == 1) {
			System.out.println("화씨 온도를 입력하세요 >>> ");
			// double ft = sc.nextDouble();
			ft = Double.parseDouble(sc.nextLine());
			ct = (ft - 32) * 5 / 9;
			System.out.printf("화씨 %.2f는 섭씨 %.2f입니다.", ft, ct);
		} else if (select == 2) {
			System.out.println("섭씨 온도를 입력하세요");
			ct = Double.parseDouble(sc.next());
			ft = ct * 9 / 5 + 32;
			System.out.printf("섭씨 %.2f는 화씨 %.2f입니다", ct, ft);
			sc.close();
		} else {
			System.out.println("정신 차리셈(1 or 2)");
		}
		
		sc.close();
	}
}
