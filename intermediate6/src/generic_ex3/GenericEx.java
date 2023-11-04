package generic_ex3;

public class GenericEx {
	static <T extends Number> boolean compare(T t1,T t2) {
//		int intValue1 = t1.intValue();
//		int intValue2 = t2.intValue();
//		
		System.out.println(t1.getClass().getSimpleName());
		
		double doubleVal1 = t1.doubleValue();
		double doubleVal2 = t2.doubleValue();
		
		
		return doubleVal1 == doubleVal2;
	}
	
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println("=======");
		boolean result2 = compare(20, 20);
		System.out.println(result2);
		System.out.println("=======");
		boolean result3 = compare(10.3,10.9);
		System.out.println(result3); // double로 하니까 false 출력
//		System.out.println(result3); // compare를 int에 국한시키면 double의 소수부분 잘려나가서 true출력함
		
		
		
		
		
	}
}
