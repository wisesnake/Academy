package base_ex;

public class ToStringEx {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone("샘숭","android");
		System.out.println(sp);
//		sp만 쓰나 toString()을 붙이나 같음 생략된거임.
		System.err.println(sp.toString());
		//상당히 편리하게 쓰일 오버라이딩이니 기억해두자!
	}

}
