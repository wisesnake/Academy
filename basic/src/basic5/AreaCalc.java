package basic5;

public class AreaCalc {

	//f
	
	
	//c
	public AreaCalc() {
		
	}
	
	//m
	//ㄴ> 메소드, 기능, ~을 ~하다. 목적격을 매개변수로 만들어서 코딩하는 연습을 많이 하시기 바랍니다.
	
	//	면적을 구하라 -> width height
	//	정사각형
	// 메소드 오버로딩 : 메소드의 이름은 똑같되, 매개변수의 타입 개수 순서가 다름.
	double areaRectangle(double width){
		return width*width;
	}
	
	double areaRectangle(double width,double height){
		return width*height;
	}
	

	
	
}
