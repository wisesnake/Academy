package chpt17ex;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("this is java book","lambda expressions", "java8 supports lambda expressions");
		
		//java만 포함된 문자열
		list.stream().filter(c -> c.contains("java")).forEach(c -> System.out.println(c));
		
		//forEach 는 void 형 메서드임. 따라서 forEach를 통해서 스트림 최종 처리를 할 경우, 특정 변수에다가 초기화 하는 형태는 불가능함.
		
		
		
		
	}
	

}
