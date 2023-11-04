package interfaceEx2;

public class CastingEx {

	public static void main(String[] args) {
		//"인터페이스를 구현한 클래스의 객체"를 만든 후에는 타입을 가급적 "인터페이스 타입"으로 선언하는 습관을 들일것.
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
//		현재 vehicle은 Bus의 객체지만 Vehicle인터페이스 타입으로 형변환 되어있으므로
//		Bus 클래스의 checkFare메소드에는 접근 안됨
		
		Bus bus = (Bus)vehicle;
		bus.checkFare();
//		상속관계에서 자동형변환 -> 캐스팅 과 같이, 구현클래스객체가 인터페이스타입으로 자동형변환 된 후에는
//		구현클래스에 있는 멤버,메서드 등에 접근할 수가 없기 때문에, 다시 Bus로 캐스팅해주어야 함.
	}

}
