package Polymorphism;

public class Car {

	Tire tire;
	
	public Car() {
		System.out.println(tire);
	}
	
	void run() {
		tire.roll();
	}
	
}
