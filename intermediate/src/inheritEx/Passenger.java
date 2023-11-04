package inheritEx;


public class Passenger {

	//f
	String name; // 승객 객체의 이름.
	int money; // 승객 객체의 소지금.
	
	
	
	
	//c
	Passenger(String name, int money){
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
	
	void showPassengerInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n",this.name, this.money);
	}
	

}
