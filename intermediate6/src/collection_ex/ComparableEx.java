package collection_ex;

import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		//Person 클래스의 필드 및 메서드등을 가지는 Set 자료구조 treeSet 변수를 선언
		
		
		treeSet.add(new Person("홍길동", 20));
		treeSet.add(new Person("김자바", 33));
		treeSet.add(new Person("박지원", 40));
		
		//Person클래스의 생성자를 이용하여 treeSet set컬렉션에 각각 값을 저장.
		
		//Person클래스에서 compareTo 메서드를, 생성자 두번째 매개값인 숫자를 기준으로 
		//많고 적음을 판별하여 순서대로 저장하도록 오버라이드 했으므로 각 객체는 나이필드순으로 저장됨
		//이는 원래 compareTo가 Set자료구조에서 자료를 순서대로 저장하도록 하는 메서드를 선언해뒀으므로,
		//이를 오버라이드해서 한 객체당 특정 필드를 기준으로 정렬하도록 만드는 과정임.
		
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}	
}
