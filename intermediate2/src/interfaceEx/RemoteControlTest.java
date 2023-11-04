package interfaceEx;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl remoCon = null;
		
		//인터페이스도 타입으로써 선언이 가능함(참조형이므로, 참조형 - 배열 열거 클래스 인터페이스)
		//인터페이스 자체는 인스턴스화(객체) 할 수 없으므로, 그 인터페이스를 구현한 클래스로 객체를 만들어
		//인터페이스 타입의 인터페이스형 참조변수를 초기화 하는것이 가장 일반적인 초기화 기법
		
		remoCon = new Television();
		
		remoCon.turnOn();
		
		remoCon.setMute(true);
		
		remoCon = new Audio();

		remoCon.turnOn();
		
		remoCon.setMute(true);
//		
	}

}
