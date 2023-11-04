package Calc;

import java.util.Scanner;

public class AccuAndAvgMain {

	public static void main(String[] args) {
		
		double[] arr;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 길이 정하셈");
		int length = sc.nextInt();
		arr = new double[length];
		
		System.out.println("값 입력하셈");
		
		for(int i = 0; i < arr.length; i++) {			
			System.out.printf("%d of %d 입력 > \n",i+1,arr.length);
			arr[i] = sc.nextDouble();
		}
		
		AccuAndAvg aaa = new AccuAndAvg(arr);
		//위에서 입력받은 값들을 배열의 형태로 가진 arr[]을 매개값으로 활용하는 객체 생성.
		
		double result1 = aaa.getTotal();
		//입력받은 배열변수 arr을 활용하는 누적합을 구하는 메서드 호출하여 리턴값 받음.
		
		double result2 = aaa.getAvg();
		//입력받은 배열변수 arr을 활용하는 평균값을 구하는 메서드 호출하여 리턴값 받음.
		
		System.out.printf("총누적합 : %.2f | 평균: %.2f (출력값은 소숫점 2자리까지!)",result1,result2);
	}

}
