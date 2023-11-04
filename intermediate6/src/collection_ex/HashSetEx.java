package collection_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("seven");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			if(str.equals("five")) {
				System.out.println("five를 지웁니다");
				iterator.remove();
			}
		}
		System.out.println("삭제 후");
		
		for(String str : set) {
			System.out.println(str);
		}
	}

}
