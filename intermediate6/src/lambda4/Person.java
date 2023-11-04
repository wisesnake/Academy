package lambda4;

import java.util.Scanner;

public class Person {
	void action(Calculable calculable) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1>");
		double x = sc.nextDouble();
		System.out.print("입력 2>");
		double y = sc.nextDouble();
		
		double result = calculable.calc(x, y);
		System.out.println(result);
		System.out.println("-----------------");
	}
	
}
