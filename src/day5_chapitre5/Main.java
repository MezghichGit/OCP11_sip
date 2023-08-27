package day5_chapitre5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		var x = 10;
		/*System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now()); */
		/*
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		System.out.println(zoned1);
		System.out.println(ZoneId.systemDefault());
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time) .minusDays(1).minusHours(10).minusSeconds(30); 
		 */
		
		//System.out.println(Period.ofMonths(3));
		//System.out.println(Period.of(3,2,10));
		//Duration hourly = Duration.of(1, ChronoUnit.HOURS);
		
		Instant now = Instant.now();
		Thread.sleep(2000);
		Instant later = Instant.now();
		Duration duration = Duration.between(now, later);
		//System.out.println(duration);
		//System.out.println(duration.toSeconds());
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		System.out.println(ChronoUnit.SECONDS.between(one, two));
	}

}
