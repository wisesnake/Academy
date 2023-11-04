package exceptionEx;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String str = null;
//		System.out.println(str);
		try {
			//try부분에는 예외가 날 수도 있는 코드(보정이 필요할 코드)
			System.out.println(str.length());
			
		}catch(NullPointerException e) {
			//예외 발생시 동작할 코드 여기에
			//기본
			System.out.println("str는 null이라 길이가 없엉!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
