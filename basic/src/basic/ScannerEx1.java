package basic;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		//기본형 bsil fd cb
		//나머지 참조형 : 클래스 타입
		
		//클래스 타입으로 변수를 선언하고자 할 경우, 어떤 새로운 주소를 할단한다는 연산자인
		// new 연산자를 이용해야함

		Scanner scanner = new Scanner(System.in); 
		int input = scanner.nextInt(); 
		// input 변수에 다음으로 입력받은 값을 Int 타입으로 저장한다.
		// scanner 변수는 입력을 받을 수 있는 변수		
		System.out.println(input);
		
		
	}

}
