package chpt7ex;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowtire = new SnowTire();
		Tire tire = snowtire;

		//new SnowTire()라는 객체를 객체A라고 가정하면, 이 객체 A가 Tire 타입 tire변수에 들어가면서
		//객체 A는 Tire로 타입변환이 되면서 최초 SnowTire로 선언되었지만 더이상 SnowTire클래스의 메서드에 접근 불가하게 되었고,
		//이후 아래의 SnowTire 클래스 타입인 snowtire2변수에, SnowTire클래스타입으로 캐스팅되며 들어가면서 
		//최종적으로 객체 A는 SnowTire타입 -> Tire 타입 -> SnowTire타입 으로 타입변환을 거쳐갔음.
		//이래서 부모클래스 타입으로 자동 타입 변환이 되었다, 그리고 다시 자식타입으로 강제 타입 변환이 되었다. 라고 말할수가 있음.
		//나는 객체 그 자체를 중심으로 보지 않고 변수를 중심으로 봐서 부모타입으로,자식타입으로 변환되었다는 말을 이해하지 못했었음.
		
		snowtire.run();
		tire.run();

		//run()은 자식클래스에서 오버라이딩되었으므로 무조건 자식클래스걸로 호출됨.
		//부모클래스의 run()을 호출하고 싶으면 순수 부모클래스의 객체를 만들어서 호출해야 함.
		
		SnowTire snowtire2 = (SnowTire)tire;

		//그리고 다시 이렇게 해당 객체를 자식 객체로 되돌리는,강제 형변환 또한 할 수 있음.
	}

}
