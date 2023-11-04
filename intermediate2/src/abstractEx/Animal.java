package abstractEx;

//객체를 생성할 수 있는 클래스는 실체 클래스, 이 클래스들의 공통적인 필드나 메서드를 추출해서 선언한 클래스를 추상 클래스라고 함.
//추상클래스는 실체 클래스의 부모(상속 필요)역할

//추상메소드가 있느냐의 여부로 추상클래스인지를 구분해도 크게 무리는 없을 듯 하다.
public abstract class Animal {

	//추상클래스도 필생메를 선언할 수는 있다.
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
// 추상 메서드를 알기 위해서 다시 한번 메서드에 대하여 공부해 보도록 하겠습니다.
//	void breathe() {
//		System.out.println("숨 쉰다.");
//	}
//	
//	위 메서드를 두 부분으로 구분하면,
//	1) 선언부 : void breather()
//	2) 구현부 : { System.out.println("숨 쉰다."); }

	// 추상메서드
	abstract void breathe();
	//선언부만 선언해둠(이후 자식클래스에서 오버라이드)
	
	public static void main(String[] args) {
//		new Animal(); 컴파일에러, 추상클래스는 new연산자를 사용하여 객체를 직접 만들지 못함.
		
		
	}
}
