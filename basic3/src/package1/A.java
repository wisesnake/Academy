package package1;

//생성자의 접근 제한

public class A {

	//f
	A a = new A();
	A a1 = new A(true);
	A a2 = new A(1);
	//같은 클래스 내에서는 private여도 접근 가능한 모습
	//ㄴ> 밑에 A(char)생성자를 private로 선언 해줬었음.
	A a3 = new A('s');
	
	//c
	public A(){
		
	}
	
	//public
	public A(boolean b){
		
	}

	//default
	A(int b){
		
	}
	//private
	private A(String b){
		
	}
	
	
	//m
	
}
