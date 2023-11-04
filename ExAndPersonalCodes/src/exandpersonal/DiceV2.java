package exandpersonal;

import java.util.Random;
import java.util.Scanner;

public class DiceV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("주사위 게임!");
		game : while(true) {			
			System.out.println("주사위를 굴리려면 1을, 아니면 2을 입력하세요");
			System.out.print(">");
			int start = sc.nextInt();
		switch(start){
		case 1:{
			int dice = random.nextInt(1,6);
			System.out.printf("숫자는 %d가 나왔습니다! \n", dice);
			System.out.println("====================");
			System.out.println("====================");
			break;
		}
		case 2:{
			System.out.println("게임을 종료합니다.");
			break game;
		}
		default:{
			System.err.println("1 혹은 2중에서만 입력하세요");
			continue;
		}
		}
		}
		
	}

}
