package chpt7ex;

public class Parent {
	public String name;
	
	public Parent() {
		
	}
	//부모 클래스에 기본 생성자가 없고, 매개변수를 갖고 있는 생성자만 있을경우
	//자식클래스가 생성자를 컴파일 시 자동 생성되는 super();에 의해 컴파일에러발생.
	//따라서 부모클래스에 기본생성자를 추가해주거나, 자식생성자에 부모생성자 중
	//매개변수를 갖는 생성자와 스타일이 같은 super 생성자를 추가해주어야 함.
	public Parent(String name) {
		this.name = name;
	}
	
}
