package api05_date_time;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d-%d-%d %d\n",year, month, date, dayOfWeek);
		
		now.add(date, 3);
		System.out.println(now.get(Calendar.DATE));
		
		
	}
}
