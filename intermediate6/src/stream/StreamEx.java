package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","김자바");
		
		//1.for
		System.out.println("--for--");
		for(String str : list) {
			System.out.println(str);
		}
		
		//2.iterator
		Iterator<String> iterator = list.iterator();
		
		System.out.println("--iterator--");
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		//3.Stream
		System.out.println("--stream.foreach--");
		Stream<String> stream = list.stream();
		stream.forEach(item -> System.out.println(item));
		
		//stream 이 제공하는 대부분의 요소 처리 매서드는 함수적 인터페이스(@functionalInterface) 예제 타입을 가지므로 람다식 또는 매서드 참조를 이용해서 요소 처리 내용을 
		//매개값으로 전달할 수 있다.
		
		System.out.println("========================");
	
		//컬렉션요소나 배열(리스트)을 스트림객체로 변환(.stream();)
		//해당 타입으로 받은 후 stream을 가지고 데이터 처리를 람다식으로 한다.
		List<Student> list2 = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
				);
		
//		list2.stream().forEach(stu -> {
//			String name = stu.getName();
//			int score = stu.getScore();
//			System.out.println(name + ":" + score);
//		});
//		굳이 stream객체를 만들어서 얻지 말고 바로 접근해도 무방함.
		
		Stream<Student> stream2 = list2.stream();
	
		stream2.forEach(stu -> {
			String name = stu.getName();
			int score = stu.getScore();
			System.out.println(name + ":" + score);
		});
	
	
	}
	
	

}
