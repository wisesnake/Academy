package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrStreamEx {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		String[] strArr = {"김씨","이씨","강씨","박씨","임씨"};
		
//		intArr.stream();
//		배열은 반드시 스트림 객체를 생성해야함.
		
		IntStream intStream = Arrays.stream(intArr);
		Stream<String> strStream = Arrays.stream(strArr);
		
		intStream.forEach(ic->System.out.println(ic));
		strStream.forEach(sc->System.out.println(sc));
	}

}
