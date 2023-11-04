package inheritance;
//부모클래스
public class Phone{
	//f
	public String model;
	public String color;
	
	
	
	//c
	public Phone() {
		
	}
	
	
	
	//m
	public void sendVoice(String message){
		System.out.println("보낸 매세지 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("받은 매세지 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화 끊는다.");
	}
	
	
}
