package interfaceEx3;

public class DriverTest {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		
		driver.drive(new Taxi());
		//매개변수의 다형성.
	}
}
