package chpt12ex;

public class IntCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		int o3 = obj3;
		int o4 = obj4;
		System.out.println(o3 == o4);
	}

}
