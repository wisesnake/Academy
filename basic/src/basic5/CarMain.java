package basic5;

public class CarMain {

	public static void main(String[] args) {		
		Car car1 = new Car(10);
		// 생성자를 통해, 매개값부분에 넣고싶은 연료의 총량을 넣으면 car1 객체에다가 주유.
		System.out.println("연료체크~" + car1.gas);
		// car1 객체에 gas필드에 연료가 제대로 들어갔는지 체크.
		
		System.out.println("부릉부릉~ 차의 시동을 걸고 달립니다~");
		while(true) {
			if(car1.gascheck()) {
				// gascheck()메소드는 boolean을 리턴하며, gascheck 메소드에서는 해당 객체의 
				// gas 인스턴스가 0이 되면 false를 리턴하도록 하였음. 따라서 0이 되기 전까지는
				// 달린다는 매세지를 무한출력
				
				System.out.printf("현재 연료는 %d입니다.",car1.gas );
				System.out.println("차가 계속 달립니다~");
				car1.gas--;
				// 루프가 1회 돌때마다 gas필드를 1씩 줄이는중
			}else{
				// gascheck메서드의 리턴값을 평가하여,가스가 0이 되어서 false를 리턴할경우
				// break 시켜서 무한루프를 탈출시키며 종료.
				System.err.println("엔진 오링~ 시동이 꺼집니다");
				break;
			}
		}
		
	}

}
