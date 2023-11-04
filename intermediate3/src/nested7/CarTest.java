package nested7;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		car.tire1.roll();
//		Car안에서 객체 만들어졌었음.
//		ㄴ>Tire tire1 = new Tire();
		car.tire2.roll();
//		Car안에서 객체가 만들어졌는데, 얘는 따로
//		익명클래스 형태로 자식클래스 객체가 따로 만들어서
//		거따가 roll메서드를 오버라이드했으므로 다형성 구현됨.
//		car.run();
		car.run2();
		System.out.println("======================");

		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러감");
			}
		});

		
	}
}
