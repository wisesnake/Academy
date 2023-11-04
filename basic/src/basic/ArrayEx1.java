package basic;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 0831
		
		// 배열 : 고정되어있으므로 방이 몇개인지 미리 선언
		// 		 또한 각각 방에 들어갈 데이터 타입도 통일되어있으므로 데이터 타입도 선언해야함. 
		
		//이 변수는 배열 변수
//		
//		int arr[];
//		arr = new int[3];
//		//변수 arr는 int 데이터타입의 3칸의 방을 가진 배열 변수이다. 선언 
		
		int arr[] = new int[3];
//		좀더 간략화된 버전의 배열 선언
		
		System.out.println(arr);		
		System.out.println(System.identityHashCode(arr));
		
		arr[0] = 9;
		System.out.println(System.identityHashCode(arr[0]));
		
		arr[1] = 20;
		arr[2] = 30;
		
		
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		System.out.println("------------------");
		System.out.println(arr); // [0]	이든 [1]이든 [2]이든 값이 추가되어도 주소값은 동일한걸 확인 가능.	
//		System.out.println(arr.toString());
		
	}

}
