package exandpersonal;

import java.util.Scanner;

public class studGradeMenu {

	public static void main(String[] args) {
		// 다음과 같은 인터페이스 하에서 학생 수와 점수를 입력받아, 최고 점수 및 평균 점수를 구하는 프로그램

//
//		실행 결과
//		------------------------------------
//		1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
//		-------------------------------------
//		선택> 1
//		학생수> 3
//		----
//		선택> 2
//		scores[0]> 85
//		scores[1]> 90
//		scores[2]> 95
//		----
//		선택> 3
//		<점수목록>
//		scores[0]> 85
//		scores[1]> 90
//		scores[2]> 95
//		----
//		선택> 4
//		최고 점수 : 95
//		평균 점수 : 90
//		----
//		선택>5
//		프로그램 종료
//		
//		메뉴판은 항상 떠야함.

		Scanner sc = new Scanner(System.in); // 입력값을 위한 scanner객체 sc 생성.
		// 일단 정수 여러개가 들어갈 빈 배열변수 선언.
		int studentNum = 0;
		int[] scores = new int[0];

		outer_for: for(;;)   {

			System.out.println("|------------------------------------|");
			System.out.println("|------------------------------------|");
			System.out.println("|------------------------------------|");
			System.out.println("|1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료 |");
			System.out.println("|------------------------------------|");
			System.out.println("|------------------------------------|");
			System.out.println("|------------------------------------|");
			
			System.out.print("선택> ");
			int menu = sc.nextInt(); // 메뉴 네비게이팅을 위한 입력변수 받을 menu
			switch (menu) {
			case 1: {
				System.out.printf("학생수 > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			}
			case 2: {
				if (scores.length == 0) {
					System.out.println("학생 수를 먼저 입력해 주세요.");
					continue;
				} else {
					System.out.printf("입력 된 학생 수 : %d명 \n\n", scores.length);
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("%d번째 학생의 점수> ", i + 1);
						scores[i] = sc.nextInt();
					}
					break;
				}
			}

			case 3: {
				if (scores.length == 0) {
					System.out.println("학생 수를 먼저 입력해 주세요.");
					continue;
				} else {
					System.out.println("<점수 리스트>");
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("%d번째 학생의 점수> %d \n", i + 1, scores[i]);
					}
				}
				break;
			}
			case 4: {
				int max = 0;
				int tot = 0;
				double avg = 0.0;
				if (scores.length == 0 || scores[0] == 0) {
					System.out.println("학생 수 혹은 학생 별 점수 입력이 안되었습니다.");
					continue;
				} else {

					for (int i = 0; i < scores.length; i++) {
						if (max < scores[i]) {
							max = scores[i];
						}
						tot += scores[i];
					}
				avg = (double) tot / scores.length;
				System.out.printf("최고 점수> %d점 \n", max);
				System.out.printf("평균 점수> %.1f \n", avg);
				}
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				break outer_for;

			}
			default: {
				System.out.println("1~5 사이의 수를 입력해 주세요.");
				break;
			}
			}
		}
	}
}