package inheritance2;

public class Tire {
	//f
	//타이어 위치
	String location;
	//최대 회전수(타이어 수명)
	int maxRotation;
	//누적 회전수
	int accumulateRotation;
	
	
	//c
	public Tire() {
		
	}
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//m
	public boolean roll() {
		++accumulateRotation;
		//<최초루프>
		//최초 메소드 호출한 즉시 0->1 됐음.
		//1 < 6 이므로 참.
		
		if(accumulateRotation < maxRotation) {
			System.out.println(this.location + " Tire 수명: " + (this.maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("타이어 펑크");
			return false;
		}	
	}
}
