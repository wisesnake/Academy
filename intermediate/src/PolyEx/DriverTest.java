package PolyEx;

public class DriverTest {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		driver.vehicle = new Vehicle();
		
		driver.drive();
		//Driver 클래스 안에는 Vehicle클래스 참조타입 변수 vehicle이 있음.
		//그리고 drive()메소드는 이 vehicle 참조타입변수를 참조하여 Vehicle클래스의 run()을 호출함.
		//따라서 이번 drive() 메소드 호출에서는 Vehicle의 run()이 실행됨.
		
		driver.vehicle = new Bus();

		driver.drive();
		//그리고 이번엔 driver객체 속의 vehicle을 Bus클래스를 참조하는 객체 참조 변수로 만들었음.
		//따라서 drive()메소드 호출에서 vehecle.run()은 Bus클래스에서 오버라이딩 된 버전의 run()메소드가 호출됨.
		
		
		driver.vehicle = new Taxi();
		
		driver.drive();
		//마찬가지로 Taxi클래스의 오버라이딩 된 버전의 run()메소드가 호출됨.
	}

}
