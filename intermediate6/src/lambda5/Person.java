package lambda5;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";

		int result = comparable.compare(a, b);
		//compare추상메서드는 String 타입 a,b를 매개변수로 받음.

		if (result < 0) {
			System.out.printf("%s 는 %s 보다 앞에 옵니다./n", a, b);
		} else if (result == 0) {
			System.out.printf("%s 는 %s 와 같습니다./n", a, b);
		} else {
			System.out.printf("%s 는 %s 보다 앞에 옵니다./n", b, a);
		}
	}
}
