package co06_enum;

import java.util.Calendar;

public class WeekEx {
	
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘은 " + today +"라네 ㅋㅋㅋ");
		
		System.out.println(Week.valueOf("FRIDAY"));
		
		for(Week w : Week.values()) {
			System.out.println(w);
			System.out.println(w.getName());
		}
		
		System.out.println(Week.FRIDAY.ordinal());
	}
}
