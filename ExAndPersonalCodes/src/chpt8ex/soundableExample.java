package chpt8ex;

public class soundableExample {
	public static void printSound(Soundable soundable) {
		//매개변수로 Soundable인터페이스 타입의 객체(혹은 객체참조 변수를) 받음.
		System.out.println(soundable.sound());
		//그렇게 받은 후 해당 객체를 참조하여 해당 클래스의 sound()메서드 실행.(Soundable 인터페이스를 구현한 클래스를 통한 다형성 구현)
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		//매개변수로써 입력된 객체의 종류에 따라 결과물 달라짐.(다형성)
	}

}
