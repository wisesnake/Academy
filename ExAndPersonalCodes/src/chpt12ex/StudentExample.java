package chpt12ex;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		//HashSet 은 equals 와 hashcode 메서드를 사용해 동등 객체인지 판별하고 중복이면 저장 X
		
		
		hashSet.add(new Student("1"));
		//student클래스에 Allargsconstructor  어노테이션으로 인해 매개값이 필드로 초기화해줌.
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		//
		
		
		
		System.out.println("지정된 student 수: " + hashSet.size());
	}

}
