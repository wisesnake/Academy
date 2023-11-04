package Calc;

public class CalcFunction {
	//필
	double num[] = new double[2]; // 입력받은 두 수의 필드.
	
	
	
	
	//생
	
	CalcFunction() {
		
	}
	
	CalcFunction(double num[]){ 
		// ㄴ> 해당 생성자를 통해, 
		this.num[0] = num[0];
		this.num[1] = num[1];
	}
	
	//메
	
	double Add() {
		return num[0] + num[1];
	}
	
	double Minus() {
		return num[0] - num[1];
	}
	
	double Multiple() {
		return num[0] * num[1];
	}
	
	double Divide() {
		return num[0] / num[1];
	}
	
	
}
