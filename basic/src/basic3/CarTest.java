package basic3;


public class CarTest {
	public static void main(String[] args) {
		//1)객체(인스턴스)를 이용한 필드 초기화
//		Car mycar = new Car();
//		mycar.model = "제네시스";
//		mycar.color = "검정";
//		mycar.maxSpeed = 350;
//
//		System.out.println(mycar.model + mycar.color + mycar.maxSpeed);

//		2) 생성자를 이용한 필드 초기화
//		Car mycar = new Car("제네시스", "검정색", 350);
//		
//		System.out.println(mycar.model);
//		System.out.println(mycar.color);
//		System.out.println(mycar.maxSpeed);
//		
//		System.out.println("=============");
//		Car mycar2 = new Car("포르쉐", "은색");
//		
//		System.out.println(mycar2.model);
//		System.out.println(mycar2.color);
	// '.'의 의미 접근하다 -> 보내고 실행해라! 
		
		
		
		Car car1 = new Car("제네시스","노랑",250);
		System.out.println(car1.model + car1.color + car1.company + car1.maxSpeed);

		Car car2 = new Car("소나타", 250, "파랑");
		System.out.println(car2.model + car2.color + car2.company + car2.maxSpeed);
	}

}


