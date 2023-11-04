package chpt12ex;

public class StringBuilderEx {

	public static void main(String[] args) {
		String num = null;
		
		for(int i = 1 ; i <= 100; i++) {
			num =  new StringBuilder().append(i).toString();
			System.out.printf("%4s",num);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
