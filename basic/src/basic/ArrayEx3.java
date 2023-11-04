package basic;

public class ArrayEx3 {

	public static void main(String[] args) {

		// 배열을 처음 생성하면 배9열 항목은 기본값(0, null)으로 초기화됨
		int arrs[] = new int[3];
		float arrs2[] = new float[3];
		char arrs3[] = new char[3];
		boolean arrs4[] = new boolean[3];
		
		for (int arr : arrs) {
			System.out.println(arr);
		}

		for (float arr : arrs2) {
			System.out.println(arr);
		}
		
		for (char arr : arrs3) {
			System.out.printf("[%s] \n", arr);
		}
		
		for (boolean arr : arrs4) {
			System.out.println(arr);
		}
		
	}

}
