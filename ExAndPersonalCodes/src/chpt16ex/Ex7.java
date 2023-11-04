package chpt16ex;

public class Ex7 {

	public static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		//최대값
		
		int max = maxOrMin((int x,int y)->{
			if(x < y) {
				return y;
			} else {
				return x;
			}
		});
		
		//최소값
		int min = maxOrMin((int x,int y)->{
			if(x > y) {
				return y;
			}else {
				return x;
			}
		});
		
		System.out.println("최고 : " + max + " | 최소 : " + min);
	}

}
