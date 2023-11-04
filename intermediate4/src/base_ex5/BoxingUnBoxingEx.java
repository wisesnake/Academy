package base_ex5;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println(obj);
		System.out.println(obj.intValue());
		//intValue메서드는 Integer객체 내부의 int값을 리턴한다.
		
		//UnBoxing
		int value = obj;
		System.out.println(value);
		
		//연산시 자동으로 Unboxing 됨.
		int result = obj + 20;
		System.out.println(result);
		
		System.out.println(Integer.parseInt("10") + 10);
		System.out.println(Double.parseDouble("10.45") + 10);
		System.out.println(Boolean.parseBoolean("true"));
	 }

}
