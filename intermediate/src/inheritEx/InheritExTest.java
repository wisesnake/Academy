package inheritEx;

public class InheritExTest {

	public static void main(String[] args) {
		Passenger james = new Passenger("James", 5000);
		Passenger thomas = new Passenger("Thomas", 10000);
		// 이름과 소지금이라는 승객 공통 속성을 가진 탑승객 각자의 객체 생성.

		Transport bus = new Bus(1000, "버스 100번");
		Transport bus2 = new Bus(1200, "버스 200번");
		Transport metro = new Metro(1500, "지하철 2호선");
		// 요금과 현재 탑승 인원수, 호선이라는 공통 속성을 가진 대중교통 각각의 객체 생성.

		james.ride(bus);
		// 탑승 메소드를 호출함으로써 버스객체의 탑승객 수 증가와 제임스의 소지금에서 버스 객체의 요금만큼 차감.

		james.showPassengerInfo();
		bus.showTransportInfo();

		System.out.println();

		thomas.ride(metro);
		// 탑승 메소드를 호출함으로써 지하철객체의 탑승객 수 증가와 토마스의 소지금에서 지하철 객체의 요금만큼 차감.

		thomas.showPassengerInfo();
		metro.showTransportInfo();

		System.out.println();

		Passenger lim = new Passenger("임슬범", 20000);

		lim.ride(bus);

		lim.showPassengerInfo();
		bus.showTransportInfo();

//		// 위와 같이, 상황에 따라 확장이 일어나야 하므로 이것이 바로 OOP를 해야하는 이유임.
//		Passenger passenger[] = new Passenger[10];
//		for (int i = 1; i < 10; i++) {
//			passenger[i] = new Passenger("승객" + i, 10000);
//			if (i % 2 == 0) {
//
//				passenger[i].ride(metro);
//				System.out.printf("%s 가 %s에 탑승했습니다. 승객의 현재 소지금 : %d \n", passenger[i].name,metro.route ,passenger[i].money);
//			} else if(i % 3 == 0){
//				passenger[i].ride(bus2);
//				System.out.printf("%s 가 %s에 탑승했습니다. 승객의 현재 소지금 : %d \n", passenger[i].name,bus2.route, passenger[i].money);
//
//			} else{
//				passenger[i].ride(bus);
//			System.out.printf("%s 가 %s에 탑승했습니다. 승객의 현재 소지금 : %d \n", passenger[i].name,bus.route, passenger[i].money);
//			}
//		}
//
//		metro.showTransportInfo();
//		bus.showTransportInfo();
//		bus2.showTransportInfo();
	}

}
