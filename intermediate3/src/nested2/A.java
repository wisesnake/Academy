package nested2;

public class A {
	// f

	// A의 인스턴스필드에 필드값으로 B객체 대입.
	B field = new B();

	// c
	public A() {
		B b = new B();
	}

	// 인스턴스 멤버 클래스
	class B {
		int num1;

		// 인스턴스 멤버 클래스 안에서 정적 필드 허용 (java 17부터)
		static int num2 = 2;

		public B() {
			System.out.println("B생성자 호출됨.");
		}

		void bMethod() {
			System.out.println("here is bMethod() ( A -> B -> bMethod)");
		}

		static void bStaticMethod() {
			System.out.println("here is Static bMethod() ");
		}

	}

	// m
	void method() {
		B b = new B();
		System.out.println(B.num2);
		b.bMethod();
		b.bStaticMethod();
	}
}
