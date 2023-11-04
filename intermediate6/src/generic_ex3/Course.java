package generic_ex3;

public class Course {
	// ? : 제네릭 타입을 매개값이나 리턴타입으로 사욯라 때, 타입 파라미터로 ?(와일드카드) 사용 가능.
	// ? 는 범위(extends or super)에 있는 모든 타입으로 대체할 수 있다는 표시
	//모든사람이 등록 가능.
	 
	public static void registerCourse1(Applicant<?> applicant) {
		//누구나
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 코스1을 등록함." );
	}
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		//학생만(Person>Student 를 Extend 한 HighStudent 랑 MiddleStudent만
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 코스2를 등록함." );
	}
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		//직딩 및 일반인(Worker 의 Super인 Worker, Worker의 Super인 Person만 이므로, Person의 Extend인 Student는 미포함.
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 코스3을 등록함." );
	}
}
