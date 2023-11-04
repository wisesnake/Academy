package basic6;

public class CalculatorCircle {
	//필
	//계산기라는 클래스가 저장하고 있어야 할 값의 이름들을 선언
	
	String color; // 객체가 만들어질때 비롯되는 필드 : 인스턴스필드
	static double pi=3.14159; // 클래스단위에서 비롯되는 필드 : Static 필드
	
	
	
	//생
	public CalculatorCircle() {
		
	}
	
	
	
	//메
	//인스턴스 메서드
	//Static 메서드 : 인스턴스 필드를 이용하지 않는 메소드는 정적(Static) 메서드로 선언하는 것이 좋다.
	
	static int plus(int num1,int num2) {
		return num1+num2;
	}
	
}
