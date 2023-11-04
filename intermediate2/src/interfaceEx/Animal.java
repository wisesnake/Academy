package interfaceEx;

public interface Animal {
	//상
	public final static int NUMBER_OF_LIMB = 4;
	public final static int NUMBER_OF_EYES = 2;
	
	
	
	
	//추
	public abstract void run();
	
	
	
	//디
	default void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	//정
	static void runAway() {
		System.out.println("도망갑니다.");
	}
}
