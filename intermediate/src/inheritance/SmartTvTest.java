package inheritance;

public class SmartTvTest {

	public static void main(String[] args) {

		SmartTv lgTv = new SmartTv("LG","80\"", "CurvedScreen");
		
		System.out.printf("스마트TV 정보 : 모델 : %s| 화면크기 : %s| 화면타입: %s \n",lgTv.model,lgTv.screenSize,lgTv.screenType); 	
		
		lgTv.powerOn();
		System.out.println("현재 wifi 상태 : " + lgTv.wifi);
		lgTv.setWifi(true);
		System.out.println("현재 wifi 상태 : " + lgTv.wifi);
		lgTv.changeInput("hdmi");
		System.out.println("현재 입력모드 : " + lgTv.inputmode);
		
		
		lgTv.ottAppStart("netflix");
		System.out.println("두둥~~~~~~~");
		
	}

}
