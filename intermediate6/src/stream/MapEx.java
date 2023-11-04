package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapEx {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("홍길동",85));
		stuList.add(new Student("홍길동",92));
		stuList.add(new Student("홍길동",87));
		
		//Student를 score 스트림으로 변환
		
	
		stuList.stream().mapToInt((stu)->{return stu.getScore();}).forEach((s)->System.out.println(s));
		
		int intArr[] = {1,2,3,4,5};
		
		//int를 double로
		Arrays.stream(intArr).asDoubleStream().forEach((s)->{System.out.println(s);});
		
		//Integer(객체) 박싱
		Arrays.stream(intArr).boxed().forEach((s)->{System.out.println(s.intValue());});
		
		
		
		//객체를 int로
//		IntStream intStream = Arrays.stream(intArr);
//		intStream=Arrays.stream(intArr);
//		intStream.boxed().forEach(obj->System.out.println(obj.intValue()));
	}

}
