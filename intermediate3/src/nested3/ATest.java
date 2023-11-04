package nested3;

public class ATest {
	public static void main(String[] args) {
		
		A.B b = new A.B();
		
		System.out.println(b.field1);
	
		System.out.println(A.B.field2);
		
		b.method1();
		
		A.B.method2();
		
		
	}
}
