package basic2;

public class CarTest {

	public static void main(String[] args) {
		System.out.println(new Car());
	
		Car car1 = new Car();
		car1.color = "붉은";
		
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "푸른";
	
		System.out.println(car2.color);
	}
	

}
