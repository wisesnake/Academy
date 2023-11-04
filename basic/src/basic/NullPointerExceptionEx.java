package basic;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		
		String name = null;
		
		System.out.println(name);
		System.out.println(System.identityHashCode(name));

		name = "홍길동";
		
		System.out.println(name);
		System.out.println(System.identityHashCode(name));
	}

}
