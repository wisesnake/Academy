package chpt17ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {

	public static void main(String[] args) {
		//개발자인 사람만
		List<Member> list = Arrays.asList(
				new Member("신용권","개발자"),
				new Member("김나리","디자이너"),
				new Member("홍길동","개발자")
				);
		
		List<Member> list2 = list.stream().filter(c->c.getJob().equals("개발자")).collect(Collectors.toList());
				
		list2.stream().forEach(c->System.out.println(c.getName()));
	}

}
