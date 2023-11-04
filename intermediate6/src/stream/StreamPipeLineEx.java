package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30));

		// 1.Stream
		Stream<Student> stream = list.stream();

		// 2.중간 매핑, 람다식에서 에러가 날 경우 두가지를 생각해보자. 1)매개변수가 있는가? 2)리턴을 필요로 하는가?
		IntStream intStream = stream.mapToInt(stu -> stu.getScore());

		// 3. 최종처리(count,average,max,min,sum)

		System.out.println(intStream.average().getAsDouble());

		// 위 과정을 줄여서 체이닝(데이터를 체인처럼 엮어서 처리)

		long cnt = list.stream().mapToInt((stu) -> {
			return stu.getScore();
		}).count();
		System.out.println("count : " + cnt);
		
		int max = list.stream().mapToInt((stu) -> {
			return stu.getScore();
		}).max().getAsInt();
		System.out.println("max : " + max);
		int min = list.stream().mapToInt((stu) -> {
			return stu.getScore();
		}).min().getAsInt();
		System.out.println("min : " + min);
		
		int sum = list.stream().mapToInt((stu) -> {
			return stu.getScore();
		}).sum();
		System.out.println("sum : " + sum);
	}
}
