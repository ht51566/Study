package api05_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getYear()+1900);
		
		Date date = new Date(166400432432L);
		System.out.println(date);
		
		//일시 데이터의 표현
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH-mm-ss a z");
		String today = sdf.format(now);
		System.out.println(today);
	
	}
}
