package basic4;

import java.util.Random;

public class FunEx3 {

	 //안받고 안줌
	static void sunja1() {
		System.out.println("hi");
	}
	// 안받고 줌
	static String sunja2() {
		System.out.println("이거받아");
		return "apple";
	}
	// 받고 안줌
	static boolean sunja3() {
		Random random = new Random();
		boolean b = random.nextBoolean();
		
		return b;
	}
	// 주고받음
	static String sunja4(String gift) {
		
		System.out.println(gift + "줘서 ㄳ 답례임");
		return "apple";
	}
	
	public static void main(String[] args) {
//		sunja1();
//		System.out.println();
//		
//		System.out.println(sunja2() + "을 받음");
//		System.out.println();
		for(int i = 0;i < 10;i++) {
			System.out.println("불리언 랜덤리턴하기~ >" + sunja3());			
		}
//		System.out.println();
//		
//		System.out.println(sunja4("banana") + " 을 받음");
		
		
	}

}
