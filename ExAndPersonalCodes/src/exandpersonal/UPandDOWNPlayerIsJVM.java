package exandpersonal;

import java.util.Scanner;

public class UPandDOWNPlayerIsJVM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rdy;
		int maxAnswer;
		boolean cpuwin = false;

		input: while (true) {
		    System.out.println("제가 1부터 몇까지의 자연수를 추측할 지 정해주시기 바랍니다.");
		    String inputLine = sc.nextLine(); // 입력을 문자열로 받음
		    try {
		        maxAnswer = Integer.parseInt(inputLine); // 문자열을 정수로 변환
		    } catch (NumberFormatException e) {
		        System.out.println("올바른 숫자를 입력해주세요.");
		        continue input;
		    }

		    System.out.printf("입력한 값이 %d 가 맞습니까? 맞다면 y를, 다시 입력하고 싶으시다면 n을 입력해 주십시오. \n >", maxAnswer);
		    rdy = sc.nextLine();

		    if (rdy.equalsIgnoreCase("y")) {
		        break input;
		    } else if (rdy.equalsIgnoreCase("n")) {
		        continue input;
		    }
		}
		
		while(true) {
			
		System.out.println("준비되었다면 Y를, 종료를 원하시면 N을 입력해주세요");
		
		rdy = sc.nextLine();
		
		if(rdy.equals("y") || rdy.equals("Y")) {
			break;
		} else if(rdy.equals("n") || rdy.equals("N")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} 
		}
		
//		=============================================================
		
		System.out.println("게임 시작!");
		System.out.println("규칙 : 저의 추측보다 정답의 값이 높다면 DOWN을, 낮다면 UP을 입력해주십시오.");
		System.out.println("	  제가 정답을 맞추었다면 GOOD 을 입력해 주십시오.");
		while(!cpuwin) {
			int guess;
			guess = maxAnswer/2;
			
			System.out.printf("%d 인가요?", guess);
			break;
		}
	}

}
