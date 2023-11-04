package commute;

public class Commuter {

	//f
	String name; 
	int money; 
	
	
	
	
	//c
	Commuter(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	
	//m
	void ride(Transport transport) {
		++transport.passengerNum;
		//ride 메소드를 실행했으니 대중교통 객체의 승객1명이 증가했다.
		this.money -= transport.fee;
		//탑승한 사람의 소지금에서 대중교통 객체의 요금만큼 차감.
		transport.income += transport.fee;
		//해당 대중교통 객체의 수입금을 요금만큼 증가시킴.
	}
	
	void buy(Cafe coffee) {
		this.money -= coffee.fee;
		// 통근자 객체의 소지금에서, 매개변수로 들어온 커피 메뉴 객체의 가격만큼 차감.
		coffee.income += coffee.fee;
		// 들어온 자식 커피 객체의 income 액수를 커피 요금만큼 증가시킴. 
	}
	
	void commute(Transport transport, Cafe coffee) {
		this.buy(coffee);
		this.ride(transport);
		int totUse = transport.fee + coffee.fee;
		System.out.printf("%s 님은 %s 를 사고 %s 를 타고 출근했습니다.\n",this.name, coffee.coffee, transport.route);
		System.out.printf("구매내역 : %s, %d | %s, %s, %d | 총사용액 : %d \n",transport.route,transport.fee,coffee.brand,coffee.coffee,coffee.fee,totUse);
		moneyLeft();
	}
	
	void moneyLeft() {
		System.out.printf("%s 님의 남은 금액 : %d\n",this.name, this.money);
	}
	
	
}
