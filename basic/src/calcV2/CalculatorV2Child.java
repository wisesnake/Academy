package calcV2;

public class CalculatorV2Child extends Calculator{

	//필
	int tot;
	double avg;
	int scores[];
	
	//생
	public CalculatorV2Child() {
	
	}
	
	CalculatorV2Child(int scores[]){
		this.scores=scores;
	}
	
	
	
	
	//메서드
	
	//1) 누적합(국, 영, 수) 메서드
	int accuSum(int scores[]){
	
		for(int score:scores) {
			tot = tot + score;	
		}
		return tot;
	}
//	 1 - 2) ... 가변길이 매개변수를 이용한 메서드
	int accuSum2(int ... scores) {
		
		for(int score:scores) {
			tot += score;
		}
		return tot;
	}
	
	//2) 평균
	double average(){
		double avg =(double) tot / this.scores.length;
		return avg;
	}
	
}
