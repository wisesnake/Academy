package basic;

public class ForEx4 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) continue;
			// 짝수 일 경우 밑의 sysout을 실행하지 말고 for문의 증감문으로 돌아갈 것.
			// continue는 if와 같이 활용하여 특정 상황에 for문의 특정 실행문을 건너뛰는 식으로 활용 가능.(흐름제어)
			System.out.println(i);
		}
		
	}

}

