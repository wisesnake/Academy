package stream2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateEx2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		
		OptionalDouble result = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).average();
		System.out.println("optionalDouble");
		System.out.println(result);
		System.out.println();
		
		double result1 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).average().getAsDouble();
		System.out.println("getAsDouble");
		System.out.println(result1);
		System.out.println();
		
		double result2 = Arrays.stream(arr).filter((i) -> {
			return i % 2 == 0;
		}).average().orElse(0.0);
		System.out.println("orElse(0.0)");
		System.out.println(result2);
		System.out.println();
	}

}
