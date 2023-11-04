package Calc;

import java.util.Scanner;

public class TotAvgMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studGrade[][];
		int studNum;

		System.out.println("학생별 총누적합과 평균을 구합니다.");
		System.out.println("학생수와 각 점수를 차례대로 입력하세요");
		System.out.print("학생수 >");
		studNum = sc.nextInt();
		studGrade = new int[studNum][3]; // 학생수 X 과목수(3) 만큼의 이차원 배열 생성.

		for (int j = 0; j < studGrade.length; j++) {
			System.out.printf("<학생 %d> \n", j + 1);
			for (int k = 0; k < 3; k++) {
				if (k == 0) {
					System.out.print("국어점수 : ");
					studGrade[j][k] = sc.nextInt();
				} else if (k == 1) {
					System.out.print("영어점수 : ");
					studGrade[j][k] = sc.nextInt();
				} else if (k == 2) {
					System.out.print("수학점수 : ");
					studGrade[j][k] = sc.nextInt();
				}
				System.out.println();
			}
		}

        for (int i = 0; i < studGrade.length; i++) {
            int total = TotAvg.getTotal(studGrade[i]);
            double avg = TotAvg.getAverage(studGrade[i]);

		        
		        System.out.printf("학생 %d | 누적 : %d | 평균 : %.2f\n", i + 1, total, avg);
		    }

	}

}
