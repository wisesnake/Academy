package basic;

public class PromotionEx2 {
	public static void main(String[] args) {
		// 자바에서의 정수는 int, 정수 연산식에서 중 산술 연산시(+,-.*,/,%) int로 형 변환이 일어난 후에 연산이 됨.
		// 연산식에서의 자동 타입 변환, 산술 연산시

		// 나머지 연산자(operator) : %
		System.out.println(9 % 4);

		// b b
		// c(char) c
		// s 산술 연산자 (+,-.*,/,%) s
		// i i

		byte x = 10;
		byte y = 20;

//		byte result = x + y;	//byte로 선언하였을지라도 연산 시 x 와 y 가 int 로 자동 형변환이 일어났음.

		int result = x + y;
		
		
		
		//실수 연산(float, float 연산)
		float result2 = 1.2f + 3.4f;

		System.out.println(result2);
		
		//실수 연산2(float, double)
		double result3 = 1.2f + 3.4; 	//float값 1.2f가 더 넓은 범위의 double로 자동 형변환 되었음
		
		System.out.println(result3);
		
		//정수와 실수 연산
		int intVal = 10;
		double doubleVal = 5.5;
		
		// int(4kb) -> double(8kb) 자동 형변환되었음
		System.out.println(intVal + doubleVal);

		
		// 결과를 정수로 받고자 할 경우에는 int로 강제 형변환
		System.out.println(intVal + (int)doubleVal);
		
		
		
		
		
		
		
		
		
	}
	
}