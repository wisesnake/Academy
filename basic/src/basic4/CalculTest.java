package basic4;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculTest {
	public static void main(String[] args) {
//		Calcul calcul = new Calcul(1,2);
//	
//		System.out.println(calcul.Add());
		
//		int[] arr = new int[] {90,80,70,60};
//
//		
//		
//		Calcul calcul = new Calcul(arr);
//		
//		System.out.println(calcul);
//	
//		System.out.println(calcul.arr);
//	
//		
//		int result = calcul.accu(arr);
//		System.out.println(result);
//		
//		double result2 = calcul.avg(arr.length);
//		System.out.println(result2);

		
		
		Calcul calcul = new Calcul(new int[] {90,80,70,60});
		
		System.out.println(calcul);
	
		System.out.println(calcul.arr);
	
		
		int result = calcul.accu(calcul.arr);
		System.out.println(result);
		
		double result2 = calcul.avg(calcul.arr.length);
		System.out.println(result2);

		
	}
}
