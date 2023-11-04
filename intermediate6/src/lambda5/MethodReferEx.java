package lambda5;

public class MethodReferEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);
		//Person클래스의 ordering 메서드는 매개변수로 Comparable 펑션인터페이스 타입의
		//매개변수를 받고, 이 매개변수에서는 compare라는 추상메서드를 String a,b 매개변수를 통해 구현한다.
		//String클래스의 compareto~case 클래스는 두 스트링을 매개값으로 받아 유니코드로 변환하여 비교한다.
		//매개변수가 메서드를 참조할 경우, 람다식은 (a,b) -> a.a의 인스턴스메서드(b) 의 방식으로 이루어지며,
		//이를 축약한 버전이 a :: 인스턴스메서드 이다.
		//즉 위에서는 ordering메서드에서 result에 a.a의 인스턴스메서드(b) 의 작동결과가 음수일때와 0, 양수일때
		//각각 조건에 맞는 sysout을 출력하도록 설정해놓은것에 따라서 홍길동.a,b비교메서드(김길동) 의 형태로 코드가
		//작동하고 난 결과에 맞는 sysout을 출력하도록 동작하게 되는것이다.
	}
//	Compares two strings lexicographically, ignoring casedifferences. 
//	This method returns an integer whose sign is that ofcalling compareTo 
//	with case folded versions of the stringswhere case differences 
//	have been eliminated by calling Character.toLowerCase(Character.toUpperCase(int)) oneach Unicode code point. 

}
