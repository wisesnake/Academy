package basic6;

public class Car {
	
	//필
	int speed;
	
	
	//생
	void hi() {
		
	}
	
	
	//메
	
	
	
	
	public static void main(String[] args) {
//		speed = 80;
//		hi();
//		둘다 인스턴스이므로 static인 메인에서는 실행 불가
		
		Car car = new Car();
		car.speed = 80;
		car.hi();
		
	}

}
