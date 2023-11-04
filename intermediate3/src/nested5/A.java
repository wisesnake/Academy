package nested5;

public class A {
	// f
	int field1;
	static int field2;
	
	
	void method1(){
		
	}
	static void method2() {
		
	}

	class B {
		public B() {
			// TODO Auto-generated constructor stub
			field1 = 10;
			method1();
			field2= 19;
			method2();
		}
		
		void B() {
			field1 = 20;
		}
	}

	static class C {
//		field1 = 10;
//		method1();
		void method() {
			field2 = 10;
			A.method2();			
		}
	}
}
