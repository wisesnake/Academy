package basic2;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		
		if (args.length!= 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
			// 0 입력시 프로그램이 정상적으로 종료
			// 양수 : 프로그램이 비정상 종료
			// 음수 : 시스템 혹은 JVM과 관련된 오류
		
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		
	}

}
