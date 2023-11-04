package inheritance6;

public class A {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		System.out.println(a instanceof A);
//		System.out.println(b instanceof A);
//		상속관계가 아닌이상 자동타입변환이 일어날 일도 없고, 해당 연산자를 쓸 일조차도 없으므로
//		해당 코드는 애초부터 컴파일 에러가 남.

		
		
	}

}
