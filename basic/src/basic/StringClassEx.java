package basic;

public class StringClassEx {

	public static void main(String[] args) {
		//0831
		
//		String st1="hi";
//		String 클래스로 선언된 변수 st1은 참조형 데이터 타입임.
		
		System.out.println(System.identityHashCode(new String())); 
		// 새롭게 생성한 객체에는 아무런 값이 없음에도 불구하고, 주소값이 출력됨. 
		// new 객체명() 는 주소값을 가진 새로운 객체를 생성한다는걸 알 수 있음.
	
		System.out.println("------------------------------");
		String st1 = new String();
		System.out.println(System.identityHashCode(st1)); 
		// 객체가 들어간 변수 자체의 주소값도 다름.
		System.out.printf("[%s] \n", st1); // []출력, 암것도 없음
		System.out.println("------------------------------");
		
		String st2 = new String("apple");
		System.out.println("st2 주소값 : " + System.identityHashCode(st2)); 
		System.out.println("------------------------------");

		String st3 = new String("apple");
		System.out.println("st3 주소값 : " + System.identityHashCode(st3));  // st2와 같지만, 주소값이 다름.
		
		System.out.println(st2 == st3); // false 출력, 값 자체는 같지만 == 연산자는 주소값을 평가하기 때문임.
		System.out.println(st2.equals(st3)); // 따라서 문자열의 값이 같은지를 확인하려면 equals를 사용
		
		
		
		
	}
	
}
