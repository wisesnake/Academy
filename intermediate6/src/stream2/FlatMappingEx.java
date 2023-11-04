package stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();

		list1.add("this is a java");
		list1.add("i am a best dev");

		list1.stream().flatMap((data) -> {
			return Arrays.stream(data.split(" "));
		}).forEach((s) -> {
			System.out.println(s);
		});
		System.out.println();

		List<String> list2 = Arrays.asList("10,20,30,40,50");

		list2.stream().flatMap((data) -> {
			return Arrays.stream(data.split(","));
		}).forEach(s -> System.out.println(s));
		
		
		
		System.out.println();
		list2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number));
	}

}
