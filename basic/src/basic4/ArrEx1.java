package basic4;

public class ArrEx1 {

	public static void main(String[] args) {

		int arr[] = new int[3];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 70;
		
		int tot = 0;
		
//		for (int i = 0; i < arr.length; i++) {
//			tot += arr[i];
//		}
		
		for (int j : arr) {
			tot += j;
		}
		
		
		System.out.println(tot);
		
	}

}
