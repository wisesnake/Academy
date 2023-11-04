package FightGame;

import java.util.Random;
import java.util.Scanner;

public class Arena {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		Player player1 = new Player();
		Player player2 = new Player();
		int retry;
		
		System.out.println("게임 가동중...");
		System.out.println("1:1 Arena!!!");
		while(true) {
		
			System.out.println("플레이어의 이름을 입력해주세요");
			System.out.printf(">");
			name = sc.nextLine();
			player1.name = name;
			System.out.printf("플레이어의 이름이 %s 맞습니까? 맞으면 1을, 다시 지으시려면 2를 입력하세요.", name);
			int q = sc.nextInt();
			sc.nextLine();
			while(true) {
				
			if (q == 1) {
				break;
			} else if(q == 2) {
				continue;
			} else {
				System.err.println("말좀 들어라!");
				continue;
			}
			}
			
			System.out.println("몬스터가 기다리고 있는 던전으로 입장합니다.....");
			System.out.println("던전 속은 조용하고, 당신의 발소리만 울립니다.");
			for(;;) {
				
				System.out.println("뚜벅...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
			
			
		}
	}

}
