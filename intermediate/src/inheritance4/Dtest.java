package inheritance4;


public class Dtest {
	public static void main(String[] args) {
		
		System.out.println("package2 의 메인클래스");
		D d = new D();
//		D의 부모인 타 패키지의 protected class A의 객체도 생성됨
		
//		d.field;
//		부모인 타패키지 A클래스꺼는 호출 안됨
		d.pMethod();
		
	}
}

