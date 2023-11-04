package base_ex4;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("#")
	//value로 정의된 값만 초기화.
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(count = 10, value = "*")
	//value 외 다른 이름을 가진 속성의 값도 초기화 해야 할 경우, 다음과 같이 value도 명시해줄것.
	public void method3() {
		System.out.println("실행 내용3");
	}
	
}
