package chpt9ex;

public class CarEx {

	public static void main(String[] args) {
		//Tire 와 Engine객체를 생성하는 코드 짜기.
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		//중첩클래스는 객체생성 후 객체를 통해서만 객체 생성 가능.
		//따라서 new Car.Engine()의 모양새
		
		
	}

}
