package stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEx {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("홍길동",30));
		stuList.add(new Student("신용권",10));
		stuList.add(new Student("유미선",20));
		
		stuList.stream().sorted().forEach(s->{System.out.println(s.getName() + s.getScore());});
		System.out.println();
		
		stuList.stream().sorted(Comparator.reverseOrder()).forEach(s->{System.out.println(s.getName() + s.getScore());});
	}

}
