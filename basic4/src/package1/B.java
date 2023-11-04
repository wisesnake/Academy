package package1;

public class B {
	
	public static void main(String[] args) {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 2;
//		a.field3 = 3;
		
		a.method1();
		a.method2();
//		a.method3();
		
//		ㄴ> 각각 private 접근제어자로 선언하였던 필드 메소드 3은 
//		타 클래스에서 다음과같이 접근하려고하면 에러출력, 접근이 불가능함
		
	}
}
