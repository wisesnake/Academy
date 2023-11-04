package Calc;

import java.util.Scanner;

public class CalcMain {

	// 정수 두개를 입력받은 후, 메뉴가 떠서 사칙연산 중 하나를 선택하게끔 함.
	// 예를들어 1.더하기 를 선택하면, CalcFunction클래스의 객체 Calc를 생성하고
	// 해당 객체로 Calc.Add() 형태로 메소드를 불러와, 두 정수의 합의 값을 리턴받아 출력.
	// 여기서 정수 두개는 단순하게 double num1,num2 로 하지 말고, double num[0] num[1] 형태로
	static void powerOn() {
		System.out.println("계산기 전원 On");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 프롬프트상에서 입력받기 위한 Scanner타입객체 생성

		double num[] = new double[2]; // 소숫점의 경우를 생각해 입력받은 정수 2개를 저장할 double타입 배열 생성
		int menu;

		System.out.println("부팅중.....");

		powerOn(); // 일단 가볍게 내부 클래스 이용한 간단한 메소드

		System.out.println("정수 두개를 입력해 주십시오.");

		System.out.printf("정수 1 > ");
		num[0] = sc.nextDouble();

		System.out.printf("정수 2 > ");
		num[1] = sc.nextDouble();
		
		double arr1[]=new double[] {num[0],num[1]};
		
		CalcFunction calc = new CalcFunction(arr1);

		System.out.printf("입력받은 정수 : %d, %d \n", (int) num[0], (int) num[1]);
		System.out.println("수행하고자 하는 작업을 선택해 주십시오.");
		System.out.println("1.더하기|2.빼기|3.곱하기|4.나누기");
		menu = sc.nextInt();
		switch (menu) {
		case 1: {
			System.out.println("더하기를 시행합니다.");
			System.out.printf("결과 : %d", (int) calc.Add());
			break;
		}

		case 2: {
			System.out.println("빼기를 시행합니다.");
			System.out.printf("결과 : %d", (int) calc.Minus());
			break;
		}

		case 3: {
			System.out.println("곱하기를 시행합니다.");
			System.out.printf("결과 : %d", (int) calc.Multiple());
			break;
		}

		case 4: {
			System.out.println("나누기를 시행합니다.");
			System.out.printf("결과 : %.1f \n(나누기는 소수 1번째 자리까지만 출력합니다.) ", calc.Divide());
			break;
		}
		}
	}

}
