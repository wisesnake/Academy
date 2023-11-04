package basic6;

public class CalculatorCircleTest {

	public static void main(String[] args) {

		//원마다의 색깔은 객체를 여러개 만들어서 원객체의 색깔을 넣어줌
		
		CalculatorCircle CalculatorCircle = new CalculatorCircle();
		CalculatorCircle.color ="파랑";
		System.out.println(CalculatorCircle.color);
		System.out.println();
		
		CalculatorCircle CalculatorCircle2 = new CalculatorCircle();
		CalculatorCircle2.color ="빨강";
		System.out.println(CalculatorCircle2.color);
		System.out.println();
				

		double radius = 10.0;
		
		
		double result = CalculatorCircle.pi * radius * radius;
		System.out.println(result);
		
		
		int result2 = CalculatorCircle.plus(5, 6);
		
		
		System.out.println(result2);
		
		
		
	}

}
