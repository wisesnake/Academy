package exceptionEx;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		try {
			System.out.println(arr[3]);			
		} catch (Exception e) {
			System.out.println("4번째 arr(arr[3])은 존재하지 않아...");			
		}
		
	}

}
