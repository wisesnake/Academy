package interfaceEx3;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달림.");
	}
	void checkFare() {
		System.out.println("택시 승차요금 체크");
	}
}
