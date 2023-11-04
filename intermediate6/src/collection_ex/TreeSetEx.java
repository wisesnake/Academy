package collection_ex;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(95);
		scores.add(80);
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(80);
		scores.add(80);
		scores.add(80);
		//기본적으로 Set컬렉션이기 때문에 hashcode와 equals 가 리턴값이 true인 애들은 중복저장 안함.
		
		for(Integer s : scores) {
			System.out.println(s + " ");
		}
		
		TreeSet<String> str = new TreeSet<>();
		
		str.add("다");
		str.add("가");
		str.add("나");
		str.add("라");
		str.add("바");
		str.add("마");
		//기본적으로 Set컬렉션이기 때문에 hashcode와 equals 가 리턴값이 true인 애들은 중복저장 안함.
		
		for(String s : str) {
			System.out.println(s + " ");
		}
	}

}
