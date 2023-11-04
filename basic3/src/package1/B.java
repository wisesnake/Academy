package package1;

public class B {
	A a = new A();
	A a1 = new A(true);
	A a2 = new A(1);

	//A클래스에서 private로 선언되었던 A(String) 때문에 에러 출력.
//	A a3 = new A("string");
}
