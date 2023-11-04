package nested;

public class A {
	//f
	
	
	//c
	

	//m
	
	void method(){
		//로컬 클라스 (매서드 영역 안을 local이라 지칭함.)
		class B{ 
		// B객체를 생성하고자 하려면, method가 호출되어야만 한다.(실행되는동안만 객체생성가능)
			
		}
		class AB{
			
		}
	}
	
	void method2() {
		class ABC{
			
		}
	}
	
	
	//인스턴스멤버 클라스
	//클래스 A에 대한 객체를 생성하여야 AA객체를 만들 수 있다.
	class AA{
		
	}
	
	//정적멤버 클라스
	//A객체를 생성하지 않고도 AAA객체를 만들 수 있다.
	static class AAA{
		
		
	}
	
	
	
}
