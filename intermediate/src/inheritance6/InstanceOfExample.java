package inheritance6;

public class InstanceOfExample {

	
	public static void personInfo(Person person) {
		System.out.println(person.name);
		person.walk();
		// 자바 12이전 문법

		
		
//		if(person instanceof Student) {
//			Student student = (Student)person;
//			System.out.println(student.studentNo);
//			student.study();
//		}
	
		//자바 12부터는
		
		if(person instanceof Student student) {
			// Student 객체일 경우 강제 타입 변환.
			System.out.println(student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {

//		Person person = new Person("홍길동");
//		
//	
//		person.walk();
//	
		Person p2 = new Student("김길동",10);
//		p2.study(); Student타입객체지만 부모클래스인 Person으로 강제형변환 되었기 때문에
//		study메소드에 접근이 불가해서 컴파일에러, 밑의 personInfo 메소드를 호출했을 때
//		p2객체를 student타입객체로 변환시켜 student클래스의 메소드 필드를 사용하게끔 코딩.
		personInfo(p2);
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);

	}

}
