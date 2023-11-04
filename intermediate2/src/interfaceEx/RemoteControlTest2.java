package interfaceEx;

public class RemoteControlTest2 {
	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		
		System.out.println("========");
		Audio audio = new Audio();
		audio.turnOn();		
		System.out.println("========");
		audio.setVolume(8);
		System.out.println("========");
		audio.setMute(true);
		System.out.println("========");
		audio.setMute(false);
	}

 

}
