package basic2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.spi.CurrencyNameProvider;

public class DateAndTimeEx1 {

	public static void main(String[] args) {

		//LocalDate : 날짜 정보만을 나타내는 클래스.
		//LocalTime : 시간 정보만을 나타내는 클래스.
		//LocalDateTime 둘이 합체
		
//		System.out.println(LocalDateTime.now());
		
		
		//요일
		
		LocalDate currentDate = LocalDate.now();
		
//		System.out.println(currentDate);
		
		
//		System.out.println(currentDate.getDayOfWeek());
		
		DayOfWeek week = currentDate.getDayOfWeek();
		
		System.out.println(week);

		System.out.println(Week.MONDAY);
	}

}
