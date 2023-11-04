package basic;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteVar1 = 10;
		
		int intValue = byteVar1; // 자동 형(type) 변환(promotion)
		
		System.out.println(intValue);

		
		char charValue1 = 'A';
		
		intValue = charValue1;
		
		System.out.println(intValue);
		
		
		
		char charValue2 = '가';
		
		intValue = charValue2;
		
		System.out.println(intValue);
		
		
		
		intValue = 500;
		
		long longValue = intValue;
		
		System.out.println(longValue);
		
		
		
		double doubleValue = intValue;
	
		System.out.println(doubleValue);
	}

}
