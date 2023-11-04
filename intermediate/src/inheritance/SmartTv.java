package inheritance;

public class SmartTv extends Tv {
	//f
	public String ottName;
	public boolean wifi;
	
	
	
	//c
	SmartTv(String model, String screenSize, String screenType){
		this.model = model;
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	
	
	
	//m
	public void ottAppStart(String ottName) {
		this.ottName = ottName;
		if(this.model.equals("oldModel")) {
			System.out.println("죄송합니다. 해당 모델은 OTT 서비스를 지원하지 않습니다.");
		}else if(ottName.equals("netflix")) {
			System.out.println("Netflix 를 켭니다.");			
		}else if(!ottName.equals("netflix")){
			System.out.println("해당 OTT는 서비스 하고 있지 않습니다.");
		}
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		if(wifi == true) {
			System.out.println("wi-fi를 켰습니다.");			
		}else if(wifi == false) {
			System.out.println("wi-fi를 껐습니다.");
		}
	}
	
}
