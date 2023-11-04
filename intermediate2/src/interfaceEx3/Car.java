package interfaceEx3;

public class Car {
//	Tire tire = new HankookTire();
	Tire tire = new KumhoTire();
	
	void run() {
		tire.roll();
	}
}
