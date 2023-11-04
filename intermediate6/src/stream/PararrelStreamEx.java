package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PararrelStreamEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("짜장");
		list.add("김치찌게");
		list.add("제육");
		list.add("된장찌게");
		
		Stream<String> stream = list.parallelStream();
		
		stream.forEach(menu -> System.out.println(menu+" -> "+"이 데이터를 처리하는 쓰레드의 이름 : "+ Thread.currentThread().getName()));
		
		System.out.println("-----");
		
		Stream<String> stream2 = list.stream();
		
		stream2.forEach(menu -> System.out.println(menu+" -> "+"이 데이터를 처리하는 쓰레드의 이름 : "+ Thread.currentThread().getName()));
		
		
	}

}
