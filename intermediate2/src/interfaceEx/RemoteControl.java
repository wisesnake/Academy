package interfaceEx;

public interface RemoteControl {
	// 인터페이스는 상추디정

	// 상)수 public static final 생략해도 되지만 익숙해질때까지는 일단 쓰자
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// 추)상메서드 public abstract도 생략 가능하지만 일단 쓰자
	public abstract void turnOn();
	void setVolume(int volume);

	// 디)폴트메서드 리모콘이 일단 갖고 있어야 하는 기능.
	// RemoteControl을 구현한 클래스(객체)들이 기본적으로 가지고 있어야 할 메서드.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("뮤트합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("뮤트 해제");
		}
	}

	// 정)적메서드
	static void changeBattery() {

	}

}
