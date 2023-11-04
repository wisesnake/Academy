package basic;

public class ControlEx {

	public static void main(String[] args) {

		// for 문 안에 if문 형태

		// 요구 사항 : 1부터 10까지 자연수 중 홀수 짝수

		// 구체적인 요구사항이 정의가 되었는가?

		// 조건문과 반복문이 필요하다

		// 조건문 먼저(상관은 없으나, 상황따라서 판단?)

		// 2번 조건문 형태

// ==================================틀 짜기


//		System.out.println(1 % 2); // 1 출력
//		System.out.println(2 % 2); // 0 출력
//		
//		System.out.println(2 % 2 == 0); // true 출력. -> 어? if는 boolean을 평가하잖아? 응용이 가능하겠네?

//		int num = 2;

//		System.out.println(num % 2 == 0);

//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			
//			System.out.println("홀수");
//		}

//================================== if문 구성 끝냈으니 반복문 틀 짜기
		// 초 조 증
//		for(int i = 0 ; i < 10; i++) {
//			System.out.println(i);
//		}

//		for(int i = 1 ; i <= 10; i++) {
//			System.out.println(i);
//		}
//==================================for문 틀 짜면서 범위 확정 했으니 반복문 for문 섞기		

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수");
			} else {

				System.out.println("홀수");
			}
		}
		
//=======================내 스타일 코드
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "는 짝수입니다.");
//			
//			} else {
//				System.out.println(i + "는 홀수입니다.");
//
//			}
//
//		}

	}

}
