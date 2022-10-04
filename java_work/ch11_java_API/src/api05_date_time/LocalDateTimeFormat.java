package api05_date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeFormat {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		System.out.println(dateTime.format(dtf));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		//System.out.println(sdf.format(dateTime)); //IllegalArgumentException
		Date date = java.sql.Timestamp.valueOf(dateTime);
		System.out.println(sdf.format(date));
		
	}
}
