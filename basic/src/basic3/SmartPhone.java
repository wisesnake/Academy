package basic3;

public class SmartPhone {
	//필
	String color;
	int ramGB;
	
	
	//생(생성자 역시 일종의 함수로써 이해할 수 있음)
	public SmartPhone() {
		
	}
	
	public SmartPhone(String color, int ramGB) {
		this.color = color;	
		this.ramGB = ramGB;
	}
	//color 와 ramGB라는 두개의 인스턴스 변수를 갖고 있음(필드를)
	//매개변수를 받는 생성자는 color와 ramGB를 초기화하는데 사용도
}
