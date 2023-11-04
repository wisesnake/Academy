package basic;

public class IfEx {

	public static void main(String[] args) {
		// 조건이 하나인 경우
		if(true) {
			System.out.println("참이면 나올 결과");
		}
		
		
		
		
		// 조건이 두개인 경우
		if(true) {
			System.out.println("참이면 나올 결과");
		}else {
			System.out.println("거짓이면 나올 결과");
		}
		
		
		
		
		// 조건이 셋인 경우
		if(false) {
			System.out.println("참1이면 나올 결과");
		}else if(false) {
			System.out.println("참2이면 나올 결과");
		}else {
			System.out.println("참1도, 참2도 아니면 나올 결과");
		}
	}

}
