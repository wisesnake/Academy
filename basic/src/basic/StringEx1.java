package basic;

public class StringEx1 {

	public static void main(String[] args) {
		
		System.out.println("hi");

//		String str1 = new String();
//		str1="안녕";
//		System.out.println(str1);
		//요게 정석이지만
		
//		String str2 = "반가워요";
//		System.out.println(str2);
//		많이 쓰는 객체이므로 이렇게 할 수 있도록 내장되어있음.
		
		// 컴퓨터가 제일 많이 하는 것은 값이 같은지를 비교
		// 값 비교는 ==이지만 
		System.out.println(1==1); // true출력
		// 문자열 비교는 무조건 함수

		// 문자열 비교는 무조건 equals()함수를 사용하는 것이 좋습니다.
		
		System.out.println("hi".equals("hi")); // true출력
		System.out.println("hi".equals("hi2")); // true출력
	}

}
