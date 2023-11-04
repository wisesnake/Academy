package lambda2;

public class LambdaEx {

	public static void main(String[] args) {

		Person person = new Person();

//		person.action(new Workable() {
//			@Override
//			public void work() {
//				System.out.println("공부");
//			}
//			
//		});
// 기존 위와같이 익명 객체를 매개변수로 하여 오버라이딩을 했다면
// 람다식의 형태로 간단하게 가능.
		person.action(()->{
			System.out.println("출근");
			System.out.println("프로그래밍");
		});
		person.action(()->{
			System.out.println("퇴근");
		});	
	}
}
