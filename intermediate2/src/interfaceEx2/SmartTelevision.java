package interfaceEx2;

public class SmartTelevision implements RemoteControl,Serchable{

	@Override
	public void turnOn() {
		System.out.println("켬");
	}

	@Override
	public void turnOff() {
		System.out.println("끔");
			
	}

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

}
