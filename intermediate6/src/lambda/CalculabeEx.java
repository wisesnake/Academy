package lambda;

public class CalculabeEx {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {

			@Override
			public void calculate() {
				System.out.println("hi");
			}
		};

//		Calculable2 cal2 = new Calculable2() {
//			
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x+y);
//			}
//		};
//		위의 인터페이스 익명객체 구현 후 오버라이딩을 간단하게 람다식으로 표현
		Calculable2 cal2 = (x, y) -> {
			System.out.println("더하기: " + (x + y));
		};
		Calculable2 cal2b = (x, y) -> {
			System.out.println("빼기: " + (x - y));
		};
		Calculable2 cal2c = (x, y) -> {
			System.out.println("곱하기: " + (x * y));
		};

		Calculable3 cal3 = new Calculable3() {

			@Override
			public String calculate() {
				return "nice";
			}
		};

		Calculable4 cal4 = new Calculable4() {

			@Override
			public Integer calculate(int x, int y) {
				return x + y;
			}
		};

		cal.calculate();
		cal2.calculate(2, 5);
		cal2b.calculate(2, 5);
		cal2c.calculate(2, 5);

		System.out.println(cal3.calculate());
		System.out.println(cal4.calculate(2, 5));

	}

}
