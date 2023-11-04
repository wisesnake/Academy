package base_ex;

public class HashCodeEx {

	public static void main(String[] args) {
		
		System.out.println("==홍길동.hashcode()==");
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		
		String str1="홍길동";
		String str2="홍길동";
		System.out.println("==System.identityHashCode(str1,str2) (둘다 \"홍길동\")==");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		//하기는 기존 hashCode와 equals를 재정의 하지 않은 상황일때.
		//==================================================
//		System.out.println(s1 == s2);
		//false
//		System.out.println(s1.equals(s2));
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		//원래의 hashCode()메소드는 !!객체의 메모리번지를 이용!!해서 해시코드를 생성하기 때문에
		//!!객체마다 다른 정수값을 리턴한다.!!
		//==================================================
		//현재는 다른 객체이나, Student클래스에서 같은 학생이다라는 의미를
		//재정의 하는 코드를 작성해서 같은 학생이다 라는 그런 작업을 할 것이다.

		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("같은 학생임. - 동등객체");
			} else {
				System.out.println("다른 학생.");
			}
		}else {
			System.out.println("해시코드가 다르므로 다른 학생임.");
		}
		
	}

}
