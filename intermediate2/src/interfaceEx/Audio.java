package interfaceEx;

public class Audio implements RemoteControl {
	
	int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("볼륨의 최고치는 10입니다.");
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			 System.out.println("볼륨의 최저치는 0입니다.");
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오의 볼륨은 : " + this.volume);
	}
	
	int memoryVolume;
	//디폴트 메서드 재정의
	//ㄴ> 디폴트 메서드 재정의 시 주의할 점.
	//반드시 public접근제한자를 붙일것. default 생략해야함.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("오디오 뮤트");
			this.memoryVolume = this.volume;
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("뮤트 해제");
			setVolume(this.memoryVolume);
		}
		
	}
}
