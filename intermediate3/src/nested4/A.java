package nested4;

public class A {
	// f

	// c
	public A() {

		// 로컬 클래스
		class B {

		}
	}

	// m
	void method() {
		class B {
			// f
			int num1 = 1;
			static int num2 = 2;

			// c
			public B() {
				System.out.println("이것은 매소드안의 B의 기본생성자");

			}
			/// m
			void method2() {
				System.out.println("A속 B속 method()속 method2()");
			}
			static void method3() {
				
				System.out.println("A속 B속 method()속 static method3()");
			}
		}
		System.out.println("여기서부터 객체생성하고 메소드속 B의 호출코드가 적혀있는구간");
		B b = new B();
		System.out.println(b.num1);
		System.out.println(B.num2);
		b.method2();
		B.method3();
	}
}
