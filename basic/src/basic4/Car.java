package basic4;

public class Car {


		//필
		String company = "HD";
		String model;
		String color;
		int maxSpeed;
		
		// 생성자 간  중복된 코드 발생 -> 공통 코드를 한 생성자에만 집중적으로 작성하고, 나머지 생성자는 this()로 퉁치기 
		public Car() {
			
		}
		
		
		public Car(String model) {
			this(model, "red", 350);
		}
		

		public Car(String model, String color) {
			this(model, color, 350);
		}
		
		
		public Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			
		}
		
		
		
		//메
		
		


}
