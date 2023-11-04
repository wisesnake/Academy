package basic4;

public class Sunja {

	
	//메서드 정의
	//메서드타입 리턴타입 메서드명(매개변수)
	
	static void sunja() {
		System.out.println("hi");
	}
	
	static void sunja2(String gift) {
		System.out.println(gift + " 줘서 고마워요");
	}
	
	static String sunja3() {
		System.out.println("선물이에요");
		return "cookie";
	}
	
	static String sunja4(String gift) {
		System.out.println(gift + " 고마워 이거줄게 ");
		return "cookie";
	}
	
	public static void main(String[] args) {
		String gift = "candy";

		
		System.out.println("타입 1: 주고받는거 X");
		sunja();
		System.out.println();
		
		System.out.println("타입 2: 나만 줌");
		sunja2(gift);
		System.out.println();
		
		System.out.println("타입 3: 나만 받음");
		System.out.println(sunja3() + "를 받았습니다.");
		System.out.println();
		
		System.out.println("타입 4: 주고 받음");
		System.out.println(sunja4(gift) + "를 받았습니다.");
		
	}

}
