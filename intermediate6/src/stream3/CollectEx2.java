package stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("홍길동","남",92));
		stuList.add(new Student("김자바","남",95));
		stuList.add(new Student("오혜영","여",87));
		stuList.add(new Student("김수영","여",95));
	
	
		Map<String,Double> map = stuList.stream()
				.collect(Collectors.groupingBy(
						obj->obj.getFamilyName(), 
						Collectors.averagingDouble(obj->obj.getScore())));
		


	
	}

}
