package chpt11x;

public class Ex6Test {

	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과!");
			} catch(NumberFormatException e) {
				System.out.println("숫자변환 안된다!");
			} finally{
				System.out.println(value);
			}
		}
	}
}
