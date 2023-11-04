package Calc;

public class CalcFinal {

	//ㅍ
	double val;
	double currVal;
	
	
	
	//ㅅ
	CalcFinal(double val,double currVal){
	this.val = val;
	this.currVal = currVal;
	}
	
	
	
	//ㅁ
	double add(){
		currVal += val;
		return currVal;
	}
	double minus() {
		currVal -= val;
		return currVal;
	}
	double multi() {
		currVal *= val;
		return currVal;
	}
	double divide() {
		currVal /= val;
		return currVal;
	}
	
}
