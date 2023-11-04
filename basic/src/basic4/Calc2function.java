package basic4;


public class Calc2function {
	// 목표 : Calc.Add(num1,num2) 의 형태로
	//필
	int num1;
	int num2;
	

		
	
	//생
	public Calc2function() {

	}
	public Calc2function(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	
	
	//메
	int Add() {
		return this.num1 + this.num2;
	}
	int Minus() {
		return this.num1 - this.num2;
	}
	int Multi() {
		return this.num1 * this.num2;
	}
	int Divide() {
		return this.num1 / this.num2;
	}
	
	
}
