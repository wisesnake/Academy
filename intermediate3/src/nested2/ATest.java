package nested2;


public class ATest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		//ㄴ> A클래스 내의 중첩클래스 B에 접근하려면 객체를 통해 접근
		//ㄴ> A타입 a참조변수를 통해 A객체 만들고 이를통해 객체에 접근했음.
		b.num1 = 4;
		System.out.println(b.num1);
		b.bMethod();
	
		b.num2 = 1;
		System.out.println(A.B.num2);
		
		b.bStaticMethod();
		A.B.bStaticMethod();
	}

}
