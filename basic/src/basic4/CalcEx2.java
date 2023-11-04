package basic4;

import java.util.Scanner;

public class CalcEx2 {

	public static void main(String[] args) {
		int num1, num2;
		int menu;
		int result = 0;

		System.out.println("계산기를 실행합니다.");

		while(true){
			System.out.println("계산을 할 두개의 정수를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			System.out.println("입력1 > ");
			num1 = sc.nextInt();
			System.out.println("입력2 > ");
			num2 = sc.nextInt();

			System.out.printf("입력받은 정수 : %d , %d \n", num1, num2);
			System.out.println("무엇을 할까요?");
			System.out.println("1.더하기|2.빼기|3.곱하기|4.나누기");
			System.out.print("입력 > ");
			menu = sc.nextInt();

			Calc2function calc = new Calc2function(num1, num2);

			switch (menu) {
			case 1: {
				result = calc.Add();
				break;
			}
			case 2: {
				result = calc.Minus();
				break;
			}
			case 3: {
				result = calc.Multi();
				break;
			}
			case 4: {
				result = calc.Divide();
				break;
			}
			}
			System.out.println("결과 :" + result);
			
			System.out.println("다시 하려면 1을, 끝내려면 아무 숫자나 입력하십시오.");
			int ask = sc.nextInt();
			if (ask == 1) {
				continue;
			} else {
				break;
			}
		}
	}
}
