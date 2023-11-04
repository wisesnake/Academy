package stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectEx {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("홍길동","남",92));
		stuList.add(new Student("김수영","여",87));
		stuList.add(new Student("김자바","남",95));
		stuList.add(new Student("오혜영","여",93));
		
		List<Student> maleList = stuList.stream().filter((obj)->{return obj.getFamilyName().equals("남");}).collect(Collectors.toList());
		maleList.stream().forEach((str)->System.out.println(str.getName()));
		
	
		System.out.println("========================================");
		
		List<Student> femaleList = stuList.stream().filter((obj)->{return obj.getFamilyName().equals("여");}).collect(Collectors.toList());
		femaleList.stream().forEach((str)->System.out.println(str.getName()));
		
		System.out.println("이번엔 맵 형태로");
		
		Map<String, Integer> map = stuList.stream().collect(Collectors.toMap(obj->{return obj.getName();}, obj-> obj.getScore()));
		
		System.out.println(map);
		
	
	}	
}
