package chpt12ex;

public class CodeRunTimeEx {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int[] scores = new int[1000];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum+=score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		long end = System.nanoTime();
		
		System.out.println("하는데 걸린 시간은 "+ (end - start) + "입니다.");
	}

}
