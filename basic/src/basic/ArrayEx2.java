package basic;

import java.lang.reflect.Array;

public class ArrayEx2 {

	public static void main(String[] args) {
//		int arr[] = new int[3];
//		
//		arr[0] = 9;		
//		arr[1] = 20;
//		arr[2] = 30;
//		위의 선언 및 초기화를 한 줄로 할 수 있는 방법.		
		
		int arr[] = new int[] {9, 20, 30};
		
		System.out.println(arr.length); // 배열의 길이를 int형태로 리턴받는 필드에 접근 -> 배열함수.length
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
// 위의 sysout 을 세번 한 것을 for문으로 간략화, 이런식으로 많이쓰임.		
		
//		for(int i = 0;i < arr.length; i++) {
//			System.out.println(arr[i]);			
//		}
//		향상된 형태의 for문
//		for(값 : 배열객체) {
//			
//		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
