package chpt12ex;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DaysLeftEx {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		//오늘
		LocalDateTime endDay = LocalDateTime.of(2023, 12, 31, 0, 0);
		//마지막날
		long remainDay = today.until(endDay, ChronoUnit.DAYS);
		//일 수로 계산하여 차이 값 초기화.
		System.out.println(remainDay + "일 남음");
	}

}
