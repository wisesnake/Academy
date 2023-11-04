package exandpersonal;

import java.util.Scanner;

public class UPandDOWN {

	public static void main(String[] args) {
		int answer = 0;
		int guess = 0;
		int retry;

		game: while (true) { // retry 부분에서 1 입력 시 처음 부분으로 돌아오게 하기 위해 라벨링 후 게임 시작부분부터 무한루프 걸었음.
			System.out.println("1부터 100까지의 숫자 중 정답을 정하겠습니다!");

			answer = ((int) (Math.random() * 100) + 1); // 0.0~99.0의 math.random() 실수를 캐스팅으로 정수형태로 변환 후 +1을 해줌으로써 
														// 1~100 사이의 난수를 생성하도록 하였음.

			while (true) { // 정수를 반복해서 받아 up down 여부를 평가하여 사용자에게 전달해주기 위해 무한루프를 걸은 부분.
				System.out.print("정수를 입력하세요 >");
				Scanner sc = new Scanner(System.in);
				guess = sc.nextInt();

				if (answer < guess) { // 프로그램이 정한 정답보다 사용자의 입력값이 높을 경우
					System.out.println("DOWN! 좀더 생각해보세요!");
				} else if (answer > guess) { // 프로그램이 정한 정답보다 사용자의 입력값이 낮을 경우
					System.out.println("UP! 좀더 생각해보세요!");
				} else if (answer == guess) { // 사용자의 입력값이 저장일 경우.
					System.out.println("정답! 축하합니다!");
					while (true) { // 정답메세지 후, 사용자에게 재시도 여부를 묻되, 맞는 값을 입력하지 않았을 경우를 위한 무한루프.

						System.out.println("Retry? 다시 하고 싶으시면 1을, 종료를 원하면 0을 입력하세요.");
						retry = sc.nextInt();
						if (retry == 1) { // 사용자가 1을 입력하였을 경우, game 라벨을 가진 최상위 무한루프로 복귀 -> 게임 재시작
							System.out.println("처음으로 돌아갑니다.");
							continue game;
						} else if (retry == 0) { // 사용자가 1을 입력하였을 경우, game 라벨을 가진 최상위 무한루프에서 탈출 -> 게임 종료
							System.out.println("게임을 종료합니다.");
							break game;
						} else { // 1이나 0 이외의 엉뚱한 키를 입력하였을 경우, 가장 가까운 반복문(retry질문)으로 복귀시킴.
							System.out.println("당신은 내 말을 듣지 않는군요.");
							continue;
						}
					}
				}
			}
		}
	}
}