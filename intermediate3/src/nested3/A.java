package nested3;

public class A {
	
	static class B {
		
		int field1 = 1;
		static int field2 = 2;
		
		public B() {
			System.out.println("A 속 B의 기본생성자");
		}
		
		void method1() {
			System.out.println("A.B의 method1");
		}
		
		static void method2() {
			System.out.println("A.B의 method2");
		}
	}
	
}
