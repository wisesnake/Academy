package basic;

public class PromotionEx3 {

	public static void main(String[] args) {
		byte v1 = 10;

		int v2 = 100;

		long v3 = 1000L; // 1000 은 int이므로 뒤에 L붙여서 롱타입으로


//		 int v4= v1 + v2 + v3; 에러메세지 -> can't convert from long to int

		 long v4= v1 + v2 + v3; // 가장 큰 long타입으로 변환 후에 연산이 일어남.

		 
		 char v5 = 'A';
		 
		 char v6 = 0;

		 char v7 = 65535; // 음수 안들어감, 2kb를 넘어가는(2^16을 넘어가는) 수인 65536부터는 안들어감.
		 
		 char v8 = 1;
		 
		 System.out.println(v5 + v8); // int로 형변환 일어나며, A + 1 -> 65 + 1 되어서 66이 출력
		 
		 System.out.println((char) (v5 + v8)); // 65 + 66 을 char 타입으로, 즉, A 의 ASCII코드에서 +1 되어서 B가 되었음.
		 
		 
		 // 정수 연산시 주의해야할 점(나누기)
		 
		 int v9 = 10;
		 
		 System.out.println(v9 / 4);
		 // int 값인 2가 나옴, 소숫점단위는 잘림
		 System.out.println((double)v9 / 4);
//		 casing으로 인해 double로 강제 형변환이 일어나 2.5가 나옴.
		 
	}

}
