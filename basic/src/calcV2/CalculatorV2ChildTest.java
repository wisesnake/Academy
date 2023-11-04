package calcV2;

public class CalculatorV2ChildTest {

	public static void main(String[] args) {
//		CalculatorV2Child calChild =new CalculatorV2Child();
//		calChild.num1=4;
//		calChild.num2=3;
//		System.out.println(calChild.plus());
		
		
//		int scores[]=new int[]{90,90,90};
//		int totalScore=calChild.accuSum(scores);
//		System.out.println("총점" + totalScore);
		
		
		
		CalculatorV2Child calChild=new CalculatorV2Child(new int[] {90, 90});
		
		int totalScore = calChild.accuSum(calChild.scores);
		int totalScore2 = calChild.accuSum2(calChild.scores);
		System.out.println("총점" + totalScore);
		System.out.println("총점" + totalScore2);
		
		double average=calChild.average();
//		System.out.println("평균" + average);
		System.out.printf("평균 : %.2f", average);
		
		
		
	}

}
