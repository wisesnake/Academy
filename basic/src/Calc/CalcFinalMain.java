package Calc;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcFinalMain {

	public static void main(String[] args) {
		// 연산자숫자 형태로 입력하면 쭈우욱 계산되는 형태로
		// ex) 10 엔터 +10엔터 하면 20 출력 후 계속 입력
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		System.out.println("정수를 입력하십시오.");
		int iniNum = sc.nextInt();
		arrList.add(iniNum);
		sc.nextLine();
		
		System.out.println("수행하려는 계산을 연산자+정수 의 형태로 입력하십시오.");
		System.out.println("ex) 앞서 입력한 숫자에 10을 더하려면 \' +10 \' 과 같은 형태");
		
		String input;
		char operator;
		double currVal = 0.0;
		double val;
		
		
		do {
			System.out.println("종료하려면 0을 입력하세요.");
			System.out.print("입력 > ");
			// 연산자 + 숫자 문자열로 입력받음 
			input = sc.nextLine();
			
			// 입력받은 문자열 중, 첫번재는 무조건 연산자일 테니 연산자 평가용으로 변수에 빼둠.
			operator = input.charAt(0);
			
			//0만 입력받았을 경우 종료.
            if (operator == '0') {
                System.out.println("계산기를 종료합니다.");
                break;
            }            
			
			// 연산자부분과 숫자부분 분리하여 숫자부분은 val로 넣었음
			val = Double.parseDouble(input.substring(1,input.length()));
			
			//이 시점에서, 입력받은 값은 operator(연산자) 와 val(값) 부분으로 나뉨.

			CalcFinal calc = new CalcFinal(val,currVal);
			//연산을 수행하기 위해 숫자부분만 val로 뺀채로 객체 생성.
			
			switch (operator) {
			case '+' : {
				currVal = calc.add();
				break;
			}
			case '-' : {
				currVal = calc.minus();
				break;
			}
			case '*' : {
				currVal = calc.multi();
				break;
			}
			case '/' : {
				currVal = calc.divide();
				break;
			}
			default :{
				System.out.println("정상적인 연산자가 아닙니다.");
				continue;
			}
			
			}
			System.out.printf("현재 값 : %.2f \n", currVal);
			
			
			
		}while(true);

	}

}
