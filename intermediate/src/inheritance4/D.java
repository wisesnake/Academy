package inheritance4;

import inheritance3.A;

public class D extends A	 {
	//상속받을 경우, protected에 접근 가능함을 보여주는 클래스
	public D() {
		super();
		System.out.println("package2의 D객체 생성.");
	}
	
	
	@Override
	protected void pMethod() {
		super.pMethod();
		System.out.println("protected A를 상속받았고 재정의도되는 package2의 메서드");
	}
	
	public void method1() {
		field = "hi2";
		method();
	}
	
	public void method2() {
//		A a = new A();
//		부모클래스의 객체를 만들수는 없음.
	}
	
}
