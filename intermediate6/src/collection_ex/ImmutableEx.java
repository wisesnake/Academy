package collection_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableEx {

	public static void main(String[] args) {
		
		
		List<String> immutableList1 = List.of("A","B","C");
		Set<String> immutableSet1 = Set.of("A","B","C");
		Map<Integer,String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		try {
			immutableList1.add("D");
		}catch(Exception e) {
			System.out.println("immutable객체는 수정 할 수 없음.");
		}
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"A");
		map.put(3,"A");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr); 
				
	}

}
