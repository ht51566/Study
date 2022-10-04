package api05_date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {
	public static void main(String[] args) throws InterruptedException {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String dateTime = now.getYear() + "년 ";
		// dateTime += now.getMonth() + "월"; //OCTOBER
		dateTime += now.getMonthValue() + "월";
		dateTime += now.getDayOfMonth() + "일";
		dateTime += now.getHour() + "시";
		dateTime += now.getMinute() + "분";
		dateTime += now.getSecond() + "초";
		dateTime += now.getNano() + "나노초";

		System.out.println(dateTime);

		LocalDateTime time = LocalDateTime.of(1919, 3, 1, 9, 0, 0);
		System.out.println(time);
		System.out.println("-----------------------------------------");
		
		if(now.isAfter(time)) {
			System.out.println("지금은 미래입니다~");
		}else {
			System.out.println("지금은 과거입니다~");
		}
		
		long timeGap = now.until(time, ChronoUnit.YEARS);
		System.out.println(timeGap);
		
		LocalDate date = now.toLocalDate();
		LocalTime time2 = now.toLocalTime();
		System.out.println(date);
		System.out.println(time2);
		
		if(date.isLeapYear()) {
			System.out.println("윤년, 2월 29일이 있다네 ㅋㅋㅋ");
		}else {
			System.out.println("윤년 아님, 2월은 28일까지 ㅋㅋㅋ");
		}
		
		System.out.println("-----------------------------------------");
		ZonedDateTime myZone = ZonedDateTime.now();
		System.out.println(myZone);
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		ZoneOffset szo = myZone.getOffset();
		System.out.println(szo);
		ZoneId zid = myZone.getZone();
		System.out.println(zid);
		
		Instant instant1 = Instant.now();
		Thread.sleep(1000);
		Instant instant2 = Instant.now();
		System.out.println(instant1);
		System.out.println(instant2);
		if(instant1.isBefore(instant2)) {
			System.out.println("ㅇㅋ");
		}else {
			System.out.println("ㄴㄴ");
		}
		System.out.println(instant1.until(instant2, ChronoUnit.NANOS));
	}
}
