package basic5;

public class Car {

		// 차가 가려면 연료가 gas
		
		// 차가 gas가 있는지 없는지 여부를 확인해야함.
		
		// 만약에 gas가 0이라면 차는 멈춰야 합니다.
				
	//필
	int gas;
	
	//생	
	Car(int gas){
		this.gas = gas;
	}

	//메
	
	
	boolean gascheck() {
		boolean engine = true;
		if(this.gas == 0) {
			// 생성자를 통해 받아온 현재 연료량을 평가하여, 연료가 오링이면 false를 리턴
			engine = false;
		}
		return engine;
	}
	

}
