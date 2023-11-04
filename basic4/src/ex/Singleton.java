package ex;


// 싱글톤 패턴
public class Singleton {
	
	//f(I,S,F), 접근(퍼 프 디 프)
	private static Singleton singleton = new Singleton();
	
	
	
	//c
	private Singleton() {

	}
	
	
	
	//m
	
	public static Singleton getInstance() {
		return singleton;
	}
}
