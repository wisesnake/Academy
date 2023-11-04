package exceptionEx;

public class CatchByExceptionKindEx2 {

	public static void main(String[] args) {
		try {
			int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.printf("%s + %s = %d", args[0], args[1], result);
		} catch (Exception e) {
			System.out.println("숫자 형태로만 넣어주세요");

		}
	}
}
