package basic;

public class PrintFormatEx1 {

	public static void main(String[] args) {
//		출력 포맷 : "%"
//				ㄴ % 뒤에 올 수 있는 종류
//					d : digit, 숫자
//					f : float, 실수
		int value = 123;
		System.out.printf("%d", value);
		System.out.println();
		
		System.out.printf("%6d", value);
		System.out.println();
		System.out.printf("%06d", value);
		
		
		System.out.println();
		double area = 3.141592 * 10 * 10;
		System.out.println(area);
		System.out.printf("%.1f\n",area); // 반올림됐음.
		System.out.printf("%.2f",area); // 반올림됐음.
		
		
		
	}

}
