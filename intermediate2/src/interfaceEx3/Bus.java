package interfaceEx3;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달림.");
	}
	
	void checkFare() {
		System.out.println("버스 승차요금 체크");
	}
	
}
