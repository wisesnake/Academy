package basic;

public class PrimitiveDataAddrEx {

	public static void main(String[] args) {
		//기본형 데이터의 주소값
		int a = 1;
		int b = 1;
		int c=  2;
		
		System.out.println(a==b); // true 출력, == 연산자란, 주소값이 같은지 평가.
		System.out.println(a==c); // false 출력
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		// 똑같은 기본형데이터 값이 들어가있는 a와 b의 주소값은 같음.
		
		System.out.println(System.identityHashCode(c));
		// 안에 들어있는 데이터가 다른 a 와 b 의 변수의 주소값이 다름.
		
		
		
	}

}
