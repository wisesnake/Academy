package Polymorphism;

public class CarTest {

	public static void main(String[] args) {

//		car.run();
		
		//카 객체에서  run을 실행하니 그 안에 타이어 객체가 있어야 하나 
		//현재는 null 인상태이므로 NullPointerException발생
		//앞으로 해당오류 보이면 아 내가 객체를 뭔가 하나 빠뜨렸구나 떠올리면 됨.
		Tire tire = new Tire();
		Car car = new Car();
		car.tire = new Tire();
		
		car.run();
		System.out.println("========");
		System.out.println("한국타이어로 타이어 교체");
		car.tire = new HankookTire();
		car.run();
		
		System.out.println("========");
		System.out.println("금호타이어로 타어어 교체");
		car.tire = new KumhoTire();
		car.run();
	}

}
