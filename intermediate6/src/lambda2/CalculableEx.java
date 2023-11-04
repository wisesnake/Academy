package lambda2;

public class CalculableEx {

	public static void action(Calculable cal) {
		cal.calculate();
	}

	public static void action2(Calculable2 cal) {
		cal.calculate(6, 7);
	}

	public static void action3(Calculable3 cal) {
		String result = cal.calculate();
		System.out.println(result);
	}
	
	public static void action4(Calculable4 cal) {
		int result = cal.calculate(2,6);
		System.out.println(result);
	}

	public static void main(String[] args) {

		action(() -> {
			System.out.println("hi");
		});

		action2((x, y) -> {
			System.out.println(x + y);
		});
		
		action3(()->{
			return "nice";
		});
		
		action4((x,y)->{
			return x+y;
		});
		
	}

}
