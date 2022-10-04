package api05_date_time;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 데이터 입력부분
		System.out.println("희망 년도와 월을 입력하시게나  (ex년도 : 2009,월 : 3)");
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();

		System.out.println("    [ " + year + "년 " + month + "월" + " ] ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("     일    월    화    수   목   금   토");

		// Calendar 객체 생성 (오늘의 대한 정보)
		Calendar cal = Calendar.getInstance();
		// 희망 연도, 월, 일 셋팅
		// 월의 범위는 0~11 이기 때문에 실제월 -1
		// 일은 달력이 1일부터 시작하기 때문에 1일로 셋팅
		// 요일 구하기(월의 첫날)
		cal.set(year, month - 1, 1);

		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		// 해당월 1일의 요일 구함
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(week);
		// 1일이 해당 요일에 위치하도록 공백을 만들어 밀어주는 역할
		for (int i = 1; i < week; i++)
			System.out.print("   ");
		for (int i = 1; i <= lastOfDate; i++) {
			// 달력 정렬을 위해 1~9까지는 공백이3칸 10부터는 2칸 공백 넣기
			System.out.print((i < 10) ? "  " + i : " " + i);
			// 토요일에 날짜를 표시하고 줄바꿈 하는 코드
			if (week % 7 == 0)
				System.out.println();
			week++;
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}
