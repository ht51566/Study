package api05_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConversion {
	public static void main(String[] args) {
//		Date => LocalDateTime
		
		// 1. Date 객체 생성 (현재날짜)
		Date date = new Date();
		// 2. Date -> LocalDate
		LocalDate localDate = date.toInstant() // Date -> Instant
				.atZone(ZoneId.systemDefault()) // Instant -> ZonedDateTime
				.toLocalDate(); // ZonedDateTime -> LocalDate
		// 3. Date -> LocalDateTime
		LocalDateTime localDateTime = date.toInstant() // Date -> Instant
				.atZone(ZoneId.systemDefault()) // Instant -> ZonedDateTime
				.toLocalDateTime(); // ZonedDateTime -> LocalDateTime
		// 4. Date, LocalDate, LocalDateTime 출력
		System.out.println(date); // Sun Jun 20 21:09:20 KST 2021
		System.out.println(localDate); // 2021-06-20
		System.out.println(localDateTime); // 2021-06-20T21:09:20.461
		System.out.println("-----------------------------------------");

		// 2. Date -> LocalDate
		localDate = new java.sql.Date(date.getTime()) // java.util.Date -> java.sql.Date
				.toLocalDate(); // java.sql.Date -> LocalDate
		// 3. Date -> LocalDateTime
		localDateTime = new java.sql.Timestamp(date.getTime()) // java.util.Date -> java.sql.Timestamp
				.toLocalDateTime(); // java.sql.Timestamp -> LocalDateTime
		// 4. Date, LocalDate, LocalDateTime 출력
		System.out.println(date); // Sun Jun 20 21:09:20 KST 2021
		System.out.println(localDate); // 2021-06-20
		System.out.println(localDateTime); // 2021-06-20T21:09:20.461

		System.out.println("-----------------------------------------");
//		LocalDateTime -> java.util.Date
		
		// 1. LocalDateTime 객체 생성(현재 시간)
		LocalDateTime dateTime2 = LocalDateTime.now();
		// 2. LocalDateTime -> Date 변환
		Date date2 = java.sql.Timestamp.valueOf(localDateTime);
		// 3. LocalDateTime, Date 결과 출력
		System.out.println(dateTime2); // 2021-06-20T21:45:14.172849300
		System.out.println(date2); // 2021-06-20 21:45:14.1728493
	}
}
