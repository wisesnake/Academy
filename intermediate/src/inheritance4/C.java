package inheritance4;
import inheritance3.A;
import inheritance3.B;

public class C {
	public void method() {
//		A a = new A();
		B B = new B();
//		protected 생성자를 쓰는 A클래스는 import를 해도 객체생성 시 컴파일에러를 출력함.
//		protected는 외부패키지에서 접근 못하게 막음. 메소드도, 필드도 마찬가지임
	}
}
