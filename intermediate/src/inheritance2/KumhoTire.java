package inheritance2;

public class KumhoTire extends Tire {

	public KumhoTire(){
		
	}
	
	//부모클래스 가리키는 예약어 : super
	//자기자신을 가리키는 예약어가 this인것과 같은맥락.
	//자식은 부모가 가진 필드와 생성자를 통해서 객체를 초기화 할 수 있다. 
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}	
}
