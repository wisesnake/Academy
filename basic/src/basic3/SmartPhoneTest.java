package basic3;

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone ssPhone = new SmartPhone("silver", 128);
		//SmartPhone 클래스 데이터타입을 지니는 ssPhone 변수를 생성하고,
		//new 연산자를 통해 SmartPhone타입의 객체를 생성한 후 Car클래스타입의 변수에 대입.
		
		System.out.println(ssPhone.color);
		System.out.println(ssPhone.ramGB + "GB");

		System.out.println("========================");
		SmartPhone iPhone = new SmartPhone("black", 64);
		
		System.out.println(iPhone.color);
		System.out.println(iPhone.ramGB + "GB");
		
		//SmartPhone클래스를 참조하는 객체 ssPhone을 생성한 후, 생성자를 호출하여 color를 silver로,
		//ramGB 를 128로 초기화함 그 후 즉, Car타입의 객체를 생성 후 Car타입의 참조 변수로 Car객체를 참조.
		
	}
}
