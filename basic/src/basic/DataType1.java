package basic;

public class DataType1 {

		public static void main(String[] args) {


			//DataType
			
			byte byteValue1 = -128;
			byte byteValue2 = 0;
			byte byteValue3 = 127;
			
			short shortValue1 = -32768;
			short shortValue2 = 32767;
			
			int intValue1 = 2147483647;
			int intValue2 = -2147483648;

			long longValue1 = 2147483649L;
			long longValue2 = -2147483648L;
//			long longValue1 = 2147483649;
//			long longValue2 = -2147483648;
// 			얘네는 에러남, 뒤에 long임을 알려주는 L을 붙여야함.

			// 자바에서 실수 선언시 정밀도를 위해 double로 선언. 만약 굳이 float로 선언하고싶을 경우, long처럼 뒤에 값뒤에 f붙이면 됨
			double doubleValue= 0.1;
			
			float floatValue= 0.1f;
			// 자바에서는 정수는 int, 실수는 double 로 기본 설정됨;
			
			char ch1='a';
			
			boolean boolValue1 = true;
			boolean boolValue2 = false;
			
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			// 자바는 유니코드 체계를 따르긴 하지만 
			// ASCII 코드에 잇던 값을 C언어서 사용하고
			// 그 개념을 유지하기 위해 표용함.
			
			//다른 언어코드 체계를 포용하기 위한 유니코드
			//한글은 UTF-8 
			
			char ch2 = '가';
			System.out.println(ch2);
			System.out.println((int)ch2);
			
		}
	
}
