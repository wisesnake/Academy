package basic;

public class FuntionEx {

	static void sunja() {
		System.out.println("hi");
	}// 매개변수 x 리턴 x
	
	// 함수 안에서만 사용하는 변수를 지역(local) 변수라고 한다. 매개변수는 지역변수이다. 그 함수 영역 안에서만 사용가능.
	static void sunja2(String gift) {
		System.out.println(gift);
	}// 매개변수 O 리턴 x

	static String sunja3() {
			return "사탕";
	}// 매개변수 X 리턴 O

	static String sunja4(String gift) {
		System.out.println(gift+"를 받았습니다.");
		return "도너츠";
	}// 매개변수 O 리턴 O
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("=============sunja================");
		sunja();	
		System.out.println("=============sunja2================");
		sunja2("hi"); 
		// 위에서 함수에 매개변수 부분에 변수 gift는 초기화가 안됐으나, 매개변수 문자열 hi를 투입함으로써,
		// sunja2 함수의 매개변수로 선언된 gift는 초기화가 된거임.
		System.out.println("==============sunja3==============");
		
		String gift = sunja3();
		// return이 있는 함수로 정의된 경우, 가급적 변수로 받아서 찍어보세요!!
		// sysout(sunja3()); 와 같은 형태로 가독성 좋지 않게 쓰지 말라는 뜻.
	
		System.out.println(gift);
		
		System.out.println("=============================");
		
		String gift2 = sunja4("바나나");
		
		System.out.println(gift2 + "를 반환했습니다..");
		

		
	}
}
