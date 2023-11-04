package stream2;

import java.util.Arrays;

public class MatchingEx {

	public static void main(String[] args) {
		
		int intArr[] = {2,4,6};
		int intArr2[] = {2,3,5,7,9};
		int intArr3[] = {1,3,5,7,9};
		
		boolean result1 = Arrays.stream(intArr).allMatch((i)->{return i % 2 == 0;});
		
		System.out.println("짝수임? : " + result1);
		
		boolean result2 = Arrays.stream(intArr2).anyMatch((i)->{return i % 2 == 0;});
		System.out.println("짝수 하나라도 있음? : " + result2);
		
		boolean result3 = Arrays.stream(intArr3).anyMatch((i)->{return i % 2 == 0;});
		System.out.println("짝수임? : " + result3);
		
		boolean result4 = Arrays.stream(intArr3).noneMatch((i)->{return i % 2 == 0;});
		System.out.println("짝수아님? : " + result4);
		
		
	}

}
