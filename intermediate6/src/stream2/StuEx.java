package stream2;

import java.util.Arrays;
import java.util.List;

public class StuEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동",92),
				new Student("신용권",95),
				new Student("김자바",88));
		
		int sum1 = list.stream().mapToInt(Student :: getScore).sum();

		int sum2 = list.stream().mapToInt(Student :: getScore).reduce(0,(a,b) -> a+b);
		System.out.println(sum1);
		System.out.println(sum2);
		
		//만약 기본값을 total을 10을 주고자 하면,
		//그럴때 reduce사용
		//reduce는 스트림에 요소가 없을 경우 예외가 발생하지만, identity 매개값이 주어지면
		//이 값을 디폴트 값으로 리턴한다.
		System.out.println("==================================================");
		
		
	}

}
