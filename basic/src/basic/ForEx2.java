package basic;

public class ForEx2 {

	public static void main(String[] args) {
		
		// 이중(nested) for 문

		for (int i = 1; i < 10; i++) { // 행
			for (int j = 1; j < 10; j++) { // 열
				System.out.printf("%2d  X %2d = %2d |", i , j , i*j);
			}
			System.out.println();
		}
	}
}
