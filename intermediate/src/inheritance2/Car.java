package inheritance2;

public class Car {

	// f
	String company;
	String model;
	// 해당 차를 타는 사람이 있다는것을 선언
	Person person;

	// 부품(집합)관계, 타이어는 차의 부품이다. 타이어, 핸들, 엔진 이런 것들이 집합이 되면
	// 차가 완성이 됨. 부품 관계는 큰 틀(Car클래스)안에 부품이(타이어) 객체로써 초기화 돼야 함.
	Tire frontLeft = new Tire("앞 왼쪽", 6);
	Tire frontRight = new HankookTire("앞 오른쪽", 10);
	Tire backLeft = new KumhoTire("뒷 왼쪽", 20);
	Tire backRight = new KumhoTire("뒷 오른쪽", 20);

	// c
	public Car() {

	}

	public Car(String company, String model) {
//		super(); 생략가능
		this.company = company;
		this.model = model;
	}

	// m
//	public void owner(Person person) {
//		this.person = person;
//		System.out.println("이 차의 주인은 " + this.person.name);
//	}

	String take() {
		return this.company + "회사의" + this.model + "차를 타고 달린다.";
	}
	//매개변수(변수,지역local변수-함수내에서만사용하는변수)
	//매개변수를 통해서 객체와 객체간의 
	void drive1(String person) {
		System.out.println(person + "운전중");
		
	}
	
	void drive1(Person person) {
		this.person = person;
		System.out.println(this.person.name + "이 운전중"); 
	}
	
	int run() {
		System.out.println("자동차 달린당.");
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}else if(frontRight.roll() == false) {
			stop();
			return 2;
		}else if(backLeft.roll() == false) {
			stop();
			return 3;
		}else if(backRight.roll() == false) {
			stop();
			return 4;
		}
		
		
		return 0;
	}

	int stop() {
		System.out.println("자동차 멈췄당.");
		return 0;
	}

}
