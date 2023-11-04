package base_ex;

public class ObjectEx {

	public static void main(String[] args) {

//		System.out.println(new Object());
//		System.out.println(new Object().toString());

		Object obj1 = new Object();

//		System.out.println(obj1);
//		System.out.println(obj1.toString());
		// 주소가 같음.
		System.out.println("================");
		Object obj2 = obj1;

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
//		System.out.println(obj2);

		//Object의 비교 연산자의 equals() 메서드는 ==과 동일한 결과 리턴.
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
		//Object의 equals() String 의 equals()관계
		//String은 equals() 메서드를 재정의해서 내부 문자열이 같은지를 비교함.
//		System.out.println("============================");
//		String str1 = new String("hong");
//		String str2 = new String("hong");
//	
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		//주소가 다름.
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1 == str2);
//		//equals 가 override가 되어있기 때문에 기존 다른 객체와 다른 결과
//	
//      //동등 객체임을 판단할 경우 hashCode()의 equals() 메서드를 같이 사용.
		
		
		
		
	}


}
