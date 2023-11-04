package inheritance;

public class Tv {

	//f
	public String model;
	public String screenSize;
	public String screenType;
	public String inputmode;
	
	
	//c
	
	Tv(){
		
	}
	
	
	//m
	public void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void changeInput(String inputmode) {
		System.out.printf("입력모드를 %s 로 전환합니다. \n" , inputmode);
		this.inputmode = inputmode;
	}
}
