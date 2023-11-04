package stream2;

import java.util.Arrays;

public class AggregateEx {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		// 최종처리메서드가 집계함수일 경우, 집계값이 없을 경우 예외가 발생할 수 있으므로 getAsXXX()메서드를 쓰거나
		//
		
		long result1 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).count();
		System.out.println(result1);

		int result2 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).sum();
		System.out.println(result2);

		int result3 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).max().getAsInt();
		System.out.println(result3);

		int result4 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).min().getAsInt();
		System.out.println(result4);
		
		double result5 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).average().getAsDouble();
		System.out.println(result5);
	}

}
