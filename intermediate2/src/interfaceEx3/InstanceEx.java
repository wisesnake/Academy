package interfaceEx3;

public class InstanceEx {

	static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}else if(vehicle instanceof Taxi taxi) {
			taxi.checkFare();
		}
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
	
		ride(bus);
		System.out.println("===============");
		ride(taxi);
	}

}
