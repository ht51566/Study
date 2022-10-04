package ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	public static void main(String[] args) {
		
		//오늘 날짜를 2022년 10월 04일 화요일 15:34:22로 출력하시오
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE HH:mm:ss");
		System.out.println(sdf.format(now));
		
		
		
	}
}
