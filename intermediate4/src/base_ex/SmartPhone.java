package base_ex;

public class SmartPhone {
	String company;
	String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {

		return "제조사: " + this.company + ", 운영체제: " + this.os;
	}
}
