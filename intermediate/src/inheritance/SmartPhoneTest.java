package inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone smartphone = new SmartPhone("Galaxy", "navy");
		System.out.println(smartphone.model + "  " + smartphone.color);

		smartphone.sendVoice("오늘 점심 뭐 먹을랭");
		
		smartphone.receiveVoice("백반 먹자");
		
		System.out.println(smartphone.wifi);
		smartphone.setWifi(true);
		System.out.println(smartphone.wifi);
	
		smartphone.internet();
		
		//SmartPhone클래스 객체임에도, 그 부모클래스인 Phone 클래스의 속성 메소드 등을 호출 할 수 있는 모습.
	}

}
