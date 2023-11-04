package inheritance3;

public class B {
	
	//f
	
	A a = new A();
	
	
	
	
	//c
	
	public B() {
		A a1 = new A();
	}
	
	
	
	
	//m
	
	public void method() {
		A a2 = new A();
		a2.field = "hi";
		a2.method();
		//inheritance4의 C 클래스에서 계속...
	}
}
