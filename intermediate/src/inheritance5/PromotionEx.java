package inheritance5;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		//관계도
		//A->B->D
		//A->C->E
		
		//자동 타입변환
		//부모타입 참조변수 = 자식 타입 객체
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

		//자식타입의 객체 = 부모타입 참조변수 대입 가능.(자동타입변환)
		
//		B b2 = e;
//		C c2 = d;
//		친인척(?)관계이지만 직접상속관계가 아니므로 컴파일 에러 발생.
		
		System.out.println("=======================");
		
		A a = new A();
		B bb = new B();
		
		System.out.println(a);
		System.out.println(bb);
		
		A aa = bb;
		System.out.println(aa);
		System.out.println(aa == bb);
		//true 출력
		
//		String str = "s";
//		int num = str; 
//		캐스팅하지 않으면 대입 시 자동형변환이 일어나지 않아 컴파일 에러를 내는,서로 상속관계에 있지 않은 기본형 타입들과는 다른개념
	}

}
