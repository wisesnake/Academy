package commuteinterface;

public class Commuter {
	String name;
	int money;

	
	Commuter(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void showInfo() {
		System.out.println(this.name + "님의 정보");
		System.out.println("소지금 : " + this.money + "원");
	}
	
	void buy(Cafe brand, Cafe coffee, Cafe fee) {
		
	}
}
