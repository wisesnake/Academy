package exceptionEx;

import java.util.Scanner;

public class NullPointerExceptionEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				int n1 = sc.nextInt();
				System.out.println("입력받은 정수 :" + n1);
			} catch (Exception e) {
				System.out.println("정수 외에 다른 데이터 타입을 입력하시면 안됩니다!");
			}
			break;
		}

	}

}
