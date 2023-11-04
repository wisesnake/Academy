package nested6;

public class A {
	String field = "A-field";
	
	void method() {
		System.out.println("A-a");
	}

	void useB() {
		B b = new B();
		b.print();
	}
	
	class B{
		String field = "b-field";
		
		void method(){
			System.out.println("B-b");
				
		}
		
		void print()
		{
//			System.out.println(this.field);
//			System.out.println(field);
			method();
			this.method();
			System.out.println("-------");
			A.this.method();
//			System.out.println(A.this.field);
		}
	}
	
	
}
