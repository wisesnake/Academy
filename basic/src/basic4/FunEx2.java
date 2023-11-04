package basic4;

public class FunEx2 {
	
	 //안주고 안받고
	static void sunja1(){
		System.out.println("하잉");
	}
	
	//안주고 받고
	static String sunja2(){
		System.out.println("여기 번호");
		return "전화번호";
	}
	//주고 안받고
	static void sunja3(String gift){
		System.out.println(gift + "고마워");
	}
	// 주고 받고
	static String sunja4(String gift){
		System.out.println(gift + "고마워 여기 번호");
		return "전화번호";
	}
	
	public static void main(String[] args) {
		sunja1();
		System.out.println();
		System.out.println(sunja2() + "를 받았다.");
		System.out.println();
		sunja3("장미");
		System.out.println();
		System.out.println(sunja4("장미") + "를 받았다.");
		
		
	}

}
