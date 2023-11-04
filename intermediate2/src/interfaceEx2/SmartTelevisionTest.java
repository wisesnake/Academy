package interfaceEx2;

public class SmartTelevisionTest {

	public static void main(String[] args) {

		SmartTelevision smarttv = new SmartTelevision();
		
		smarttv.turnOn();
		smarttv.search("http://www.youtube.com");
		smarttv.turnOff();
		//구현 객체가 어떤 인터페이스 변수에 대입되느냐에 따라 변수를 통해 호출할 수 있는 추상 메서드가 결정
		RemoteControl rc = new SmartTelevision();

		rc.turnOn();
		rc.turnOff();

		Serchable serchable = new SmartTelevision();
		
		serchable.search(null);
//		 ㄴ>
		
	}

}
