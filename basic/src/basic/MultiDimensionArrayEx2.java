package basic;

public class MultiDimensionArrayEx2 {

	public static void main(String[] args) {
		// 이차원 배열(표 형태의 데이터 저장하는데 유리함)

		// 일차원 배열
		// 1)

//		int arr1[] = new int[3];
//		arr1[0] = 70;
//		arr1[1] = 70;
//		arr1[2] = 70;
//		
//		//2)
//		int arr1_1[] = new int[] {70,70,70};
//		
//		//이차원
//		//1)
//		int arr2[][] = new int[3][3];
//		arr2[0][0] = 70;
//		arr2[0][1] = 80;
//		arr2[0][2] = 90;
//
//		arr2[1][0] = 75;
//		arr2[1][1] = 85;
//		arr2[1][2] = 95;
//
//		arr2[2][0] = 73;
//		arr2[2][1] = 83;
//		arr2[2][2] = 93;

		// 다차원 배열을 가독성 좋고 편하게 선언하는 방법
		int arr2[][] = new int[][] {{70,70,70},
									{80,80,80},
									{90,90,90}};
		// 행의 길이
		System.out.println(arr2.length);
		// 만약 arr[3][4]으로 ,즉, 4행을 초기화 시키진 않았아도
		// 이차원 배열 중 행의 개수(길이) 자체는 4로 출력 하는걸 알 수 있음.(배열이 할당됨)
		
		// 열의 길이
		System.out.println(arr2[1].length);
		// 3 출력, 역시 초기화 시키지 않은 열에 대해서도 길이는 출력함
		// 2차원 배열에서 열의 길이는 일단 행에 접근(arr2[n번째 행]) 한 후에 길이를 찍어야함.
		int tot = 0;
		int cnt = 0;

		// for문으로 표의 형태로 다차원 배열 항목별 결과 찍기
		for (int i = 0; i < arr2.length; i++) { // 행 생성
			for (int j = 0; j < arr2[i].length; j++) { // 열 생성
				System.out.print("|" + arr2[i][j]);
				cnt += 1;
				tot += arr2[i][j];
			}
			System.out.println("|");
		}
		double avg = (double)tot / cnt;
		System.out.printf("누적합 : %d \n", tot);
		System.out.printf("평균  : %.1f", avg);
	}

}
