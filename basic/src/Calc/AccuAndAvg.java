package Calc;

public class AccuAndAvg {

	
	//필
	double arr[];
	double tot;
	double avg;
	
	//생
	AccuAndAvg(){
		
	}

	AccuAndAvg(double[] arr){
		this.arr = arr;
		// 필드변수 arr[]에다가 객체의 매개값 배열 대입.
	}
	
	//메
	double getTotal() {
		// 객체의 매개값 배열 arr[]을 갖고 메서드 작동.
		for(int i = 0 ; i < arr.length; i++) {			
			tot += arr[i];
		}
		return tot;
	}
	
	double getAvg() {
		// 객체의 매개값 배열 arr[]을 갖고 메서드 작동.
		return tot / arr.length;
	}
}
