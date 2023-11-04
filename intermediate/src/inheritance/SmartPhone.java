package inheritance;

//Phone과 SmartPhone 의 관계를 맺어보자.

//스마트폰(자식)은 폰(부모)이다. 이런 형태의 문장이 말이 되면 상속 관계를 맺을 수 있다.

//extends를 통해 Phone의 필드, 속성등을 상속
public class SmartPhone extends Phone{
	
	
	//f
	public boolean wifi;
	
	
	
	
	
	//c
	public SmartPhone(String model, String color) {
		//해당 클래스에서 선언한 필드가 아님에도, 부모 클래스인 Phone에서 선언되었던 public String Color 필드를 사용 가능.
		this.model = model;
		this.color = color;
		
	}
	
	
	
	
	
	//m
	public void setWifi(boolean wifi){
		this.wifi = wifi;
		System.out.println("wifi 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
	
}
