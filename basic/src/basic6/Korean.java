package basic6;

public class Korean {
	//f-IorSorFinal
	//final필드에 초기값을 주는 방법 : 1. 필드 선언시에 초기값 대입 2. : 생성자에서 초기값 대입.
	
	final String nation = "대한민국";
	final String ssn;
	String name;
	
	
	
	//c
	public Korean() {
		this.ssn = "";
		
	}



	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	//m-IorS
	
	
	
	
}
