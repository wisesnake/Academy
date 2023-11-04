package basic3;

public class Korean {
	
	//필
//	String nation; // 어차피 한국인에게 korean 타입 객체를 계속해서 생성할거면 중복시키지 말고, 아예 애초부터 고정하면 되는거 아닌가?
//	ㄴ>
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	
	//생
	public Korean() {
		
		
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	Korean(String nation, String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
	
	
	
	//메
	
	
	
	
	
	
}
