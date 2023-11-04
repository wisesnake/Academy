package chpt17ex;

import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		List<Member> memberList = Arrays.asList(
				new Member("홍길동",30),
				new Member("신용권",40),
				new Member("김자바",26)
				);

		Double result = memberList.stream().mapToDouble(c->c.getAge()).average().getAsDouble();
		//순서도
		//멤버리스트를 스트림화>maptodouble매서드를 통해 arraylist의 각 요소를 반복자로 순회하며 매개변수 c에 각 getAge를 double로 매핑
		//c 에 담겨있는 홍길동,신용권,김자바의 나이요소 세가지의 평균값을 average()메서드로 구함, 결과를 double로 getasdouble
		//끗
		System.out.println(result);
	}

}
