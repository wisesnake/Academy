package basic;

public class VaribleScopeEx3 {
	public static void main(String[] args) {
		// main 함수 안에서, 즉, 함수 안에서 선언된 변수는 지역변수(local varible)라 하고,
		// 초기화(선언과 값 할당) 해야지만 사용(찍어볼 수 있다.) 가능
		int var = 15;

		// 제어문 (if(조건), for&& while(반복문)

		// if문의 가장 기본 형태
		if (true) {
			int var2 = 20;
			System.out.println(var);
			System.out.println(var2);
		}

//		System.out.println(var2);
//		if문 안에서 지역변수로 선언된 변수이므로 if문블럭 밖에서는 X
//		name scope(이름이 인식되는 범위)

		if (false) {
			System.out.println("이것은 거짓이니까 찍어라!");
		}
	}
}
