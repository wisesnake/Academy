package calcV2;


// 부모
public class Calculator {
	
	// 필드	
	double num1;
	double num2;
	
	// 생성자
	public Calculator() {
		
	}

	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 메소드
	
	// 사칙연산
	// 더하기
	double plus() {
		return this.num1 + this.num2;
	}
	// 빼기
	double subtract() {
		return this.num1 - this.num2;
	}
	// 곱하기
	double multiply() {
		return this.num1 * this.num2;
	}
	// 나누기
	double divide() {
		return this.num1 / this.num2;
	}
	
	
	

	
}
