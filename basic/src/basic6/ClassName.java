package basic6;

public class ClassName {

	//정적 메서드와 정적 블록은 객체가 없어도 실행된다는 특징 때문에 내부에 인스턴스 필드나
	//인스턴스 메서드를 사용할 수 없다.
	//또한 객체 자신의 참조인 this도 static은 사용할 수 없다.
	
	//f
	//instance
	int field1;
	
	//static
	static int field2;
	
	//static block
	
	static {
//		field1=10; 인스턴스 필드이기 때문에 오류출력
		field2=10;
		
	}
	
	
	//c
	public ClassName() {
		
	}
	
	
	
	//m
	
	//instance
	void method1() {
		
	}
	//static
	static void method2() {
//		field1 = 5; instance -> static 불가
//		static 다해놓고 인스턴스를 쓰고싶다, 객체 통해서 참조자체는 가능. 근데 쓸 일 없을듯.		
//		ㄴ> ClassName className = new ClassName();
//		ㄴ> className.field1 = 10;
		
	}
	
}
