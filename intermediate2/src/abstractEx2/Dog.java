package abstractEx2;

public class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍");
	}
	//부모클래스에서 sound()메소드를 추상메소드로써 실행부 없이 선언해두었기 때문에, 추상클래스 Animal을
	//상속받는 Dog클래스에서는 반드시 해당 메소드를 선언하여 오버라이딩 하여, 구현을 해야만 함.
	//에러메세지 : the type dog must implement the inherited abstract method Animal sound()
	//				ㄴ>dog 유형은 상속된 추상 메서드 Animal sound()를 구현해야 합니다.
	
}
