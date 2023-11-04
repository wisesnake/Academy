package basic;

import java.util.IdentityHashMap;
import java.util.Scanner; // Scanner 함수를 포함하고 있는 패키지 불러옴
//import java.util.* 와 같은 형태로 해당 패키지 내의 모든 메소드를 사용하고 싶을 때 호출 가능.

public class WhileEx2 {
	public static void main(String[] args) {
		//0830
		
		Scanner sc = new Scanner(System.in);
//		System.out.println(System.identityHashCode(sc));
		
//		String inputText = sc.nextLine();
//		
//		System.out.println(inputText);
		String inputText;
		
		// do-while문은 무조건 시작하자마자 뭔가를 하고 판단하라는 것이므로 가장 많이 쓰이는 패턴은 값을 이력받고 판단할 경우
		// 조건문부분(탈출시점)이 실행문 다음에 있음.
		
		do {
			System.out.print(">");
			
			inputText = sc.nextLine();
			
			System.out.println(inputText);
			
		}while(!inputText.equals("quit"));
		//quit이라고 타이핑하기 전까지 무한루프 도는 코드. do~while 문은 거의 이런식으로 활용된다.
		
		
	}
}
