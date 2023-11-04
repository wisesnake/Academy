package interfaceEx;

public interface Service {
	// 상

	// 추

	// 디

	default void defaultMethod1() {
		System.out.println("여기는 디폴트 메서드1");
		defaultCommon();
	}

	default void defaultMethod2() {
		System.out.println("여기는 디폴트 메서드2");
		defaultCommon();
	}

	// private 디폴트메서드
	private void defaultCommon() {
		System.out.println("디폴트 메서드 중복코드 A");
		System.out.println("디폴트 메서드 중복코드 B");

	}

	// 정
	static void staticMethod1() {
		System.out.println("여기는 정적 메서드1");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("여기는 정적 메서드2");
		staticCommon();
	}

	// private정적메서드
	private static void staticCommon() {
		System.out.println("정적메서드 중복코드 C");
		System.out.println("정적메서드 중복코드 D");
	}

	// interface의 private메서드들은 주로 코드 중복을 없애기 위해 쓰임.
}
