package nested7;

public class Car {
	Tire tire1 = new Tire();

	// 필드에 익명 자식 객체 대입.

	// Tire 부모 {} 익명 클래스가 자식.
	Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("자식 Tire 객체 굴러감.");
		}
	};

	void run() {
		tire1.roll();
		tire2.roll();
	}

	// 지역(로컬)변수
	void run2() {
		
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2");
			}
		};
		tire.roll();
	}

	
	
	//매개변수 이용
	 void run3(Tire tire) {
		 tire.roll();
	 }
	
	
	
}
