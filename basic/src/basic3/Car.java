package basic3;

public class Car {


		//필
		String company = "HD";
		String model;
		String color;
		int maxSpeed;
		
		//생성자 : 개발자가 생성자를 선언하는 이유는 객체를 처음부터 이 Car라는 클래스는 아래와 같은 형태로 필드를 초기화 할 수 있도록 다양한 형태를 미리 제안해놓을 수 있다.
		
		public Car() {
			
		}
		
		// Constructor Overloading : 매개변수의 타입, 갯수, 순서가 다르게 여러개 생성자를 선언하는 것.
		//  
		
		public Car(String model) {
			this.model = model;
		}
		



		public Car(String model, String color) {
			//this 라는 Car라는 자기 자신의 주소
//			Car.model = model; 의 형태가 아니라 this예약어를 써야함
			this.model = model;
			this.color = color;
			
		}
		
//		public Car(String color , String model) { 에러출력, 순서가 다르더라도 타입이 같으면 의미가 없으므로.
//			this.model = model;
//			this.color = color;    
//		}
		
		public Car(String model, String color, int maxSpeed) {
			//this 라는 Car라는 자기 자신의 주소
//			Car.model = model; 의 형태가 아니라 this예약어를 써야함
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			
		}
		
		public Car(String model, int maxSpeed, String color) { // 오류출력 안함. 타입이 달르므로 순서가 다른게 유의미해짐.
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			
		}
		
		
		
		//메
		
		


}
