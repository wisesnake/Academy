package generic_ex2;

public class GenericTest {

	public static void main(String[] args) {

		HomeAgency homeAgency = new HomeAgency();

		Home home = homeAgency.rent();
		//Home 클래스타입 참조 변수 home에는, 인터페이스 Rentable<T>의 추상메서드 rent()를 Home 리턴타입으로 오버라이딩하여
		//리턴받은 새로이 생성된 Home객체가 들어가게 됨.
		home.turnOnLight();

		System.out.println("----------------------");
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}

}
